// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalEventDataResponse extends TeaModel {
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
    public QueryDeviceOriginalEventDataResponseData data;

    public static QueryDeviceOriginalEventDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalEventDataResponse self = new QueryDeviceOriginalEventDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalEventDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalEventDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalEventDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalEventDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalEventDataResponse setData(QueryDeviceOriginalEventDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalEventDataResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalEventDataResponseDataListEventInfo extends TeaModel {
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

        public static QueryDeviceOriginalEventDataResponseDataListEventInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseDataListEventInfo self = new QueryDeviceOriginalEventDataResponseDataListEventInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseDataListEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceOriginalEventDataResponseDataListEventInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalEventDataResponseDataListEventInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceOriginalEventDataResponseDataListEventInfo setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryDeviceOriginalEventDataResponseDataListEventInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceOriginalEventDataResponseDataList extends TeaModel {
        @NameInMap("EventInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceOriginalEventDataResponseDataListEventInfo> eventInfo;

        public static QueryDeviceOriginalEventDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseDataList self = new QueryDeviceOriginalEventDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseDataList setEventInfo(java.util.List<QueryDeviceOriginalEventDataResponseDataListEventInfo> eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalEventDataResponseDataListEventInfo> getEventInfo() {
            return this.eventInfo;
        }

    }

    public static class QueryDeviceOriginalEventDataResponseData extends TeaModel {
        @NameInMap("NextPageToken")
        @Validation(required = true)
        public String nextPageToken;

        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceOriginalEventDataResponseDataList list;

        public static QueryDeviceOriginalEventDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseData self = new QueryDeviceOriginalEventDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalEventDataResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalEventDataResponseData setList(QueryDeviceOriginalEventDataResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalEventDataResponseDataList getList() {
            return this.list;
        }

    }

}
