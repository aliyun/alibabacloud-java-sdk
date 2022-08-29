// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlPredictionDataProcessConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetTrustMlPredictionDataProcessConfigResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTrustMlPredictionDataProcessConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlPredictionDataProcessConfigResponseBody self = new GetTrustMlPredictionDataProcessConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustMlPredictionDataProcessConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTrustMlPredictionDataProcessConfigResponseBody setData(java.util.List<GetTrustMlPredictionDataProcessConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTrustMlPredictionDataProcessConfigResponseBodyData> getData() {
        return this.data;
    }

    public GetTrustMlPredictionDataProcessConfigResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTrustMlPredictionDataProcessConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrustMlPredictionDataProcessConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrustMlPredictionDataProcessConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTrustMlPredictionDataProcessConfigResponseBodyDataField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetTrustMlPredictionDataProcessConfigResponseBodyDataField build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionDataProcessConfigResponseBodyDataField self = new GetTrustMlPredictionDataProcessConfigResponseBodyDataField();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyDataField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyDataField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyDataField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyDataField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetTrustMlPredictionDataProcessConfigResponseBodyData extends TeaModel {
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
        public java.util.List<GetTrustMlPredictionDataProcessConfigResponseBodyDataField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static GetTrustMlPredictionDataProcessConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrustMlPredictionDataProcessConfigResponseBodyData self = new GetTrustMlPredictionDataProcessConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setField(java.util.List<GetTrustMlPredictionDataProcessConfigResponseBodyDataField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<GetTrustMlPredictionDataProcessConfigResponseBodyDataField> getField() {
            return this.field;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public GetTrustMlPredictionDataProcessConfigResponseBodyData setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

}
