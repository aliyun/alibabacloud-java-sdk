// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeColumnsResponseItems items;

    public static DescribeColumnsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsResponse self = new DescribeColumnsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColumnsResponse setItems(DescribeColumnsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeColumnsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeColumnsResponseItemsColumn extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("PrimaryKey")
        @Validation(required = true)
        public Boolean primaryKey;

        @NameInMap("AutoIncrementColumn")
        @Validation(required = true)
        public Boolean autoIncrementColumn;

        public static DescribeColumnsResponseItemsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseItemsColumn self = new DescribeColumnsResponseItemsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseItemsColumn setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeColumnsResponseItemsColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeColumnsResponseItemsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeColumnsResponseItemsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeColumnsResponseItemsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeColumnsResponseItemsColumn setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeColumnsResponseItemsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

    }

    public static class DescribeColumnsResponseItems extends TeaModel {
        @NameInMap("Column")
        @Validation(required = true)
        public java.util.List<DescribeColumnsResponseItemsColumn> column;

        public static DescribeColumnsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseItems self = new DescribeColumnsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseItems setColumn(java.util.List<DescribeColumnsResponseItemsColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<DescribeColumnsResponseItemsColumn> getColumn() {
            return this.column;
        }

    }

}
