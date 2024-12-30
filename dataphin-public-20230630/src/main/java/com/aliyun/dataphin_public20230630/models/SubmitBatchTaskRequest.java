// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
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

    public static class SubmitBatchTaskRequestSubmitCommandParamList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
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
        @NameInMap("DependPeriod")
        public SubmitBatchTaskRequestSubmitCommandUpStreamListDependPeriod dependPeriod;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DependStrategy")
        public String dependStrategy;

        @NameInMap("FieldList")
        public java.util.List<String> fieldList;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        @NameInMap("SourceNodeEnabled")
        public Boolean sourceNodeEnabled;

        /**
         * <strong>example:</strong>
         * <p>n_2001</p>
         */
        @NameInMap("SourceNodeId")
        public String sourceNodeId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_input1</p>
         */
        @NameInMap("SourceNodeOutputName")
        public String sourceNodeOutputName;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>show tables;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("CustomScheduleConfig")
        public SubmitBatchTaskRequestSubmitCommandCustomScheduleConfig customScheduleConfig;

        /**
         * <strong>example:</strong>
         * <p>PYTHON3_7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test111</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        @NameInMap("NodeOutputNameList")
        public java.util.List<String> nodeOutputNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        @NameInMap("ParamList")
        public java.util.List<SubmitBatchTaskRequestSubmitCommandParamList> paramList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10121101</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("PythonModuleList")
        public java.util.List<String> pythonModuleList;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        @NameInMap("SparkClientInfo")
        public SubmitBatchTaskRequestSubmitCommandSparkClientInfo sparkClientInfo;

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
