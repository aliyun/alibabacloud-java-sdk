// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetHistoryFlTrainingJobInstanceByJobIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHistoryFlTrainingJobInstanceByJobIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryFlTrainingJobInstanceByJobIdResponseBody self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody setData(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData> getData() {
        return this.data;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList extends TeaModel {
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
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setField(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoListField> getField() {
            return this.field;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns extends TeaModel {
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

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns extends TeaModel {
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

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos extends TeaModel {
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
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setFlFeatureColumns(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setInputColumns(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setOutputColumns(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams extends TeaModel {
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

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData extends TeaModel {
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
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList> dataProcessDtoList;

        @NameInMap("DataProcessTypeOrder")
        public java.util.List<Integer> dataProcessTypeOrder;

        @NameInMap("DataSetDtos")
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos> dataSetDtos;

        @NameInMap("DynamicParams")
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams> dynamicParams;

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

        public static GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData self = new GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setAlgId(Long algId) {
            this.algId = algId;
            return this;
        }
        public Long getAlgId() {
            return this.algId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setAlgName(String algName) {
            this.algName = algName;
            return this;
        }
        public String getAlgName() {
            return this.algName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setAlgRound(Integer algRound) {
            this.algRound = algRound;
            return this;
        }
        public Integer getAlgRound() {
            return this.algRound;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setAlgTypeId(Long algTypeId) {
            this.algTypeId = algTypeId;
            return this;
        }
        public Long getAlgTypeId() {
            return this.algTypeId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setAlgTypeName(String algTypeName) {
            this.algTypeName = algTypeName;
            return this;
        }
        public String getAlgTypeName() {
            return this.algTypeName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setAlgVersion(String algVersion) {
            this.algVersion = algVersion;
            return this;
        }
        public String getAlgVersion() {
            return this.algVersion;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setDataProcessDtoList(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList> dataProcessDtoList) {
            this.dataProcessDtoList = dataProcessDtoList;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataProcessDtoList> getDataProcessDtoList() {
            return this.dataProcessDtoList;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setDataProcessTypeOrder(java.util.List<Integer> dataProcessTypeOrder) {
            this.dataProcessTypeOrder = dataProcessTypeOrder;
            return this;
        }
        public java.util.List<Integer> getDataProcessTypeOrder() {
            return this.dataProcessTypeOrder;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setDataSetDtos(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos> dataSetDtos) {
            this.dataSetDtos = dataSetDtos;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDataSetDtos> getDataSetDtos() {
            return this.dataSetDtos;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setDynamicParams(java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams> dynamicParams) {
            this.dynamicParams = dynamicParams;
            return this;
        }
        public java.util.List<GetHistoryFlTrainingJobInstanceByJobIdResponseBodyDataDynamicParams> getDynamicParams() {
            return this.dynamicParams;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setFeatureDistribution(Integer featureDistribution) {
            this.featureDistribution = featureDistribution;
            return this;
        }
        public Integer getFeatureDistribution() {
            return this.featureDistribution;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setFeatureFormat(Integer featureFormat) {
            this.featureFormat = featureFormat;
            return this;
        }
        public Integer getFeatureFormat() {
            return this.featureFormat;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setHostFeatureNum(Integer hostFeatureNum) {
            this.hostFeatureNum = hostFeatureNum;
            return this;
        }
        public Integer getHostFeatureNum() {
            return this.hostFeatureNum;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setPartitionType(Integer partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public Integer getPartitionType() {
            return this.partitionType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setPlanList(java.util.List<String> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<String> getPlanList() {
            return this.planList;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setProtocolTypeList(java.util.List<String> protocolTypeList) {
            this.protocolTypeList = protocolTypeList;
            return this;
        }
        public java.util.List<String> getProtocolTypeList() {
            return this.protocolTypeList;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setRandomSeed(Integer randomSeed) {
            this.randomSeed = randomSeed;
            return this;
        }
        public Integer getRandomSeed() {
            return this.randomSeed;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setSlaveFeatureNum(Integer slaveFeatureNum) {
            this.slaveFeatureNum = slaveFeatureNum;
            return this;
        }
        public Integer getSlaveFeatureNum() {
            return this.slaveFeatureNum;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setTrainingModelId(Long trainingModelId) {
            this.trainingModelId = trainingModelId;
            return this;
        }
        public Long getTrainingModelId() {
            return this.trainingModelId;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setTrainingModelName(String trainingModelName) {
            this.trainingModelName = trainingModelName;
            return this;
        }
        public String getTrainingModelName() {
            return this.trainingModelName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setTrainingModelVersion(java.util.List<String> trainingModelVersion) {
            this.trainingModelVersion = trainingModelVersion;
            return this;
        }
        public java.util.List<String> getTrainingModelVersion() {
            return this.trainingModelVersion;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setTrainingModelVersionName(java.util.List<String> trainingModelVersionName) {
            this.trainingModelVersionName = trainingModelVersionName;
            return this;
        }
        public java.util.List<String> getTrainingModelVersionName() {
            return this.trainingModelVersionName;
        }

        public GetHistoryFlTrainingJobInstanceByJobIdResponseBodyData setTrainingSetProportion(Integer trainingSetProportion) {
            this.trainingSetProportion = trainingSetProportion;
            return this;
        }
        public Integer getTrainingSetProportion() {
            return this.trainingSetProportion;
        }

    }

}
