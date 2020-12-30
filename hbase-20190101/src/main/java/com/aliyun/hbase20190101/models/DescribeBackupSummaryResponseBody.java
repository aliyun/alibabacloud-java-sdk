// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Incr")
    public DescribeBackupSummaryResponseBodyIncr incr;

    @NameInMap("Full")
    public DescribeBackupSummaryResponseBodyFull full;

    public static DescribeBackupSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSummaryResponseBody self = new DescribeBackupSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSummaryResponseBody setIncr(DescribeBackupSummaryResponseBodyIncr incr) {
        this.incr = incr;
        return this;
    }
    public DescribeBackupSummaryResponseBodyIncr getIncr() {
        return this.incr;
    }

    public DescribeBackupSummaryResponseBody setFull(DescribeBackupSummaryResponseBodyFull full) {
        this.full = full;
        return this;
    }
    public DescribeBackupSummaryResponseBodyFull getFull() {
        return this.full;
    }

    public static class DescribeBackupSummaryResponseBodyIncr extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("Pos")
        public String pos;

        @NameInMap("QueueLogNum")
        public String queueLogNum;

        @NameInMap("BackupLogSize")
        public String backupLogSize;

        @NameInMap("RunningLogNum")
        public String runningLogNum;

        public static DescribeBackupSummaryResponseBodyIncr build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyIncr self = new DescribeBackupSummaryResponseBodyIncr();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyIncr setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupSummaryResponseBodyIncr setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeBackupSummaryResponseBodyIncr setPos(String pos) {
            this.pos = pos;
            return this;
        }
        public String getPos() {
            return this.pos;
        }

        public DescribeBackupSummaryResponseBodyIncr setQueueLogNum(String queueLogNum) {
            this.queueLogNum = queueLogNum;
            return this;
        }
        public String getQueueLogNum() {
            return this.queueLogNum;
        }

        public DescribeBackupSummaryResponseBodyIncr setBackupLogSize(String backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }
        public String getBackupLogSize() {
            return this.backupLogSize;
        }

        public DescribeBackupSummaryResponseBodyIncr setRunningLogNum(String runningLogNum) {
            this.runningLogNum = runningLogNum;
            return this;
        }
        public String getRunningLogNum() {
            return this.runningLogNum;
        }

    }

    public static class DescribeBackupSummaryResponseBodyFullRecordsRecord extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeBackupSummaryResponseBodyFullRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyFullRecordsRecord self = new DescribeBackupSummaryResponseBodyFullRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeBackupSummaryResponseBodyFullRecords extends TeaModel {
        @NameInMap("Record")
        public java.util.List<DescribeBackupSummaryResponseBodyFullRecordsRecord> record;

        public static DescribeBackupSummaryResponseBodyFullRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyFullRecords self = new DescribeBackupSummaryResponseBodyFullRecords();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyFullRecords setRecord(java.util.List<DescribeBackupSummaryResponseBodyFullRecordsRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<DescribeBackupSummaryResponseBodyFullRecordsRecord> getRecord() {
            return this.record;
        }

    }

    public static class DescribeBackupSummaryResponseBodyFull extends TeaModel {
        @NameInMap("NextFullBackupDate")
        public String nextFullBackupDate;

        @NameInMap("Records")
        public DescribeBackupSummaryResponseBodyFullRecords records;

        @NameInMap("HasMore")
        public String hasMore;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("Total")
        public Integer total;

        public static DescribeBackupSummaryResponseBodyFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyFull self = new DescribeBackupSummaryResponseBodyFull();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyFull setNextFullBackupDate(String nextFullBackupDate) {
            this.nextFullBackupDate = nextFullBackupDate;
            return this;
        }
        public String getNextFullBackupDate() {
            return this.nextFullBackupDate;
        }

        public DescribeBackupSummaryResponseBodyFull setRecords(DescribeBackupSummaryResponseBodyFullRecords records) {
            this.records = records;
            return this;
        }
        public DescribeBackupSummaryResponseBodyFullRecords getRecords() {
            return this.records;
        }

        public DescribeBackupSummaryResponseBodyFull setHasMore(String hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public String getHasMore() {
            return this.hasMore;
        }

        public DescribeBackupSummaryResponseBodyFull setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupSummaryResponseBodyFull setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeBackupSummaryResponseBodyFull setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
