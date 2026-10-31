// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTemplateRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The template update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateBatchTemplateRequestUpdateCommand updateCommand;

    public static UpdateBatchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTemplateRequest self = new UpdateBatchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBatchTemplateRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateBatchTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateBatchTemplateRequest setUpdateCommand(UpdateBatchTemplateRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBatchTemplateRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBatchTemplateRequestUpdateCommandDataSourceConfig extends TeaModel {
        /**
         * <p>The catalog of the data source for the database SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The ID of the data source for the database SQL template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <p>The schema of the data source for the database SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The type of the data source for the database SQL template. Valid values: MYSQL, ORACLE, ADB_FOR_PG, OUSHUDB, PRESTO, POSTGRE_SQL, STARROCKS, CLICKHOUSE, ANALYTICDB, ADB_FOR_MYSQL_V3, GAUSSDB, SELECTDB, DORIS, SQL_SERVER, HOLOGRES, OPENGAUSS, DAMENG, OCEANBASE, TRINO, POLARDB_X2, LINDORM, EMR_SPARK_SERVERLESS, TDSQL_FOR_PG, TDSQL_FOR_MYSQL, GBASE_8A, and TDENGINE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateBatchTemplateRequestUpdateCommandDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTemplateRequestUpdateCommandDataSourceConfig self = new UpdateBatchTemplateRequestUpdateCommandDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTemplateRequestUpdateCommandDataSourceConfig setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public UpdateBatchTemplateRequestUpdateCommandDataSourceConfig setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public UpdateBatchTemplateRequestUpdateCommandDataSourceConfig setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public UpdateBatchTemplateRequestUpdateCommandDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateBatchTemplateRequestUpdateCommandParams extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>Input date</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether encryption is enabled for the parameter.</p>
         */
        @NameInMap("EncryptEnabled")
        public Boolean encryptEnabled;

        /**
         * <p>The key of the parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateBatchTemplateRequestUpdateCommandParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTemplateRequestUpdateCommandParams self = new UpdateBatchTemplateRequestUpdateCommandParams();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTemplateRequestUpdateCommandParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBatchTemplateRequestUpdateCommandParams setEncryptEnabled(Boolean encryptEnabled) {
            this.encryptEnabled = encryptEnabled;
            return this;
        }
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
        }

        public UpdateBatchTemplateRequestUpdateCommandParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateBatchTemplateRequestUpdateCommandParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateBatchTemplateRequestUpdateCommand extends TeaModel {
        /**
         * <p>The template content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>echo 123</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The datasource config for database SQL templates. This parameter takes effect only for database SQL templates.</p>
         */
        @NameInMap("DataSourceConfig")
        public UpdateBatchTemplateRequestUpdateCommandDataSourceConfig dataSourceConfig;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Shell template for data processing</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the resource group in the development environment. By default, the default resource group of the project is used.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DevResourceGroupId")
        public String devResourceGroupId;

        /**
         * <p>The folder of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/Data development/Templates</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The name of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Data processing template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of template parameters.</p>
         */
        @NameInMap("Params")
        public java.util.List<UpdateBatchTemplateRequestUpdateCommandParams> params;

        /**
         * <p>The list of IDs of dependent third-party Python packages.</p>
         */
        @NameInMap("PythonModuleIds")
        public java.util.List<Long> pythonModuleIds;

        /**
         * <p>The ID of the resource group in the production environment. By default, the default resource group of the project is used.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Specifies whether to share runtime resources.</p>
         */
        @NameInMap("ShareRuntimeResource")
        public Boolean shareRuntimeResource;

        /**
         * <p>The ID of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static UpdateBatchTemplateRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTemplateRequestUpdateCommand self = new UpdateBatchTemplateRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTemplateRequestUpdateCommand setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateBatchTemplateRequestUpdateCommand setDataSourceConfig(UpdateBatchTemplateRequestUpdateCommandDataSourceConfig dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public UpdateBatchTemplateRequestUpdateCommandDataSourceConfig getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public UpdateBatchTemplateRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBatchTemplateRequestUpdateCommand setDevResourceGroupId(String devResourceGroupId) {
            this.devResourceGroupId = devResourceGroupId;
            return this;
        }
        public String getDevResourceGroupId() {
            return this.devResourceGroupId;
        }

        public UpdateBatchTemplateRequestUpdateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateBatchTemplateRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBatchTemplateRequestUpdateCommand setParams(java.util.List<UpdateBatchTemplateRequestUpdateCommandParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<UpdateBatchTemplateRequestUpdateCommandParams> getParams() {
            return this.params;
        }

        public UpdateBatchTemplateRequestUpdateCommand setPythonModuleIds(java.util.List<Long> pythonModuleIds) {
            this.pythonModuleIds = pythonModuleIds;
            return this;
        }
        public java.util.List<Long> getPythonModuleIds() {
            return this.pythonModuleIds;
        }

        public UpdateBatchTemplateRequestUpdateCommand setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateBatchTemplateRequestUpdateCommand setShareRuntimeResource(Boolean shareRuntimeResource) {
            this.shareRuntimeResource = shareRuntimeResource;
            return this;
        }
        public Boolean getShareRuntimeResource() {
            return this.shareRuntimeResource;
        }

        public UpdateBatchTemplateRequestUpdateCommand setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
