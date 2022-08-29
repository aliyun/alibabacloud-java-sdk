// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlTrainingJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTrustMlTrainingJobResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTrustMlTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlTrainingJobResponseBody self = new GetTrustMlTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustMlTrainingJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTrustMlTrainingJobResponseBody setData(GetTrustMlTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrustMlTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public GetTrustMlTrainingJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTrustMlTrainingJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrustMlTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrustMlTrainingJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField self = new GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList extends TeaModel {
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
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList self = new GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setField(java.util.List<GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataProcessDtoListField> getField() {
            return this.field;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns self = new GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns extends TeaModel {
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

        public static GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns self = new GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns extends TeaModel {
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

        public static GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns self = new GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyDataDataSetDtos extends TeaModel {
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
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetTrustMlTrainingJobResponseBodyDataDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDataSetDtos self = new GetTrustMlTrainingJobResponseBodyDataDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setFlFeatureColumns(java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setInputColumns(java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setOutputColumns(java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyDataDynamicParams extends TeaModel {
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

        public static GetTrustMlTrainingJobResponseBodyDataDynamicParams build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyDataDynamicParams self = new GetTrustMlTrainingJobResponseBodyDataDynamicParams();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyDataDynamicParams setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public GetTrustMlTrainingJobResponseBodyDataDynamicParams setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public GetTrustMlTrainingJobResponseBodyDataDynamicParams setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public GetTrustMlTrainingJobResponseBodyDataDynamicParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetTrustMlTrainingJobResponseBodyDataDynamicParams setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

        public GetTrustMlTrainingJobResponseBodyDataDynamicParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class GetTrustMlTrainingJobResponseBodyData extends TeaModel {
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
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList> dataProcessDtoList;

        @NameInMap("DataProcessTypeOrder")
        public java.util.List<Integer> dataProcessTypeOrder;

        @NameInMap("DataSetDtos")
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtos> dataSetDtos;

        @NameInMap("DynamicParams")
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDynamicParams> dynamicParams;

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

        public static GetTrustMlTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlTrainingJobResponseBodyData self = new GetTrustMlTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrustMlTrainingJobResponseBodyData setAlgId(Long algId) {
            this.algId = algId;
            return this;
        }
        public Long getAlgId() {
            return this.algId;
        }

        public GetTrustMlTrainingJobResponseBodyData setAlgName(String algName) {
            this.algName = algName;
            return this;
        }
        public String getAlgName() {
            return this.algName;
        }

        public GetTrustMlTrainingJobResponseBodyData setAlgRound(Integer algRound) {
            this.algRound = algRound;
            return this;
        }
        public Integer getAlgRound() {
            return this.algRound;
        }

        public GetTrustMlTrainingJobResponseBodyData setAlgTypeId(Long algTypeId) {
            this.algTypeId = algTypeId;
            return this;
        }
        public Long getAlgTypeId() {
            return this.algTypeId;
        }

        public GetTrustMlTrainingJobResponseBodyData setAlgTypeName(String algTypeName) {
            this.algTypeName = algTypeName;
            return this;
        }
        public String getAlgTypeName() {
            return this.algTypeName;
        }

        public GetTrustMlTrainingJobResponseBodyData setAlgVersion(String algVersion) {
            this.algVersion = algVersion;
            return this;
        }
        public String getAlgVersion() {
            return this.algVersion;
        }

        public GetTrustMlTrainingJobResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetTrustMlTrainingJobResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetTrustMlTrainingJobResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetTrustMlTrainingJobResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetTrustMlTrainingJobResponseBodyData setDataProcessDtoList(java.util.List<GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList> dataProcessDtoList) {
            this.dataProcessDtoList = dataProcessDtoList;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataProcessDtoList> getDataProcessDtoList() {
            return this.dataProcessDtoList;
        }

        public GetTrustMlTrainingJobResponseBodyData setDataProcessTypeOrder(java.util.List<Integer> dataProcessTypeOrder) {
            this.dataProcessTypeOrder = dataProcessTypeOrder;
            return this;
        }
        public java.util.List<Integer> getDataProcessTypeOrder() {
            return this.dataProcessTypeOrder;
        }

        public GetTrustMlTrainingJobResponseBodyData setDataSetDtos(java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtos> dataSetDtos) {
            this.dataSetDtos = dataSetDtos;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDataSetDtos> getDataSetDtos() {
            return this.dataSetDtos;
        }

        public GetTrustMlTrainingJobResponseBodyData setDynamicParams(java.util.List<GetTrustMlTrainingJobResponseBodyDataDynamicParams> dynamicParams) {
            this.dynamicParams = dynamicParams;
            return this;
        }
        public java.util.List<GetTrustMlTrainingJobResponseBodyDataDynamicParams> getDynamicParams() {
            return this.dynamicParams;
        }

        public GetTrustMlTrainingJobResponseBodyData setFeatureDistribution(Integer featureDistribution) {
            this.featureDistribution = featureDistribution;
            return this;
        }
        public Integer getFeatureDistribution() {
            return this.featureDistribution;
        }

        public GetTrustMlTrainingJobResponseBodyData setFeatureFormat(Integer featureFormat) {
            this.featureFormat = featureFormat;
            return this;
        }
        public Integer getFeatureFormat() {
            return this.featureFormat;
        }

        public GetTrustMlTrainingJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrustMlTrainingJobResponseBodyData setHostFeatureNum(Integer hostFeatureNum) {
            this.hostFeatureNum = hostFeatureNum;
            return this;
        }
        public Integer getHostFeatureNum() {
            return this.hostFeatureNum;
        }

        public GetTrustMlTrainingJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetTrustMlTrainingJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetTrustMlTrainingJobResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetTrustMlTrainingJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetTrustMlTrainingJobResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public GetTrustMlTrainingJobResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetTrustMlTrainingJobResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetTrustMlTrainingJobResponseBodyData setPartitionType(Integer partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public Integer getPartitionType() {
            return this.partitionType;
        }

        public GetTrustMlTrainingJobResponseBodyData setPlanList(java.util.List<String> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<String> getPlanList() {
            return this.planList;
        }

        public GetTrustMlTrainingJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTrustMlTrainingJobResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTrustMlTrainingJobResponseBodyData setProtocolTypeList(java.util.List<String> protocolTypeList) {
            this.protocolTypeList = protocolTypeList;
            return this;
        }
        public java.util.List<String> getProtocolTypeList() {
            return this.protocolTypeList;
        }

        public GetTrustMlTrainingJobResponseBodyData setRandomSeed(Integer randomSeed) {
            this.randomSeed = randomSeed;
            return this;
        }
        public Integer getRandomSeed() {
            return this.randomSeed;
        }

        public GetTrustMlTrainingJobResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public GetTrustMlTrainingJobResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetTrustMlTrainingJobResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public GetTrustMlTrainingJobResponseBodyData setSlaveFeatureNum(Integer slaveFeatureNum) {
            this.slaveFeatureNum = slaveFeatureNum;
            return this;
        }
        public Integer getSlaveFeatureNum() {
            return this.slaveFeatureNum;
        }

        public GetTrustMlTrainingJobResponseBodyData setTrainingModelId(Long trainingModelId) {
            this.trainingModelId = trainingModelId;
            return this;
        }
        public Long getTrainingModelId() {
            return this.trainingModelId;
        }

        public GetTrustMlTrainingJobResponseBodyData setTrainingModelName(String trainingModelName) {
            this.trainingModelName = trainingModelName;
            return this;
        }
        public String getTrainingModelName() {
            return this.trainingModelName;
        }

        public GetTrustMlTrainingJobResponseBodyData setTrainingModelVersion(java.util.List<String> trainingModelVersion) {
            this.trainingModelVersion = trainingModelVersion;
            return this;
        }
        public java.util.List<String> getTrainingModelVersion() {
            return this.trainingModelVersion;
        }

        public GetTrustMlTrainingJobResponseBodyData setTrainingModelVersionName(java.util.List<String> trainingModelVersionName) {
            this.trainingModelVersionName = trainingModelVersionName;
            return this;
        }
        public java.util.List<String> getTrainingModelVersionName() {
            return this.trainingModelVersionName;
        }

        public GetTrustMlTrainingJobResponseBodyData setTrainingSetProportion(Integer trainingSetProportion) {
            this.trainingSetProportion = trainingSetProportion;
            return this;
        }
        public Integer getTrainingSetProportion() {
            return this.trainingSetProportion;
        }

    }

}
