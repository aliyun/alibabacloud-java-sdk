// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceResponseBody extends TeaModel {
    // The information about the queried traces.
    @NameInMap("MultiCallChainInfos")
    public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> multiCallChainInfos;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetMultipleTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceResponseBody self = new GetMultipleTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultipleTraceResponseBody setMultiCallChainInfos(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> multiCallChainInfos) {
        this.multiCallChainInfos = multiCallChainInfos;
        return this;
    }
    public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> getMultiCallChainInfos() {
        return this.multiCallChainInfos;
    }

    public GetMultipleTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList self = new GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList extends TeaModel {
        // The tags of the trace.
        @NameInMap("TagEntryList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList> tagEntryList;

        // The timestamp when the trace was returned.
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList self = new GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList();
            return TeaModel.build(map, self);
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList setTagEntryList(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList self = new GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpans extends TeaModel {
        // The amount of time consumed by the trace. Unit: milliseconds.
        @NameInMap("Duration")
        public Long duration;

        // Indicates whether a method stack was provided.
        // 
        // - `true`: A method stack was provided.
        // - `false` : No method stack was provided.
        @NameInMap("HaveStack")
        public Boolean haveStack;

        // The log events in the trace.
        @NameInMap("LogEventList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> logEventList;

        // The name of the traced span.
        @NameInMap("OperationName")
        public String operationName;

        // The ID of the parent span.
        @NameInMap("ParentSpanId")
        public String parentSpanId;

        // The response code.
        @NameInMap("ResultCode")
        public String resultCode;

        // The ID of the remote procedure call (RPC).
        @NameInMap("RpcId")
        public String rpcId;

        // The type of the remote procedure call (RPC) mode.
        // 
        // *   0: HTTP entry
        // *   25: HTTP call
        // *   1: High-speed Service Framework (HSF) call
        // *   2: HSF provision
        // *   40: on-premises API call
        // *   60: MySQL call
        // *   62: Oracle call
        // *   63: PostgreSQL call
        // *   70: Redis call
        // *   4: Taobao Distributed Data Layer (TDDL) call
        // *   5: Tair call
        // *   13: MetaQ message sending
        // *   252: MetaQ message receiving
        // *   3: notification sending
        // *   254: notification receiving
        // *   7: Apache Dubbo call
        // *   8: Apache Dubbo provision
        // *   19: SOFARPC call
        // *   18: SOFARPC provision
        // *   11: Distributed Service Framework (DSF) call
        // *   12: DSF provision
        // *   \-1: unknown call
        @NameInMap("RpcType")
        public Integer rpcType;

        // The IP address of the host where the application resides.
        @NameInMap("ServiceIp")
        public String serviceIp;

        // The name of the application.
        @NameInMap("ServiceName")
        public String serviceName;

        // Span ID。
        @NameInMap("SpanId")
        public String spanId;

        // The tags of the trace.
        @NameInMap("TagEntryList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> tagEntryList;

        // The timestamp when the trace was returned.
        @NameInMap("Timestamp")
        public Long timestamp;

        // The ID of the trace.
        @NameInMap("TraceID")
        public String traceID;

        public static GetMultipleTraceResponseBodyMultiCallChainInfosSpans build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseBodyMultiCallChainInfosSpans self = new GetMultipleTraceResponseBodyMultiCallChainInfosSpans();
            return TeaModel.build(map, self);
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setLogEventList(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> getLogEventList() {
            return this.logEventList;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setRpcType(Integer rpcType) {
            this.rpcType = rpcType;
            return this;
        }
        public Integer getRpcType() {
            return this.rpcType;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setTagEntryList(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

    public static class GetMultipleTraceResponseBodyMultiCallChainInfos extends TeaModel {
        // The information about the trace.
        @NameInMap("Spans")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpans> spans;

        // The ID of the trace.
        @NameInMap("TraceID")
        public String traceID;

        public static GetMultipleTraceResponseBodyMultiCallChainInfos build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseBodyMultiCallChainInfos self = new GetMultipleTraceResponseBodyMultiCallChainInfos();
            return TeaModel.build(map, self);
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfos setSpans(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpans> spans) {
            this.spans = spans;
            return this;
        }
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpans> getSpans() {
            return this.spans;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfos setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

}
