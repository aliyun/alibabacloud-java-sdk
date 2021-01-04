// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("TableList")
    public ListTablesResponseBodyTableList tableList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTablesResponseBody setTableList(ListTablesResponseBodyTableList tableList) {
        this.tableList = tableList;
        return this;
    }
    public ListTablesResponseBodyTableList getTableList() {
        return this.tableList;
    }

    public ListTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTablesResponseBodyTableListTableOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static ListTablesResponseBodyTableListTableOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyTableListTableOwnerIdList self = new ListTablesResponseBodyTableListTableOwnerIdList();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyTableListTableOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class ListTablesResponseBodyTableListTableOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static ListTablesResponseBodyTableListTableOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyTableListTableOwnerNameList self = new ListTablesResponseBodyTableListTableOwnerNameList();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyTableListTableOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class ListTablesResponseBodyTableListTable extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("StoreCapacity")
        public Long storeCapacity;

        @NameInMap("OwnerIdList")
        public ListTablesResponseBodyTableListTableOwnerIdList ownerIdList;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("OwnerNameList")
        public ListTablesResponseBodyTableListTableOwnerNameList ownerNameList;

        @NameInMap("TableSchemaName")
        public String tableSchemaName;

        @NameInMap("TableType")
        public String tableType;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("NumRows")
        public Long numRows;

        @NameInMap("TableId")
        public String tableId;

        public static ListTablesResponseBodyTableListTable build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyTableListTable self = new ListTablesResponseBodyTableListTable();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyTableListTable setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListTablesResponseBodyTableListTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListTablesResponseBodyTableListTable setStoreCapacity(Long storeCapacity) {
            this.storeCapacity = storeCapacity;
            return this;
        }
        public Long getStoreCapacity() {
            return this.storeCapacity;
        }

        public ListTablesResponseBodyTableListTable setOwnerIdList(ListTablesResponseBodyTableListTableOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListTablesResponseBodyTableListTableOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListTablesResponseBodyTableListTable setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTablesResponseBodyTableListTable setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ListTablesResponseBodyTableListTable setOwnerNameList(ListTablesResponseBodyTableListTableOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListTablesResponseBodyTableListTableOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListTablesResponseBodyTableListTable setTableSchemaName(String tableSchemaName) {
            this.tableSchemaName = tableSchemaName;
            return this;
        }
        public String getTableSchemaName() {
            return this.tableSchemaName;
        }

        public ListTablesResponseBodyTableListTable setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

        public ListTablesResponseBodyTableListTable setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListTablesResponseBodyTableListTable setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListTablesResponseBodyTableListTable setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public ListTablesResponseBodyTableListTable setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

    public static class ListTablesResponseBodyTableList extends TeaModel {
        @NameInMap("Table")
        public java.util.List<ListTablesResponseBodyTableListTable> table;

        public static ListTablesResponseBodyTableList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyTableList self = new ListTablesResponseBodyTableList();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyTableList setTable(java.util.List<ListTablesResponseBodyTableListTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<ListTablesResponseBodyTableListTable> getTable() {
            return this.table;
        }

    }

}
