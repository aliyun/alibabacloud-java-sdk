// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ExecuteStatementResponseBody extends TeaModel {
    /**
     * <p>The time when the SQL statements were created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-04T10:08:47+0800</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The returned results of the synchronous call.</p>
     */
    @NameInMap("Data")
    public ExecuteStatementResponseBodyData data;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adbtest</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The ID of the job for asynchronously executing the SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ARN of the access credential for the created Data API account.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
     */
    @NameInMap("SecretArn")
    public String secretArn;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ExecuteStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementResponseBody self = new ExecuteStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ExecuteStatementResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ExecuteStatementResponseBody setData(ExecuteStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteStatementResponseBodyData getData() {
        return this.data;
    }

    public ExecuteStatementResponseBody setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ExecuteStatementResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecuteStatementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteStatementResponseBody setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public ExecuteStatementResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ExecuteStatementResponseBodyDataColumnMetadata extends TeaModel {
        @NameInMap("ColumnMetadata")
        public java.util.List<ColumnMetadata> columnMetadata;

        public static ExecuteStatementResponseBodyDataColumnMetadata build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyDataColumnMetadata self = new ExecuteStatementResponseBodyDataColumnMetadata();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyDataColumnMetadata setColumnMetadata(java.util.List<ColumnMetadata> columnMetadata) {
            this.columnMetadata = columnMetadata;
            return this;
        }
        public java.util.List<ColumnMetadata> getColumnMetadata() {
            return this.columnMetadata;
        }

    }

    public static class ExecuteStatementResponseBodyDataRecordsRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<Field> record;

        public static ExecuteStatementResponseBodyDataRecordsRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyDataRecordsRecords self = new ExecuteStatementResponseBodyDataRecordsRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyDataRecordsRecords setRecord(java.util.List<Field> record) {
            this.record = record;
            return this;
        }
        public java.util.List<Field> getRecord() {
            return this.record;
        }

    }

    public static class ExecuteStatementResponseBodyDataRecords extends TeaModel {
        @NameInMap("Records")
        public java.util.List<ExecuteStatementResponseBodyDataRecordsRecords> records;

        public static ExecuteStatementResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyDataRecords self = new ExecuteStatementResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyDataRecords setRecords(java.util.List<ExecuteStatementResponseBodyDataRecordsRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ExecuteStatementResponseBodyDataRecordsRecords> getRecords() {
            return this.records;
        }

    }

    public static class ExecuteStatementResponseBodyData extends TeaModel {
        @NameInMap("ColumnMetadata")
        public ExecuteStatementResponseBodyDataColumnMetadata columnMetadata;

        @NameInMap("Records")
        public ExecuteStatementResponseBodyDataRecords records;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalNumRows")
        public Long totalNumRows;

        public static ExecuteStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyData self = new ExecuteStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyData setColumnMetadata(ExecuteStatementResponseBodyDataColumnMetadata columnMetadata) {
            this.columnMetadata = columnMetadata;
            return this;
        }
        public ExecuteStatementResponseBodyDataColumnMetadata getColumnMetadata() {
            return this.columnMetadata;
        }

        public ExecuteStatementResponseBodyData setRecords(ExecuteStatementResponseBodyDataRecords records) {
            this.records = records;
            return this;
        }
        public ExecuteStatementResponseBodyDataRecords getRecords() {
            return this.records;
        }

        public ExecuteStatementResponseBodyData setTotalNumRows(Long totalNumRows) {
            this.totalNumRows = totalNumRows;
            return this;
        }
        public Long getTotalNumRows() {
            return this.totalNumRows;
        }

    }

}
