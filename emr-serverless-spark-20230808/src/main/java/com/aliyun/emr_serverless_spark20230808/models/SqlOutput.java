// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class SqlOutput extends TeaModel {
    @NameInMap("rows")
    public java.util.List<SqlOutputRows> rows;

    @NameInMap("schema")
    public SqlOutputSchema schema;

    public static SqlOutput build(java.util.Map<String, ?> map) throws Exception {
        SqlOutput self = new SqlOutput();
        return TeaModel.build(map, self);
    }

    public SqlOutput setRows(java.util.List<SqlOutputRows> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<SqlOutputRows> getRows() {
        return this.rows;
    }

    public SqlOutput setSchema(SqlOutputSchema schema) {
        this.schema = schema;
        return this;
    }
    public SqlOutputSchema getSchema() {
        return this.schema;
    }

    public static class SqlOutputRows extends TeaModel {
        @NameInMap("values")
        public java.util.List<String> values;

        public static SqlOutputRows build(java.util.Map<String, ?> map) throws Exception {
            SqlOutputRows self = new SqlOutputRows();
            return TeaModel.build(map, self);
        }

        public SqlOutputRows setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class SqlOutputSchemaFields extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("nullable")
        public Boolean nullable;

        @NameInMap("type")
        public String type;

        public static SqlOutputSchemaFields build(java.util.Map<String, ?> map) throws Exception {
            SqlOutputSchemaFields self = new SqlOutputSchemaFields();
            return TeaModel.build(map, self);
        }

        public SqlOutputSchemaFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SqlOutputSchemaFields setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public SqlOutputSchemaFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SqlOutputSchema extends TeaModel {
        @NameInMap("fields")
        public java.util.List<SqlOutputSchemaFields> fields;

        public static SqlOutputSchema build(java.util.Map<String, ?> map) throws Exception {
            SqlOutputSchema self = new SqlOutputSchema();
            return TeaModel.build(map, self);
        }

        public SqlOutputSchema setFields(java.util.List<SqlOutputSchemaFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<SqlOutputSchemaFields> getFields() {
            return this.fields;
        }

    }

}
