// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTablesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of the logical tables.</p>
     */
    @NameInMap("LogicTableList")
    public ListLogicTablesResponseBodyLogicTableList logicTableList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F1E6484F-9DF1-4406-9BDE-0861C4629B69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of logical tables that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLogicTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTablesResponseBody self = new ListLogicTablesResponseBody();
        return TeaModel.build(map, self);
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

    public ListLogicTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLogicTablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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
        /**
         * <p>The ID of the logical database.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>Indicates whether the table is a logical table. The value is fixed to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The IDs of the owners of the logical tables.</p>
         */
        @NameInMap("OwnerIdList")
        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerIdList ownerIdList;

        /**
         * <p>The nicknames of the owners of the logical tables.</p>
         */
        @NameInMap("OwnerNameList")
        public ListLogicTablesResponseBodyLogicTableListLogicTableOwnerNameList ownerNameList;

        /**
         * <p>The logical database to which the logical table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>yuyang_test</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The number of logical tables.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TableCount")
        public String tableCount;

        /**
         * <p>The expression of the logical table.</p>
         * 
         * <strong>example:</strong>
         * <p>test[1-4]</p>
         */
        @NameInMap("TableExpr")
        public String tableExpr;

        /**
         * <p>The GUID of the logical table.</p>
         * 
         * <strong>example:</strong>
         * <p>IDB_L_308302.yuyang_test.test_ch</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The ID of the logical table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The name of the logical table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

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

        public ListLogicTablesResponseBodyLogicTableListLogicTable setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
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

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableCount(String tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public String getTableCount() {
            return this.tableCount;
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

        public ListLogicTablesResponseBodyLogicTableListLogicTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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
