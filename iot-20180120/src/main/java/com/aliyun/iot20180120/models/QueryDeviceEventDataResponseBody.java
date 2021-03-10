// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceEventDataResponseBodyData data;

    public static QueryDeviceEventDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventDataResponseBody self = new QueryDeviceEventDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceEventDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceEventDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventDataResponseBody setData(QueryDeviceEventDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceEventDataResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceEventDataResponseBodyDataListEventInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("OutputData")
        public String outputData;

        public static QueryDeviceEventDataResponseBodyDataListEventInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseBodyDataListEventInfo self = new QueryDeviceEventDataResponseBodyDataListEventInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryDeviceEventDataResponseBodyDataListEventInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceEventDataResponseBodyDataList extends TeaModel {
        @NameInMap("EventInfo")
        public java.util.List<QueryDeviceEventDataResponseBodyDataListEventInfo> eventInfo;

        public static QueryDeviceEventDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseBodyDataList self = new QueryDeviceEventDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseBodyDataList setEventInfo(java.util.List<QueryDeviceEventDataResponseBodyDataListEventInfo> eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public java.util.List<QueryDeviceEventDataResponseBodyDataListEventInfo> getEventInfo() {
            return this.eventInfo;
        }

    }

    public static class QueryDeviceEventDataResponseBodyData extends TeaModel {
        @NameInMap("NextTime")
        public Long nextTime;

        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("List")
        public QueryDeviceEventDataResponseBodyDataList list;

        public static QueryDeviceEventDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseBodyData self = new QueryDeviceEventDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseBodyData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDeviceEventDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceEventDataResponseBodyData setList(QueryDeviceEventDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceEventDataResponseBodyDataList getList() {
            return this.list;
        }

    }

}
