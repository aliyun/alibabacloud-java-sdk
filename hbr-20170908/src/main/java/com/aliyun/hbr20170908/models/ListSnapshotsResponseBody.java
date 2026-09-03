// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The return message. The value &quot;successful&quot; is returned for successful requests. An error message is returned for failed requests.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next page. An empty NextToken indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>aWQj********MCMy</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17189276-<strong><strong>-</strong></strong>-****-0FF51B5A41A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of backup points.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<ListSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponseBody self = new ListSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSnapshotsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSnapshotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotsResponseBody setSnapshots(java.util.List<ListSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public ListSnapshotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The actual amount of data written, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        /**
         * <p>The actual number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ActualItems")
        public Long actualItems;

        /**
         * <p>The time when the backup was archived.</p>
         * 
         * <strong>example:</strong>
         * <p>1640334062</p>
         */
        @NameInMap("ArchiveTime")
        public Long archiveTime;

        /**
         * <p>The backup type. The value is <strong>COMPLETE</strong>, which indicates a full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The amount of data that has been backed up, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The total amount of data to back up, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>When <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>, this parameter indicates the backup client ID. In other cases, it indicates the ID of the backup data source.</p>
         * 
         * <strong>example:</strong>
         * <p>c-*********************</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The backup completion time. A UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642496679</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The time when the backup point was created, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607436917</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the backup was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1642496679</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The file that records backup failure information, including information about partially completed backups.</p>
         * 
         * <strong>example:</strong>
         * <p>temp/report/123456789/job-xxxxxxxxx_failed.zip</p>
         */
        @NameInMap("ErrorFile")
        public String errorFile;

        /**
         * <p>The source paths excluded from the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;/test/example_cn-hangzhou_7.txt\&quot;, \&quot;/test/example_cn-hangzhou_1.txt\&quot;, \&quot;/test/example_cn-hangzhou_3.txt\&quot;, \&quot;/test/example_cn-hangzhou_9.txt\&quot;, \&quot;/test/example_cn-hangzhou_6.txt\&quot;]</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>The backup expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1771901707</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The source paths included in the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;/test/example_cn-huhehaote_3.txt\&quot;, \&quot;/test/example_cn-huhehaote_9.txt\&quot;, \&quot;/test/example_cn-huhehaote_5.txt\&quot;, \&quot;/test/example_cn-huhehaote_1.txt\&quot;, \&quot;/test/example_cn-huhehaote_7.txt\&quot;]</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>The instance ID of the backup data source.</p>
         * 
         * <strong>example:</strong>
         * <p>i-*********************</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Tablestore instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The number of nodes that have been backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ItemsDone")
        public Long itemsDone;

        /**
         * <p>The total number of nodes to back up.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        /**
         * <p>The backup job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-00030j3chkt******2</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The source path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The list of source paths.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The backup plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>po-123***7890</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The protected source data size, in bytes. When SourceType is set to ECS_FILE, this indicates the protected cloud disk capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        @NameInMap("ProtectedDataSize")
        public Long protectedDataSize;

        /**
         * <p>The end time of the Tablestore backup job execution. A UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642521709966</p>
         */
        @NameInMap("RangeEnd")
        public Long rangeEnd;

        /**
         * <p>The start time of the Tablestore backup job execution. A UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642492553038</p>
         */
        @NameInMap("RangeStart")
        public Long rangeStart;

        /**
         * <p>The retention period of the backup, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The hash value of the backup point.</p>
         * 
         * <strong>example:</strong>
         * <p>f2ac5fd243**********************bc4451777be019</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The backup point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-00047mxg17p26*****b</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: ECS file backup</li>
         * <li><strong>File</strong>: On-premises file backup</li>
         * <li><strong>OSS</strong>: OSS backup</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup</li>
         * <li><strong>COMMON_NAS</strong>: On-premises NAS backup</li>
         * <li><strong>CONTAINER</strong>: Container backup</li>
         * <li><strong>OTS_TABLE</strong>: Tablestore backup</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The backup point status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The name of the data table in the Tablestore instance.</p>
         * 
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the vault that stores the backup data.</p>
         * 
         * <strong>example:</strong>
         * <p>v-00030j*******sn</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static ListSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodySnapshots self = new ListSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodySnapshots setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public ListSnapshotsResponseBodySnapshots setActualItems(Long actualItems) {
            this.actualItems = actualItems;
            return this;
        }
        public Long getActualItems() {
            return this.actualItems;
        }

        public ListSnapshotsResponseBodySnapshots setArchiveTime(Long archiveTime) {
            this.archiveTime = archiveTime;
            return this;
        }
        public Long getArchiveTime() {
            return this.archiveTime;
        }

        public ListSnapshotsResponseBodySnapshots setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public ListSnapshotsResponseBodySnapshots setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public ListSnapshotsResponseBodySnapshots setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public ListSnapshotsResponseBodySnapshots setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListSnapshotsResponseBodySnapshots setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public ListSnapshotsResponseBodySnapshots setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSnapshotsResponseBodySnapshots setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListSnapshotsResponseBodySnapshots setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public ListSnapshotsResponseBodySnapshots setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public ListSnapshotsResponseBodySnapshots setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListSnapshotsResponseBodySnapshots setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public ListSnapshotsResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSnapshotsResponseBodySnapshots setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListSnapshotsResponseBodySnapshots setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public ListSnapshotsResponseBodySnapshots setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public ListSnapshotsResponseBodySnapshots setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSnapshotsResponseBodySnapshots setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListSnapshotsResponseBodySnapshots setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public ListSnapshotsResponseBodySnapshots setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListSnapshotsResponseBodySnapshots setProtectedDataSize(Long protectedDataSize) {
            this.protectedDataSize = protectedDataSize;
            return this;
        }
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        public ListSnapshotsResponseBodySnapshots setRangeEnd(Long rangeEnd) {
            this.rangeEnd = rangeEnd;
            return this;
        }
        public Long getRangeEnd() {
            return this.rangeEnd;
        }

        public ListSnapshotsResponseBodySnapshots setRangeStart(Long rangeStart) {
            this.rangeStart = rangeStart;
            return this;
        }
        public Long getRangeStart() {
            return this.rangeStart;
        }

        public ListSnapshotsResponseBodySnapshots setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public ListSnapshotsResponseBodySnapshots setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public ListSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListSnapshotsResponseBodySnapshots setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotsResponseBodySnapshots setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public ListSnapshotsResponseBodySnapshots setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListSnapshotsResponseBodySnapshots setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
