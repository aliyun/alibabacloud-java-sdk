// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalEventDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceOriginalEventDataResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceOriginalEventDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalEventDataResponseBody self = new QueryDeviceOriginalEventDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalEventDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalEventDataResponseBody setData(QueryDeviceOriginalEventDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalEventDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceOriginalEventDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalEventDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalEventDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceOriginalEventDataResponseBodyDataListEventInfo extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputData")
        public String outputData;

        @NameInMap("Time")
        public String time;

        public static QueryDeviceOriginalEventDataResponseBodyDataListEventInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseBodyDataListEventInfo self = new QueryDeviceOriginalEventDataResponseBodyDataListEventInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public QueryDeviceOriginalEventDataResponseBodyDataListEventInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceOriginalEventDataResponseBodyDataList extends TeaModel {
        @NameInMap("EventInfo")
        public java.util.List<QueryDeviceOriginalEventDataResponseBodyDataListEventInfo> eventInfo;

        public static QueryDeviceOriginalEventDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseBodyDataList self = new QueryDeviceOriginalEventDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseBodyDataList setEventInfo(java.util.List<QueryDeviceOriginalEventDataResponseBodyDataListEventInfo> eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalEventDataResponseBodyDataListEventInfo> getEventInfo() {
            return this.eventInfo;
        }

    }

    public static class QueryDeviceOriginalEventDataResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDeviceOriginalEventDataResponseBodyDataList list;

        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceOriginalEventDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalEventDataResponseBodyData self = new QueryDeviceOriginalEventDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalEventDataResponseBodyData setList(QueryDeviceOriginalEventDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalEventDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceOriginalEventDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalEventDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
