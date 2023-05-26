// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the trace.</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The tags of the trace.</p>
         */
        @NameInMap("TagEntryList")
        public java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> tagEntryList;

        /**
         * <p>The timestamp when the log event was generated.</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The child spans of the current span.</p>
         */
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

        /**
         * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Indicates whether a method stack was provided.</p>
         * <br>
         * <p>*   `true`: A method stack was provided.</p>
         * <p>*   `false`: No method stack was provided.</p>
         */
        @NameInMap("HaveStack")
        public Boolean haveStack;

        /**
         * <p>The log events in the trace.</p>
         */
        @NameInMap("LogEventList")
        public java.util.List<GetTraceResponseBodySpansLogEventList> logEventList;

        /**
         * <p>The name of the traced span.</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The ID of the parent span.</p>
         */
        @NameInMap("ParentSpanId")
        public String parentSpanId;

        /**
         * <p>The status code.</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The ID of the RPC mode.</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>The type of the remote procedure call (RPC) mode.</p>
         * <br>
         * <p>*   0: HTTP entry</p>
         * <p>*   25: HTTP call</p>
         * <p>*   1: High-speed Service Framework (HSF) call</p>
         * <p>*   2: HSF provision</p>
         * <p>*   40: on-premises API call</p>
         * <p>*   60: MySQL call</p>
         * <p>*   62: Oracle call</p>
         * <p>*   63: PostgreSQL call</p>
         * <p>*   70: Redis call</p>
         * <p>*   4: Taobao Distributed Data Layer (TDDL) call</p>
         * <p>*   5: Tair call</p>
         * <p>*   13: MetaQ message sending</p>
         * <p>*   252: MetaQ message receiving</p>
         * <p>*   3: notification sending</p>
         * <p>*   254: notification receiving</p>
         * <p>*   7: Apache Dubbo call</p>
         * <p>*   8: Apache Dubbo provision</p>
         * <p>*   19: SOFARPC call</p>
         * <p>*   18: SOFARPC provision</p>
         * <p>*   11: Distributed Service Framework (DSF) call</p>
         * <p>*   12: DSF provision</p>
         * <p>*   \-1: unknown call</p>
         */
        @NameInMap("RpcType")
        public Integer rpcType;

        /**
         * <p>The IP address of the host where the application resides.</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The span ID.</p>
         */
        @NameInMap("SpanId")
        public String spanId;

        /**
         * <p>The tags of the trace.</p>
         */
        @NameInMap("TagEntryList")
        public java.util.List<GetTraceResponseBodySpansTagEntryList> tagEntryList;

        /**
         * <p>The timestamp generated when the span was generated.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The trace ID.</p>
         */
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
