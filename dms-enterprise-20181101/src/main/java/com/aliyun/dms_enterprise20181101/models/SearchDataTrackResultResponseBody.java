// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDataTrackResultResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The parsing result of the data tracking task.</p>
     */
    @NameInMap("TrackResult")
    public SearchDataTrackResultResponseBodyTrackResult trackResult;

    public static SearchDataTrackResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDataTrackResultResponseBody self = new SearchDataTrackResultResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDataTrackResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchDataTrackResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchDataTrackResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchDataTrackResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchDataTrackResultResponseBody setTrackResult(SearchDataTrackResultResponseBodyTrackResult trackResult) {
        this.trackResult = trackResult;
        return this;
    }
    public SearchDataTrackResultResponseBodyTrackResult getTrackResult() {
        return this.trackResult;
    }

    public static class SearchDataTrackResultResponseBodyTrackResultEventList extends TeaModel {
        /**
         * <p>The data records after you perform data operations in the database.</p>
         */
        @NameInMap("DataAfter")
        public java.util.List<String> dataAfter;

        /**
         * <p>The data records before you perform data operations in the database.</p>
         */
        @NameInMap("DataBefore")
        public java.util.List<String> dataBefore;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        /**
         * <p>The length of the event content. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4324</p>
         */
        @NameInMap("EventLength")
        public Long eventLength;

        /**
         * <p>The event time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 10:25:47</p>
         */
        @NameInMap("EventTimestamp")
        public String eventTimestamp;

        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li><strong>WRITE_ROWS</strong>: indicates an INSERT operation.</li>
         * <li><strong>UPDATE_ROWS</strong>: indicates an UPDATE operation.</li>
         * <li><strong>DELETE_ROWS</strong>: indicates a DELETE operation.</li>
         * <li><strong>EXT_WRITE_ROWS</strong>: indicates an INSERT operation, which is equivalent to WRITE_ROWS.</li>
         * <li><strong>EXT_UPDATE_ROWS</strong>: indicates an UPDATE operation, which is equivalent to UPDATE_ROWS.</li>
         * <li><strong>EXT_DELETE_ROWS</strong>: indicates a DELETE operation, which is equivalent to DELETE_ROWS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPDATE_ROWS</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The SQL statements used to roll back the data change.</p>
         * 
         * <strong>example:</strong>
         * <p>-- Timestamp:2023-04-23 10:25:47 #1\r\nUPDATE <code>dc_test</code>.<code>tb_chunk_dml</code> SET <code>id</code>=1 , <code>gmt_create</code>=\&quot;2021-09-30T00:00:00\&quot; , <code>content</code>=\&quot;2023-03-30 14:51:50\&quot; , <code>c1</code>=\&quot;2023-04-17 13:42:03\&quot; , <code>c_id</code>=1 , <code>c13425</code>=\&quot;b\\\&quot;\&quot; , <code>c432532535</code>= null , <code>c1432</code>= null , <code>c143243253</code>= null , <code>c1432535</code>= null , <code>c43125325</code>= null , <code>c3425325</code>= null WHERE  (<code>id</code>=1)&quot;</p>
         */
        @NameInMap("RollSQL")
        public String rollSQL;

        public static SearchDataTrackResultResponseBodyTrackResultEventList build(java.util.Map<String, ?> map) throws Exception {
            SearchDataTrackResultResponseBodyTrackResultEventList self = new SearchDataTrackResultResponseBodyTrackResultEventList();
            return TeaModel.build(map, self);
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setDataAfter(java.util.List<String> dataAfter) {
            this.dataAfter = dataAfter;
            return this;
        }
        public java.util.List<String> getDataAfter() {
            return this.dataAfter;
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setDataBefore(java.util.List<String> dataBefore) {
            this.dataBefore = dataBefore;
            return this;
        }
        public java.util.List<String> getDataBefore() {
            return this.dataBefore;
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setEventLength(Long eventLength) {
            this.eventLength = eventLength;
            return this;
        }
        public Long getEventLength() {
            return this.eventLength;
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setEventTimestamp(String eventTimestamp) {
            this.eventTimestamp = eventTimestamp;
            return this;
        }
        public String getEventTimestamp() {
            return this.eventTimestamp;
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public SearchDataTrackResultResponseBodyTrackResultEventList setRollSQL(String rollSQL) {
            this.rollSQL = rollSQL;
            return this;
        }
        public String getRollSQL() {
            return this.rollSQL;
        }

    }

    public static class SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns extends TeaModel {
        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>basic_platform</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The position of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ColumnPosition")
        public Integer columnPosition;

        /**
         * <p>The data type of the column. Examples: BIGINT, INT, and VARCHAR.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>Indicates whether the column is a virtual column. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Fictive")
        public Boolean fictive;

        public static SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns build(java.util.Map<String, ?> map) throws Exception {
            SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns self = new SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns();
            return TeaModel.build(map, self);
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns setColumnPosition(Integer columnPosition) {
            this.columnPosition = columnPosition;
            return this;
        }
        public Integer getColumnPosition() {
            return this.columnPosition;
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns setFictive(Boolean fictive) {
            this.fictive = fictive;
            return this;
        }
        public Boolean getFictive() {
            return this.fictive;
        }

    }

    public static class SearchDataTrackResultResponseBodyTrackResultTableInfoList extends TeaModel {
        /**
         * <p>The information about columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns> columns;

        /**
         * <p>The description of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_eb_vas</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>import_table_test1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static SearchDataTrackResultResponseBodyTrackResultTableInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchDataTrackResultResponseBodyTrackResultTableInfoList self = new SearchDataTrackResultResponseBodyTrackResultTableInfoList();
            return TeaModel.build(map, self);
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoList setColumns(java.util.List<SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<SearchDataTrackResultResponseBodyTrackResultTableInfoListColumns> getColumns() {
            return this.columns;
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public SearchDataTrackResultResponseBodyTrackResultTableInfoList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class SearchDataTrackResultResponseBodyTrackResult extends TeaModel {
        /**
         * <p>The details of the event logs.</p>
         */
        @NameInMap("EventList")
        public java.util.List<SearchDataTrackResultResponseBodyTrackResultEventList> eventList;

        /**
         * <p>The metadata of tables for which you track data operations.</p>
         */
        @NameInMap("TableInfoList")
        public java.util.List<SearchDataTrackResultResponseBodyTrackResultTableInfoList> tableInfoList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchDataTrackResultResponseBodyTrackResult build(java.util.Map<String, ?> map) throws Exception {
            SearchDataTrackResultResponseBodyTrackResult self = new SearchDataTrackResultResponseBodyTrackResult();
            return TeaModel.build(map, self);
        }

        public SearchDataTrackResultResponseBodyTrackResult setEventList(java.util.List<SearchDataTrackResultResponseBodyTrackResultEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<SearchDataTrackResultResponseBodyTrackResultEventList> getEventList() {
            return this.eventList;
        }

        public SearchDataTrackResultResponseBodyTrackResult setTableInfoList(java.util.List<SearchDataTrackResultResponseBodyTrackResultTableInfoList> tableInfoList) {
            this.tableInfoList = tableInfoList;
            return this;
        }
        public java.util.List<SearchDataTrackResultResponseBodyTrackResultTableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        public SearchDataTrackResultResponseBodyTrackResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
