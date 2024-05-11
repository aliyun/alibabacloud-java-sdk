// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterQueryEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EventCenterQueryEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EventCenterQueryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EventCenterQueryEventsResponseBody self = new EventCenterQueryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public EventCenterQueryEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EventCenterQueryEventsResponseBody setData(EventCenterQueryEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EventCenterQueryEventsResponseBodyData getData() {
        return this.data;
    }

    public EventCenterQueryEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EventCenterQueryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EventCenterQueryEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EventCenterQueryEventsResponseBodyDataTable extends TeaModel {
        @NameInMap("RowData")
        public java.util.Map<String, ?> rowData;

        public static EventCenterQueryEventsResponseBodyDataTable build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsResponseBodyDataTable self = new EventCenterQueryEventsResponseBodyDataTable();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsResponseBodyDataTable setRowData(java.util.Map<String, ?> rowData) {
            this.rowData = rowData;
            return this;
        }
        public java.util.Map<String, ?> getRowData() {
            return this.rowData;
        }

    }

    public static class EventCenterQueryEventsResponseBodyDataTimeSeries extends TeaModel {
        @NameInMap("RowData")
        public java.util.Map<String, ?> rowData;

        @NameInMap("Time")
        public String time;

        public static EventCenterQueryEventsResponseBodyDataTimeSeries build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsResponseBodyDataTimeSeries self = new EventCenterQueryEventsResponseBodyDataTimeSeries();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsResponseBodyDataTimeSeries setRowData(java.util.Map<String, ?> rowData) {
            this.rowData = rowData;
            return this;
        }
        public java.util.Map<String, ?> getRowData() {
            return this.rowData;
        }

        public EventCenterQueryEventsResponseBodyDataTimeSeries setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class EventCenterQueryEventsResponseBodyData extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Table")
        public java.util.List<EventCenterQueryEventsResponseBodyDataTable> table;

        @NameInMap("TimeSeries")
        public java.util.List<EventCenterQueryEventsResponseBodyDataTimeSeries> timeSeries;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static EventCenterQueryEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsResponseBodyData self = new EventCenterQueryEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public EventCenterQueryEventsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public EventCenterQueryEventsResponseBodyData setTable(java.util.List<EventCenterQueryEventsResponseBodyDataTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<EventCenterQueryEventsResponseBodyDataTable> getTable() {
            return this.table;
        }

        public EventCenterQueryEventsResponseBodyData setTimeSeries(java.util.List<EventCenterQueryEventsResponseBodyDataTimeSeries> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }
        public java.util.List<EventCenterQueryEventsResponseBodyDataTimeSeries> getTimeSeries() {
            return this.timeSeries;
        }

        public EventCenterQueryEventsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
