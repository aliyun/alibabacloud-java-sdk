// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSourceTableMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public GetSourceTableMetaRequestContext context;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public GetSourceTableMetaRequestQuery query;

    public static GetSourceTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSourceTableMetaRequest self = new GetSourceTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetSourceTableMetaRequest setContext(GetSourceTableMetaRequestContext context) {
        this.context = context;
        return this;
    }
    public GetSourceTableMetaRequestContext getContext() {
        return this.context;
    }

    public GetSourceTableMetaRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetSourceTableMetaRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetSourceTableMetaRequest setQuery(GetSourceTableMetaRequestQuery query) {
        this.query = query;
        return this;
    }
    public GetSourceTableMetaRequestQuery getQuery() {
        return this.query;
    }

    public static class GetSourceTableMetaRequestContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetSourceTableMetaRequestContext build(java.util.Map<String, ?> map) throws Exception {
            GetSourceTableMetaRequestContext self = new GetSourceTableMetaRequestContext();
            return TeaModel.build(map, self);
        }

        public GetSourceTableMetaRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetSourceTableMetaRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetSourceTableMetaRequestQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hive_catalog</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>DATA_SOURCE</p>
         */
        @NameInMap("QueryMode")
        public String queryMode;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <strong>example:</strong>
         * <p>ods_user_info</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetSourceTableMetaRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            GetSourceTableMetaRequestQuery self = new GetSourceTableMetaRequestQuery();
            return TeaModel.build(map, self);
        }

        public GetSourceTableMetaRequestQuery setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetSourceTableMetaRequestQuery setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSourceTableMetaRequestQuery setQueryMode(String queryMode) {
            this.queryMode = queryMode;
            return this;
        }
        public String getQueryMode() {
            return this.queryMode;
        }

        public GetSourceTableMetaRequestQuery setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetSourceTableMetaRequestQuery setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
