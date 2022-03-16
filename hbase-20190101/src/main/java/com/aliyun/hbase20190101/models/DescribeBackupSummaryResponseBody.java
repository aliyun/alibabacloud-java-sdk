// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupSummaryResponseBody extends TeaModel {
    @NameInMap("Full")
    public DescribeBackupSummaryResponseBodyFull full;

    @NameInMap("Incr")
    public DescribeBackupSummaryResponseBodyIncr incr;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSummaryResponseBody self = new DescribeBackupSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSummaryResponseBody setFull(DescribeBackupSummaryResponseBodyFull full) {
        this.full = full;
        return this;
    }
    public DescribeBackupSummaryResponseBodyFull getFull() {
        return this.full;
    }

    public DescribeBackupSummaryResponseBody setIncr(DescribeBackupSummaryResponseBodyIncr incr) {
        this.incr = incr;
        return this;
    }
    public DescribeBackupSummaryResponseBodyIncr getIncr() {
        return this.incr;
    }

    public DescribeBackupSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupSummaryResponseBodyFullRecordsRecord extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("Status")
        public String status;

        public static DescribeBackupSummaryResponseBodyFullRecordsRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyFullRecordsRecord self = new DescribeBackupSummaryResponseBodyFullRecordsRecord();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
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

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeBackupSummaryResponseBodyFullRecordsRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
        @NameInMap("HasMore")
        public String hasMore;

        @NameInMap("NextFullBackupDate")
        public String nextFullBackupDate;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public DescribeBackupSummaryResponseBodyFullRecords records;

        @NameInMap("Total")
        public Integer total;

        public static DescribeBackupSummaryResponseBodyFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyFull self = new DescribeBackupSummaryResponseBodyFull();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyFull setHasMore(String hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public String getHasMore() {
            return this.hasMore;
        }

        public DescribeBackupSummaryResponseBodyFull setNextFullBackupDate(String nextFullBackupDate) {
            this.nextFullBackupDate = nextFullBackupDate;
            return this;
        }
        public String getNextFullBackupDate() {
            return this.nextFullBackupDate;
        }

        public DescribeBackupSummaryResponseBodyFull setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeBackupSummaryResponseBodyFull setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupSummaryResponseBodyFull setRecords(DescribeBackupSummaryResponseBodyFullRecords records) {
            this.records = records;
            return this;
        }
        public DescribeBackupSummaryResponseBodyFullRecords getRecords() {
            return this.records;
        }

        public DescribeBackupSummaryResponseBodyFull setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeBackupSummaryResponseBodyIncr extends TeaModel {
        @NameInMap("BackupLogSize")
        public String backupLogSize;

        @NameInMap("Pos")
        public String pos;

        @NameInMap("QueueLogNum")
        public String queueLogNum;

        @NameInMap("RunningLogNum")
        public String runningLogNum;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("Status")
        public String status;

        public static DescribeBackupSummaryResponseBodyIncr build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSummaryResponseBodyIncr self = new DescribeBackupSummaryResponseBodyIncr();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSummaryResponseBodyIncr setBackupLogSize(String backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }
        public String getBackupLogSize() {
            return this.backupLogSize;
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

        public DescribeBackupSummaryResponseBodyIncr setRunningLogNum(String runningLogNum) {
            this.runningLogNum = runningLogNum;
            return this;
        }
        public String getRunningLogNum() {
            return this.runningLogNum;
        }

        public DescribeBackupSummaryResponseBodyIncr setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeBackupSummaryResponseBodyIncr setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
