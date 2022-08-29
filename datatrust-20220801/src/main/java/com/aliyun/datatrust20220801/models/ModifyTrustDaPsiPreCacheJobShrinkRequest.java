// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustDaPsiPreCacheJobShrinkRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataSetDtos")
    public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos> dataSetDtos;

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
    public String planListShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProtocolTypeList")
    public String protocolTypeListShrink;

    @NameInMap("PsiPreCacheConfig")
    public String psiPreCacheConfigShrink;

    @NameInMap("ScheduleCron")
    public String scheduleCron;

    @NameInMap("ScheduleType")
    public Integer scheduleType;

    @NameInMap("ScheduleTypeName")
    public String scheduleTypeName;

    public static ModifyTrustDaPsiPreCacheJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustDaPsiPreCacheJobShrinkRequest self = new ModifyTrustDaPsiPreCacheJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setDataSetDtos(java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setPlanListShrink(String planListShrink) {
        this.planListShrink = planListShrink;
        return this;
    }
    public String getPlanListShrink() {
        return this.planListShrink;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setProtocolTypeListShrink(String protocolTypeListShrink) {
        this.protocolTypeListShrink = protocolTypeListShrink;
        return this;
    }
    public String getProtocolTypeListShrink() {
        return this.protocolTypeListShrink;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setPsiPreCacheConfigShrink(String psiPreCacheConfigShrink) {
        this.psiPreCacheConfigShrink = psiPreCacheConfigShrink;
        return this;
    }
    public String getPsiPreCacheConfigShrink() {
        return this.psiPreCacheConfigShrink;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public ModifyTrustDaPsiPreCacheJobShrinkRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public static class ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns self = new ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns extends TeaModel {
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

        public static ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns self = new ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns self = new ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos extends TeaModel {
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
        public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos self = new ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setFlFeatureColumns(java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setInputColumns(java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputColumns(java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public ModifyTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
