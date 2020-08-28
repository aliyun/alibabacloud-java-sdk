// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceEventResponseData data;

    public static QueryDeviceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventResponse self = new QueryDeviceEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceEventResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceEventResponse setData(QueryDeviceEventResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceEventResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceEventResponseDataList extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public String eventId;

        @NameInMap("EventTime")
        @Validation(required = true)
        public String eventTime;

        @NameInMap("EventType")
        @Validation(required = true)
        public Integer eventType;

        @NameInMap("EventDesc")
        @Validation(required = true)
        public String eventDesc;

        @NameInMap("EventPicId")
        @Validation(required = true)
        public String eventPicId;

        @NameInMap("EventData")
        @Validation(required = true)
        public String eventData;

        public static QueryDeviceEventResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventResponseDataList self = new QueryDeviceEventResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventResponseDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryDeviceEventResponseDataList setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public QueryDeviceEventResponseDataList setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public QueryDeviceEventResponseDataList setEventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }
        public String getEventDesc() {
            return this.eventDesc;
        }

        public QueryDeviceEventResponseDataList setEventPicId(String eventPicId) {
            this.eventPicId = eventPicId;
            return this;
        }
        public String getEventPicId() {
            return this.eventPicId;
        }

        public QueryDeviceEventResponseDataList setEventData(String eventData) {
            this.eventData = eventData;
            return this;
        }
        public String getEventData() {
            return this.eventData;
        }

    }

    public static class QueryDeviceEventResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryDeviceEventResponseDataList> list;

        public static QueryDeviceEventResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventResponseData self = new QueryDeviceEventResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDeviceEventResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDeviceEventResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryDeviceEventResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryDeviceEventResponseData setList(java.util.List<QueryDeviceEventResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryDeviceEventResponseDataList> getList() {
            return this.list;
        }

    }

}
