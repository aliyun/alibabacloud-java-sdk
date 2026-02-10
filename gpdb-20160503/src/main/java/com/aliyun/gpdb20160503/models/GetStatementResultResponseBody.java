// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetStatementResultResponseBody extends TeaModel {
    /**
     * <p>The result of the asynchronous call.</p>
     */
    @NameInMap("Data")
    public GetStatementResultResponseBodyData data;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>API execution status, with values as follows:</p>
     * <ul>
     * <li><strong>false</strong>: Execution failed.</li>
     * <li><strong>true</strong>: Execution succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetStatementResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStatementResultResponseBody self = new GetStatementResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStatementResultResponseBody setData(GetStatementResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStatementResultResponseBodyData getData() {
        return this.data;
    }

    public GetStatementResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStatementResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStatementResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetStatementResultResponseBodyDataColumnMetadata extends TeaModel {
        @NameInMap("ColumnMetadata")
        public java.util.List<ColumnMetadata> columnMetadata;

        public static GetStatementResultResponseBodyDataColumnMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetStatementResultResponseBodyDataColumnMetadata self = new GetStatementResultResponseBodyDataColumnMetadata();
            return TeaModel.build(map, self);
        }

        public GetStatementResultResponseBodyDataColumnMetadata setColumnMetadata(java.util.List<ColumnMetadata> columnMetadata) {
            this.columnMetadata = columnMetadata;
            return this;
        }
        public java.util.List<ColumnMetadata> getColumnMetadata() {
            return this.columnMetadata;
        }

    }

    public static class GetStatementResultResponseBodyDataRecordsRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<Field> record;

        public static GetStatementResultResponseBodyDataRecordsRecords build(java.util.Map<String, ?> map) throws Exception {
            GetStatementResultResponseBodyDataRecordsRecords self = new GetStatementResultResponseBodyDataRecordsRecords();
            return TeaModel.build(map, self);
        }

        public GetStatementResultResponseBodyDataRecordsRecords setRecord(java.util.List<Field> record) {
            this.record = record;
            return this;
        }
        public java.util.List<Field> getRecord() {
            return this.record;
        }

    }

    public static class GetStatementResultResponseBodyDataRecords extends TeaModel {
        @NameInMap("Records")
        public java.util.List<GetStatementResultResponseBodyDataRecordsRecords> records;

        public static GetStatementResultResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetStatementResultResponseBodyDataRecords self = new GetStatementResultResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetStatementResultResponseBodyDataRecords setRecords(java.util.List<GetStatementResultResponseBodyDataRecordsRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetStatementResultResponseBodyDataRecordsRecords> getRecords() {
            return this.records;
        }

    }

    public static class GetStatementResultResponseBodyData extends TeaModel {
        @NameInMap("ColumnMetadata")
        public GetStatementResultResponseBodyDataColumnMetadata columnMetadata;

        @NameInMap("Records")
        public GetStatementResultResponseBodyDataRecords records;

        /**
         * <p>Total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalNumRows")
        public Long totalNumRows;

        public static GetStatementResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStatementResultResponseBodyData self = new GetStatementResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStatementResultResponseBodyData setColumnMetadata(GetStatementResultResponseBodyDataColumnMetadata columnMetadata) {
            this.columnMetadata = columnMetadata;
            return this;
        }
        public GetStatementResultResponseBodyDataColumnMetadata getColumnMetadata() {
            return this.columnMetadata;
        }

        public GetStatementResultResponseBodyData setRecords(GetStatementResultResponseBodyDataRecords records) {
            this.records = records;
            return this;
        }
        public GetStatementResultResponseBodyDataRecords getRecords() {
            return this.records;
        }

        public GetStatementResultResponseBodyData setTotalNumRows(Long totalNumRows) {
            this.totalNumRows = totalNumRows;
            return this;
        }
        public Long getTotalNumRows() {
            return this.totalNumRows;
        }

    }

}
