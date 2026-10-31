// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoByVersionResponseBody extends TeaModel {
    /**
     * <p>The error code. OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The node details.</p>
     */
    @NameInMap("TaskInfo")
    public GetBatchTaskInfoByVersionResponseBodyTaskInfo taskInfo;

    public static GetBatchTaskInfoByVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskInfoByVersionResponseBody self = new GetBatchTaskInfoByVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskInfoByVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchTaskInfoByVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBatchTaskInfoByVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTaskInfoByVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTaskInfoByVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBatchTaskInfoByVersionResponseBody setTaskInfo(GetBatchTaskInfoByVersionResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public GetBatchTaskInfoByVersionResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig extends TeaModel {
        /**
         * <p>The end time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The custom interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The unit of the interval. Valid values: MINUTE and HOUR.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>The scheduling period.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The start time in the HH:mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo extends TeaModel {
        /**
         * <p>The HTTP path in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>/sql/1.0/warehouses/dev</p>
         */
        @NameInMap("DevHttpPath")
        public String devHttpPath;

        /**
         * <p>Specifies whether to enable Databricks Python Connect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDatabricksPythonConnect")
        public Boolean enableDatabricksPythonConnect;

        /**
         * <p>The HTTP path in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>/sql/1.0/warehouses/prod</p>
         */
        @NameInMap("ProdHttpPath")
        public String prodHttpPath;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo setDevHttpPath(String devHttpPath) {
            this.devHttpPath = devHttpPath;
            return this;
        }
        public String getDevHttpPath() {
            return this.devHttpPath;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo setEnableDatabricksPythonConnect(Boolean enableDatabricksPythonConnect) {
            this.enableDatabricksPythonConnect = enableDatabricksPythonConnect;
            return this;
        }
        public Boolean getEnableDatabricksPythonConnect() {
            return this.enableDatabricksPythonConnect;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo setProdHttpPath(String prodHttpPath) {
            this.prodHttpPath = prodHttpPath;
            return this;
        }
        public String getProdHttpPath() {
            return this.prodHttpPath;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig extends TeaModel {
        /**
         * <p>The custom retry interval for failed executions.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CustomRerunInterval")
        public String customRerunInterval;

        /**
         * <p>The custom number of retries for failed executions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CustomRerunTimes")
        public String customRerunTimes;

        /**
         * <p>Specifies whether to follow the system retry configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowSystem")
        public Boolean followSystem;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig setCustomRerunInterval(String customRerunInterval) {
            this.customRerunInterval = customRerunInterval;
            return this;
        }
        public String getCustomRerunInterval() {
            return this.customRerunInterval;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig setCustomRerunTimes(String customRerunTimes) {
            this.customRerunTimes = customRerunTimes;
            return this;
        }
        public String getCustomRerunTimes() {
            return this.customRerunTimes;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig setFollowSystem(Boolean followSystem) {
            this.followSystem = followSystem;
            return this;
        }
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig extends TeaModel {
        /**
         * <p>The custom timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("CustomValues")
        public String customValues;

        /**
         * <p>Specifies whether to follow the system retry configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowSystem")
        public Boolean followSystem;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig setCustomValues(String customValues) {
            this.customValues = customValues;
            return this;
        }
        public String getCustomValues() {
            return this.customValues;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig setFollowSystem(Boolean followSystem) {
            this.followSystem = followSystem;
            return this;
        }
        public Boolean getFollowSystem() {
            return this.followSystem;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig extends TeaModel {
        /**
         * <p>The PAI experiment ID.</p>
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
         * <p>The PAI workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("WorkSpaceId")
        public String workSpaceId;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig setWorkSpaceId(String workSpaceId) {
            this.workSpaceId = workSpaceId;
            return this;
        }
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList extends TeaModel {
        /**
         * <p>The ID of the third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ModuleId")
        public Long moduleId;

        /**
         * <p>The name of the third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>pandas</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Python version required by the third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>Python 3.7</p>
         */
        @NameInMap("PythonVersion")
        public String pythonVersion;

        /**
         * <p>The version of the third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1.3.5</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList setPythonVersion(String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo extends TeaModel {
        /**
         * <p>The name of the Spark client.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SparkClientVersion")
        public String sparkClientVersion;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo setSparkClientVersion(String sparkClientVersion) {
            this.sparkClientVersion = sparkClientVersion;
            return this;
        }
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod extends TeaModel {
        /**
         * <p>The period offset. This parameter is required when the PeriodType parameter is set to LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>The dependency period type. Valid values:</p>
         * <ul>
         * <li>CURRENT_PERIOD: Current period.</li>
         * <li>LAST_PERIOD: Last period.</li>
         * <li>LAST_N_PERIOD: Last N periods.</li>
         * <li>LAST_24_HOUR: Last 24 hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_PERIOD</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList extends TeaModel {
        /**
         * <p>The dependency period.</p>
         */
        @NameInMap("DependPeriod")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values:</p>
         * <ul>
         * <li>ALL: All.</li>
         * <li>FIRST: First.</li>
         * <li>LAST: Last.</li>
         * <li>NEAR: Nearest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LAST</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        /**
         * <p>The dependent logical table fields.</p>
         */
        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <p>The upstream dependency node type. Valid values:</p>
         * <ul>
         * <li>PHYSICAL: Physical node.</li>
         * <li>LOGICAL: Logical table dependency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The period difference. A value of 0 indicates a same-period dependency. A positive integer indicates a dependency on the previous N periods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        /**
         * <p>Specifies whether the upstream node is enabled.</p>
         */
        @NameInMap("SourceNodeEnabled")
        public Boolean sourceNodeEnabled;

        /**
         * <p>The ID of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>n_2001</p>
         */
        @NameInMap("SourceNodeId")
        public String sourceNodeId;

        /**
         * <p>The name of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeName")
        public String sourceNodeName;

        /**
         * <p>The output name of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
         * <p>The upstream username.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("SourceNodeUserName")
        public String sourceNodeUserName;

        /**
         * <p>The name of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList self = new GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setDependPeriod(GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod dependPeriod) {
            this.dependPeriod = dependPeriod;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamListDependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setDependStrategy(String dependStrategy) {
            this.dependStrategy = dependStrategy;
            return this;
        }
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeEnabled(Boolean sourceNodeEnabled) {
            this.sourceNodeEnabled = sourceNodeEnabled;
            return this;
        }
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeId(String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeName(String sourceNodeName) {
            this.sourceNodeName = sourceNodeName;
            return this;
        }
        public String getSourceNodeName() {
            return this.sourceNodeName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeOutputName(String sourceNodeOutputName) {
            this.sourceNodeOutputName = sourceNodeOutputName;
            return this;
        }
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceNodeUserName(String sourceNodeUserName) {
            this.sourceNodeUserName = sourceNodeUserName;
            return this;
        }
        public String getSourceNodeUserName() {
            return this.sourceNodeUserName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

    }

    public static class GetBatchTaskInfoByVersionResponseBodyTaskInfo extends TeaModel {
        /**
         * <p>The code of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

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
         * <p>The current CPU resource configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CpuResource")
        public String cpuResource;

        /**
         * <p>The cron expression for automatic scheduling. You can refer to Linux cron expressions.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The custom scheduling interval configuration.</p>
         */
        @NameInMap("CustomScheduleConfig")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig;

        /**
         * <p>The ID of the DAG to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dag_102121211</p>
         */
        @NameInMap("DagId")
        public String dagId;

        /**
         * <p>The catalog of the data source. This parameter applies only to database SQL nodes and data source types that require a catalog, such as Presto.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_catalog</p>
         */
        @NameInMap("DataSourceCatalog")
        public String dataSourceCatalog;

        /**
         * <p>The ID of the data source for the database SQL node.</p>
         * 
         * <strong>example:</strong>
         * <p>12131111</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The schema of the data source. This parameter applies only to database SQL nodes and data source types that require a schema, such as Oracle.</p>
         * 
         * <strong>example:</strong>
         * <p>erp</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        /**
         * <p>The Python connection information.</p>
         */
        @NameInMap("DatabricksPythonConnectInfo")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo databricksPythonConnectInfo;

        /**
         * <p>The IDs of the developers.</p>
         */
        @NameInMap("DevelopOwnerIdList")
        public java.util.List<String> developOwnerIdList;

        /**
         * <p>The names of the developers.</p>
         */
        @NameInMap("DevelopOwnerNameList")
        public java.util.List<String> developOwnerNameList;

        /**
         * <p>The retry configuration for failed executions. This is the current configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
         */
        @NameInMap("ExecuteRerunConfig")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig executeRerunConfig;

        /**
         * <p>The execution timeout configuration. This is the current configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
         */
        @NameInMap("ExecuteTimeOutConfig")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig executeTimeOutConfig;

        /**
         * <p>The node ID of the task directory tree.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>Indicates whether a development environment node exists.</p>
         */
        @NameInMap("HasDevNode")
        public Boolean hasDevNode;

        /**
         * <p>The current CPU resource configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MemoryResource")
        public String memoryResource;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task 1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether publishing is required.</p>
         */
        @NameInMap("NeedPublish")
        public Boolean needPublish;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The source of the node, which indicates the organization or application that created the node.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi</p>
         */
        @NameInMap("NodeFrom")
        public String nodeFrom;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_1011_21232132322</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task 1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The list of node output names.</p>
         */
        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <p>The node status. Valid values: 1: Normal. 2: Paused. 3: Dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <p>The ID of the user who performs the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OperatorUserId")
        public String operatorUserId;

        /**
         * <p>The list of O&amp;M owner IDs.</p>
         */
        @NameInMap("OpsOwnerIdList")
        public java.util.List<String> opsOwnerIdList;

        /**
         * <p>The list of O&amp;M owner names.</p>
         */
        @NameInMap("OpsOwnerNameList")
        public java.util.List<String> opsOwnerNameList;

        /**
         * <p>The name of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The user ID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30231123</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The PAI configuration.</p>
         */
        @NameInMap("PaiConfig")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig paiConfig;

        /**
         * <p>The list of custom parameters for the node.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> paramList;

        /**
         * <p>Specifies whether node scheduling is paused.</p>
         */
        @NameInMap("Paused")
        public Boolean paused;

        /**
         * <p>The task scheduling priority. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Specifies whether the task is published.</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <p>The list of third-party packages required by the Python task.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList> pythonModuleList;

        /**
         * <p>The Python version for the Python task, such as Python 3.7.</p>
         * 
         * <strong>example:</strong>
         * <p>Python 3.7</p>
         */
        @NameInMap("PythonVersion")
        public String pythonVersion;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test xx</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Specifies whether the node can be rerun.</p>
         */
        @NameInMap("Rerunable")
        public Boolean rerunable;

        /**
         * <p>Specifies whether to enable retry on timeout. This reflects the current configuration of the node. When queried by version, it reflects the configuration of the corresponding version.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RetryOnTimeoutEnable")
        public Boolean retryOnTimeoutEnable;

        /**
         * <p>The schedule period. Valid values:</p>
         * <ul>
         * <li>YEARLY: Yearly.</li>
         * <li>MONTHLY: Monthly.</li>
         * <li>WEEKLY: Weekly.</li>
         * <li>DAILY: Daily.</li>
         * <li>HOURLY: Hourly.</li>
         * <li>MINUTELY: Minutely.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>1: Periodic node.</li>
         * <li>3: Manual node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <p>The Spark client.</p>
         */
        @NameInMap("SparkClientInfo")
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo sparkClientInfo;

        /**
         * <p>The current CPU resource configuration of the node. If queried by version, this is the configuration of the corresponding version.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SparkDynamicResourceSwitch")
        public Boolean sparkDynamicResourceSwitch;

        /**
         * <p>The effective scope of the Spark resource configuration. Valid values:</p>
         * <ul>
         * <li>ONLY_PROD: Production environment only.</li>
         * <li>PROD_AND_DEV: Production and development environments.
         * This reflects the current configuration of the node. When queried by version, it reflects the configuration of the corresponding version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLY_PROD</p>
         */
        @NameInMap("SparkResourceEffectScope")
        public String sparkResourceEffectScope;

        /**
         * <p>The Spark SQL resource configuration. The key is the configuration item name and the value is a string. The configuration is returned as a JSON string, such as {&quot;spark.executor.memory&quot;:&quot;2g&quot;}. This reflects the current configuration of the node. When queried by version, it reflects the configuration of the corresponding version.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.executor.memory&quot;:&quot;2g&quot;}</p>
         */
        @NameInMap("SparkSqlResourceConfigMap")
        public String sparkSqlResourceConfigMap;

        /**
         * <p>The MaxCompute Spark version.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark 3.1.1</p>
         */
        @NameInMap("SparkVersion")
        public String sparkVersion;

        /**
         * <p>The publish status. Valid values:</p>
         * <ul>
         * <li>0: Draft.</li>
         * <li>1: Submitted.</li>
         * <li>100: In development.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test task 1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task type. For more information, see the API operation for creating an offline computing node.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        /**
         * <p>The upstream dependencies.</p>
         */
        @NameInMap("UpStreamList")
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList> upStreamList;

        public static GetBatchTaskInfoByVersionResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskInfoByVersionResponseBodyTaskInfo self = new GetBatchTaskInfoByVersionResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCodeTemplateId(String codeTemplateId) {
            this.codeTemplateId = codeTemplateId;
            return this;
        }
        public String getCodeTemplateId() {
            return this.codeTemplateId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCodeTemplateVersion(Integer codeTemplateVersion) {
            this.codeTemplateVersion = codeTemplateVersion;
            return this;
        }
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCpuResource(String cpuResource) {
            this.cpuResource = cpuResource;
            return this;
        }
        public String getCpuResource() {
            return this.cpuResource;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setCustomScheduleConfig(GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig customScheduleConfig) {
            this.customScheduleConfig = customScheduleConfig;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoCustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDagId(String dagId) {
            this.dagId = dagId;
            return this;
        }
        public String getDagId() {
            return this.dagId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDataSourceCatalog(String dataSourceCatalog) {
            this.dataSourceCatalog = dataSourceCatalog;
            return this;
        }
        public String getDataSourceCatalog() {
            return this.dataSourceCatalog;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDatabricksPythonConnectInfo(GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo databricksPythonConnectInfo) {
            this.databricksPythonConnectInfo = databricksPythonConnectInfo;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoDatabricksPythonConnectInfo getDatabricksPythonConnectInfo() {
            return this.databricksPythonConnectInfo;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDevelopOwnerIdList(java.util.List<String> developOwnerIdList) {
            this.developOwnerIdList = developOwnerIdList;
            return this;
        }
        public java.util.List<String> getDevelopOwnerIdList() {
            return this.developOwnerIdList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setDevelopOwnerNameList(java.util.List<String> developOwnerNameList) {
            this.developOwnerNameList = developOwnerNameList;
            return this;
        }
        public java.util.List<String> getDevelopOwnerNameList() {
            return this.developOwnerNameList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setExecuteRerunConfig(GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig executeRerunConfig) {
            this.executeRerunConfig = executeRerunConfig;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteRerunConfig getExecuteRerunConfig() {
            return this.executeRerunConfig;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setExecuteTimeOutConfig(GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig executeTimeOutConfig) {
            this.executeTimeOutConfig = executeTimeOutConfig;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoExecuteTimeOutConfig getExecuteTimeOutConfig() {
            return this.executeTimeOutConfig;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setHasDevNode(Boolean hasDevNode) {
            this.hasDevNode = hasDevNode;
            return this;
        }
        public Boolean getHasDevNode() {
            return this.hasDevNode;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setMemoryResource(String memoryResource) {
            this.memoryResource = memoryResource;
            return this;
        }
        public String getMemoryResource() {
            return this.memoryResource;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNeedPublish(Boolean needPublish) {
            this.needPublish = needPublish;
            return this;
        }
        public Boolean getNeedPublish() {
            return this.needPublish;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeFrom(String nodeFrom) {
            this.nodeFrom = nodeFrom;
            return this;
        }
        public String getNodeFrom() {
            return this.nodeFrom;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOperatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }
        public String getOperatorUserId() {
            return this.operatorUserId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOpsOwnerIdList(java.util.List<String> opsOwnerIdList) {
            this.opsOwnerIdList = opsOwnerIdList;
            return this;
        }
        public java.util.List<String> getOpsOwnerIdList() {
            return this.opsOwnerIdList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOpsOwnerNameList(java.util.List<String> opsOwnerNameList) {
            this.opsOwnerNameList = opsOwnerNameList;
            return this;
        }
        public java.util.List<String> getOpsOwnerNameList() {
            return this.opsOwnerNameList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPaiConfig(GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig paiConfig) {
            this.paiConfig = paiConfig;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoPaiConfig getPaiConfig() {
            return this.paiConfig;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setParamList(java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoParamList> getParamList() {
            return this.paramList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPaused(Boolean paused) {
            this.paused = paused;
            return this;
        }
        public Boolean getPaused() {
            return this.paused;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPythonModuleList(java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoPythonModuleList> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setPythonVersion(String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setRerunable(Boolean rerunable) {
            this.rerunable = rerunable;
            return this;
        }
        public Boolean getRerunable() {
            return this.rerunable;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setRetryOnTimeoutEnable(Boolean retryOnTimeoutEnable) {
            this.retryOnTimeoutEnable = retryOnTimeoutEnable;
            return this;
        }
        public Boolean getRetryOnTimeoutEnable() {
            return this.retryOnTimeoutEnable;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSparkClientInfo(GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo sparkClientInfo) {
            this.sparkClientInfo = sparkClientInfo;
            return this;
        }
        public GetBatchTaskInfoByVersionResponseBodyTaskInfoSparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSparkDynamicResourceSwitch(Boolean sparkDynamicResourceSwitch) {
            this.sparkDynamicResourceSwitch = sparkDynamicResourceSwitch;
            return this;
        }
        public Boolean getSparkDynamicResourceSwitch() {
            return this.sparkDynamicResourceSwitch;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSparkResourceEffectScope(String sparkResourceEffectScope) {
            this.sparkResourceEffectScope = sparkResourceEffectScope;
            return this;
        }
        public String getSparkResourceEffectScope() {
            return this.sparkResourceEffectScope;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSparkSqlResourceConfigMap(String sparkSqlResourceConfigMap) {
            this.sparkSqlResourceConfigMap = sparkSqlResourceConfigMap;
            return this;
        }
        public String getSparkSqlResourceConfigMap() {
            return this.sparkSqlResourceConfigMap;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setSparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }
        public String getSparkVersion() {
            return this.sparkVersion;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public GetBatchTaskInfoByVersionResponseBodyTaskInfo setUpStreamList(java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList> upStreamList) {
            this.upStreamList = upStreamList;
            return this;
        }
        public java.util.List<GetBatchTaskInfoByVersionResponseBodyTaskInfoUpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

    }

}
