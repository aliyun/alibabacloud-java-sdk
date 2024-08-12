// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSchemasResponseBody extends TeaModel {
    /**
     * <p>The information about the databases of the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeSchemasResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchemasResponseBody self = new DescribeSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSchemasResponseBody setItems(DescribeSchemasResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSchemasResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSchemasResponseBodyItemsSchema extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        public static DescribeSchemasResponseBodyItemsSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemasResponseBodyItemsSchema self = new DescribeSchemasResponseBodyItemsSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSchemasResponseBodyItemsSchema setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeSchemasResponseBodyItemsSchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class DescribeSchemasResponseBodyItems extends TeaModel {
        @NameInMap("Schema")
        public java.util.List<DescribeSchemasResponseBodyItemsSchema> schema;

        public static DescribeSchemasResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemasResponseBodyItems self = new DescribeSchemasResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSchemasResponseBodyItems setSchema(java.util.List<DescribeSchemasResponseBodyItemsSchema> schema) {
            this.schema = schema;
            return this;
        }
        public java.util.List<DescribeSchemasResponseBodyItemsSchema> getSchema() {
            return this.schema;
        }

    }

}
