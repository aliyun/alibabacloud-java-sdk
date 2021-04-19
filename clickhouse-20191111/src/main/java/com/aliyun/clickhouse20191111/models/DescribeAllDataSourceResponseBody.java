// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public DescribeAllDataSourceResponseBodyTables tables;

    @NameInMap("Columns")
    public DescribeAllDataSourceResponseBodyColumns columns;

    @NameInMap("Schemas")
    public DescribeAllDataSourceResponseBodySchemas schemas;

    public static DescribeAllDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourceResponseBody self = new DescribeAllDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllDataSourceResponseBody setTables(DescribeAllDataSourceResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeAllDataSourceResponseBodyTables getTables() {
        return this.tables;
    }

    public DescribeAllDataSourceResponseBody setColumns(DescribeAllDataSourceResponseBodyColumns columns) {
        this.columns = columns;
        return this;
    }
    public DescribeAllDataSourceResponseBodyColumns getColumns() {
        return this.columns;
    }

    public DescribeAllDataSourceResponseBody setSchemas(DescribeAllDataSourceResponseBodySchemas schemas) {
        this.schemas = schemas;
        return this;
    }
    public DescribeAllDataSourceResponseBodySchemas getSchemas() {
        return this.schemas;
    }

    public static class DescribeAllDataSourceResponseBodyTablesTable extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("SchemaName")
        public String schemaName;

        public static DescribeAllDataSourceResponseBodyTablesTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyTablesTable self = new DescribeAllDataSourceResponseBodyTablesTable();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyTablesTable setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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

    public static class DescribeAllDataSourceResponseBodyColumnsColumn extends TeaModel {
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

        public static DescribeAllDataSourceResponseBodyColumnsColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDataSourceResponseBodyColumnsColumn self = new DescribeAllDataSourceResponseBodyColumnsColumn();
            return TeaModel.build(map, self);
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeAllDataSourceResponseBodyColumnsColumn setAutoIncrementColumn(Boolean autoIncrementColumn) {
            this.autoIncrementColumn = autoIncrementColumn;
            return this;
        }
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
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
        @NameInMap("DBClusterId")
        public String DBClusterId;

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

}
