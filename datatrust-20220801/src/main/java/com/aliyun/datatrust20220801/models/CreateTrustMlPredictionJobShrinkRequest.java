// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlPredictionJobShrinkRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataProcessDtoList")
    public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList> dataProcessDtoList;

    @NameInMap("DataProcessTypeOrder")
    public String dataProcessTypeOrderShrink;

    @NameInMap("DataSetDtos")
    public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtos> dataSetDtos;

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

    public static CreateTrustMlPredictionJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlPredictionJobShrinkRequest self = new CreateTrustMlPredictionJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlPredictionJobShrinkRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public CreateTrustMlPredictionJobShrinkRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateTrustMlPredictionJobShrinkRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setDataProcessDtoList(java.util.List<CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList> dataProcessDtoList) {
        this.dataProcessDtoList = dataProcessDtoList;
        return this;
    }
    public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList> getDataProcessDtoList() {
        return this.dataProcessDtoList;
    }

    public CreateTrustMlPredictionJobShrinkRequest setDataProcessTypeOrderShrink(String dataProcessTypeOrderShrink) {
        this.dataProcessTypeOrderShrink = dataProcessTypeOrderShrink;
        return this;
    }
    public String getDataProcessTypeOrderShrink() {
        return this.dataProcessTypeOrderShrink;
    }

    public CreateTrustMlPredictionJobShrinkRequest setDataSetDtos(java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public CreateTrustMlPredictionJobShrinkRequest setFeatureDistribution(Integer featureDistribution) {
        this.featureDistribution = featureDistribution;
        return this;
    }
    public Integer getFeatureDistribution() {
        return this.featureDistribution;
    }

    public CreateTrustMlPredictionJobShrinkRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public CreateTrustMlPredictionJobShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTrustMlPredictionJobShrinkRequest setHostFeatureNum(Integer hostFeatureNum) {
        this.hostFeatureNum = hostFeatureNum;
        return this;
    }
    public Integer getHostFeatureNum() {
        return this.hostFeatureNum;
    }

    public CreateTrustMlPredictionJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public CreateTrustMlPredictionJobShrinkRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public CreateTrustMlPredictionJobShrinkRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public CreateTrustMlPredictionJobShrinkRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setOutputDs(String outputDs) {
        this.outputDs = outputDs;
        return this;
    }
    public String getOutputDs() {
        return this.outputDs;
    }

    public CreateTrustMlPredictionJobShrinkRequest setOutputId(Long outputId) {
        this.outputId = outputId;
        return this;
    }
    public Long getOutputId() {
        return this.outputId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setPartitionType(Integer partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public Integer getPartitionType() {
        return this.partitionType;
    }

    public CreateTrustMlPredictionJobShrinkRequest setPlanListShrink(String planListShrink) {
        this.planListShrink = planListShrink;
        return this;
    }
    public String getPlanListShrink() {
        return this.planListShrink;
    }

    public CreateTrustMlPredictionJobShrinkRequest setPredictionResultTo(Integer predictionResultTo) {
        this.predictionResultTo = predictionResultTo;
        return this;
    }
    public Integer getPredictionResultTo() {
        return this.predictionResultTo;
    }

    public CreateTrustMlPredictionJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setProtocolTypeListShrink(String protocolTypeListShrink) {
        this.protocolTypeListShrink = protocolTypeListShrink;
        return this;
    }
    public String getProtocolTypeListShrink() {
        return this.protocolTypeListShrink;
    }

    public CreateTrustMlPredictionJobShrinkRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public CreateTrustMlPredictionJobShrinkRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public CreateTrustMlPredictionJobShrinkRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setServiceApiId(String serviceApiId) {
        this.serviceApiId = serviceApiId;
        return this;
    }
    public String getServiceApiId() {
        return this.serviceApiId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setSlaveFeatureNum(Integer slaveFeatureNum) {
        this.slaveFeatureNum = slaveFeatureNum;
        return this;
    }
    public Integer getSlaveFeatureNum() {
        return this.slaveFeatureNum;
    }

    public CreateTrustMlPredictionJobShrinkRequest setTrainingJobId(Long trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public Long getTrainingJobId() {
        return this.trainingJobId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setTrainingModelId(Long trainingModelId) {
        this.trainingModelId = trainingModelId;
        return this;
    }
    public Long getTrainingModelId() {
        return this.trainingModelId;
    }

    public CreateTrustMlPredictionJobShrinkRequest setTrainingModelName(String trainingModelName) {
        this.trainingModelName = trainingModelName;
        return this;
    }
    public String getTrainingModelName() {
        return this.trainingModelName;
    }

    public CreateTrustMlPredictionJobShrinkRequest setTrainingModelVersion(String trainingModelVersion) {
        this.trainingModelVersion = trainingModelVersion;
        return this;
    }
    public String getTrainingModelVersion() {
        return this.trainingModelVersion;
    }

    public CreateTrustMlPredictionJobShrinkRequest setTrainingModelVersionName(String trainingModelVersionName) {
        this.trainingModelVersionName = trainingModelVersionName;
        return this;
    }
    public String getTrainingModelVersionName() {
        return this.trainingModelVersionName;
    }

    public static class CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField self = new CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList extends TeaModel {
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
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList self = new CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setField(java.util.List<CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataProcessDtoListField> getField() {
            return this.field;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns self = new CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns extends TeaModel {
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

        public static CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns self = new CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns self = new CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustMlPredictionJobShrinkRequestDataSetDtos extends TeaModel {
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
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static CreateTrustMlPredictionJobShrinkRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlPredictionJobShrinkRequestDataSetDtos self = new CreateTrustMlPredictionJobShrinkRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setFlFeatureColumns(java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setInputColumns(java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setOutputColumns(java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<CreateTrustMlPredictionJobShrinkRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public CreateTrustMlPredictionJobShrinkRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
