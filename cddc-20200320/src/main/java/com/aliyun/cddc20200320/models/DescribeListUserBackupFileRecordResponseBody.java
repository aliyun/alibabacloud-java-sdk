// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeListUserBackupFileRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Records")
    public java.util.List<DescribeListUserBackupFileRecordResponseBodyRecords> records;

    public static DescribeListUserBackupFileRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListUserBackupFileRecordResponseBody self = new DescribeListUserBackupFileRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListUserBackupFileRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListUserBackupFileRecordResponseBody setRecords(java.util.List<DescribeListUserBackupFileRecordResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeListUserBackupFileRecordResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeListUserBackupFileRecordResponseBodyRecords extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("OssFilePath")
        public String ossFilePath;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("OssFileName")
        public String ossFileName;

        @NameInMap("OssFileSize")
        public Long ossFileSize;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("BinlogInfo")
        public String binlogInfo;

        @NameInMap("CustinsId")
        public String custinsId;

        @NameInMap("OssFileMetaData")
        public String ossFileMetaData;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Uid")
        public String uid;

        public static DescribeListUserBackupFileRecordResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeListUserBackupFileRecordResponseBodyRecords self = new DescribeListUserBackupFileRecordResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setOssFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setOssFileSize(Long ossFileSize) {
            this.ossFileSize = ossFileSize;
            return this;
        }
        public Long getOssFileSize() {
            return this.ossFileSize;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setBinlogInfo(String binlogInfo) {
            this.binlogInfo = binlogInfo;
            return this;
        }
        public String getBinlogInfo() {
            return this.binlogInfo;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setCustinsId(String custinsId) {
            this.custinsId = custinsId;
            return this;
        }
        public String getCustinsId() {
            return this.custinsId;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setOssFileMetaData(String ossFileMetaData) {
            this.ossFileMetaData = ossFileMetaData;
            return this;
        }
        public String getOssFileMetaData() {
            return this.ossFileMetaData;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeListUserBackupFileRecordResponseBodyRecords setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
