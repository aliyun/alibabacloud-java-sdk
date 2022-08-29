// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetMpcSqlJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetMpcSqlJobResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMpcSqlJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMpcSqlJobResponseBody self = new GetMpcSqlJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMpcSqlJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMpcSqlJobResponseBody setData(GetMpcSqlJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMpcSqlJobResponseBodyData getData() {
        return this.data;
    }

    public GetMpcSqlJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMpcSqlJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMpcSqlJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMpcSqlJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns self = new GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns extends TeaModel {
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

        public static GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns self = new GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns extends TeaModel {
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

        public static GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns self = new GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetMpcSqlJobResponseBodyDataDataSetDtos extends TeaModel {
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
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetMpcSqlJobResponseBodyDataDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetMpcSqlJobResponseBodyDataDataSetDtos self = new GetMpcSqlJobResponseBodyDataDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setFlFeatureColumns(java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setInputColumns(java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setOutputColumns(java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetMpcSqlJobResponseBodyDataDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class GetMpcSqlJobResponseBodyData extends TeaModel {
        @NameInMap("ApprovalId")
        public Long approvalId;

        @NameInMap("ApprovalStatus")
        public Integer approvalStatus;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DataSetDtos")
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtos> dataSetDtos;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Inputs")
        public java.util.List<String> inputs;

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

        @NameInMap("Outputs")
        public java.util.List<String> outputs;

        @NameInMap("PlanList")
        public java.util.List<String> planList;

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

        @NameInMap("Sql")
        public String sql;

        public static GetMpcSqlJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMpcSqlJobResponseBodyData self = new GetMpcSqlJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMpcSqlJobResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetMpcSqlJobResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetMpcSqlJobResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetMpcSqlJobResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetMpcSqlJobResponseBodyData setDataSetDtos(java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtos> dataSetDtos) {
            this.dataSetDtos = dataSetDtos;
            return this;
        }
        public java.util.List<GetMpcSqlJobResponseBodyDataDataSetDtos> getDataSetDtos() {
            return this.dataSetDtos;
        }

        public GetMpcSqlJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMpcSqlJobResponseBodyData setInputs(java.util.List<String> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<String> getInputs() {
            return this.inputs;
        }

        public GetMpcSqlJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetMpcSqlJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetMpcSqlJobResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetMpcSqlJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetMpcSqlJobResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public GetMpcSqlJobResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetMpcSqlJobResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetMpcSqlJobResponseBodyData setOutputs(java.util.List<String> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<String> getOutputs() {
            return this.outputs;
        }

        public GetMpcSqlJobResponseBodyData setPlanList(java.util.List<String> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<String> getPlanList() {
            return this.planList;
        }

        public GetMpcSqlJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMpcSqlJobResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetMpcSqlJobResponseBodyData setProtocolTypeList(java.util.List<String> protocolTypeList) {
            this.protocolTypeList = protocolTypeList;
            return this;
        }
        public java.util.List<String> getProtocolTypeList() {
            return this.protocolTypeList;
        }

        public GetMpcSqlJobResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public GetMpcSqlJobResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetMpcSqlJobResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public GetMpcSqlJobResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

}
