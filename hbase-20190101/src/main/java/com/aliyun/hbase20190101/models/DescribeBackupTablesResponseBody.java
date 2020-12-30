// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BackupRecords")
    public DescribeBackupTablesResponseBodyBackupRecords backupRecords;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Tables")
    public DescribeBackupTablesResponseBodyTables tables;

    public static DescribeBackupTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTablesResponseBody self = new DescribeBackupTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public DescribeBackupTablesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeBackupTablesResponseBody setTables(DescribeBackupTablesResponseBodyTables tables) {
        this.tables = tables;
        return this;
    }
    public DescribeBackupTablesResponseBodyTables getTables() {
        return this.tables;
    }

    public static class DescribeBackupTablesResponseBodyBackupRecordsBackupRecord extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Table")
        public String table;

        public static DescribeBackupTablesResponseBodyBackupRecordsBackupRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTablesResponseBodyBackupRecordsBackupRecord self = new DescribeBackupTablesResponseBodyBackupRecordsBackupRecord();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeBackupTablesResponseBodyBackupRecordsBackupRecord setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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
