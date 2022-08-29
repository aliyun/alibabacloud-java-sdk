// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustDaPsiPreCacheJobRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataSetDtos")
    public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtos> dataSetDtos;

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
    public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig psiPreCacheConfig;

    @NameInMap("ScheduleCron")
    public String scheduleCron;

    @NameInMap("ScheduleType")
    public Integer scheduleType;

    @NameInMap("ScheduleTypeName")
    public String scheduleTypeName;

    public static CreateTrustDaPsiPreCacheJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustDaPsiPreCacheJobRequest self = new CreateTrustDaPsiPreCacheJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustDaPsiPreCacheJobRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public CreateTrustDaPsiPreCacheJobRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public CreateTrustDaPsiPreCacheJobRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateTrustDaPsiPreCacheJobRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTrustDaPsiPreCacheJobRequest setDataSetDtos(java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public CreateTrustDaPsiPreCacheJobRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTrustDaPsiPreCacheJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateTrustDaPsiPreCacheJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateTrustDaPsiPreCacheJobRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public CreateTrustDaPsiPreCacheJobRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public CreateTrustDaPsiPreCacheJobRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public CreateTrustDaPsiPreCacheJobRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public CreateTrustDaPsiPreCacheJobRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public CreateTrustDaPsiPreCacheJobRequest setPlanList(java.util.List<String> planList) {
        this.planList = planList;
        return this;
    }
    public java.util.List<String> getPlanList() {
        return this.planList;
    }

    public CreateTrustDaPsiPreCacheJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTrustDaPsiPreCacheJobRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTrustDaPsiPreCacheJobRequest setProtocolTypeList(java.util.List<String> protocolTypeList) {
        this.protocolTypeList = protocolTypeList;
        return this;
    }
    public java.util.List<String> getProtocolTypeList() {
        return this.protocolTypeList;
    }

    public CreateTrustDaPsiPreCacheJobRequest setPsiPreCacheConfig(CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig psiPreCacheConfig) {
        this.psiPreCacheConfig = psiPreCacheConfig;
        return this;
    }
    public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig getPsiPreCacheConfig() {
        return this.psiPreCacheConfig;
    }

    public CreateTrustDaPsiPreCacheJobRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public CreateTrustDaPsiPreCacheJobRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public CreateTrustDaPsiPreCacheJobRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public static class CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns self = new CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns extends TeaModel {
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

        public static CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns self = new CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns self = new CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobRequestDataSetDtos extends TeaModel {
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
        public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static CreateTrustDaPsiPreCacheJobRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobRequestDataSetDtos self = new CreateTrustDaPsiPreCacheJobRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setFlFeatureColumns(java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setInputColumns(java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setOutputColumns(java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<CreateTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public CreateTrustDaPsiPreCacheJobRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig extends TeaModel {
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

        public static CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig self = new CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setCacheUsage(Long cacheUsage) {
            this.cacheUsage = cacheUsage;
            return this;
        }
        public Long getCacheUsage() {
            return this.cacheUsage;
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setIsUsePsiPreCache(Boolean isUsePsiPreCache) {
            this.isUsePsiPreCache = isUsePsiPreCache;
            return this;
        }
        public Boolean getIsUsePsiPreCache() {
            return this.isUsePsiPreCache;
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setLocalBasePath(String localBasePath) {
            this.localBasePath = localBasePath;
            return this;
        }
        public String getLocalBasePath() {
            return this.localBasePath;
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheColumn(java.util.List<String> psiPreCacheColumn) {
            this.psiPreCacheColumn = psiPreCacheColumn;
            return this;
        }
        public java.util.List<String> getPsiPreCacheColumn() {
            return this.psiPreCacheColumn;
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheDataName(String psiPreCacheDataName) {
            this.psiPreCacheDataName = psiPreCacheDataName;
            return this;
        }
        public String getPsiPreCacheDataName() {
            return this.psiPreCacheDataName;
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheJobId(Long psiPreCacheJobId) {
            this.psiPreCacheJobId = psiPreCacheJobId;
            return this;
        }
        public Long getPsiPreCacheJobId() {
            return this.psiPreCacheJobId;
        }

        public CreateTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheJobName(String psiPreCacheJobName) {
            this.psiPreCacheJobName = psiPreCacheJobName;
            return this;
        }
        public String getPsiPreCacheJobName() {
            return this.psiPreCacheJobName;
        }

    }

}
