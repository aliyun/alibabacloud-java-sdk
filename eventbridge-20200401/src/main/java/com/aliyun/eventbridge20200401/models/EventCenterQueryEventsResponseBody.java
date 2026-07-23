// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterQueryEventsResponseBody extends TeaModel {
    /**
     * <p>The status of the API call, which can be Success or a POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public EventCenterQueryEventsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Limit is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DAF96FB-A4B6-548C-B999-XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>A query result entry, represented as a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;id&quot;:&quot;xxx&quot;,
         *   &quot;source&quot;:&quot;acs.ecs&quot;
         * }</p>
         */
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
        /**
         * <p>A query result entry, represented as a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;id&quot;:&quot;xxx&quot;,
         *   &quot;source&quot;:&quot;acs.ecs&quot;
         * }</p>
         */
        @NameInMap("RowData")
        public java.util.Map<String, ?> rowData;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1683561600000</p>
         */
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
        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to retrieve the next page of results. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The query results for the <code>table</code> query type.</p>
         */
        @NameInMap("Table")
        public java.util.List<EventCenterQueryEventsResponseBodyDataTable> table;

        /**
         * <p>The query results for the <code>time series</code> query type.</p>
         */
        @NameInMap("TimeSeries")
        public java.util.List<EventCenterQueryEventsResponseBodyDataTimeSeries> timeSeries;

        /**
         * <p>The total number of entries that meet the filter conditions. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
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
