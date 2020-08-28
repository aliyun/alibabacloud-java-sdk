// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSchemasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSchemasResponseItems items;

    public static DescribeSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchemasResponse self = new DescribeSchemasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSchemasResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSchemasResponse setItems(DescribeSchemasResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSchemasResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSchemasResponseItemsSchema extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        public static DescribeSchemasResponseItemsSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemasResponseItemsSchema self = new DescribeSchemasResponseItemsSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSchemasResponseItemsSchema setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSchemasResponseItemsSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeSchemasResponseItems extends TeaModel {
        @NameInMap("Schema")
        @Validation(required = true)
        public java.util.List<DescribeSchemasResponseItemsSchema> schema;

        public static DescribeSchemasResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemasResponseItems self = new DescribeSchemasResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSchemasResponseItems setSchema(java.util.List<DescribeSchemasResponseItemsSchema> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<DescribeSchemasResponseItemsSchema> getSchema() {
            return this.schema;
        }

    }

}
