// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaPsiJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTrustDaPsiJobResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTrustDaPsiJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaPsiJobResponseBody self = new GetTrustDaPsiJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustDaPsiJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTrustDaPsiJobResponseBody setData(GetTrustDaPsiJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrustDaPsiJobResponseBodyData getData() {
        return this.data;
    }

    public GetTrustDaPsiJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTrustDaPsiJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrustDaPsiJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrustDaPsiJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns self = new GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns extends TeaModel {
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

        public static GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns self = new GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns extends TeaModel {
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

        public static GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns self = new GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustDaPsiJobResponseBodyDataDataSetDtos extends TeaModel {
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
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetTrustDaPsiJobResponseBodyDataDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiJobResponseBodyDataDataSetDtos self = new GetTrustDaPsiJobResponseBodyDataDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setFlFeatureColumns(java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setInputColumns(java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setOutputColumns(java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetTrustDaPsiJobResponseBodyDataDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig extends TeaModel {
        @NameInMap("CacheUsage")
        public Long cacheUsage;

        @NameInMap("IsUsePsiPreCache")
        public Boolean isUsePsiPreCache;

        @NameInMap("LocalBasePath")
        public String localBasePath;

        @NameInMap("PsiPreCacheColumn")
        public java.util.List<String> psiPreCacheColumn;

        @NameInMap("PsiPreCacheDataName")
        public String psiPreCacheDataName;

        @NameInMap("PsiPreCacheJobId")
        public Long psiPreCacheJobId;

        @NameInMap("PsiPreCacheJobName")
        public String psiPreCacheJobName;

        public static GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig self = new GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setCacheUsage(Long cacheUsage) {
            this.cacheUsage = cacheUsage;
            return this;
        }
        public Long getCacheUsage() {
            return this.cacheUsage;
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setIsUsePsiPreCache(Boolean isUsePsiPreCache) {
            this.isUsePsiPreCache = isUsePsiPreCache;
            return this;
        }
        public Boolean getIsUsePsiPreCache() {
            return this.isUsePsiPreCache;
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setLocalBasePath(String localBasePath) {
            this.localBasePath = localBasePath;
            return this;
        }
        public String getLocalBasePath() {
            return this.localBasePath;
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheColumn(java.util.List<String> psiPreCacheColumn) {
            this.psiPreCacheColumn = psiPreCacheColumn;
            return this;
        }
        public java.util.List<String> getPsiPreCacheColumn() {
            return this.psiPreCacheColumn;
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheDataName(String psiPreCacheDataName) {
            this.psiPreCacheDataName = psiPreCacheDataName;
            return this;
        }
        public String getPsiPreCacheDataName() {
            return this.psiPreCacheDataName;
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheJobId(Long psiPreCacheJobId) {
            this.psiPreCacheJobId = psiPreCacheJobId;
            return this;
        }
        public Long getPsiPreCacheJobId() {
            return this.psiPreCacheJobId;
        }

        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheJobName(String psiPreCacheJobName) {
            this.psiPreCacheJobName = psiPreCacheJobName;
            return this;
        }
        public String getPsiPreCacheJobName() {
            return this.psiPreCacheJobName;
        }

    }

    public static class GetTrustDaPsiJobResponseBodyData extends TeaModel {
        @NameInMap("ApprovalId")
        public Long approvalId;

        @NameInMap("ApprovalStatus")
        public Integer approvalStatus;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DataSetDtos")
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtos> dataSetDtos;

        @NameInMap("GmtCreate")
        public String gmtCreate;

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

        @NameInMap("PlanList")
        public java.util.List<String> planList;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProtocolTypeList")
        public java.util.List<String> protocolTypeList;

        @NameInMap("PsiPreCacheConfig")
        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig psiPreCacheConfig;

        @NameInMap("ScheduleCron")
        public String scheduleCron;

        @NameInMap("ScheduleType")
        public Integer scheduleType;

        @NameInMap("ScheduleTypeName")
        public String scheduleTypeName;

        @NameInMap("Sql")
        public String sql;

        public static GetTrustDaPsiJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiJobResponseBodyData self = new GetTrustDaPsiJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiJobResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetTrustDaPsiJobResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetTrustDaPsiJobResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetTrustDaPsiJobResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetTrustDaPsiJobResponseBodyData setDataSetDtos(java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtos> dataSetDtos) {
            this.dataSetDtos = dataSetDtos;
            return this;
        }
        public java.util.List<GetTrustDaPsiJobResponseBodyDataDataSetDtos> getDataSetDtos() {
            return this.dataSetDtos;
        }

        public GetTrustDaPsiJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrustDaPsiJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetTrustDaPsiJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetTrustDaPsiJobResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetTrustDaPsiJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetTrustDaPsiJobResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public GetTrustDaPsiJobResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetTrustDaPsiJobResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetTrustDaPsiJobResponseBodyData setPlanList(java.util.List<String> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<String> getPlanList() {
            return this.planList;
        }

        public GetTrustDaPsiJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTrustDaPsiJobResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTrustDaPsiJobResponseBodyData setProtocolTypeList(java.util.List<String> protocolTypeList) {
            this.protocolTypeList = protocolTypeList;
            return this;
        }
        public java.util.List<String> getProtocolTypeList() {
            return this.protocolTypeList;
        }

        public GetTrustDaPsiJobResponseBodyData setPsiPreCacheConfig(GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig psiPreCacheConfig) {
            this.psiPreCacheConfig = psiPreCacheConfig;
            return this;
        }
        public GetTrustDaPsiJobResponseBodyDataPsiPreCacheConfig getPsiPreCacheConfig() {
            return this.psiPreCacheConfig;
        }

        public GetTrustDaPsiJobResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public GetTrustDaPsiJobResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetTrustDaPsiJobResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

        public GetTrustDaPsiJobResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

}
