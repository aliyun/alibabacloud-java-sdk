// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceMissingIndexListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceMissingIndexListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AvgTotalUserCost")
        public Double avgTotalUserCost;

        @NameInMap("AvgUserImpact")
        public Double avgUserImpact;

        @NameInMap("CreateIndex")
        public String createIndex;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EqualityColumns")
        public String equalityColumns;

        @NameInMap("IncludedColumns")
        public String includedColumns;

        @NameInMap("IndexCount")
        public Long indexCount;

        @NameInMap("InequalityColumns")
        public String inequalityColumns;

        @NameInMap("LastUserSeek")
        public Long lastUserSeek;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("ReservedPages")
        public Long reservedPages;

        @NameInMap("ReservedSize")
        public Double reservedSize;

        @NameInMap("RowCount")
        public Long rowCount;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SystemScans")
        public Long systemScans;

        @NameInMap("SystemSeeks")
        public Long systemSeeks;

        @NameInMap("UniqueCompiles")
        public Long uniqueCompiles;

        @NameInMap("UserScans")
        public Long userScans;

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
        @NameInMap("List")
        public java.util.List<GetInstanceMissingIndexListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

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
