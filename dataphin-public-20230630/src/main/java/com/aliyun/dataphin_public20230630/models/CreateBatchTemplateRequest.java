// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBatchTemplateRequest extends TeaModel {
    /**
     * <p>The command to create a template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBatchTemplateRequestCreateCommand createCommand;

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

    public static CreateBatchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTemplateRequest self = new CreateBatchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTemplateRequest setCreateCommand(CreateBatchTemplateRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateBatchTemplateRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateBatchTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateBatchTemplateRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public CreateBatchTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public static class CreateBatchTemplateRequestCreateCommandDataSourceConfig extends TeaModel {
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

        public static CreateBatchTemplateRequestCreateCommandDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTemplateRequestCreateCommandDataSourceConfig self = new CreateBatchTemplateRequestCreateCommandDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateBatchTemplateRequestCreateCommandDataSourceConfig setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public CreateBatchTemplateRequestCreateCommandDataSourceConfig setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public CreateBatchTemplateRequestCreateCommandDataSourceConfig setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public CreateBatchTemplateRequestCreateCommandDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateBatchTemplateRequestCreateCommandParams extends TeaModel {
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

        public static CreateBatchTemplateRequestCreateCommandParams build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTemplateRequestCreateCommandParams self = new CreateBatchTemplateRequestCreateCommandParams();
            return TeaModel.build(map, self);
        }

        public CreateBatchTemplateRequestCreateCommandParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBatchTemplateRequestCreateCommandParams setEncryptEnabled(Boolean encryptEnabled) {
            this.encryptEnabled = encryptEnabled;
            return this;
        }
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
        }

        public CreateBatchTemplateRequestCreateCommandParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBatchTemplateRequestCreateCommandParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateBatchTemplateRequestCreateCommand extends TeaModel {
        /**
         * <p>The content of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>echo 123</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The datasource config for database SQL templates, which takes effect only for database SQL templates.</p>
         */
        @NameInMap("DataSourceConfig")
        public CreateBatchTemplateRequestCreateCommandDataSourceConfig dataSourceConfig;

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
         * <p>The directory of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/Data Development/Templates</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The compute engine version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON_3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

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
         * <p>The node type of the template. Valid values: 10: Shell, 21: Python, 998: Database SQL, 5: MaxCompute SQL, 6: MapReduce on MaxCompute, 8: Spark on MaxCompute, 28: Hologres SQL, 1: Hive SQL, 2: MapReduce on Yarn, 18: Spark on Yarn, 78: Impala SQL, 80: Spark SQL, 10000: Inceptor SQL, 51: AnalyticDB for PostgreSQL SQL, 81: GaussDB SQL, 82: Databricks SQL, 76: ArgoDB SQL, 79: StarRocks SQL, 202: SelectDB SQL, 201: Doris SQL, and 203: OushuDB SQL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OperatorType")
        public Integer operatorType;

        /**
         * <p>The list of template parameters.</p>
         */
        @NameInMap("Params")
        public java.util.List<CreateBatchTemplateRequestCreateCommandParams> params;

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

        public static CreateBatchTemplateRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTemplateRequestCreateCommand self = new CreateBatchTemplateRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateBatchTemplateRequestCreateCommand setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateBatchTemplateRequestCreateCommand setDataSourceConfig(CreateBatchTemplateRequestCreateCommandDataSourceConfig dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public CreateBatchTemplateRequestCreateCommandDataSourceConfig getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public CreateBatchTemplateRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBatchTemplateRequestCreateCommand setDevResourceGroupId(String devResourceGroupId) {
            this.devResourceGroupId = devResourceGroupId;
            return this;
        }
        public String getDevResourceGroupId() {
            return this.devResourceGroupId;
        }

        public CreateBatchTemplateRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateBatchTemplateRequestCreateCommand setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateBatchTemplateRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBatchTemplateRequestCreateCommand setOperatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Integer getOperatorType() {
            return this.operatorType;
        }

        public CreateBatchTemplateRequestCreateCommand setParams(java.util.List<CreateBatchTemplateRequestCreateCommandParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<CreateBatchTemplateRequestCreateCommandParams> getParams() {
            return this.params;
        }

        public CreateBatchTemplateRequestCreateCommand setPythonModuleIds(java.util.List<Long> pythonModuleIds) {
            this.pythonModuleIds = pythonModuleIds;
            return this;
        }
        public java.util.List<Long> getPythonModuleIds() {
            return this.pythonModuleIds;
        }

        public CreateBatchTemplateRequestCreateCommand setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateBatchTemplateRequestCreateCommand setShareRuntimeResource(Boolean shareRuntimeResource) {
            this.shareRuntimeResource = shareRuntimeResource;
            return this;
        }
        public Boolean getShareRuntimeResource() {
            return this.shareRuntimeResource;
        }

    }

}
