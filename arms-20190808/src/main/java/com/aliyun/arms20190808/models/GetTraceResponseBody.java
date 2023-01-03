// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details of the trace.
    @NameInMap("Spans")
    public java.util.List<GetTraceResponseBodySpans> spans;

    public static GetTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponseBody self = new GetTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceResponseBody setSpans(java.util.List<GetTraceResponseBodySpans> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<GetTraceResponseBodySpans> getSpans() {
        return this.spans;
    }

    public static class GetTraceResponseBodySpansLogEventListTagEntryList extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodySpansLogEventListTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansLogEventListTagEntryList self = new GetTraceResponseBodySpansLogEventListTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansLogEventListTagEntryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodySpansLogEventListTagEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodySpansLogEventList extends TeaModel {
        // The tags of the trace.
        @NameInMap("TagEntryList")
        public java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> tagEntryList;

        // The timestamp when the log event was generated.
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetTraceResponseBodySpansLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansLogEventList self = new GetTraceResponseBodySpansLogEventList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansLogEventList setTagEntryList(java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpansLogEventList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetTraceResponseBodySpansTagEntryList extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodySpansTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansTagEntryList self = new GetTraceResponseBodySpansTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansTagEntryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodySpansTagEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodySpans extends TeaModel {
        // The child spans of the current span.
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

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
        public java.util.List<GetTraceResponseBodySpansLogEventList> logEventList;

        // The name of the traced span.
        @NameInMap("OperationName")
        public String operationName;

        // The ID of the parent span.
        @NameInMap("ParentSpanId")
        public String parentSpanId;

        // The returned code.
        @NameInMap("ResultCode")
        public String resultCode;

        // The ID of the remote procedure call (RPC) mode.
        @NameInMap("RpcId")
        public String rpcId;

        // The type of the remote procedure call (RPC) mode.
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
        public java.util.List<GetTraceResponseBodySpansTagEntryList> tagEntryList;

        // The timestamp when the span was generated.
        @NameInMap("Timestamp")
        public Long timestamp;

        // The ID of the trace.
        @NameInMap("TraceID")
        public String traceID;

        public static GetTraceResponseBodySpans build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpans self = new GetTraceResponseBodySpans();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpans setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public GetTraceResponseBodySpans setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetTraceResponseBodySpans setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetTraceResponseBodySpans setLogEventList(java.util.List<GetTraceResponseBodySpansLogEventList> logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansLogEventList> getLogEventList() {
            return this.logEventList;
        }

        public GetTraceResponseBodySpans setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetTraceResponseBodySpans setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public GetTraceResponseBodySpans setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetTraceResponseBodySpans setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetTraceResponseBodySpans setRpcType(Integer rpcType) {
            this.rpcType = rpcType;
            return this;
        }
        public Integer getRpcType() {
            return this.rpcType;
        }

        public GetTraceResponseBodySpans setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetTraceResponseBodySpans setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetTraceResponseBodySpans setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public GetTraceResponseBodySpans setTagEntryList(java.util.List<GetTraceResponseBodySpansTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpans setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetTraceResponseBodySpans setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

}
