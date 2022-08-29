// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustDaPsiPreCacheJobShrinkRequest extends TeaModel {
    @NameInMap("ApprovalId")
    public Long approvalId;

    @NameInMap("ApprovalStatus")
    public Integer approvalStatus;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("DataSetDtos")
    public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos> dataSetDtos;

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

    public static CreateTrustDaPsiPreCacheJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustDaPsiPreCacheJobShrinkRequest self = new CreateTrustDaPsiPreCacheJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setDataSetDtos(java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }
    public String getModeName() {
        return this.modeName;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setPlanListShrink(String planListShrink) {
        this.planListShrink = planListShrink;
        return this;
    }
    public String getPlanListShrink() {
        return this.planListShrink;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setProtocolTypeListShrink(String protocolTypeListShrink) {
        this.protocolTypeListShrink = protocolTypeListShrink;
        return this;
    }
    public String getProtocolTypeListShrink() {
        return this.protocolTypeListShrink;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setPsiPreCacheConfigShrink(String psiPreCacheConfigShrink) {
        this.psiPreCacheConfigShrink = psiPreCacheConfigShrink;
        return this;
    }
    public String getPsiPreCacheConfigShrink() {
        return this.psiPreCacheConfigShrink;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }
    public String getScheduleCron() {
        return this.scheduleCron;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public Integer getScheduleType() {
        return this.scheduleType;
    }

    public CreateTrustDaPsiPreCacheJobShrinkRequest setScheduleTypeName(String scheduleTypeName) {
        this.scheduleTypeName = scheduleTypeName;
        return this;
    }
    public String getScheduleTypeName() {
        return this.scheduleTypeName;
    }

    public static class CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns self = new CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns extends TeaModel {
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

        public static CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns self = new CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns self = new CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos extends TeaModel {
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
        public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos self = new CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setFlFeatureColumns(java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setInputColumns(java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputColumns(java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public CreateTrustDaPsiPreCacheJobShrinkRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
