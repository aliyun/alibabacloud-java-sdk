// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTaskRequest extends TeaModel {
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
     * <p>The submit request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitBatchTaskRequestSubmitCommand submitCommand;

    public static SubmitBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTaskRequest self = new SubmitBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTaskRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitBatchTaskRequest setSubmitCommand(SubmitBatchTaskRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitBatchTaskRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig extends TeaModel {
        /**
         * <p>The end time in the format of HH:mm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The custom interval.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The interval unit. Valid values:</p>
         * <ul>
         * <li>MINUTE: minute</li>
         * <li>HOUR: hour</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>The schedule period. Valid values:</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The start time in the format of HH:mm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig self = new SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>参数说明</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptEnabled")
        public Boolean encryptEnabled;

        /**
         * <strong>example:</strong>
         * <p>paramKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>paramValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams self = new SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setEncryptEnabled(Boolean encryptEnabled) {
            this.encryptEnabled = encryptEnabled;
            return this;
        }
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandParamList extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Value")
        public String value;

        public static SubmitBatchTaskRequestSubmitCommandParamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandParamList self = new SubmitBatchTaskRequestSubmitCommandParamList();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitBatchTaskRequestSubmitCommandParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandSparkClientInfo extends TeaModel {
        /**
         * <p>The version name of the Spark client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SparkClientVersion")
        public String sparkClientVersion;

        public static SubmitBatchTaskRequestSubmitCommandSparkClientInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandSparkClientInfo self = new SubmitBatchTaskRequestSubmitCommandSparkClientInfo();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo setSparkClientVersion(String sparkClientVersion) {
            this.sparkClientVersion = sparkClientVersion;
            return this;
        }
        public String getSparkClientVersion() {
            return this.sparkClientVersion;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod extends TeaModel {
        /**
         * <p>The period offset. This parameter is required when dependencyPeriodType is set to LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>The dependency period type. Valid values:</p>
         * <ul>
         * <li>CURRENT_PERIOD: current period</li>
         * <li>LAST_PERIOD: previous period</li>
         * <li>LAST_N_PERIOD: last N days</li>
         * <li>LAST_24_HOUR: last 24 hours</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_PERIOD</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod self = new SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommandUpStreamList extends TeaModel {
        /**
         * <p>The dependency period.</p>
         */
        @NameInMap("DependPeriod")
        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod dependPeriod;

        /**
         * <p>The dependency strategy. Valid values:</p>
         * <ul>
         * <li>ALL: all</li>
         * <li>FIRST: first</li>
         * <li>LAST: last</li>
         * <li>NEAR: nearest</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        /**
         * <p>The dependent logical table fields.</p>
         */
        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <p>The type of the upstream dependency node. Valid values:</p>
         * <ul>
         * <li>PHYSICAL: physical node</li>
         * <li>LOGICAL: logical table dependency</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The period difference. A value of 0 indicates a same-period dependency. A positive number indicates a dependency on the previous N periods.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        /**
         * <p>Indicates whether the upstream node is enabled.</p>
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
         * <p>The output name of the upstream node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
         * <p>The name of the input table.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        public static SubmitBatchTaskRequestSubmitCommandUpStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommandUpStreamList self = new SubmitBatchTaskRequestSubmitCommandUpStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setDependPeriod(SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod dependPeriod) {
            this.dependPeriod = dependPeriod;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod getDependPeriod() {
            return this.dependPeriod;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setDependStrategy(String dependStrategy) {
            this.dependStrategy = dependStrategy;
            return this;
        }
        public String getDependStrategy() {
            return this.dependStrategy;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setFieldList(java.util.List<String> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceNodeEnabled(Boolean sourceNodeEnabled) {
            this.sourceNodeEnabled = sourceNodeEnabled;
            return this;
        }
        public Boolean getSourceNodeEnabled() {
            return this.sourceNodeEnabled;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceNodeId(String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public String getSourceNodeId() {
            return this.sourceNodeId;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceNodeOutputName(String sourceNodeOutputName) {
            this.sourceNodeOutputName = sourceNodeOutputName;
            return this;
        }
        public String getSourceNodeOutputName() {
            return this.sourceNodeOutputName;
        }

        public SubmitBatchTaskRequestSubmitCommandUpStreamList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

    }

    public static class SubmitBatchTaskRequestSubmitCommand extends TeaModel {
        /**
         * <p>The code of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CodeTemplateVersion")
        public Integer codeTemplateVersion;

        /**
         * <p>The comment for the submit operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The cron expression for automatic scheduling. Refer to the Linux cron expression syntax.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The custom schedule interval configuration.</p>
         */
        @NameInMap("CustomScheduleConfig")
        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig customScheduleConfig;

        /**
         * <p>The execution engine for the node, such as for Python tasks. Valid values:</p>
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
         * <p>The node ID in the directory tree.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the batch task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The list of node output names.</p>
         */
        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li>1: Normal.</li>
         * <li>2: Paused.</li>
         * <li>3: Dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>template_123456</p>
         */
        @NameInMap("OfflineCodeTemplateId")
        public String offlineCodeTemplateId;

        @NameInMap("OfflineCodeTemplateParams")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> offlineCodeTemplateParams;

        /**
         * <p>The list of custom parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> paramList;

        /**
         * <p>The scheduling priority of the node. Valid values: 1 to 9. A larger value indicates a lower priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the project to which the node belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The Python third-party packages that the node depends on.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <p>The schedule period. Valid values:</p>
         * <ul>
         * <li>YEARLY</li>
         * <li>MONTHLY</li>
         * <li>WEEKLY</li>
         * <li>DAILY</li>
         * <li>HOURLY</li>
         * <li>MINUTELY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <p>The Spark client information.</p>
         */
        @NameInMap("SparkClientInfo")
        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo sparkClientInfo;

        /**
         * <p>The upstream dependencies.</p>
         */
        @NameInMap("UpStreamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandUpStreamList> upStreamList;

        public static SubmitBatchTaskRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskRequestSubmitCommand self = new SubmitBatchTaskRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskRequestSubmitCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitBatchTaskRequestSubmitCommand setCodeTemplateVersion(Integer codeTemplateVersion) {
            this.codeTemplateVersion = codeTemplateVersion;
            return this;
        }
        public Integer getCodeTemplateVersion() {
            return this.codeTemplateVersion;
        }

        public SubmitBatchTaskRequestSubmitCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public SubmitBatchTaskRequestSubmitCommand setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public SubmitBatchTaskRequestSubmitCommand setCustomScheduleConfig(SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig customScheduleConfig) {
            this.customScheduleConfig = customScheduleConfig;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig getCustomScheduleConfig() {
            return this.customScheduleConfig;
        }

        public SubmitBatchTaskRequestSubmitCommand setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public SubmitBatchTaskRequestSubmitCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public SubmitBatchTaskRequestSubmitCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitBatchTaskRequestSubmitCommand setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public SubmitBatchTaskRequestSubmitCommand setNodeOutputNameList(java.util.List<String> nodeOutputNameList) {
            this.nodeOutputNameList = nodeOutputNameList;
            return this;
        }
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        public SubmitBatchTaskRequestSubmitCommand setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public SubmitBatchTaskRequestSubmitCommand setOfflineCodeTemplateId(String offlineCodeTemplateId) {
            this.offlineCodeTemplateId = offlineCodeTemplateId;
            return this;
        }
        public String getOfflineCodeTemplateId() {
            return this.offlineCodeTemplateId;
        }

        public SubmitBatchTaskRequestSubmitCommand setOfflineCodeTemplateParams(java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> offlineCodeTemplateParams) {
            this.offlineCodeTemplateParams = offlineCodeTemplateParams;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandOfflineCodeTemplateParams> getOfflineCodeTemplateParams() {
            return this.offlineCodeTemplateParams;
        }

        public SubmitBatchTaskRequestSubmitCommand setParamList(java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> getParamList() {
            return this.paramList;
        }

        public SubmitBatchTaskRequestSubmitCommand setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public SubmitBatchTaskRequestSubmitCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SubmitBatchTaskRequestSubmitCommand setPythonModuleList(java.util.List<String> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<String> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public SubmitBatchTaskRequestSubmitCommand setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public SubmitBatchTaskRequestSubmitCommand setSparkClientInfo(SubmitBatchTaskRequestSubmitCommandSparkClientInfo sparkClientInfo) {
            this.sparkClientInfo = sparkClientInfo;
            return this;
        }
        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo getSparkClientInfo() {
            return this.sparkClientInfo;
        }

        public SubmitBatchTaskRequestSubmitCommand setUpStreamList(java.util.List<SubmitBatchTaskRequestSubmitCommandUpStreamList> upStreamList) {
            this.upStreamList = upStreamList;
            return this;
        }
        public java.util.List<SubmitBatchTaskRequestSubmitCommandUpStreamList> getUpStreamList() {
            return this.upStreamList;
        }

    }

}
