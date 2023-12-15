// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTraceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponseBody self = new GetTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceResponseBody setData(GetTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTraceResponseBodyData getData() {
        return this.data;
    }

    public GetTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry self = new GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList extends TeaModel {
        @NameInMap("TagEntry")
        public java.util.List<GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry> tagEntry;

        public static GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList self = new GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList setTagEntry(java.util.List<GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry> tagEntry) {
            this.tagEntry = tagEntry;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryListTagEntry> getTagEntry() {
            return this.tagEntry;
        }

    }

    public static class GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent extends TeaModel {
        @NameInMap("TagEntryList")
        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList tagEntryList;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent self = new GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent setTagEntryList(GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEventTagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetTraceResponseBodyDataCallChainInfoLogEventList extends TeaModel {
        @NameInMap("LogEvent")
        public java.util.List<GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent> logEvent;

        public static GetTraceResponseBodyDataCallChainInfoLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfoLogEventList self = new GetTraceResponseBodyDataCallChainInfoLogEventList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfoLogEventList setLogEvent(java.util.List<GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent> logEvent) {
            this.logEvent = logEvent;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataCallChainInfoLogEventListLogEvent> getLogEvent() {
            return this.logEvent;
        }

    }

    public static class GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry self = new GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodyDataCallChainInfoTagEntryList extends TeaModel {
        @NameInMap("TagEntry")
        public java.util.List<GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry> tagEntry;

        public static GetTraceResponseBodyDataCallChainInfoTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfoTagEntryList self = new GetTraceResponseBodyDataCallChainInfoTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfoTagEntryList setTagEntry(java.util.List<GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry> tagEntry) {
            this.tagEntry = tagEntry;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataCallChainInfoTagEntryListTagEntry> getTagEntry() {
            return this.tagEntry;
        }

    }

    public static class GetTraceResponseBodyDataCallChainInfo extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("HaveStack")
        public Boolean haveStack;

        @NameInMap("LogEventList")
        public GetTraceResponseBodyDataCallChainInfoLogEventList logEventList;

        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("TagEntryList")
        public GetTraceResponseBodyDataCallChainInfoTagEntryList tagEntryList;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TraceID")
        public String traceID;

        public static GetTraceResponseBodyDataCallChainInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyDataCallChainInfo self = new GetTraceResponseBodyDataCallChainInfo();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyDataCallChainInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetTraceResponseBodyDataCallChainInfo setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetTraceResponseBodyDataCallChainInfo setLogEventList(GetTraceResponseBodyDataCallChainInfoLogEventList logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public GetTraceResponseBodyDataCallChainInfoLogEventList getLogEventList() {
            return this.logEventList;
        }

        public GetTraceResponseBodyDataCallChainInfo setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetTraceResponseBodyDataCallChainInfo setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetTraceResponseBodyDataCallChainInfo setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetTraceResponseBodyDataCallChainInfo setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetTraceResponseBodyDataCallChainInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetTraceResponseBodyDataCallChainInfo setTagEntryList(GetTraceResponseBodyDataCallChainInfoTagEntryList tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public GetTraceResponseBodyDataCallChainInfoTagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodyDataCallChainInfo setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetTraceResponseBodyDataCallChainInfo setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

    public static class GetTraceResponseBodyData extends TeaModel {
        @NameInMap("CallChainInfo")
        public java.util.List<GetTraceResponseBodyDataCallChainInfo> callChainInfo;

        public static GetTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodyData self = new GetTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodyData setCallChainInfo(java.util.List<GetTraceResponseBodyDataCallChainInfo> callChainInfo) {
            this.callChainInfo = callChainInfo;
            return this;
        }
        public java.util.List<GetTraceResponseBodyDataCallChainInfo> getCallChainInfo() {
            return this.callChainInfo;
        }

    }

}
