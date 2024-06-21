// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceResponseBody extends TeaModel {
    /**
     * <p>The details of traces.</p>
     */
    @NameInMap("MultiCallChainInfos")
    public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> multiCallChainInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>http.status.code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
        /**
         * <p>The tags of the trace.</p>
         */
        @NameInMap("TagEntryList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList> tagEntryList;

        /**
         * <p>The time when the log was generated. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1595174501747</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>http.status.code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
        /**
         * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Indicates whether a method stack was provided.</p>
         * <ul>
         * <li><code>true</code>: A method stack was provided.</li>
         * <li><code>false</code>: No method stack was provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HaveStack")
        public Boolean haveStack;

        /**
         * <p>The log events in the trace.</p>
         */
        @NameInMap("LogEventList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> logEventList;

        /**
         * <p>The name of the traced span.</p>
         * 
         * <strong>example:</strong>
         * <p>/demo/queryNotExistDB/11</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The ID of the parent span.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("ParentSpanId")
        public String parentSpanId;

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>RPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>The type of the remote procedure call (RPC) mode.</p>
         * <ul>
         * <li>0: HTTP entry</li>
         * <li>25: HTTP call</li>
         * <li>1: High-speed Service Framework (HSF) call</li>
         * <li>2: HSF provision</li>
         * <li>40: on-premises API call</li>
         * <li>60: MySQL call</li>
         * <li>62: Oracle call</li>
         * <li>63: PostgreSQL call</li>
         * <li>70: Redis call</li>
         * <li>4: Taobao Distributed Data Layer (TDDL) call</li>
         * <li>5: Tair call</li>
         * <li>13: MetaQ message sending</li>
         * <li>252: MetaQ message receiving</li>
         * <li>3: notification sending</li>
         * <li>254: notification receiving</li>
         * <li>7: Apache Dubbo call</li>
         * <li>8: Apache Dubbo provision</li>
         * <li>19: SOFARPC call</li>
         * <li>18: SOFARPC provision</li>
         * <li>11: Distributed Service Framework (DSF) call</li>
         * <li>12: DSF provision</li>
         * <li>\-1: unknown call</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RpcType")
        public Integer rpcType;

        /**
         * <p>The IP address of the host where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.XX.XX</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-k8s-demo-subcomponent</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The span ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("SpanId")
        public String spanId;

        /**
         * <p>The tags of the trace.</p>
         */
        @NameInMap("TagEntryList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> tagEntryList;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1595174501747</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1400a115951745017447033d****</p>
         */
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
        /**
         * <p>The details of the trace.</p>
         */
        @NameInMap("Spans")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpans> spans;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1400a115951745017447033d****</p>
         */
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
