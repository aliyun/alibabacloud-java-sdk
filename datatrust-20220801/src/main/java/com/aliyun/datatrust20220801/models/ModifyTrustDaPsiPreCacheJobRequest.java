// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustDaPsiPreCacheJobRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataSetDtos")
    public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtos> dataSetDtos;

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
    public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig psiPreCacheConfig;

    @NameInMap("ScheduleCron")
    public String scheduleCron;

    @NameInMap("ScheduleType")
    public Integer scheduleType;

    @NameInMap("ScheduleTypeName")
    public String scheduleTypeName;

    public static ModifyTrustDaPsiPreCacheJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustDaPsiPreCacheJobRequest self = new ModifyTrustDaPsiPreCacheJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrustDaPsiPreCacheJobRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setDataSetDtos(java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setPlanList(java.util.List<String> planList) {
        this.planList = planList;
        return this;
    }
    public java.util.List<String> getPlanList() {
        return this.planList;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setProtocolTypeList(java.util.List<String> protocolTypeList) {
        this.protocolTypeList = protocolTypeList;
        return this;
    }
    public java.util.List<String> getProtocolTypeList() {
        return this.protocolTypeList;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setPsiPreCacheConfig(ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig psiPreCacheConfig) {
        this.psiPreCacheConfig = psiPreCacheConfig;
        return this;
    }
    public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig getPsiPreCacheConfig() {
        return this.psiPreCacheConfig;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public ModifyTrustDaPsiPreCacheJobRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public static class ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns self = new ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns extends TeaModel {
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

        public static ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns self = new ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns self = new ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobRequestDataSetDtos extends TeaModel {
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
        public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static ModifyTrustDaPsiPreCacheJobRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobRequestDataSetDtos self = new ModifyTrustDaPsiPreCacheJobRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setFlFeatureColumns(java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setInputColumns(java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setOutputColumns(java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<ModifyTrustDaPsiPreCacheJobRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig extends TeaModel {
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

        public static ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig self = new ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setCacheUsage(Long cacheUsage) {
            this.cacheUsage = cacheUsage;
            return this;
        }
        public Long getCacheUsage() {
            return this.cacheUsage;
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setIsUsePsiPreCache(Boolean isUsePsiPreCache) {
            this.isUsePsiPreCache = isUsePsiPreCache;
            return this;
        }
        public Boolean getIsUsePsiPreCache() {
            return this.isUsePsiPreCache;
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setLocalBasePath(String localBasePath) {
            this.localBasePath = localBasePath;
            return this;
        }
        public String getLocalBasePath() {
            return this.localBasePath;
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheColumn(java.util.List<String> psiPreCacheColumn) {
            this.psiPreCacheColumn = psiPreCacheColumn;
            return this;
        }
        public java.util.List<String> getPsiPreCacheColumn() {
            return this.psiPreCacheColumn;
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheDataName(String psiPreCacheDataName) {
            this.psiPreCacheDataName = psiPreCacheDataName;
            return this;
        }
        public String getPsiPreCacheDataName() {
            return this.psiPreCacheDataName;
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheJobId(Long psiPreCacheJobId) {
            this.psiPreCacheJobId = psiPreCacheJobId;
            return this;
        }
        public Long getPsiPreCacheJobId() {
            return this.psiPreCacheJobId;
        }

        public ModifyTrustDaPsiPreCacheJobRequestPsiPreCacheConfig setPsiPreCacheJobName(String psiPreCacheJobName) {
            this.psiPreCacheJobName = psiPreCacheJobName;
            return this;
        }
        public String getPsiPreCacheJobName() {
            return this.psiPreCacheJobName;
        }

    }

}
