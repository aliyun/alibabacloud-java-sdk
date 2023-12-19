// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeOtsTableSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of backup snapshots that are displayed on the current page.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The returned message. If the request was successful, "successful" is returned. If the request failed, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that is required to obtain the next page of backup snapshots.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The backup snapshots.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<DescribeOtsTableSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOtsTableSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOtsTableSnapshotsResponseBody self = new DescribeOtsTableSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOtsTableSnapshotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOtsTableSnapshotsResponseBody setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeOtsTableSnapshotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOtsTableSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOtsTableSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOtsTableSnapshotsResponseBody setSnapshots(java.util.List<DescribeOtsTableSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeOtsTableSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public DescribeOtsTableSnapshotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOtsTableSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The actual data amount of backup snapshots after duplicates are removed. Unit: bytes.</p>
         */
        @NameInMap("ActualBytes")
        public String actualBytes;

        /**
         * <p>The backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The total amount of data. Unit: bytes.</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>The time when the backup snapshot was completed. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The time when the Tablestore instance was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the Tablestore instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the backup job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The hash value of the parent backup snapshot.</p>
         */
        @NameInMap("ParentSnapshotHash")
        public String parentSnapshotHash;

        /**
         * <p>The time when the backup job ended. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("RangeEnd")
        public Long rangeEnd;

        /**
         * <p>The time when the backup job started. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("RangeStart")
        public Long rangeStart;

        /**
         * <p>The retention period of the backup snapshot. Unit: days.</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The hash value of the backup snapshot.</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The ID of the backup snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   **ECS_FILE**: backup snapshots for Elastic Compute Service (ECS) files</p>
         * <p>*   **OSS**: backup snapshots for Object Storage Service (OSS) buckets</p>
         * <p>*   **NAS**: backup snapshots for Apsara File Storage NAS file systems</p>
         * <p>*   **OTS_TABLE**: backup snapshots for Tablestore instances</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time when the backup snapshot started. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the backup job. Valid values:</p>
         * <br>
         * <p>*   **COMPLETE**: The backup job is completed.</p>
         * <p>*   **PARTIAL_COMPLETE**: The backup job is partially completed.</p>
         * <p>*   **FAILED**: The backup job has failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the table in the Tablestore instance.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The time when the backup snapshot was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the backup vault that stores the backup snapshot.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeOtsTableSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeOtsTableSnapshotsResponseBodySnapshots self = new DescribeOtsTableSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setActualBytes(String actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public String getActualBytes() {
            return this.actualBytes;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setParentSnapshotHash(String parentSnapshotHash) {
            this.parentSnapshotHash = parentSnapshotHash;
            return this;
        }
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setRangeEnd(Long rangeEnd) {
            this.rangeEnd = rangeEnd;
            return this;
        }
        public Long getRangeEnd() {
            return this.rangeEnd;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setRangeStart(Long rangeStart) {
            this.rangeStart = rangeStart;
            return this;
        }
        public Long getRangeStart() {
            return this.rangeStart;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeOtsTableSnapshotsResponseBodySnapshots setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
