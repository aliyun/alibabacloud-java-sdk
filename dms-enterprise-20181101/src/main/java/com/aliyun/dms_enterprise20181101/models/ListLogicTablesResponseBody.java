// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTablesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogicTableList")
    public ListLogicTablesResponseBodyLogicTableList logicTableList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListLogicTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTablesResponseBody self = new ListLogicTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogicTablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListLogicTablesResponseBody setLogicTableList(ListLogicTablesResponseBodyLogicTableList logicTableList) {
        this.logicTableList = logicTableList;
        return this;
    }
    public ListLogicTablesResponseBodyLogicTableList getLogicTableList() {
        return this.logicTableList;
    }

    public ListLogicTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogicTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLogicTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLogicTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList self = new ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList();
            return TeaModel.build(map, self);
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList self = new ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList();
            return TeaModel.build(map, self);
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class ListLogicTablesResponseBodyLogicTableListLogicTable extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableCount")
        public String tableCount;

        @NameInMap("OwnerIdList")
        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList ownerNameList;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("TableExpr")
        public String tableExpr;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableId")
        public String tableId;

        public static ListLogicTablesResponseBodyLogicTableListLogicTable build(java.util.Map<String, ?> map) throws Exception {
            ListLogicTablesResponseBodyLogicTableListLogicTable self = new ListLogicTablesResponseBodyLogicTableListLogicTable();
            return TeaModel.build(map, self);
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableCount(String tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public String getTableCount() {
            return this.tableCount;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setOwnerIdList(ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setOwnerNameList(ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableExpr(String tableExpr) {
            this.tableExpr = tableExpr;
            return this;
        }
        public String getTableExpr() {
            return this.tableExpr;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

    public static class ListLogicTablesResponseBodyLogicTableList extends TeaModel {
        @NameInMap("LogicTable")
        public java.util.List<ListLogicTablesResponseBodyLogicTableListLogicTable> logicTable;

        public static ListLogicTablesResponseBodyLogicTableList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicTablesResponseBodyLogicTableList self = new ListLogicTablesResponseBodyLogicTableList();
            return TeaModel.build(map, self);
        }

        public ListLogicTablesResponseBodyLogicTableList setLogicTable(java.util.List<ListLogicTablesResponseBodyLogicTableListLogicTable> logicTable) {
            this.logicTable = logicTable;
            return this;
        }
        public java.util.List<ListLogicTablesResponseBodyLogicTableListLogicTable> getLogicTable() {
            return this.logicTable;
        }

    }

}
