// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponseBody extends TeaModel {
    /**
     * <p>The queried columns.</p>
     */
    @NameInMap("Items")
    public DescribeColumnsResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-XXX442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsResponseBody self = new DescribeColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsResponseBody setItems(DescribeColumnsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeColumnsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeColumnsResponseBodyItemsColumn extends TeaModel {
        /**
         * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoIncrementColumn")
        public Boolean autoIncrementColumn;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp111m2cfrdl1****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>Indicates whether the column is the primary key of the table. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeColumnsResponseBodyItemsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseBodyItemsColumn self = new DescribeColumnsResponseBodyItemsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseBodyItemsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

        public DescribeColumnsResponseBodyItemsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
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

        public DescribeColumnsResponseBodyItemsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeColumnsResponseBodyItemsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
