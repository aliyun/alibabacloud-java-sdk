// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceEventDataResponseData data;

    public static QueryDeviceEventDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventDataResponse self = new QueryDeviceEventDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceEventDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceEventDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventDataResponse setData(QueryDeviceEventDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceEventDataResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceEventDataResponseDataListEventInfo extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("OutputData")
        @Validation(required = true)
        public String outputData;

        public static QueryDeviceEventDataResponseDataListEventInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseDataListEventInfo self = new QueryDeviceEventDataResponseDataListEventInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseDataListEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceEventDataResponseDataListEventInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceEventDataResponseDataListEventInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceEventDataResponseDataListEventInfo setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryDeviceEventDataResponseDataListEventInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceEventDataResponseDataList extends TeaModel {
        @NameInMap("EventInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceEventDataResponseDataListEventInfo> eventInfo;

        public static QueryDeviceEventDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseDataList self = new QueryDeviceEventDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseDataList setEventInfo(java.util.List<QueryDeviceEventDataResponseDataListEventInfo> eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public java.util.List<QueryDeviceEventDataResponseDataListEventInfo> getEventInfo() {
            return this.eventInfo;
        }

    }

    public static class QueryDeviceEventDataResponseData extends TeaModel {
        @NameInMap("NextTime")
        @Validation(required = true)
        public Long nextTime;

        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceEventDataResponseDataList list;

        public static QueryDeviceEventDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventDataResponseData self = new QueryDeviceEventDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventDataResponseData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDeviceEventDataResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceEventDataResponseData setList(QueryDeviceEventDataResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceEventDataResponseDataList getList() {
            return this.list;
        }

    }

}
