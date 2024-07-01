// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourceResponseBody extends TeaModel {
    /**
     * <p>The queried columns.</p>
     */
    @NameInMap("Columns")
    public DescribeAllDataSourceResponseBodyColumns columns;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7EDB8E4-9769-4233-88C7-DCA4C9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried databases.</p>
     */
    @NameInMap("Schemas")
    public DescribeAllDataSourceResponseBodySchemas schemas;

    /**
     * <p>The queried tables.</p>
     */
    @NameInMap("Tables")
    public DescribeAllDataSourceResponseBodyTables tables;

    public static DescribeAllDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourceResponseBody self = new DescribeAllDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourceResponseBody setColumns(DescribeAllDataSourceResponseBodyColumns columns) {
        this.columns = columns;
        return this;
    }
    public DescribeAllDataSourceResponseBodyColumns getColumns() {
        return this.columns;
    }

    public DescribeAllDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllDataSourceResponseBody setSchemas(DescribeAllDataSourceResponseBodySchemas schemas) {
        this.schemas = schemas;
        return this;
    }
    public DescribeAllDataSourceResponseBodySchemas getSchemas() {
        return this.schemas;
    }

    public DescribeAllDataSourceResponseBody setTables(DescribeAllDataSourceResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeAllDataSourceResponseBodyTables getTables() {
        return this.tables;
    }

    public static class DescribeAllDataSourceResponseBodyColumnsColumn extends TeaModel {
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
         * <p>amv-bp1pke2pcfavw****</p>
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
         * <p>The logical name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The logical name of the table.</p>
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

        public static DescribeAllDataSourceResponseBodyColumnsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyColumnsColumn self = new DescribeAllDataSourceResponseBodyColumnsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAllDataSourceResponseBodyColumns extends TeaModel {
        @NameInMap("Column")
        public java.util.List<DescribeAllDataSourceResponseBodyColumnsColumn> column;

        public static DescribeAllDataSourceResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyColumns self = new DescribeAllDataSourceResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyColumns setColumn(java.util.List<DescribeAllDataSourceResponseBodyColumnsColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<DescribeAllDataSourceResponseBodyColumnsColumn> getColumn() {
            return this.column;
        }

    }

    public static class DescribeAllDataSourceResponseBodySchemasSchema extends TeaModel {
        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1pke2pcfavw****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The logical name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        public static DescribeAllDataSourceResponseBodySchemasSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodySchemasSchema self = new DescribeAllDataSourceResponseBodySchemasSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodySchemasSchema setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourceResponseBodySchemasSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeAllDataSourceResponseBodySchemas extends TeaModel {
        @NameInMap("Schema")
        public java.util.List<DescribeAllDataSourceResponseBodySchemasSchema> schema;

        public static DescribeAllDataSourceResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodySchemas self = new DescribeAllDataSourceResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodySchemas setSchema(java.util.List<DescribeAllDataSourceResponseBodySchemasSchema> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<DescribeAllDataSourceResponseBodySchemasSchema> getSchema() {
            return this.schema;
        }

    }

    public static class DescribeAllDataSourceResponseBodyTablesTable extends TeaModel {
        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1pke2pcfavw****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The logical name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeAllDataSourceResponseBodyTablesTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyTablesTable self = new DescribeAllDataSourceResponseBodyTablesTable();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyTablesTable setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourceResponseBodyTablesTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourceResponseBodyTablesTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeAllDataSourceResponseBodyTables extends TeaModel {
        @NameInMap("Table")
        public java.util.List<DescribeAllDataSourceResponseBodyTablesTable> table;

        public static DescribeAllDataSourceResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyTables self = new DescribeAllDataSourceResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyTables setTable(java.util.List<DescribeAllDataSourceResponseBodyTablesTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeAllDataSourceResponseBodyTablesTable> getTable() {
            return this.table;
        }

    }

}
