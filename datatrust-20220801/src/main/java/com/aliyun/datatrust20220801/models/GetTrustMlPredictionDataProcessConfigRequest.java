// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlPredictionDataProcessConfigRequest extends TeaModel {
    @NameInMap("AlgName")
    public String algName;

    @NameInMap("DataSetDtos")
    public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtos> dataSetDtos;

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

    public static GetTrustMlPredictionDataProcessConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlPredictionDataProcessConfigRequest self = new GetTrustMlPredictionDataProcessConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustMlPredictionDataProcessConfigRequest setAlgName(String algName) {
        this.algName = algName;
        return this;
    }
    public String getAlgName() {
        return this.algName;
    }

    public GetTrustMlPredictionDataProcessConfigRequest setDataSetDtos(java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtos> dataSetDtos) {
        this.dataSetDtos = dataSetDtos;
        return this;
    }
    public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtos> getDataSetDtos() {
        return this.dataSetDtos;
    }

    public GetTrustMlPredictionDataProcessConfigRequest setFeatureFormat(Integer featureFormat) {
        this.featureFormat = featureFormat;
        return this;
    }
    public Integer getFeatureFormat() {
        return this.featureFormat;
    }

    public GetTrustMlPredictionDataProcessConfigRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetTrustMlPredictionDataProcessConfigRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public GetTrustMlPredictionDataProcessConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetTrustMlPredictionDataProcessConfigRequest setTrainingJobId(Long trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public Long getTrainingJobId() {
        return this.trainingJobId;
    }

    public static class GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns self = new GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns extends TeaModel {
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

        public static GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns self = new GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns extends TeaModel {
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

        public static GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns self = new GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns setDataSetRole(Integer dataSetRole) {
            this.dataSetRole = dataSetRole;
            return this;
        }
        public Integer getDataSetRole() {
            return this.dataSetRole;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns setInputColumnDesc(String inputColumnDesc) {
            this.inputColumnDesc = inputColumnDesc;
            return this;
        }
        public String getInputColumnDesc() {
            return this.inputColumnDesc;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns setInputColumnName(String inputColumnName) {
            this.inputColumnName = inputColumnName;
            return this;
        }
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns setOutputColumnDesc(String outputColumnDesc) {
            this.outputColumnDesc = outputColumnDesc;
            return this;
        }
        public String getOutputColumnDesc() {
            return this.outputColumnDesc;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns setOutputColumnName(String outputColumnName) {
            this.outputColumnName = outputColumnName;
            return this;
        }
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

    }

    public static class GetTrustMlPredictionDataProcessConfigRequestDataSetDtos extends TeaModel {
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
        public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns> flFeatureColumns;

        @NameInMap("FlLabelColumn")
        public String flLabelColumn;

        @NameInMap("InputColumns")
        public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns> inputColumns;

        @NameInMap("InputDs")
        public String inputDs;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OutputColumns")
        public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns> outputColumns;

        @NameInMap("OutputDataSetId")
        public Long outputDataSetId;

        @NameInMap("OutputDs")
        public String outputDs;

        @NameInMap("OutputName")
        public String outputName;

        @NameInMap("PreSql")
        public String preSql;

        public static GetTrustMlPredictionDataProcessConfigRequestDataSetDtos build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionDataProcessConfigRequestDataSetDtos self = new GetTrustMlPredictionDataProcessConfigRequestDataSetDtos();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setDataRole(Integer dataRole) {
            this.dataRole = dataRole;
            return this;
        }
        public Integer getDataRole() {
            return this.dataRole;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setFilterStr(String filterStr) {
            this.filterStr = filterStr;
            return this;
        }
        public String getFilterStr() {
            return this.filterStr;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setFlFeatureColumns(java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns> flFeatureColumns) {
            this.flFeatureColumns = flFeatureColumns;
            return this;
        }
        public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosFlFeatureColumns> getFlFeatureColumns() {
            return this.flFeatureColumns;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setFlLabelColumn(String flLabelColumn) {
            this.flLabelColumn = flLabelColumn;
            return this;
        }
        public String getFlLabelColumn() {
            return this.flLabelColumn;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setInputColumns(java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns> inputColumns) {
            this.inputColumns = inputColumns;
            return this;
        }
        public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosInputColumns> getInputColumns() {
            return this.inputColumns;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setInputDs(String inputDs) {
            this.inputDs = inputDs;
            return this;
        }
        public String getInputDs() {
            return this.inputDs;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setOutputColumns(java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public java.util.List<GetTrustMlPredictionDataProcessConfigRequestDataSetDtosOutputColumns> getOutputColumns() {
            return this.outputColumns;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setOutputDataSetId(Long outputDataSetId) {
            this.outputDataSetId = outputDataSetId;
            return this;
        }
        public Long getOutputDataSetId() {
            return this.outputDataSetId;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setOutputDs(String outputDs) {
            this.outputDs = outputDs;
            return this;
        }
        public String getOutputDs() {
            return this.outputDs;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setOutputName(String outputName) {
            this.outputName = outputName;
            return this;
        }
        public String getOutputName() {
            return this.outputName;
        }

        public GetTrustMlPredictionDataProcessConfigRequestDataSetDtos setPreSql(String preSql) {
            this.preSql = preSql;
            return this;
        }
        public String getPreSql() {
            return this.preSql;
        }

    }

}
