// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBatchTaskRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBatchTaskRequestCreateCommand createCommand;

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

    public static CreateBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskRequest self = new CreateBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskRequest setCreateCommand(CreateBatchTaskRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateBatchTaskRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateBatchTaskRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo extends TeaModel {
        /**
         * <p>The HTTP path for the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>/sql/1.0/warehouses/dev</p>
         */
        @NameInMap("DevHttpPath")
        public String devHttpPath;

        /**
         * <p>Specifies whether to enable Databricks Python connect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDatabricksPythonConnect")
        public Boolean enableDatabricksPythonConnect;

        /**
         * <p>The HTTP path for the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>/sql/1.0/warehouses/prod</p>
         */
        @NameInMap("ProdHttpPath")
        public String prodHttpPath;

        public static CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo self = new CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo();
            return TeaModel.build(map, self);
        }

        public CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo setDevHttpPath(String devHttpPath) {
            this.devHttpPath = devHttpPath;
            return this;
        }
        public String getDevHttpPath() {
            return this.devHttpPath;
        }

        public CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo setEnableDatabricksPythonConnect(Boolean enableDatabricksPythonConnect) {
            this.enableDatabricksPythonConnect = enableDatabricksPythonConnect;
            return this;
        }
        public Boolean getEnableDatabricksPythonConnect() {
            return this.enableDatabricksPythonConnect;
        }

        public CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo setProdHttpPath(String prodHttpPath) {
            this.prodHttpPath = prodHttpPath;
            return this;
        }
        public String getProdHttpPath() {
            return this.prodHttpPath;
        }

    }

    public static class CreateBatchTaskRequestCreateCommandPaiConfig extends TeaModel {
        /**
         * <p>The ID of the PAI experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>789012</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <p>The PAI region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the PAI workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("WorkSpaceId")
        public String workSpaceId;

        public static CreateBatchTaskRequestCreateCommandPaiConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTaskRequestCreateCommandPaiConfig self = new CreateBatchTaskRequestCreateCommandPaiConfig();
            return TeaModel.build(map, self);
        }

        public CreateBatchTaskRequestCreateCommandPaiConfig setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public CreateBatchTaskRequestCreateCommandPaiConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateBatchTaskRequestCreateCommandPaiConfig setWorkSpaceId(String workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

    }

    public static class CreateBatchTaskRequestCreateCommand extends TeaModel {
        /**
         * <p>The ID of the offline code template.</p>
         * 
         * <strong>example:</strong>
         * <p>st_123456</p>
         */
        @NameInMap("CodeTemplateId")
        public String codeTemplateId;

        /**
         * <p>The version of the offline code template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CodeTemplateVersion")
        public Integer codeTemplateVersion;

        /**
         * <p>The catalog for database SQL tasks. This parameter takes effect only for data source types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The ID of the data source for database SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The schema for database SQL tasks. This parameter takes effect only for data source types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>The Python connection configuration.</p>
         */
        @NameInMap("DatabricksPythonConnectInfo")
        public CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo databricksPythonConnectInfo;

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IDs of the development owners.</p>
         */
        @NameInMap("DevelopOwnerIdList")
        public java.util.List<String> developOwnerIdList;

        /**
         * <p>The directory in the menu tree to which the task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/a/b</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The task execution engine, such as Python tasks. Valid values:</p>
         * <ul>
         * <li>PYTHON2_7</li>
         * <li>PYTHON3_7</li>
         * <li>PYTHON3_11</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The name of the offline task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The IDs of the O&amp;M owners.</p>
         */
        @NameInMap("OpsOwnerIdList")
        public java.util.List<String> opsOwnerIdList;

        /**
         * <p>The PAI configuration.</p>
         */
        @NameInMap("PaiConfig")
        public CreateBatchTaskRequestCreateCommandPaiConfig paiConfig;

        /**
         * <p>The ID of the project to which the task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The third-party Python packages that the task depends on.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>The scheduling type. Valid values: 1 (periodic task) and 3 (manual task).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <p>Specifies whether to enable dynamic resource configuration for Spark. This parameter takes effect only for Spark SQL tasks. If you do not specify this parameter, dynamic resource configuration is enabled by default for Spark SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SparkDynamicResourceSwitch")
        public Boolean sparkDynamicResourceSwitch;

        /**
         * <p>The effective scope of Spark resources. Valid values: ONLY_PROD and PROD_AND_DEV. If you do not specify this parameter, the default value ONLY_PROD is used for Spark SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLY_PROD</p>
         */
        @NameInMap("SparkResourceEffectScope")
        public String sparkResourceEffectScope;

        /**
         * <p>The resource configuration for the Spark task. The value is a JSON string, such as {&quot;spark.executor.memory&quot;:&quot;2g&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.executor.memory&quot;:&quot;2g&quot;}</p>
         */
        @NameInMap("SparkSqlResourceConfigMap")
        public String sparkSqlResourceConfigMap;

        /**
         * <p>The MaxCompute Spark version. Valid values: MAX_COMPUTE_23X, MAX_COMPUTE_245X, and MAX_COMPUTE_311X. For Apsara Stack, only MAX_COMPUTE_APSARA is supported. Display names such as Spark 2.3.0, Spark 2.4.5, and Spark 3.1.1 are also accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark 3.1.1</p>
         */
        @NameInMap("SparkVersion")
        public String sparkVersion;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>1: Hive_SQL.</li>
         * <li>101: Hive_SQL_23X.</li>
         * <li>111: HIVE_SQL_FUSION_INSIGHT_80X.</li>
         * <li>131: COMMON_HIVE_SQL.</li>
         * <li>2: HADOOP_MR.</li>
         * <li>5: MaxCompute_SQL.</li>
         * <li>6: MaxCompute_MR.</li>
         * <li>7: SPARK_SQL_ON_MAX_COMPUTE.</li>
         * <li>8: SPARK_JAR_ON_MAX_COMPUTE.</li>
         * <li>17: SPARK_SQL_ON_HIVE.</li>
         * <li>18: Spark_JAR_ON_HIVE.</li>
         * <li>10: Shell.</li>
         * <li>71: PAI_DESIGNER.</li>
         * <li>15: DataX.</li>
         * <li>16: Merge.</li>
         * <li>21: Python.</li>
         * <li>22: Python37x.</li>
         * <li>23: Perl.</li>
         * <li>24: Python311x.</li>
         * <li>25: OneService_SQL.</li>
         * <li>26: ONE_SERVICE_SQL_ADB_FOR_PG.</li>
         * <li>27: OneService_SQL_Hive11x.</li>
         * <li>29: OneService_SQL_Hive23x.</li>
         * <li>75: ONE_SERVICE_SQL_TDH_INCEPTOR.</li>
         * <li>91: ONE_SERVICE_SQL_HIVE_CDP.</li>
         * <li>92: ONE_SERVICE_SQL_HIVE_ASIA_INFO_DP_53X.</li>
         * <li>30: Dlink.</li>
         * <li>33: ONE_SERVICE_SQL_ADB_FOR_MYSQL.</li>
         * <li>31: Logical.</li>
         * <li>41: Flink_Streaming.</li>
         * <li>42: Flink_Batch.</li>
         * <li>51: ADB_FOR_PG.</li>
         * <li>100: DryRun.</li>
         * <li>902: CHECK.</li>
         * <li>999: VIRTUAL.</li>
         * <li>10000: INCEPTOR_SQL.</li>
         * <li>28: HOLOGRES_SQL.</li>
         * <li>76: ARGODB_SQL.</li>
         * <li>78: IMPALA_SQL.</li>
         * <li>79: STARROCKS_SQL.</li>
         * <li>80: SPARK_SQL.</li>
         * <li>81: GAUSS_SQL.</li>
         * <li>998: DATABASE_SQL.</li>
         * <li>997: EXTERNAL_TRIGGER.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static CreateBatchTaskRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTaskRequestCreateCommand self = new CreateBatchTaskRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateBatchTaskRequestCreateCommand setCodeTemplateId(String codeTemplateId) {
            this.codeTemplateId = codeTemplateId;
            return this;
        }
        public String getCodeTemplateId() {
            return this.codeTemplateId;
        }

        public CreateBatchTaskRequestCreateCommand setCodeTemplateVersion(Integer codeTemplateVersion) {
            this.codeTemplateVersion = codeTemplateVersion;
            return this;
        }
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        public CreateBatchTaskRequestCreateCommand setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public CreateBatchTaskRequestCreateCommand setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CreateBatchTaskRequestCreateCommand setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public CreateBatchTaskRequestCreateCommand setDatabricksPythonConnectInfo(CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo databricksPythonConnectInfo) {
            this.databricksPythonConnectInfo = databricksPythonConnectInfo;
            return this;
        }
        public CreateBatchTaskRequestCreateCommandDatabricksPythonConnectInfo getDatabricksPythonConnectInfo() {
            return this.databricksPythonConnectInfo;
        }

        public CreateBatchTaskRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBatchTaskRequestCreateCommand setDevelopOwnerIdList(java.util.List<String> developOwnerIdList) {
            this.developOwnerIdList = developOwnerIdList;
            return this;
        }
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
        }

        public CreateBatchTaskRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateBatchTaskRequestCreateCommand setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateBatchTaskRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBatchTaskRequestCreateCommand setOpsOwnerIdList(java.util.List<String> opsOwnerIdList) {
            this.opsOwnerIdList = opsOwnerIdList;
            return this;
        }
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        public CreateBatchTaskRequestCreateCommand setPaiConfig(CreateBatchTaskRequestCreateCommandPaiConfig paiConfig) {
            this.paiConfig = paiConfig;
            return this;
        }
        public CreateBatchTaskRequestCreateCommandPaiConfig getPaiConfig() {
            return this.paiConfig;
        }

        public CreateBatchTaskRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateBatchTaskRequestCreateCommand setPythonModuleList(java.util.List<String> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public CreateBatchTaskRequestCreateCommand setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public CreateBatchTaskRequestCreateCommand setSparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
            this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
            return this;
        }
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        public CreateBatchTaskRequestCreateCommand setSparkResourceEffectScope(String sparkResourceEffectScope) {
            this.sparkResourceEffectScope = sparkResourceEffectScope;
            return this;
        }
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        public CreateBatchTaskRequestCreateCommand setSparkSqlResourceConfigMap(String sparkSqlResourceConfigMap) {
            this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
            return this;
        }
        public String getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
        }

        public CreateBatchTaskRequestCreateCommand setSparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }
        public String getSparkVersion() {
            return this.sparkVersion;
        }

        public CreateBatchTaskRequestCreateCommand setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
