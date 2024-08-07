// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceMissingIndexListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public GetInstanceMissingIndexListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetInstanceMissingIndexListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMissingIndexListResponseBody self = new GetInstanceMissingIndexListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceMissingIndexListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceMissingIndexListResponseBody setData(GetInstanceMissingIndexListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceMissingIndexListResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceMissingIndexListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceMissingIndexListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceMissingIndexListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceMissingIndexListResponseBodyDataList extends TeaModel {
        /**
         * <p>The average cost savings.</p>
         * 
         * <strong>example:</strong>
         * <p>4.67</p>
         */
        @NameInMap("AvgTotalUserCost")
        public Double avgTotalUserCost;

        /**
         * <p>The performance improvement, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>98.3</p>
         */
        @NameInMap("AvgUserImpact")
        public Double avgUserImpact;

        /**
         * <p>The statement used to create the missing indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE INDEX [IX_CLOUDDBA_school_dbo_stu@col1_@col2] ON [school].[dbo].<a href="%5Bcol1%5D,%5Bcol2%5D,%5Bcol3%5D">stu</a> INCLUDE ([col4],[col5]) WITH (FILLFACTOR = 90, ONLINE = OFF);</p>
         */
        @NameInMap("CreateIndex")
        public String createIndex;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>school</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The index columns included in the equal operation.</p>
         * 
         * <strong>example:</strong>
         * <p>col1,col2,col3</p>
         */
        @NameInMap("EqualityColumns")
        public String equalityColumns;

        /**
         * <p>The columns on which indexes are missing.</p>
         * 
         * <strong>example:</strong>
         * <p>col3,col4</p>
         */
        @NameInMap("IncludedColumns")
        public String includedColumns;

        /**
         * <p>The number of indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndexCount")
        public Long indexCount;

        /**
         * <p>The index columns included in the not equal operation.</p>
         * 
         * <strong>example:</strong>
         * <p>2392</p>
         */
        @NameInMap("InequalityColumns")
        public String inequalityColumns;

        /**
         * <p>The last seek time of a user.</p>
         * 
         * <strong>example:</strong>
         * <p>1702023327000</p>
         */
        @NameInMap("LastUserSeek")
        public Long lastUserSeek;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>stu</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5025</p>
         */
        @NameInMap("ReservedPages")
        public Long reservedPages;

        /**
         * <p>The table size.</p>
         * 
         * <strong>example:</strong>
         * <p>39.26</p>
         */
        @NameInMap("ReservedSize")
        public Double reservedSize;

        /**
         * <p>The number of table rows.</p>
         * 
         * <strong>example:</strong>
         * <p>226945</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>dbo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The number of scans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SystemScans")
        public Long systemScans;

        /**
         * <p>The number of seeks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SystemSeeks")
        public Long systemSeeks;

        /**
         * <p>The number of compilations.</p>
         * 
         * <strong>example:</strong>
         * <p>2392</p>
         */
        @NameInMap("UniqueCompiles")
        public Long uniqueCompiles;

        /**
         * <p>The number of scans performed by users.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UserScans")
        public Long userScans;

        /**
         * <p>The number of seeks performed by users.</p>
         * 
         * <strong>example:</strong>
         * <p>1081</p>
         */
        @NameInMap("UserSeeks")
        public Long userSeeks;

        public static GetInstanceMissingIndexListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMissingIndexListResponseBodyDataList self = new GetInstanceMissingIndexListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetInstanceMissingIndexListResponseBodyDataList setAvgTotalUserCost(Double avgTotalUserCost) {
            this.avgTotalUserCost = avgTotalUserCost;
            return this;
        }
        public Double getAvgTotalUserCost() {
            return this.avgTotalUserCost;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setAvgUserImpact(Double avgUserImpact) {
            this.avgUserImpact = avgUserImpact;
            return this;
        }
        public Double getAvgUserImpact() {
            return this.avgUserImpact;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setCreateIndex(String createIndex) {
            this.createIndex = createIndex;
            return this;
        }
        public String getCreateIndex() {
            return this.createIndex;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setEqualityColumns(String equalityColumns) {
            this.equalityColumns = equalityColumns;
            return this;
        }
        public String getEqualityColumns() {
            return this.equalityColumns;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setIncludedColumns(String includedColumns) {
            this.includedColumns = includedColumns;
            return this;
        }
        public String getIncludedColumns() {
            return this.includedColumns;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setIndexCount(Long indexCount) {
            this.indexCount = indexCount;
            return this;
        }
        public Long getIndexCount() {
            return this.indexCount;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setInequalityColumns(String inequalityColumns) {
            this.inequalityColumns = inequalityColumns;
            return this;
        }
        public String getInequalityColumns() {
            return this.inequalityColumns;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setLastUserSeek(Long lastUserSeek) {
            this.lastUserSeek = lastUserSeek;
            return this;
        }
        public Long getLastUserSeek() {
            return this.lastUserSeek;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setReservedPages(Long reservedPages) {
            this.reservedPages = reservedPages;
            return this;
        }
        public Long getReservedPages() {
            return this.reservedPages;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setReservedSize(Double reservedSize) {
            this.reservedSize = reservedSize;
            return this;
        }
        public Double getReservedSize() {
            return this.reservedSize;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setSystemScans(Long systemScans) {
            this.systemScans = systemScans;
            return this;
        }
        public Long getSystemScans() {
            return this.systemScans;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setSystemSeeks(Long systemSeeks) {
            this.systemSeeks = systemSeeks;
            return this;
        }
        public Long getSystemSeeks() {
            return this.systemSeeks;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setUniqueCompiles(Long uniqueCompiles) {
            this.uniqueCompiles = uniqueCompiles;
            return this;
        }
        public Long getUniqueCompiles() {
            return this.uniqueCompiles;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setUserScans(Long userScans) {
            this.userScans = userScans;
            return this;
        }
        public Long getUserScans() {
            return this.userScans;
        }

        public GetInstanceMissingIndexListResponseBodyDataList setUserSeeks(Long userSeeks) {
            this.userSeeks = userSeeks;
            return this;
        }
        public Long getUserSeeks() {
            return this.userSeeks;
        }

    }

    public static class GetInstanceMissingIndexListResponseBodyData extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("List")
        public java.util.List<GetInstanceMissingIndexListResponseBodyDataList> list;

        /**
         * <p>The page number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInstanceMissingIndexListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMissingIndexListResponseBodyData self = new GetInstanceMissingIndexListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceMissingIndexListResponseBodyData setList(java.util.List<GetInstanceMissingIndexListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetInstanceMissingIndexListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetInstanceMissingIndexListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetInstanceMissingIndexListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetInstanceMissingIndexListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
