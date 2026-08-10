// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteDDLRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public ExecuteDDLRequestContext context;

    /**
     * <p>The one-click table creation parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DDLCommand")
    public ExecuteDDLRequestDDLCommand DDLCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ExecuteDDLRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDDLRequest self = new ExecuteDDLRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDDLRequest setContext(ExecuteDDLRequestContext context) {
        this.context = context;
        return this;
    }
    public ExecuteDDLRequestContext getContext() {
        return this.context;
    }

    public ExecuteDDLRequest setDDLCommand(ExecuteDDLRequestDDLCommand DDLCommand) {
        this.DDLCommand = DDLCommand;
        return this;
    }
    public ExecuteDDLRequestDDLCommand getDDLCommand() {
        return this.DDLCommand;
    }

    public ExecuteDDLRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ExecuteDDLRequestContext extends TeaModel {
        /**
         * <p>The current operating environment. Valid values:</p>
         * <ul>
         * <li>DEV: development environment.</li>
         * <li>PROD: production environment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The ID of the project to which the integration pipeline task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ExecuteDDLRequestContext build(java.util.Map<String, ?> map) throws Exception {
            ExecuteDDLRequestContext self = new ExecuteDDLRequestContext();
            return TeaModel.build(map, self);
        }

        public ExecuteDDLRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ExecuteDDLRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ExecuteDDLRequestDDLCommandDatasourceId extends TeaModel {
        /**
         * <p>The catalog of the data source or compute cluster. This parameter is required only in OneCatalog scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>dummy_cdm_dev</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The data source category. Valid values:</p>
         * <ul>
         * <li>DATA_SOURCE: physical data source.</li>
         * <li>PROJECT_COMPUTE_SOURCE: compute source bound to a project.</li>
         * <li>ONE_CATALOG: compute source or data source in multi-engine mode (OneCatalog).</li>
         * <li>DATA_SET: dataset.</li>
         * </ul>
         * <p>This parameter is optional. The system automatically infers the category based on other fields if this parameter is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_SOURCE</p>
         */
        @NameInMap("DsCategory")
        public String dsCategory;

        /**
         * <p>The ID of the data source, compute source, or dataset. This parameter is optional when DsCategory is set to PROJECT_COMPUTE_SOURCE.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li>DEV: development environment.</li>
         * <li>PROD: production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The catalog type when DsCategory is set to ONE_CATALOG. Valid values:</p>
         * <ul>
         * <li>COMPUTE_CLUSTER: compute cluster.</li>
         * <li>DATA_SOURCE: physical data source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPUTE_CLUSTER</p>
         */
        @NameInMap("OneCatalogType")
        public String oneCatalogType;

        /**
         * <p>The ID of the project bound to the compute source. This parameter is required only when DsCategory is set to PROJECT_COMPUTE_SOURCE.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The dataset version. This parameter is required only when DsCategory is set to DATA_SET.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public String version;

        public static ExecuteDDLRequestDDLCommandDatasourceId build(java.util.Map<String, ?> map) throws Exception {
            ExecuteDDLRequestDDLCommandDatasourceId self = new ExecuteDDLRequestDDLCommandDatasourceId();
            return TeaModel.build(map, self);
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setDsCategory(String dsCategory) {
            this.dsCategory = dsCategory;
            return this;
        }
        public String getDsCategory() {
            return this.dsCategory;
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setOneCatalogType(String oneCatalogType) {
            this.oneCatalogType = oneCatalogType;
            return this;
        }
        public String getOneCatalogType() {
            return this.oneCatalogType;
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ExecuteDDLRequestDDLCommandDatasourceId setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ExecuteDDLRequestDDLCommand extends TeaModel {
        /**
         * <p>The identifier of the data source, compute source, or dataset used for table creation.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DatasourceId")
        public ExecuteDDLRequestDDLCommandDatasourceId datasourceId;

        /**
         * <p>The DDL statement for table creation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE test (id bigint)</p>
         */
        @NameInMap("Ddl")
        public String ddl;

        /**
         * <p>Specifies whether to drop the table if it already exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DropTable")
        public Boolean dropTable;

        public static ExecuteDDLRequestDDLCommand build(java.util.Map<String, ?> map) throws Exception {
            ExecuteDDLRequestDDLCommand self = new ExecuteDDLRequestDDLCommand();
            return TeaModel.build(map, self);
        }

        public ExecuteDDLRequestDDLCommand setDatasourceId(ExecuteDDLRequestDDLCommandDatasourceId datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public ExecuteDDLRequestDDLCommandDatasourceId getDatasourceId() {
            return this.datasourceId;
        }

        public ExecuteDDLRequestDDLCommand setDdl(String ddl) {
            this.ddl = ddl;
            return this;
        }
        public String getDdl() {
            return this.ddl;
        }

        public ExecuteDDLRequestDDLCommand setDropTable(Boolean dropTable) {
            this.dropTable = dropTable;
            return this;
        }
        public Boolean getDropTable() {
            return this.dropTable;
        }

    }

}
