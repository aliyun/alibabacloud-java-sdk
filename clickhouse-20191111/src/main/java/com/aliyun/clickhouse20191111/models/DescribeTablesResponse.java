// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeTablesResponseItems items;

    public static DescribeTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponse self = new DescribeTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablesResponse setItems(DescribeTablesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeTablesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeTablesResponseItemsTable extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static DescribeTablesResponseItemsTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseItemsTable self = new DescribeTablesResponseItemsTable();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseItemsTable setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeTablesResponseItemsTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeTablesResponseItemsTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeTablesResponseItems extends TeaModel {
        @NameInMap("Table")
        @Validation(required = true)
        public java.util.List<DescribeTablesResponseItemsTable> table;

        public static DescribeTablesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseItems self = new DescribeTablesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseItems setTable(java.util.List<DescribeTablesResponseItemsTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeTablesResponseItemsTable> getTable() {
            return this.table;
        }

    }

}
