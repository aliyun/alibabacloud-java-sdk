// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlTrainingJobShrinkRequest extends TeaModel {
    @NameInMap("AlgId")
    public Long algId;

    @NameInMap("AlgName")
    public String algName;

    @NameInMap("AlgRound")
    public Integer algRound;

    @NameInMap("AlgTypeId")
    public Long algTypeId;

    @NameInMap("AlgTypeName")
    public String algTypeName;

    @NameInMap("AlgVersion")
    public String algVersion;

    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataProcessDtoList")
    public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList> dataProcessDtoList;

    @NameInMap("DataProcessTypeOrder")
    public String dataProcessTypeOrderShrink;

    @NameInMap("DataSetDtos")
    public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtos> dataSetDtos;

    @NameInMap("DynamicParams")
    public java.util.List<CreateTrustMlTrainingJobShrinkRequestDynamicParams> dynamicParams;

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

    @NameInMap("PartitionType")
    public Integer partitionType;

    @NameInMap("PlanList")
    public String planListShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProtocolTypeList")
    public java.util.List<String> protocolTypeList;

    @NameInMap("RandomSeed")
    public Integer randomSeed;

    @NameInMap("ScheduleCron")
    public String scheduleCron;

    @NameInMap("ScheduleType")
    public Integer scheduleType;

    @NameInMap("ScheduleTypeName")
    public String scheduleTypeName;

    @NameInMap("SlaveFeatureNum")
    public Integer slaveFeatureNum;

    @NameInMap("TrainingModelId")
    public Long trainingModelId;

    @NameInMap("TrainingModelName")
    public String trainingModelName;

    @NameInMap("TrainingModelVersion")
    public String trainingModelVersionShrink;

    @NameInMap("TrainingModelVersionName")
    public String trainingModelVersionNameShrink;

    @NameInMap("TrainingSetProportion")
    public Integer trainingSetProportion;

    public static CreateTrustMlTrainingJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlTrainingJobShrinkRequest self = new CreateTrustMlTrainingJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlTrainingJobShrinkRequest setAlgId(Long algId) {
        this.algId = algId;
        return this;
    }
    public Long getAlgId() {
        return this.algId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setAlgName(String algName) {
        this.algName = algName;
        return this;
    }
    public String getAlgName() {
        return this.algName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setAlgRound(Integer algRound) {
        this.algRound = algRound;
        return this;
    }
    public Integer getAlgRound() {
        return this.algRound;
    }

    public CreateTrustMlTrainingJobShrinkRequest setAlgTypeId(Long algTypeId) {
        this.algTypeId = algTypeId;
        return this;
    }
    public Long getAlgTypeId() {
        return this.algTypeId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setAlgTypeName(String algTypeName) {
        this.algTypeName = algTypeName;
        return this;
    }
    public String getAlgTypeName() {
        return this.algTypeName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setAlgVersion(String algVersion) {
        this.algVersion = algVersion;
        return this;
    }
    public String getAlgVersion() {
        return this.algVersion;
    }

    public CreateTrustMlTrainingJobShrinkRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public CreateTrustMlTrainingJobShrinkRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateTrustMlTrainingJobShrinkRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setDataProcessDtoList(java.util.List<CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList> dataProcessDtoList) {
        this.dataProcessDtoList = dataProcessDtoList;
        return this;
    }
    public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList> getDataProcessDtoList() {
        return this.dataProcessDtoList;
    }

    public CreateTrustMlTrainingJobShrinkRequest setDataProcessTypeOrderShrink(String dataProcessTypeOrderShrink) {
        this.dataProcessTypeOrderShrink = dataProcessTypeOrderShrink;
        return this;
    }
    public String getDataProcessTypeOrderShrink() {
        return this.dataProcessTypeOrderShrink;
    }

    public CreateTrustMlTrainingJobShrinkRequest setDataSetDtos(java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public CreateTrustMlTrainingJobShrinkRequest setDynamicParams(java.util.List<CreateTrustMlTrainingJobShrinkRequestDynamicParams> dynamicParams) {
        this.dynamicParams = dynamicParams;
        return this;
    }
    public java.util.List<CreateTrustMlTrainingJobShrinkRequestDynamicParams> getDynamicParams() {
        return this.dynamicParams;
    }

    public CreateTrustMlTrainingJobShrinkRequest setFeatureDistribution(Integer featureDistribution) {
        this.featureDistribution = featureDistribution;
        return this;
    }
    public Integer getFeatureDistribution() {
        return this.featureDistribution;
    }

    public CreateTrustMlTrainingJobShrinkRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public CreateTrustMlTrainingJobShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTrustMlTrainingJobShrinkRequest setHostFeatureNum(Integer hostFeatureNum) {
        this.hostFeatureNum = hostFeatureNum;
        return this;
    }
    public Integer getHostFeatureNum() {
        return this.hostFeatureNum;
    }

    public CreateTrustMlTrainingJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public CreateTrustMlTrainingJobShrinkRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public CreateTrustMlTrainingJobShrinkRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public CreateTrustMlTrainingJobShrinkRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setPartitionType(Integer partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public Integer getPartitionType() {
        return this.partitionType;
    }

    public CreateTrustMlTrainingJobShrinkRequest setPlanListShrink(String planListShrink) {
        this.planListShrink = planListShrink;
        return this;
    }
    public String getPlanListShrink() {
        return this.planListShrink;
    }

    public CreateTrustMlTrainingJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setProtocolTypeList(java.util.List<String> protocolTypeList) {
        this.protocolTypeList = protocolTypeList;
        return this;
    }
    public java.util.List<String> getProtocolTypeList() {
        return this.protocolTypeList;
    }

    public CreateTrustMlTrainingJobShrinkRequest setRandomSeed(Integer randomSeed) {
        this.randomSeed = randomSeed;
        return this;
    }
    public Integer getRandomSeed() {
        return this.randomSeed;
    }

    public CreateTrustMlTrainingJobShrinkRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public CreateTrustMlTrainingJobShrinkRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public CreateTrustMlTrainingJobShrinkRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setSlaveFeatureNum(Integer slaveFeatureNum) {
        this.slaveFeatureNum = slaveFeatureNum;
        return this;
    }
    public Integer getSlaveFeatureNum() {
        return this.slaveFeatureNum;
    }

    public CreateTrustMlTrainingJobShrinkRequest setTrainingModelId(Long trainingModelId) {
        this.trainingModelId = trainingModelId;
        return this;
    }
    public Long getTrainingModelId() {
        return this.trainingModelId;
    }

    public CreateTrustMlTrainingJobShrinkRequest setTrainingModelName(String trainingModelName) {
        this.trainingModelName = trainingModelName;
        return this;
    }
    public String getTrainingModelName() {
        return this.trainingModelName;
    }

    public CreateTrustMlTrainingJobShrinkRequest setTrainingModelVersionShrink(String trainingModelVersionShrink) {
        this.trainingModelVersionShrink = trainingModelVersionShrink;
        return this;
    }
    public String getTrainingModelVersionShrink() {
        return this.trainingModelVersionShrink;
    }

    public CreateTrustMlTrainingJobShrinkRequest setTrainingModelVersionNameShrink(String trainingModelVersionNameShrink) {
        this.trainingModelVersionNameShrink = trainingModelVersionNameShrink;
        return this;
    }
    public String getTrainingModelVersionNameShrink() {
        return this.trainingModelVersionNameShrink;
    }

    public CreateTrustMlTrainingJobShrinkRequest setTrainingSetProportion(Integer trainingSetProportion) {
        this.trainingSetProportion = trainingSetProportion;
        return this;
    }
    public Integer getTrainingSetProportion() {
        return this.trainingSetProportion;
    }

    public static class CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField self = new CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList extends TeaModel {
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
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList self = new CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setField(java.util.List<CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataProcessDtoListField> getField() {
            return this.field;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns self = new CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns extends TeaModel {
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

        public static CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns self = new CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns self = new CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustMlTrainingJobShrinkRequestDataSetDtos extends TeaModel {
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
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static CreateTrustMlTrainingJobShrinkRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDataSetDtos self = new CreateTrustMlTrainingJobShrinkRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setFlFeatureColumns(java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setInputColumns(java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setOutputColumns(java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobShrinkRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class CreateTrustMlTrainingJobShrinkRequestDynamicParams extends TeaModel {
        @NameInMap("Checker")
        public String checker;

        @NameInMap("DisplayMode")
        public String displayMode;

        @NameInMap("InputMode")
        public String inputMode;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamNameForDisplay")
        public String paramNameForDisplay;

        @NameInMap("ParamValue")
        public String paramValue;

        public static CreateTrustMlTrainingJobShrinkRequestDynamicParams build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobShrinkRequestDynamicParams self = new CreateTrustMlTrainingJobShrinkRequestDynamicParams();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobShrinkRequestDynamicParams setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public CreateTrustMlTrainingJobShrinkRequestDynamicParams setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public CreateTrustMlTrainingJobShrinkRequestDynamicParams setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public CreateTrustMlTrainingJobShrinkRequestDynamicParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public CreateTrustMlTrainingJobShrinkRequestDynamicParams setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

        public CreateTrustMlTrainingJobShrinkRequestDynamicParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

}
