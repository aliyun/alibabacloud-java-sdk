// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchTableList")
    public SearchTableResponseBodySearchTableList searchTableList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTableResponseBody self = new SearchTableResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTableResponseBody setSearchTableList(SearchTableResponseBodySearchTableList searchTableList) {
        this.searchTableList = searchTableList;
        return this;
    }
    public SearchTableResponseBodySearchTableList getSearchTableList() {
        return this.searchTableList;
    }

    public SearchTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchTableResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchTableResponseBodySearchTableListSearchTableOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static SearchTableResponseBodySearchTableListSearchTableOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            SearchTableResponseBodySearchTableListSearchTableOwnerIdList self = new SearchTableResponseBodySearchTableListSearchTableOwnerIdList();
            return TeaModel.build(map, self);
        }

        public SearchTableResponseBodySearchTableListSearchTableOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class SearchTableResponseBodySearchTableListSearchTableOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static SearchTableResponseBodySearchTableListSearchTableOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            SearchTableResponseBodySearchTableListSearchTableOwnerNameList self = new SearchTableResponseBodySearchTableListSearchTableOwnerNameList();
            return TeaModel.build(map, self);
        }

        public SearchTableResponseBodySearchTableListSearchTableOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class SearchTableResponseBodySearchTableListSearchTable extends TeaModel {
        @NameInMap("DBSearchName")
        public String DBSearchName;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("OwnerIdList")
        public SearchTableResponseBodySearchTableListSearchTableOwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        public SearchTableResponseBodySearchTableListSearchTableOwnerNameList ownerNameList;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableSchemaName")
        public String tableSchemaName;

        public static SearchTableResponseBodySearchTableListSearchTable build(java.util.Map<String, ?> map) throws Exception {
            SearchTableResponseBodySearchTableListSearchTable self = new SearchTableResponseBodySearchTableListSearchTable();
            return TeaModel.build(map, self);
        }

        public SearchTableResponseBodySearchTableListSearchTable setDBSearchName(String DBSearchName) {
            this.DBSearchName = DBSearchName;
            return this;
        }
        public String getDBSearchName() {
            return this.DBSearchName;
        }

        public SearchTableResponseBodySearchTableListSearchTable setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public SearchTableResponseBodySearchTableListSearchTable setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchTableResponseBodySearchTableListSearchTable setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchTableResponseBodySearchTableListSearchTable setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchTableResponseBodySearchTableListSearchTable setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public SearchTableResponseBodySearchTableListSearchTable setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public SearchTableResponseBodySearchTableListSearchTable setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public SearchTableResponseBodySearchTableListSearchTable setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public SearchTableResponseBodySearchTableListSearchTable setOwnerIdList(SearchTableResponseBodySearchTableListSearchTableOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public SearchTableResponseBodySearchTableListSearchTableOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public SearchTableResponseBodySearchTableListSearchTable setOwnerNameList(SearchTableResponseBodySearchTableListSearchTableOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public SearchTableResponseBodySearchTableListSearchTableOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public SearchTableResponseBodySearchTableListSearchTable setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public SearchTableResponseBodySearchTableListSearchTable setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public SearchTableResponseBodySearchTableListSearchTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public SearchTableResponseBodySearchTableListSearchTable setTableSchemaName(String tableSchemaName) {
            this.tableSchemaName = tableSchemaName;
            return this;
        }
        public String getTableSchemaName() {
            return this.tableSchemaName;
        }

    }

    public static class SearchTableResponseBodySearchTableList extends TeaModel {
        @NameInMap("SearchTable")
        public java.util.List<SearchTableResponseBodySearchTableListSearchTable> searchTable;

        public static SearchTableResponseBodySearchTableList build(java.util.Map<String, ?> map) throws Exception {
            SearchTableResponseBodySearchTableList self = new SearchTableResponseBodySearchTableList();
            return TeaModel.build(map, self);
        }

        public SearchTableResponseBodySearchTableList setSearchTable(java.util.List<SearchTableResponseBodySearchTableListSearchTable> searchTable) {
            this.searchTable = searchTable;
            return this;
        }
        public java.util.List<SearchTableResponseBodySearchTableListSearchTable> getSearchTable() {
            return this.searchTable;
        }

    }

}
