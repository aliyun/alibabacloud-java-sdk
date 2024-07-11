// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
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
     * <p>B16FB618-5E96-4FFD-BB0D-490C890A4030</p>
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
     * <p>The details of the tables.</p>
     */
    @NameInMap("TableList")
    public ListTablesResponseBodyTableList tableList;

    /**
     * <p>The total number of tables that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTablesResponseBody setTableList(ListTablesResponseBodyTableList tableList) {
        this.tableList = tableList;
        return this;
    }
    public ListTablesResponseBodyTableList getTableList() {
        return this.tableList;
    }

    public ListTablesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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
        /**
         * <p>The ID of the physical database.</p>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The description of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The encoding format of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The engine of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>InnoDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The number of rows in the table. This is a statistical value and does not indicate the actual number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10085</p>
         */
        @NameInMap("NumRows")
        public Long numRows;

        /**
         * <p>The ID list of the table owners.</p>
         */
        @NameInMap("OwnerIdList")
        public ListTablesResponseBodyTableListTableOwnerIdList ownerIdList;

        /**
         * <p>The nickname list of the table owners.</p>
         */
        @NameInMap("OwnerNameList")
        public ListTablesResponseBodyTableListTableOwnerNameList ownerNameList;

        /**
         * <p>The storage space that is occupied by the table. This is a statistical value and does not indicate the accurate storage space. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("StoreCapacity")
        public Long storeCapacity;

        /**
         * <p>The GUID of the table in DMS.</p>
         * 
         * <strong>example:</strong>
         * <p>IDB_44743****.qntest.consumption_records</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>44743****</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumption_records</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The database in which the table resides.</p>
         * 
         * <strong>example:</strong>
         * <p>qntest</p>
         */
        @NameInMap("TableSchemaName")
        public String tableSchemaName;

        /**
         * <p>The type of the table. Default value: NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("TableType")
        public String tableType;

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

        public ListTablesResponseBodyTableListTable setOwnerIdList(ListTablesResponseBodyTableListTableOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListTablesResponseBodyTableListTableOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListTablesResponseBodyTableListTable setOwnerNameList(ListTablesResponseBodyTableListTableOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListTablesResponseBodyTableListTableOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListTablesResponseBodyTableListTable setStoreCapacity(Long storeCapacity) {
            this.storeCapacity = storeCapacity;
            return this;
        }
        public Long getStoreCapacity() {
            return this.storeCapacity;
        }

        public ListTablesResponseBodyTableListTable setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public ListTablesResponseBodyTableListTable setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListTablesResponseBodyTableListTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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
