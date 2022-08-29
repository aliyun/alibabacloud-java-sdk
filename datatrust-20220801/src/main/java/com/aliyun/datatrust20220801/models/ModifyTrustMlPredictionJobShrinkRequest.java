// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustMlPredictionJobShrinkRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataProcessDtoList")
    public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList> dataProcessDtoList;

    @NameInMap("DataProcessTypeOrder")
    public String dataProcessTypeOrderShrink;

    @NameInMap("DataSetDtos")
    public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtos> dataSetDtos;

    @NameInMap("FeatureDistribution")
    public Integer featureDistribution;

    @NameInMap("FeatureFormat")
    public Integer featureFormat;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("HostFeatureNum")
    public Integer hostFeatureNum;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobStatus")
    public Integer jobStatus;

    @NameInMap("JobType")
    public Integer jobType;

    @NameInMap("JobTypeName")
    public String jobTypeName;

    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("ModeName")
    public String modeName;

    @NameInMap("OutputDs")
    public String outputDs;

    @NameInMap("OutputId")
    public Long outputId;

    @NameInMap("OutputName")
    public String outputName;

    @NameInMap("PartitionType")
    public Integer partitionType;

    @NameInMap("PlanList")
    public String planListShrink;

    @NameInMap("PredictionResultTo")
    public Integer predictionResultTo;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProtocolTypeList")
    public String protocolTypeListShrink;

    @NameInMap("ScheduleCron")
    public String scheduleCron;

    @NameInMap("ScheduleType")
    public Integer scheduleType;

    @NameInMap("ScheduleTypeName")
    public String scheduleTypeName;

    @NameInMap("ServiceApiId")
    public String serviceApiId;

    @NameInMap("SlaveFeatureNum")
    public Integer slaveFeatureNum;

    @NameInMap("TrainingJobId")
    public Long trainingJobId;

    @NameInMap("TrainingJobName")
    public String trainingJobName;

    @NameInMap("TrainingModelId")
    public Long trainingModelId;

    @NameInMap("TrainingModelName")
    public String trainingModelName;

    @NameInMap("TrainingModelVersion")
    public String trainingModelVersion;

    @NameInMap("TrainingModelVersionName")
    public String trainingModelVersionName;

    public static ModifyTrustMlPredictionJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustMlPredictionJobShrinkRequest self = new ModifyTrustMlPredictionJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrustMlPredictionJobShrinkRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setDataProcessDtoList(java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList> dataProcessDtoList) {
        this.dataProcessDtoList = dataProcessDtoList;
        return this;
    }
    public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList> getDataProcessDtoList() {
        return this.dataProcessDtoList;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setDataProcessTypeOrderShrink(String dataProcessTypeOrderShrink) {
        this.dataProcessTypeOrderShrink = dataProcessTypeOrderShrink;
        return this;
    }
    public String getDataProcessTypeOrderShrink() {
        return this.dataProcessTypeOrderShrink;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setDataSetDtos(java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setFeatureDistribution(Integer featureDistribution) {
        this.featureDistribution = featureDistribution;
        return this;
    }
    public Integer getFeatureDistribution() {
        return this.featureDistribution;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setHostFeatureNum(Integer hostFeatureNum) {
        this.hostFeatureNum = hostFeatureNum;
        return this;
    }
    public Integer getHostFeatureNum() {
        return this.hostFeatureNum;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setOutputDs(String outputDs) {
        this.outputDs = outputDs;
        return this;
    }
    public String getOutputDs() {
        return this.outputDs;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setOutputId(Long outputId) {
        this.outputId = outputId;
        return this;
    }
    public Long getOutputId() {
        return this.outputId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setPartitionType(Integer partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public Integer getPartitionType() {
        return this.partitionType;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setPlanListShrink(String planListShrink) {
        this.planListShrink = planListShrink;
        return this;
    }
    public String getPlanListShrink() {
        return this.planListShrink;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setPredictionResultTo(Integer predictionResultTo) {
        this.predictionResultTo = predictionResultTo;
        return this;
    }
    public Integer getPredictionResultTo() {
        return this.predictionResultTo;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setProtocolTypeListShrink(String protocolTypeListShrink) {
        this.protocolTypeListShrink = protocolTypeListShrink;
        return this;
    }
    public String getProtocolTypeListShrink() {
        return this.protocolTypeListShrink;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setServiceApiId(String serviceApiId) {
        this.serviceApiId = serviceApiId;
        return this;
    }
    public String getServiceApiId() {
        return this.serviceApiId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setSlaveFeatureNum(Integer slaveFeatureNum) {
        this.slaveFeatureNum = slaveFeatureNum;
        return this;
    }
    public Integer getSlaveFeatureNum() {
        return this.slaveFeatureNum;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setTrainingJobId(Long trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public Long getTrainingJobId() {
        return this.trainingJobId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setTrainingModelId(Long trainingModelId) {
        this.trainingModelId = trainingModelId;
        return this;
    }
    public Long getTrainingModelId() {
        return this.trainingModelId;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setTrainingModelName(String trainingModelName) {
        this.trainingModelName = trainingModelName;
        return this;
    }
    public String getTrainingModelName() {
        return this.trainingModelName;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setTrainingModelVersion(String trainingModelVersion) {
        this.trainingModelVersion = trainingModelVersion;
        return this;
    }
    public String getTrainingModelVersion() {
        return this.trainingModelVersion;
    }

    public ModifyTrustMlPredictionJobShrinkRequest setTrainingModelVersionName(String trainingModelVersionName) {
        this.trainingModelVersionName = trainingModelVersionName;
        return this;
    }
    public String getTrainingModelVersionName() {
        return this.trainingModelVersionName;
    }

    public static class ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField self = new ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList extends TeaModel {
        @NameInMap("BinningCount")
        public Integer binningCount;

        @NameInMap("BinningInterval")
        public String binningInterval;

        @NameInMap("BinningType")
        public Integer binningType;

        @NameInMap("DataOwnerId")
        public Long dataOwnerId;

        @NameInMap("DataOwnerName")
        public String dataOwnerName;

        @NameInMap("DataSetId")
        public Long dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("DataSetUsage")
        public Integer dataSetUsage;

        @NameInMap("Field")
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList self = new ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setField(java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoListField> getField() {
            return this.field;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns self = new ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns extends TeaModel {
        @NameInMap("DataSetRole")
        public Integer dataSetRole;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("InputColumnDesc")
        public String inputColumnDesc;

        @NameInMap("InputColumnName")
        public String inputColumnName;

        @NameInMap("OutputColumnDesc")
        public String outputColumnDesc;

        @NameInMap("OutputColumnName")
        public String outputColumnName;

        public static ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns self = new ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns extends TeaModel {
        @NameInMap("DataSetRole")
        public Integer dataSetRole;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("InputColumnDesc")
        public String inputColumnDesc;

        @NameInMap("InputColumnName")
        public String inputColumnName;

        @NameInMap("OutputColumnDesc")
        public String outputColumnDesc;

        @NameInMap("OutputColumnName")
        public String outputColumnName;

        public static ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns self = new ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustMlPredictionJobShrinkRequestDataSetDtos extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("DataOwnerId")
        public Long dataOwnerId;

        @NameInMap("DataOwnerName")
        public String dataOwnerName;

        @NameInMap("DataRole")
        public Integer dataRole;

        @NameInMap("DataSetId")
        public Long dataSetId;

        @NameInMap("DataSetName")
        public String dataSetName;

        @NameInMap("DataSetUsage")
        public Integer dataSetUsage;

        @NameInMap("FilterStr")
        public String filterStr;

        @NameInMap("FlFeatureColumns")
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static ModifyTrustMlPredictionJobShrinkRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlPredictionJobShrinkRequestDataSetDtos self = new ModifyTrustMlPredictionJobShrinkRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setFlFeatureColumns(java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setInputColumns(java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setOutputColumns(java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<ModifyTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public ModifyTrustMlPredictionJobShrinkRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
