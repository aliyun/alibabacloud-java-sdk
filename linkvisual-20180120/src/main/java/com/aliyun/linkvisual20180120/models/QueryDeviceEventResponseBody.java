// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDeviceEventResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventResponseBody self = new QueryDeviceEventResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceEventResponseBody setData(QueryDeviceEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceEventResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceEventResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceEventResponseBodyDataList extends TeaModel {
        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventTime")
        public String eventTime;

        @NameInMap("EventType")
        public Integer eventType;

        @NameInMap("EventPicId")
        public String eventPicId;

        @NameInMap("EventDesc")
        public String eventDesc;

        @NameInMap("EventData")
        public String eventData;

        public static QueryDeviceEventResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventResponseBodyDataList self = new QueryDeviceEventResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventResponseBodyDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryDeviceEventResponseBodyDataList setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public QueryDeviceEventResponseBodyDataList setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public QueryDeviceEventResponseBodyDataList setEventPicId(String eventPicId) {
            this.eventPicId = eventPicId;
            return this;
        }
        public String getEventPicId() {
            return this.eventPicId;
        }

        public QueryDeviceEventResponseBodyDataList setEventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }
        public String getEventDesc() {
            return this.eventDesc;
        }

        public QueryDeviceEventResponseBodyDataList setEventData(String eventData) {
            this.eventData = eventData;
            return this;
        }
        public String getEventData() {
            return this.eventData;
        }

    }

    public static class QueryDeviceEventResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryDeviceEventResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static QueryDeviceEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceEventResponseBodyData self = new QueryDeviceEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceEventResponseBodyData setList(java.util.List<QueryDeviceEventResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryDeviceEventResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryDeviceEventResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDeviceEventResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryDeviceEventResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryDeviceEventResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
