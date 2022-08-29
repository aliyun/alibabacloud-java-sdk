// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlPredictionJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTrustMlPredictionJobResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTrustMlPredictionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlPredictionJobResponseBody self = new GetTrustMlPredictionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustMlPredictionJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTrustMlPredictionJobResponseBody setData(GetTrustMlPredictionJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrustMlPredictionJobResponseBodyData getData() {
        return this.data;
    }

    public GetTrustMlPredictionJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTrustMlPredictionJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrustMlPredictionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrustMlPredictionJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField self = new GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList extends TeaModel {
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
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList self = new GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setField(java.util.List<GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataProcessDtoListField> getField() {
            return this.field;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

    public static class GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns self = new GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns extends TeaModel {
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

        public static GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns self = new GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns extends TeaModel {
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

        public static GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns self = new GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustMlPredictionJobResponseBodyDataDataSetDtos extends TeaModel {
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
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetTrustMlPredictionJobResponseBodyDataDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyDataDataSetDtos self = new GetTrustMlPredictionJobResponseBodyDataDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setFlFeatureColumns(java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setInputColumns(java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setOutputColumns(java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetTrustMlPredictionJobResponseBodyDataDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class GetTrustMlPredictionJobResponseBodyData extends TeaModel {
        @NameInMap("ApprovalId")
        public Long approvalId;

        @NameInMap("ApprovalStatus")
        public Integer approvalStatus;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DataProcessDtoList")
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList> dataProcessDtoList;

        @NameInMap("DataProcessTypeOrder")
        public java.util.List<Integer> dataProcessTypeOrder;

        @NameInMap("DataSetDtos")
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtos> dataSetDtos;

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
        public java.util.List<String> planList;

        @NameInMap("PredictionResultTo")
        public Integer predictionResultTo;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProtocolTypeList")
        public java.util.List<String> protocolTypeList;

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

        public static GetTrustMlPredictionJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionJobResponseBodyData self = new GetTrustMlPredictionJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionJobResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetTrustMlPredictionJobResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetTrustMlPredictionJobResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetTrustMlPredictionJobResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetTrustMlPredictionJobResponseBodyData setDataProcessDtoList(java.util.List<GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList> dataProcessDtoList) {
            this.dataProcessDtoList = dataProcessDtoList;
            return this;
        }
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataProcessDtoList> getDataProcessDtoList() {
            return this.dataProcessDtoList;
        }

        public GetTrustMlPredictionJobResponseBodyData setDataProcessTypeOrder(java.util.List<Integer> dataProcessTypeOrder) {
            this.dataProcessTypeOrder = dataProcessTypeOrder;
            return this;
        }
        public java.util.List<Integer> getDataProcessTypeOrder() {
            return this.dataProcessTypeOrder;
        }

        public GetTrustMlPredictionJobResponseBodyData setDataSetDtos(java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtos> dataSetDtos) {
            this.dataSetDtos = dataSetDtos;
            return this;
        }
        public java.util.List<GetTrustMlPredictionJobResponseBodyDataDataSetDtos> getDataSetDtos() {
            return this.dataSetDtos;
        }

        public GetTrustMlPredictionJobResponseBodyData setFeatureDistribution(Integer featureDistribution) {
            this.featureDistribution = featureDistribution;
            return this;
        }
        public Integer getFeatureDistribution() {
            return this.featureDistribution;
        }

        public GetTrustMlPredictionJobResponseBodyData setFeatureFormat(Integer featureFormat) {
            this.featureFormat = featureFormat;
            return this;
        }
        public Integer getFeatureFormat() {
            return this.featureFormat;
        }

        public GetTrustMlPredictionJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrustMlPredictionJobResponseBodyData setHostFeatureNum(Integer hostFeatureNum) {
            this.hostFeatureNum = hostFeatureNum;
            return this;
        }
        public Integer getHostFeatureNum() {
            return this.hostFeatureNum;
        }

        public GetTrustMlPredictionJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetTrustMlPredictionJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetTrustMlPredictionJobResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetTrustMlPredictionJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetTrustMlPredictionJobResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public GetTrustMlPredictionJobResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetTrustMlPredictionJobResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetTrustMlPredictionJobResponseBodyData setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetTrustMlPredictionJobResponseBodyData setOutputId(Long outputId) {
            this.outputId = outputId;
            return this;
        }
        public Long getOutputId() {
            return this.outputId;
        }

        public GetTrustMlPredictionJobResponseBodyData setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetTrustMlPredictionJobResponseBodyData setPartitionType(Integer partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public Integer getPartitionType() {
            return this.partitionType;
        }

        public GetTrustMlPredictionJobResponseBodyData setPlanList(java.util.List<String> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<String> getPlanList() {
            return this.planList;
        }

        public GetTrustMlPredictionJobResponseBodyData setPredictionResultTo(Integer predictionResultTo) {
            this.predictionResultTo = predictionResultTo;
            return this;
        }
        public Integer getPredictionResultTo() {
            return this.predictionResultTo;
        }

        public GetTrustMlPredictionJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTrustMlPredictionJobResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTrustMlPredictionJobResponseBodyData setProtocolTypeList(java.util.List<String> protocolTypeList) {
            this.protocolTypeList = protocolTypeList;
            return this;
        }
        public java.util.List<String> getProtocolTypeList() {
            return this.protocolTypeList;
        }

        public GetTrustMlPredictionJobResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public GetTrustMlPredictionJobResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetTrustMlPredictionJobResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public GetTrustMlPredictionJobResponseBodyData setServiceApiId(String serviceApiId) {
            this.serviceApiId = serviceApiId;
            return this;
        }
        public String getServiceApiId() {
            return this.serviceApiId;
        }

        public GetTrustMlPredictionJobResponseBodyData setSlaveFeatureNum(Integer slaveFeatureNum) {
            this.slaveFeatureNum = slaveFeatureNum;
            return this;
        }
        public Integer getSlaveFeatureNum() {
            return this.slaveFeatureNum;
        }

        public GetTrustMlPredictionJobResponseBodyData setTrainingJobId(Long trainingJobId) {
            this.trainingJobId = trainingJobId;
            return this;
        }
        public Long getTrainingJobId() {
            return this.trainingJobId;
        }

        public GetTrustMlPredictionJobResponseBodyData setTrainingJobName(String trainingJobName) {
            this.trainingJobName = trainingJobName;
            return this;
        }
        public String getTrainingJobName() {
            return this.trainingJobName;
        }

        public GetTrustMlPredictionJobResponseBodyData setTrainingModelId(Long trainingModelId) {
            this.trainingModelId = trainingModelId;
            return this;
        }
        public Long getTrainingModelId() {
            return this.trainingModelId;
        }

        public GetTrustMlPredictionJobResponseBodyData setTrainingModelName(String trainingModelName) {
            this.trainingModelName = trainingModelName;
            return this;
        }
        public String getTrainingModelName() {
            return this.trainingModelName;
        }

        public GetTrustMlPredictionJobResponseBodyData setTrainingModelVersion(String trainingModelVersion) {
            this.trainingModelVersion = trainingModelVersion;
            return this;
        }
        public String getTrainingModelVersion() {
            return this.trainingModelVersion;
        }

        public GetTrustMlPredictionJobResponseBodyData setTrainingModelVersionName(String trainingModelVersionName) {
            this.trainingModelVersionName = trainingModelVersionName;
            return this;
        }
        public String getTrainingModelVersionName() {
            return this.trainingModelVersionName;
        }

    }

}
