// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MultiCallChainInfos")
    public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> multiCallChainInfos;

    public static GetMultipleTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceResponseBody self = new GetMultipleTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultipleTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultipleTraceResponseBody setMultiCallChainInfos(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> multiCallChainInfos) {
        this.multiCallChainInfos = multiCallChainInfos;
        return this;
    }
    public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfos> getMultiCallChainInfos() {
        return this.multiCallChainInfos;
    }

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("TagEntryList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventListTagEntryList> tagEntryList;

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

    public static class GetMultipleTraceResponseBodyMultiCallChainInfosSpans extends TeaModel {
        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("RpcType")
        public Integer rpcType;

        @NameInMap("TagEntryList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> tagEntryList;

        @NameInMap("LogEventList")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> logEventList;

        @NameInMap("HaveStack")
        public Boolean haveStack;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("TraceID")
        public String traceID;

        public static GetMultipleTraceResponseBodyMultiCallChainInfosSpans build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseBodyMultiCallChainInfosSpans self = new GetMultipleTraceResponseBodyMultiCallChainInfosSpans();
            return TeaModel.build(map, self);
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setRpcType(Integer rpcType) {
            this.rpcType = rpcType;
            return this;
        }
        public Integer getRpcType() {
            return this.rpcType;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setTagEntryList(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setLogEventList(java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpansLogEventList> getLogEventList() {
            return this.logEventList;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetMultipleTraceResponseBodyMultiCallChainInfosSpans setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
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
        @NameInMap("Spans")
        public java.util.List<GetMultipleTraceResponseBodyMultiCallChainInfosSpans> spans;

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
