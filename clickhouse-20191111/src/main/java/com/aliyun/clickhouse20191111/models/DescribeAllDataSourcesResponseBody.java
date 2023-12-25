// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourcesResponseBody extends TeaModel {
    /**
     * <p>Details of the columns.</p>
     */
    @NameInMap("Columns")
    public DescribeAllDataSourcesResponseBodyColumns columns;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the databases.</p>
     */
    @NameInMap("Schemas")
    public DescribeAllDataSourcesResponseBodySchemas schemas;

    /**
     * <p>The information about the tables.</p>
     */
    @NameInMap("Tables")
    public DescribeAllDataSourcesResponseBodyTables tables;

    public static DescribeAllDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourcesResponseBody self = new DescribeAllDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourcesResponseBody setColumns(DescribeAllDataSourcesResponseBodyColumns columns) {
        this.columns = columns;
        return this;
    }
    public DescribeAllDataSourcesResponseBodyColumns getColumns() {
        return this.columns;
    }

    public DescribeAllDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllDataSourcesResponseBody setSchemas(DescribeAllDataSourcesResponseBodySchemas schemas) {
        this.schemas = schemas;
        return this;
    }
    public DescribeAllDataSourcesResponseBodySchemas getSchemas() {
        return this.schemas;
    }

    public DescribeAllDataSourcesResponseBody setTables(DescribeAllDataSourcesResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeAllDataSourcesResponseBodyTables getTables() {
        return this.tables;
    }

    public static class DescribeAllDataSourcesResponseBodyColumnsColumn extends TeaModel {
        /**
         * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("AutoIncrementColumn")
        public Boolean autoIncrementColumn;

        /**
         * <p>The column name.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>Indicates whether the column is the primary key of the table. Valid values:</p>
         * <br>
         * <p>*   **true**: The column is the primary key of the table.</p>
         * <p>*   **false**: The column is not the primary key of the table.</p>
         */
        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        /**
         * <p>The database name.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The column type.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAllDataSourcesResponseBodyColumnsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseBodyColumnsColumn self = new DescribeAllDataSourcesResponseBodyColumnsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAllDataSourcesResponseBodyColumnsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAllDataSourcesResponseBodyColumns extends TeaModel {
        @NameInMap("Column")
        public java.util.List<DescribeAllDataSourcesResponseBodyColumnsColumn> column;

        public static DescribeAllDataSourcesResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseBodyColumns self = new DescribeAllDataSourcesResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseBodyColumns setColumn(java.util.List<DescribeAllDataSourcesResponseBodyColumnsColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<DescribeAllDataSourcesResponseBodyColumnsColumn> getColumn() {
            return this.column;
        }

    }

    public static class DescribeAllDataSourcesResponseBodySchemasSchema extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database name.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        public static DescribeAllDataSourcesResponseBodySchemasSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseBodySchemasSchema self = new DescribeAllDataSourcesResponseBodySchemasSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseBodySchemasSchema setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourcesResponseBodySchemasSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeAllDataSourcesResponseBodySchemas extends TeaModel {
        @NameInMap("Schema")
        public java.util.List<DescribeAllDataSourcesResponseBodySchemasSchema> schema;

        public static DescribeAllDataSourcesResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseBodySchemas self = new DescribeAllDataSourcesResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseBodySchemas setSchema(java.util.List<DescribeAllDataSourcesResponseBodySchemasSchema> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<DescribeAllDataSourcesResponseBodySchemasSchema> getSchema() {
            return this.schema;
        }

    }

    public static class DescribeAllDataSourcesResponseBodyTablesTable extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database name.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeAllDataSourcesResponseBodyTablesTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseBodyTablesTable self = new DescribeAllDataSourcesResponseBodyTablesTable();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseBodyTablesTable setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourcesResponseBodyTablesTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourcesResponseBodyTablesTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeAllDataSourcesResponseBodyTables extends TeaModel {
        @NameInMap("Table")
        public java.util.List<DescribeAllDataSourcesResponseBodyTablesTable> table;

        public static DescribeAllDataSourcesResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseBodyTables self = new DescribeAllDataSourcesResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseBodyTables setTable(java.util.List<DescribeAllDataSourcesResponseBodyTablesTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeAllDataSourcesResponseBodyTablesTable> getTable() {
            return this.table;
        }

    }

}
