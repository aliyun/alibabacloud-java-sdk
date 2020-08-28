// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Schemas")
    @Validation(required = true)
    public DescribeAllDataSourcesResponseSchemas schemas;

    @NameInMap("Tables")
    @Validation(required = true)
    public DescribeAllDataSourcesResponseTables tables;

    @NameInMap("Columns")
    @Validation(required = true)
    public DescribeAllDataSourcesResponseColumns columns;

    public static DescribeAllDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourcesResponse self = new DescribeAllDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllDataSourcesResponse setSchemas(DescribeAllDataSourcesResponseSchemas schemas) {
        this.schemas = schemas;
        return this;
    }
    public DescribeAllDataSourcesResponseSchemas getSchemas() {
        return this.schemas;
    }

    public DescribeAllDataSourcesResponse setTables(DescribeAllDataSourcesResponseTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeAllDataSourcesResponseTables getTables() {
        return this.tables;
    }

    public DescribeAllDataSourcesResponse setColumns(DescribeAllDataSourcesResponseColumns columns) {
        this.columns = columns;
        return this;
    }
    public DescribeAllDataSourcesResponseColumns getColumns() {
        return this.columns;
    }

    public static class DescribeAllDataSourcesResponseSchemasSchema extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        public static DescribeAllDataSourcesResponseSchemasSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseSchemasSchema self = new DescribeAllDataSourcesResponseSchemasSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseSchemasSchema setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourcesResponseSchemasSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeAllDataSourcesResponseSchemas extends TeaModel {
        @NameInMap("Schema")
        @Validation(required = true)
        public java.util.List<DescribeAllDataSourcesResponseSchemasSchema> schema;

        public static DescribeAllDataSourcesResponseSchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseSchemas self = new DescribeAllDataSourcesResponseSchemas();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseSchemas setSchema(java.util.List<DescribeAllDataSourcesResponseSchemasSchema> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<DescribeAllDataSourcesResponseSchemasSchema> getSchema() {
            return this.schema;
        }

    }

    public static class DescribeAllDataSourcesResponseTablesTable extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static DescribeAllDataSourcesResponseTablesTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseTablesTable self = new DescribeAllDataSourcesResponseTablesTable();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseTablesTable setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourcesResponseTablesTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourcesResponseTablesTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeAllDataSourcesResponseTables extends TeaModel {
        @NameInMap("Table")
        @Validation(required = true)
        public java.util.List<DescribeAllDataSourcesResponseTablesTable> table;

        public static DescribeAllDataSourcesResponseTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseTables self = new DescribeAllDataSourcesResponseTables();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseTables setTable(java.util.List<DescribeAllDataSourcesResponseTablesTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeAllDataSourcesResponseTablesTable> getTable() {
            return this.table;
        }

    }

    public static class DescribeAllDataSourcesResponseColumnsColumn extends TeaModel {
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

        public static DescribeAllDataSourcesResponseColumnsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseColumnsColumn self = new DescribeAllDataSourcesResponseColumnsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseColumnsColumn setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourcesResponseColumnsColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourcesResponseColumnsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAllDataSourcesResponseColumnsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeAllDataSourcesResponseColumnsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAllDataSourcesResponseColumnsColumn setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeAllDataSourcesResponseColumnsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

    }

    public static class DescribeAllDataSourcesResponseColumns extends TeaModel {
        @NameInMap("Column")
        @Validation(required = true)
        public java.util.List<DescribeAllDataSourcesResponseColumnsColumn> column;

        public static DescribeAllDataSourcesResponseColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourcesResponseColumns self = new DescribeAllDataSourcesResponseColumns();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourcesResponseColumns setColumn(java.util.List<DescribeAllDataSourcesResponseColumnsColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<DescribeAllDataSourcesResponseColumnsColumn> getColumn() {
            return this.column;
        }

    }

}
