// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetDefaultTrustMlDataProcessConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetDefaultTrustMlDataProcessConfigResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDefaultTrustMlDataProcessConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultTrustMlDataProcessConfigResponseBody self = new GetDefaultTrustMlDataProcessConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultTrustMlDataProcessConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDefaultTrustMlDataProcessConfigResponseBody setData(java.util.List<GetDefaultTrustMlDataProcessConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDefaultTrustMlDataProcessConfigResponseBodyData> getData() {
        return this.data;
    }

    public GetDefaultTrustMlDataProcessConfigResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDefaultTrustMlDataProcessConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDefaultTrustMlDataProcessConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultTrustMlDataProcessConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDefaultTrustMlDataProcessConfigResponseBodyDataField extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetDefaultTrustMlDataProcessConfigResponseBodyDataField build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultTrustMlDataProcessConfigResponseBodyDataField self = new GetDefaultTrustMlDataProcessConfigResponseBodyDataField();
            return TeaModel.build(map, self);
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyDataField setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyDataField setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyDataField setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyDataField setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetDefaultTrustMlDataProcessConfigResponseBodyData extends TeaModel {
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
        public java.util.List<GetDefaultTrustMlDataProcessConfigResponseBodyDataField> field;

        @NameInMap("ProcessType")
        public Integer processType;

        @NameInMap("ProcessedValue")
        public String processedValue;

        @NameInMap("RawValues")
        public java.util.List<String> rawValues;

        public static GetDefaultTrustMlDataProcessConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultTrustMlDataProcessConfigResponseBodyData self = new GetDefaultTrustMlDataProcessConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setBinningCount(Integer binningCount) {
            this.binningCount = binningCount;
            return this;
        }
        public Integer getBinningCount() {
            return this.binningCount;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setBinningInterval(String binningInterval) {
            this.binningInterval = binningInterval;
            return this;
        }
        public String getBinningInterval() {
            return this.binningInterval;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setBinningType(Integer binningType) {
            this.binningType = binningType;
            return this;
        }
        public Integer getBinningType() {
            return this.binningType;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setDataOwnerId(Long dataOwnerId) {
            this.dataOwnerId = dataOwnerId;
            return this;
        }
        public Long getDataOwnerId() {
            return this.dataOwnerId;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setDataOwnerName(String dataOwnerName) {
            this.dataOwnerName = dataOwnerName;
            return this;
        }
        public String getDataOwnerName() {
            return this.dataOwnerName;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setDataSetId(Long dataSetId) {
            this.dataSetId = dataSetId;
            return this;
        }
        public Long getDataSetId() {
            return this.dataSetId;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setDataSetName(String dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public String getDataSetName() {
            return this.dataSetName;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setDataSetUsage(Integer dataSetUsage) {
            this.dataSetUsage = dataSetUsage;
            return this;
        }
        public Integer getDataSetUsage() {
            return this.dataSetUsage;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setField(java.util.List<GetDefaultTrustMlDataProcessConfigResponseBodyDataField> field) {
            this.field = field;
            return this;
        }
        public java.util.List<GetDefaultTrustMlDataProcessConfigResponseBodyDataField> getField() {
            return this.field;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setProcessType(Integer processType) {
            this.processType = processType;
            return this;
        }
        public Integer getProcessType() {
            return this.processType;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setProcessedValue(String processedValue) {
            this.processedValue = processedValue;
            return this;
        }
        public String getProcessedValue() {
            return this.processedValue;
        }

        public GetDefaultTrustMlDataProcessConfigResponseBodyData setRawValues(java.util.List<String> rawValues) {
            this.rawValues = rawValues;
            return this;
        }
        public java.util.List<String> getRawValues() {
            return this.rawValues;
        }

    }

}
