// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetDefaultTrustMlDataProcessConfigRequest extends TeaModel {
    @NameInMap("AlgName")
    public String algName;

    @NameInMap("DataSetDtos")
    public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtos> dataSetDtos;

    @NameInMap("FeatureFormat")
    public Integer featureFormat;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobType")
    public Integer jobType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TrainingJobId")
    public Long trainingJobId;

    public static GetDefaultTrustMlDataProcessConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultTrustMlDataProcessConfigRequest self = new GetDefaultTrustMlDataProcessConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultTrustMlDataProcessConfigRequest setAlgName(String algName) {
        this.algName = algName;
        return this;
    }
    public String getAlgName() {
        return this.algName;
    }

    public GetDefaultTrustMlDataProcessConfigRequest setDataSetDtos(java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public GetDefaultTrustMlDataProcessConfigRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public GetDefaultTrustMlDataProcessConfigRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetDefaultTrustMlDataProcessConfigRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public GetDefaultTrustMlDataProcessConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDefaultTrustMlDataProcessConfigRequest setTrainingJobId(Long trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public Long getTrainingJobId() {
        return this.trainingJobId;
    }

    public static class GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns self = new GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns extends TeaModel {
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

        public static GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns self = new GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns self = new GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetDefaultTrustMlDataProcessConfigRequestDataSetDtos extends TeaModel {
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
        public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetDefaultTrustMlDataProcessConfigRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultTrustMlDataProcessConfigRequestDataSetDtos self = new GetDefaultTrustMlDataProcessConfigRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setFlFeatureColumns(java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setInputColumns(java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setOutputColumns(java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetDefaultTrustMlDataProcessConfigRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetDefaultTrustMlDataProcessConfigRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
