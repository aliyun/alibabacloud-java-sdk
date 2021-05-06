// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeColumnsResponseBodyItems items;

    public static DescribeColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsResponseBody self = new DescribeColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColumnsResponseBody setItems(DescribeColumnsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeColumnsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeColumnsResponseBodyItemsColumn extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("AutoIncrementColumn")
        public Boolean autoIncrementColumn;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        @NameInMap("SchemaName")
        public String schemaName;

        public static DescribeColumnsResponseBodyItemsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseBodyItemsColumn self = new DescribeColumnsResponseBodyItemsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseBodyItemsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeColumnsResponseBodyItemsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeColumnsResponseBodyItemsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeColumnsResponseBodyItemsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

        public DescribeColumnsResponseBodyItemsColumn setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeColumnsResponseBodyItemsColumn setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeColumnsResponseBodyItemsColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeColumnsResponseBodyItems extends TeaModel {
        @NameInMap("Column")
        public java.util.List<DescribeColumnsResponseBodyItemsColumn> column;

        public static DescribeColumnsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseBodyItems self = new DescribeColumnsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseBodyItems setColumn(java.util.List<DescribeColumnsResponseBodyItemsColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<DescribeColumnsResponseBodyItemsColumn> getColumn() {
            return this.column;
        }

    }

}
