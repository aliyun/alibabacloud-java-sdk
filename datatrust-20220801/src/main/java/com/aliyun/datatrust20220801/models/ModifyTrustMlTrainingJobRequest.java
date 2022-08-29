// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustMlTrainingJobRequest extends TeaModel {
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
    public java.util.List<ModifyTrustMlTrainingJobRequestDataProcessDtoList> dataProcessDtoList;

    @NameInMap("DataProcessTypeOrder")
    public java.util.List<Integer> dataProcessTypeOrder;

    @NameInMap("DataSetDtos")
    public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtos> dataSetDtos;

    @NameInMap("DynamicParams")
    public java.util.List<ModifyTrustMlTrainingJobRequestDynamicParams> dynamicParams;

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

    public static ModifyTrustMlTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustMlTrainingJobRequest self = new ModifyTrustMlTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrustMlTrainingJobRequest setAlgId(Long algId) {
        this.algId = algId;
        return this;
    }
    public Long getAlgId() {
        return this.algId;
    }

    public ModifyTrustMlTrainingJobRequest setAlgName(String algName) {
        this.algName = algName;
        return this;
    }
    public String getAlgName() {
        return this.algName;
    }

    public ModifyTrustMlTrainingJobRequest setAlgRound(Integer algRound) {
        this.algRound = algRound;
        return this;
    }
    public Integer getAlgRound() {
        return this.algRound;
    }

    public ModifyTrustMlTrainingJobRequest setAlgTypeId(Long algTypeId) {
        this.algTypeId = algTypeId;
        return this;
    }
    public Long getAlgTypeId() {
        return this.algTypeId;
    }

    public ModifyTrustMlTrainingJobRequest setAlgTypeName(String algTypeName) {
        this.algTypeName = algTypeName;
        return this;
    }
    public String getAlgTypeName() {
        return this.algTypeName;
    }

    public ModifyTrustMlTrainingJobRequest setAlgVersion(String algVersion) {
        this.algVersion = algVersion;
        return this;
    }
    public String getAlgVersion() {
        return this.algVersion;
    }

    public ModifyTrustMlTrainingJobRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public ModifyTrustMlTrainingJobRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public ModifyTrustMlTrainingJobRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ModifyTrustMlTrainingJobRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public ModifyTrustMlTrainingJobRequest setDataProcessDtoList(java.util.List<ModifyTrustMlTrainingJobRequestDataProcessDtoList> dataProcessDtoList) {
        this.dataProcessDtoList = dataProcessDtoList;
        return this;
    }
    public java.util.List<ModifyTrustMlTrainingJobRequestDataProcessDtoList> getDataProcessDtoList() {
        return this.dataProcessDtoList;
    }

    public ModifyTrustMlTrainingJobRequest setDataProcessTypeOrder(java.util.List<Integer> dataProcessTypeOrder) {
        this.dataProcessTypeOrder = dataProcessTypeOrder;
        return this;
    }
    public java.util.List<Integer> getDataProcessTypeOrder() {
        return this.dataProcessTypeOrder;
    }

    public ModifyTrustMlTrainingJobRequest setDataSetDtos(java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public ModifyTrustMlTrainingJobRequest setDynamicParams(java.util.List<ModifyTrustMlTrainingJobRequestDynamicParams> dynamicParams) {
        this.dynamicParams = dynamicParams;
        return this;
    }
    public java.util.List<ModifyTrustMlTrainingJobRequestDynamicParams> getDynamicParams() {
        return this.dynamicParams;
    }

    public ModifyTrustMlTrainingJobRequest setFeatureDistribution(Integer featureDistribution) {
        this.featureDistribution = featureDistribution;
        return this;
    }
    public Integer getFeatureDistribution() {
        return this.featureDistribution;
    }

    public ModifyTrustMlTrainingJobRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public ModifyTrustMlTrainingJobRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModifyTrustMlTrainingJobRequest setHostFeatureNum(Integer hostFeatureNum) {
        this.hostFeatureNum = hostFeatureNum;
        return this;
    }
    public Integer getHostFeatureNum() {
        return this.hostFeatureNum;
    }

    public ModifyTrustMlTrainingJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyTrustMlTrainingJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ModifyTrustMlTrainingJobRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ModifyTrustMlTrainingJobRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public ModifyTrustMlTrainingJobRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public ModifyTrustMlTrainingJobRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ModifyTrustMlTrainingJobRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public ModifyTrustMlTrainingJobRequest setPartitionType(Integer partitionType) {
        this.partitionType = partitionType;
        return this;
    }
    public Integer getPartitionType() {
        return this.partitionType;
    }

    public ModifyTrustMlTrainingJobRequest setPlanList(java.util.List<String> planList) {
        this.planList = planList;
        return this;
    }
    public java.util.List<String> getPlanList() {
        return this.planList;
    }

    public ModifyTrustMlTrainingJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyTrustMlTrainingJobRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyTrustMlTrainingJobRequest setProtocolTypeList(java.util.List<String> protocolTypeList) {
        this.protocolTypeList = protocolTypeList;
        return this;
    }
    public java.util.List<String> getProtocolTypeList() {
        return this.protocolTypeList;
    }

    public ModifyTrustMlTrainingJobRequest setRandomSeed(Integer randomSeed) {
        this.randomSeed = randomSeed;
        return this;
    }
    public Integer getRandomSeed() {
        return this.randomSeed;
    }

    public ModifyTrustMlTrainingJobRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public ModifyTrustMlTrainingJobRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public ModifyTrustMlTrainingJobRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public ModifyTrustMlTrainingJobRequest setSlaveFeatureNum(Integer slaveFeatureNum) {
        this.slaveFeatureNum = slaveFeatureNum;
        return this;
    }
    public Integer getSlaveFeatureNum() {
        return this.slaveFeatureNum;
    }

    public ModifyTrustMlTrainingJobRequest setTrainingModelId(Long trainingModelId) {
        this.trainingModelId = trainingModelId;
        return this;
    }
    public Long getTrainingModelId() {
        return this.trainingModelId;
    }

    public ModifyTrustMlTrainingJobRequest setTrainingModelName(String trainingModelName) {
        this.trainingModelName = trainingModelName;
        return this;
    }
    public String getTrainingModelName() {
        return this.trainingModelName;
    }

    public ModifyTrustMlTrainingJobRequest setTrainingModelVersion(java.util.List<String> trainingModelVersion) {
        this.trainingModelVersion = trainingModelVersion;
        return this;
    }
    public java.util.List<String> getTrainingModelVersion() {
        return this.trainingModelVersion;
    }

    public ModifyTrustMlTrainingJobRequest setTrainingModelVersionName(java.util.List<String> trainingModelVersionName) {
        this.trainingModelVersionName = trainingModelVersionName;
        return this;
    }
    public java.util.List<String> getTrainingModelVersionName() {
        return this.trainingModelVersionName;
    }

    public ModifyTrustMlTrainingJobRequest setTrainingSetProportion(Integer trainingSetProportion) {
        this.trainingSetProportion = trainingSetProportion;
        return this;
    }
    public Integer getTrainingSetProportion() {
        return this.trainingSetProportion;
    }

    public static class ModifyTrustMlTrainingJobRequestDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyTrustMlTrainingJobRequestDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDataProcessDtoListField self = new ModifyTrustMlTrainingJobRequestDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyTrustMlTrainingJobRequestDataProcessDtoList extends TeaModel {
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
        public java.util.List<ModifyTrustMlTrainingJobRequestDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static ModifyTrustMlTrainingJobRequestDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDataProcessDtoList self = new ModifyTrustMlTrainingJobRequestDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setField(java.util.List<ModifyTrustMlTrainingJobRequestDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<ModifyTrustMlTrainingJobRequestDataProcessDtoListField> getField() {
            return this.field;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public ModifyTrustMlTrainingJobRequestDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns self = new ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns extends TeaModel {
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

        public static ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns self = new ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns self = new ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustMlTrainingJobRequestDataSetDtos extends TeaModel {
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
        public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static ModifyTrustMlTrainingJobRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDataSetDtos self = new ModifyTrustMlTrainingJobRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setFlFeatureColumns(java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setInputColumns(java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setOutputColumns(java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<ModifyTrustMlTrainingJobRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public ModifyTrustMlTrainingJobRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class ModifyTrustMlTrainingJobRequestDynamicParams extends TeaModel {
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

        public static ModifyTrustMlTrainingJobRequestDynamicParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustMlTrainingJobRequestDynamicParams self = new ModifyTrustMlTrainingJobRequestDynamicParams();
            return TeaModel.build(map, self);
        }

        public ModifyTrustMlTrainingJobRequestDynamicParams setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public ModifyTrustMlTrainingJobRequestDynamicParams setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public ModifyTrustMlTrainingJobRequestDynamicParams setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public ModifyTrustMlTrainingJobRequestDynamicParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public ModifyTrustMlTrainingJobRequestDynamicParams setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

        public ModifyTrustMlTrainingJobRequestDynamicParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

}
