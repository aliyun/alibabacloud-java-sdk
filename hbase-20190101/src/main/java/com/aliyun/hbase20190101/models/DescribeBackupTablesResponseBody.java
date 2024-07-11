// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupTablesResponseBody extends TeaModel {
    @NameInMap("BackupRecords")
    public DescribeBackupTablesResponseBodyBackupRecords backupRecords;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>01262E9C-B0CC-4663-82FA-D50173649F92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public DescribeBackupTablesResponseBodyTables tables;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeBackupTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTablesResponseBody self = new DescribeBackupTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTablesResponseBody setBackupRecords(DescribeBackupTablesResponseBodyBackupRecords backupRecords) {
        this.backupRecords = backupRecords;
        return this;
    }
    public DescribeBackupTablesResponseBodyBackupRecords getBackupRecords() {
        return this.backupRecords;
    }

    public DescribeBackupTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupTablesResponseBody setTables(DescribeBackupTablesResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeBackupTablesResponseBodyTables getTables() {
        return this.tables;
    }

    public DescribeBackupTablesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeBackupTablesResponseBodyBackupRecordsBackupRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.2 kB</p>
         */
        @NameInMap("DataSize")
        public String dataSize;

        /**
         * <strong>example:</strong>
         * <p>2020-11-02T18:00:05Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>14/14</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <strong>example:</strong>
         * <p>0.00 MB/s</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <strong>example:</strong>
         * <p>2020-11-02T18:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>default:test1</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeBackupTablesResponseBodyBackupRecordsBackupRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTablesResponseBodyBackupRecordsBackupRecord self = new DescribeBackupTablesResponseBodyBackupRecordsBackupRecord();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeBackupTablesResponseBodyBackupRecords extends TeaModel {
        @NameInMap("BackupRecord")
        public java.util.List<DescribeBackupTablesResponseBodyBackupRecordsBackupRecord> backupRecord;

        public static DescribeBackupTablesResponseBodyBackupRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTablesResponseBodyBackupRecords self = new DescribeBackupTablesResponseBodyBackupRecords();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTablesResponseBodyBackupRecords setBackupRecord(java.util.List<DescribeBackupTablesResponseBodyBackupRecordsBackupRecord> backupRecord) {
            this.backupRecord = backupRecord;
            return this;
        }
        public java.util.List<DescribeBackupTablesResponseBodyBackupRecordsBackupRecord> getBackupRecord() {
            return this.backupRecord;
        }

    }

    public static class DescribeBackupTablesResponseBodyTables extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeBackupTablesResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTablesResponseBodyTables self = new DescribeBackupTablesResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTablesResponseBodyTables setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

}
