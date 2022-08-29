// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlDataProcessConfigRequest extends TeaModel {
    @NameInMap("DataProcessDtoList")
    public java.util.List<CreateTrustMlDataProcessConfigRequestDataProcessDtoList> dataProcessDtoList;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobMode")
    public Integer jobMode;

    @NameInMap("JobType")
    public Integer jobType;

    public static CreateTrustMlDataProcessConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlDataProcessConfigRequest self = new CreateTrustMlDataProcessConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlDataProcessConfigRequest setDataProcessDtoList(java.util.List<CreateTrustMlDataProcessConfigRequestDataProcessDtoList> dataProcessDtoList) {
        this.dataProcessDtoList = dataProcessDtoList;
        return this;
    }
    public java.util.List<CreateTrustMlDataProcessConfigRequestDataProcessDtoList> getDataProcessDtoList() {
        return this.dataProcessDtoList;
    }

    public CreateTrustMlDataProcessConfigRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateTrustMlDataProcessConfigRequest setJobMode(Integer jobMode) {
        this.jobMode = jobMode;
        return this;
    }
    public Integer getJobMode() {
        return this.jobMode;
    }

    public CreateTrustMlDataProcessConfigRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public static class CreateTrustMlDataProcessConfigRequestDataProcessDtoListField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static CreateTrustMlDataProcessConfigRequestDataProcessDtoListField build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlDataProcessConfigRequestDataProcessDtoListField self = new CreateTrustMlDataProcessConfigRequestDataProcessDtoListField();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoListField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoListField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoListField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoListField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class CreateTrustMlDataProcessConfigRequestDataProcessDtoList extends TeaModel {
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
        public java.util.List<CreateTrustMlDataProcessConfigRequestDataProcessDtoListField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static CreateTrustMlDataProcessConfigRequestDataProcessDtoList build(java.util.Map<String, ?> map) throws Exception {
            CreateTrustMlDataProcessConfigRequestDataProcessDtoList self = new CreateTrustMlDataProcessConfigRequestDataProcessDtoList();
            return TeaModel.build(map, self);
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setField(java.util.List<CreateTrustMlDataProcessConfigRequestDataProcessDtoListField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<CreateTrustMlDataProcessConfigRequestDataProcessDtoListField> getField() {
            return this.field;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public CreateTrustMlDataProcessConfigRequestDataProcessDtoList setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

}
