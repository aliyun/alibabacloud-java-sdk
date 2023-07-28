// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTablesResponseBody extends TeaModel {
    /**
     * <p>The list of tables.</p>
     */
    @NameInMap("Items")
    public DescribeTablesResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponseBody self = new DescribeTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponseBody setItems(DescribeTablesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTablesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTablesResponseBodyItemsTable extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeTablesResponseBodyItemsTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyItemsTable self = new DescribeTablesResponseBodyItemsTable();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyItemsTable setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeTablesResponseBodyItemsTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeTablesResponseBodyItemsTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeTablesResponseBodyItems extends TeaModel {
        @NameInMap("Table")
        public java.util.List<DescribeTablesResponseBodyItemsTable> table;

        public static DescribeTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyItems self = new DescribeTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyItems setTable(java.util.List<DescribeTablesResponseBodyItemsTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeTablesResponseBodyItemsTable> getTable() {
            return this.table;
        }

    }

}
