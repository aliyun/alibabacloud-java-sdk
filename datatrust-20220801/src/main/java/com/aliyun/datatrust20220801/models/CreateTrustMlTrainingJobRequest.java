// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlTrainingJobRequest extends TeaModel {
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
    public java.util.List<CreateTrustMlTrainingJobRequestDataProcessDtoList> dataProcessDtoList;

    @NameInMap("DataProcessTypeOrder")
    public java.util.List<Integer> dataProcessTypeOrder;

    @NameInMap("DataSetDtos")
    public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtos> dataSetDtos;

    @NameInMap("DynamicParams")
    public java.util.List<CreateTrustMlTrainingJobRequestDynamicParams> dynamicParams;

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
    public java.util.List<String> planList;

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
    public java.util.List<String> trainingModelVersion;

    @NameInMap("TrainingModelVersionName")
    public java.util.List<String> trainingModelVersionName;

    @NameInMap("TrainingSetProportion")
    public Integer trainingSetProportion;

    public static CreateTrustMlTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlTrainingJobRequest self = new CreateTrustMlTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlTrainingJobRequest setAlgId(Long algId) {
        this.algId = algId;
        return this;
    }
    public Long getAlgId() {
        return this.algId;
    }

    public CreateTrustMlTrainingJobRequest setAlgName(String algName) {
        this.algName = algName;
        return this;
    }
    public String getAlgName() {
        return this.algName;
    }

    public CreateTrustMlTrainingJobRequest setAlgRound(Integer algRound) {
        this.algRound = algRound;
        return this;
    }
    public Integer getAlgRound() {
        return this.algRound;
    }

    public CreateTrustMlTrainingJobRequest setAlgTypeId(Long algTypeId) {
        this.algTypeId = algTypeId;
        return this;
    }
    public Long getAlgTypeId() {
        return this.algTypeId;
    }

    public CreateTrustMlTrainingJobRequest setAlgTypeName(String algTypeName) {
        this.algTypeName = algTypeName;
        return this;
    }
    public String getAlgTypeName() {
        return this.algTypeName;
    }

    public CreateTrustMlTrainingJobRequest setAlgVersion(String algVersion) {
        this.algVersion = algVersion;
        return this;
    }
    public String getAlgVersion() {
        return this.algVersion;
    }

    public CreateTrustMlTrainingJobRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public CreateTrustMlTrainingJobRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public CreateTrustMlTrainingJobRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateTrustMlTrainingJobRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTrustMlTrainingJobRequest setDataProcessDtoList(java.util.List<CreateTrustMlTrainingJobRequestDataProcessDtoList> dataProcessDtoList) {
        this.dataProcessDtoList = dataProcessDtoList;
        return this;
    }
    public java.util.List<CreateTrustMlTrainingJobRequestDataProcessDtoList> getDataProcessDtoList() {
        return this.dataProcessDtoList;
    }

    public CreateTrustMlTrainingJobRequest setDataProcessTypeOrder(java.util.List<Integer> dataProcessTypeOrder) {
        this.dataProcessTypeOrder = dataProcessTypeOrder;
        return this;
    }
    public java.util.List<Integer> getDataProcessTypeOrder() {
        return this.dataProcessTypeOrder;
    }

    public CreateTrustMlTrainingJobRequest setDataSetDtos(java.util.List<CreateTrustMlTrainingJobRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public CreateTrustMlTrainingJobRequest setDynamicParams(java.util.List<CreateTrustMlTrainingJobRequestDynamicParams> dynamicParams) {
        this.dynamicParams = dynamicParams;
        return this;
    }
    public java.util.List<CreateTrustMlTrainingJobRequestDynamicParams> getDynamicParams() {
        return this.dynamicParams;
    }

    public CreateTrustMlTrainingJobRequest setFeatureDistribution(Integer featureDistribution) {
        this.featureDistribution = featureDistribution;
        return this;
    }
    public Integer getFeatureDistribution() {
        return this.featureDistribution;
    }

    public CreateTrustMlTrainingJobRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public CreateTrustMlTrainingJobRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTrustMlTrainingJobRequest setHostFeatureNum(Integer hostFeatureNum) {
        this.hostFeatureNum = hostFeatureNum;
        return this;
    }
    public Integer getHostFeatureNum() {
        return this.hostFeatureNum;
    }

    public CreateTrustMlTrainingJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateTrustMlTrainingJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateTrustMlTrainingJobRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public CreateTrustMlTrainingJobRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public CreateTrustMlTrainingJobRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public CreateTrustMlTrainingJobRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public CreateTrustMlTrainingJobRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public CreateTrustMlTrainingJobRequest setPartitionType(Integer partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public Integer getPartitionType() {
        return this.partitionType;
    }

    public CreateTrustMlTrainingJobRequest setPlanList(java.util.List<String> planList) {
        this.planList = planList;
        return this;
    }
    public java.util.List<String> getPlanList() {
        return this.planList;
    }

    public CreateTrustMlTrainingJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTrustMlTrainingJobRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTrustMlTrainingJobRequest setProtocolTypeList(java.util.List<String> protocolTypeList) {
        this.protocolTypeList = protocolTypeList;
        return this;
    }
    public java.util.List<String> getProtocolTypeList() {
        return this.protocolTypeList;
    }

    public CreateTrustMlTrainingJobRequest setRandomSeed(Integer randomSeed) {
        this.randomSeed = randomSeed;
        return this;
    }
    public Integer getRandomSeed() {
        return this.randomSeed;
    }

    public CreateTrustMlTrainingJobRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public CreateTrustMlTrainingJobRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public CreateTrustMlTrainingJobRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public CreateTrustMlTrainingJobRequest setSlaveFeatureNum(Integer slaveFeatureNum) {
        this.slaveFeatureNum = slaveFeatureNum;
        return this;
    }
    public Integer getSlaveFeatureNum() {
        return this.slaveFeatureNum;
    }

    public CreateTrustMlTrainingJobRequest setTrainingModelId(Long trainingModelId) {
        this.trainingModelId = trainingModelId;
        return this;
    }
    public Long getTrainingModelId() {
        return this.trainingModelId;
    }

    public CreateTrustMlTrainingJobRequest setTrainingModelName(String trainingModelName) {
        this.trainingModelName = trainingModelName;
        return this;
    }
    public String getTrainingModelName() {
        return this.trainingModelName;
    }

    public CreateTrustMlTrainingJobRequest setTrainingModelVersion(java.util.List<String> trainingModelVersion) {
        this.trainingModelVersion = trainingModelVersion;
        return this;
    }
    public java.util.List<String> getTrainingModelVersion() {
        return this.trainingModelVersion;
    }

    public CreateTrustMlTrainingJobRequest setTrainingModelVersionName(java.util.List<String> trainingModelVersionName) {
        this.trainingModelVersionName = trainingModelVersionName;
        return this;
    }
    public java.util.List<String> getTrainingModelVersionName() {
        return this.trainingModelVersionName;
    }

    public CreateTrustMlTrainingJobRequest setTrainingSetProportion(Integer trainingSetProportion) {
        this.trainingSetProportion = trainingSetProportion;
        return this;
    }
    public Integer getTrainingSetProportion() {
        return this.trainingSetProportion;
    }

    public static class CreateTrustMlTrainingJobRequestDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlTrainingJobRequestDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDataProcessDtoListField self = new CreateTrustMlTrainingJobRequestDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlTrainingJobRequestDataProcessDtoList extends TeaModel {
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
        public java.util.List<CreateTrustMlTrainingJobRequestDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static CreateTrustMlTrainingJobRequestDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDataProcessDtoList self = new CreateTrustMlTrainingJobRequestDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setField(java.util.List<CreateTrustMlTrainingJobRequestDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobRequestDataProcessDtoListField> getField() {
            return this.field;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public CreateTrustMlTrainingJobRequestDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns self = new CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlTrainingJobRequestDataSetDtosInputColumns extends TeaModel {
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

        public static CreateTrustMlTrainingJobRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDataSetDtosInputColumns self = new CreateTrustMlTrainingJobRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns self = new CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustMlTrainingJobRequestDataSetDtos extends TeaModel {
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
        public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static CreateTrustMlTrainingJobRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDataSetDtos self = new CreateTrustMlTrainingJobRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setFlFeatureColumns(java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setInputColumns(java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setOutputColumns(java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<CreateTrustMlTrainingJobRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public CreateTrustMlTrainingJobRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class CreateTrustMlTrainingJobRequestDynamicParams extends TeaModel {
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

        public static CreateTrustMlTrainingJobRequestDynamicParams build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlTrainingJobRequestDynamicParams self = new CreateTrustMlTrainingJobRequestDynamicParams();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlTrainingJobRequestDynamicParams setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public CreateTrustMlTrainingJobRequestDynamicParams setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public CreateTrustMlTrainingJobRequestDynamicParams setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public CreateTrustMlTrainingJobRequestDynamicParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public CreateTrustMlTrainingJobRequestDynamicParams setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

        public CreateTrustMlTrainingJobRequestDynamicParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

}
