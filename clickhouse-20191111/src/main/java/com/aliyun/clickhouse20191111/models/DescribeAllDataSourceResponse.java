// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Schemas")
    @Validation(required = true)
    public DescribeAllDataSourceResponseSchemas schemas;

    @NameInMap("Tables")
    @Validation(required = true)
    public DescribeAllDataSourceResponseTables tables;

    @NameInMap("Columns")
    @Validation(required = true)
    public DescribeAllDataSourceResponseColumns columns;

    public static DescribeAllDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourceResponse self = new DescribeAllDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllDataSourceResponse setSchemas(DescribeAllDataSourceResponseSchemas schemas) {
        this.schemas = schemas;
        return this;
    }
    public DescribeAllDataSourceResponseSchemas getSchemas() {
        return this.schemas;
    }

    public DescribeAllDataSourceResponse setTables(DescribeAllDataSourceResponseTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeAllDataSourceResponseTables getTables() {
        return this.tables;
    }

    public DescribeAllDataSourceResponse setColumns(DescribeAllDataSourceResponseColumns columns) {
        this.columns = columns;
        return this;
    }
    public DescribeAllDataSourceResponseColumns getColumns() {
        return this.columns;
    }

    public static class DescribeAllDataSourceResponseSchemasSchema extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        public static DescribeAllDataSourceResponseSchemasSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseSchemasSchema self = new DescribeAllDataSourceResponseSchemasSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseSchemasSchema setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourceResponseSchemasSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeAllDataSourceResponseSchemas extends TeaModel {
        @NameInMap("Schema")
        @Validation(required = true)
        public java.util.List<DescribeAllDataSourceResponseSchemasSchema> schema;

        public static DescribeAllDataSourceResponseSchemas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseSchemas self = new DescribeAllDataSourceResponseSchemas();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseSchemas setSchema(java.util.List<DescribeAllDataSourceResponseSchemasSchema> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<DescribeAllDataSourceResponseSchemasSchema> getSchema() {
            return this.schema;
        }

    }

    public static class DescribeAllDataSourceResponseTablesTable extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static DescribeAllDataSourceResponseTablesTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseTablesTable self = new DescribeAllDataSourceResponseTablesTable();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseTablesTable setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourceResponseTablesTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourceResponseTablesTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeAllDataSourceResponseTables extends TeaModel {
        @NameInMap("Table")
        @Validation(required = true)
        public java.util.List<DescribeAllDataSourceResponseTablesTable> table;

        public static DescribeAllDataSourceResponseTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseTables self = new DescribeAllDataSourceResponseTables();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseTables setTable(java.util.List<DescribeAllDataSourceResponseTablesTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeAllDataSourceResponseTablesTable> getTable() {
            return this.table;
        }

    }

    public static class DescribeAllDataSourceResponseColumnsColumn extends TeaModel {
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

        public static DescribeAllDataSourceResponseColumnsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseColumnsColumn self = new DescribeAllDataSourceResponseColumnsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseColumnsColumn setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAllDataSourceResponseColumnsColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeAllDataSourceResponseColumnsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAllDataSourceResponseColumnsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeAllDataSourceResponseColumnsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAllDataSourceResponseColumnsColumn setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public DescribeAllDataSourceResponseColumnsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

    }

    public static class DescribeAllDataSourceResponseColumns extends TeaModel {
        @NameInMap("Column")
        @Validation(required = true)
        public java.util.List<DescribeAllDataSourceResponseColumnsColumn> column;

        public static DescribeAllDataSourceResponseColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseColumns self = new DescribeAllDataSourceResponseColumns();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseColumns setColumn(java.util.List<DescribeAllDataSourceResponseColumnsColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<DescribeAllDataSourceResponseColumnsColumn> getColumn() {
            return this.column;
        }

    }

}
