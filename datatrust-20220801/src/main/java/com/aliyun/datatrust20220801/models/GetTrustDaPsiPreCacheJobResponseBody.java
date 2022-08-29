// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaPsiPreCacheJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTrustDaPsiPreCacheJobResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTrustDaPsiPreCacheJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaPsiPreCacheJobResponseBody self = new GetTrustDaPsiPreCacheJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustDaPsiPreCacheJobResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTrustDaPsiPreCacheJobResponseBody setData(GetTrustDaPsiPreCacheJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrustDaPsiPreCacheJobResponseBodyData getData() {
        return this.data;
    }

    public GetTrustDaPsiPreCacheJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTrustDaPsiPreCacheJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrustDaPsiPreCacheJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrustDaPsiPreCacheJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns self = new GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns extends TeaModel {
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

        public static GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns self = new GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns extends TeaModel {
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

        public static GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns self = new GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos extends TeaModel {
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
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos self = new GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setFlFeatureColumns(java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setInputColumns(java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setOutputColumns(java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig extends TeaModel {
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

        public static GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig self = new GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setCacheUsage(Long cacheUsage) {
            this.cacheUsage = cacheUsage;
            return this;
        }
        public Long getCacheUsage() {
            return this.cacheUsage;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setIsUsePsiPreCache(Boolean isUsePsiPreCache) {
            this.isUsePsiPreCache = isUsePsiPreCache;
            return this;
        }
        public Boolean getIsUsePsiPreCache() {
            return this.isUsePsiPreCache;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setLocalBasePath(String localBasePath) {
            this.localBasePath = localBasePath;
            return this;
        }
        public String getLocalBasePath() {
            return this.localBasePath;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheColumn(java.util.List<String> psiPreCacheColumn) {
            this.psiPreCacheColumn = psiPreCacheColumn;
            return this;
        }
        public java.util.List<String> getPsiPreCacheColumn() {
            return this.psiPreCacheColumn;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheDataName(String psiPreCacheDataName) {
            this.psiPreCacheDataName = psiPreCacheDataName;
            return this;
        }
        public String getPsiPreCacheDataName() {
            return this.psiPreCacheDataName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheJobId(Long psiPreCacheJobId) {
            this.psiPreCacheJobId = psiPreCacheJobId;
            return this;
        }
        public Long getPsiPreCacheJobId() {
            return this.psiPreCacheJobId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig setPsiPreCacheJobName(String psiPreCacheJobName) {
            this.psiPreCacheJobName = psiPreCacheJobName;
            return this;
        }
        public String getPsiPreCacheJobName() {
            return this.psiPreCacheJobName;
        }

    }

    public static class GetTrustDaPsiPreCacheJobResponseBodyData extends TeaModel {
        @NameInMap("ApprovalId")
        public Long approvalId;

        @NameInMap("ApprovalStatus")
        public Integer approvalStatus;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DataSetDtos")
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos> dataSetDtos;

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
        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig psiPreCacheConfig;

        @NameInMap("ScheduleCron")
        public String scheduleCron;

        @NameInMap("ScheduleType")
        public Integer scheduleType;

        @NameInMap("ScheduleTypeName")
        public String scheduleTypeName;

        public static GetTrustDaPsiPreCacheJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrustDaPsiPreCacheJobResponseBodyData self = new GetTrustDaPsiPreCacheJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setApprovalStatus(Integer approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public Integer getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setDataSetDtos(java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos> dataSetDtos) {
            this.dataSetDtos = dataSetDtos;
            return this;
        }
        public java.util.List<GetTrustDaPsiPreCacheJobResponseBodyDataDataSetDtos> getDataSetDtos() {
            return this.dataSetDtos;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setModeName(String modeName) {
            this.modeName = modeName;
            return this;
        }
        public String getModeName() {
            return this.modeName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setPlanList(java.util.List<String> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<String> getPlanList() {
            return this.planList;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setProtocolTypeList(java.util.List<String> protocolTypeList) {
            this.protocolTypeList = protocolTypeList;
            return this;
        }
        public java.util.List<String> getProtocolTypeList() {
            return this.protocolTypeList;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setPsiPreCacheConfig(GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig psiPreCacheConfig) {
            this.psiPreCacheConfig = psiPreCacheConfig;
            return this;
        }
        public GetTrustDaPsiPreCacheJobResponseBodyDataPsiPreCacheConfig getPsiPreCacheConfig() {
            return this.psiPreCacheConfig;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setScheduleCron(String scheduleCron) {
            this.scheduleCron = scheduleCron;
            return this;
        }
        public String getScheduleCron() {
            return this.scheduleCron;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetTrustDaPsiPreCacheJobResponseBodyData setScheduleTypeName(String scheduleTypeName) {
            this.scheduleTypeName = scheduleTypeName;
            return this;
        }
        public String getScheduleTypeName() {
            return this.scheduleTypeName;
        }

    }

}
