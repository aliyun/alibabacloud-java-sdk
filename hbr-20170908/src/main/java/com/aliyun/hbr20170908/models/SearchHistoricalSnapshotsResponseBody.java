// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class SearchHistoricalSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of historical backup snapshots that are displayed on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that is required to obtain the next page of backup snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>BE</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The historical backup snapshots.</p>
     */
    @NameInMap("Snapshots")
    public SearchHistoricalSnapshotsResponseBodySnapshots snapshots;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned backup snapshots that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchHistoricalSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchHistoricalSnapshotsResponseBody self = new SearchHistoricalSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchHistoricalSnapshotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchHistoricalSnapshotsResponseBody setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchHistoricalSnapshotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchHistoricalSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchHistoricalSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchHistoricalSnapshotsResponseBody setSnapshots(SearchHistoricalSnapshotsResponseBodySnapshots snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public SearchHistoricalSnapshotsResponseBodySnapshots getSnapshots() {
        return this.snapshots;
    }

    public SearchHistoricalSnapshotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchHistoricalSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths extends TeaModel {
        @NameInMap("Path")
        public java.util.List<String> path;

        public static SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths build(java.util.Map<String, ?> map) throws Exception {
            SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths self = new SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths();
            return TeaModel.build(map, self);
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot extends TeaModel {
        /**
         * <p>The actual data amount of backup snapshots after duplicates are removed. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        /**
         * <p>The actual number of backup snapshots.</p>
         * <blockquote>
         * <p> This parameter is available only for file backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ActualItems")
        public Long actualItems;

        /**
         * <p>Time to archive</p>
         * 
         * <strong>example:</strong>
         * <p>1640334062</p>
         */
        @NameInMap("ArchiveTime")
        public Long archiveTime;

        /**
         * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is returned only if the <strong>SourceType</strong> parameter is set to <strong>OSS</strong>. This parameter indicates the name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-backup-oss</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The actual amount of data that is generated by incremental backups. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The total amount of data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>This parameter is returned only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the ID of the HBR client.</p>
         * 
         * <strong>example:</strong>
         * <p>c-*********************</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the backup snapshot was completed. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>This parameter is returned only if the <strong>SourceType</strong> parameter is set to <strong>NAS</strong>. This parameter indicates the time when the file system was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607436917</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The files that record the information about backup failures, including the information about partially completed backups.</p>
         * 
         * <strong>example:</strong>
         * <p>Item	Error Message C:\Program Files (x86)\Symantec\Symantec Endpoint Protection\14.3.558.0000.105\Bin\service.dat	Open: open \\?\C:\Program Files (x86)\Symantec\Symantec Endpoint Protection\14.3.558.0000.105\Bin\service.dat: The process cannot access the file because it is being used by another process. C:\ProgramData\McAfee\Agent\data\InstallerFiles\172e8a3b04b7ab0fd0215f4fb7707e3744b37d83b6743b3eacb94447c74dc9af_contrib.ini	Open: open \\?\C:\ProgramData\McAfee\Agent\data\InstallerFiles\172e8a3b04b7ab0fd0215f4fb7707e3744b37d83b6743b3eacb94447c74dc9af_contrib.ini: Access is denied.</p>
         */
        @NameInMap("ErrorFile")
        public String errorFile;

        /**
         * <p>Backup paths not included in the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;/test/example_cn-hangzhou_7.txt\&quot;, \&quot;/test/example_cn-hangzhou_1.txt\&quot;, \&quot;/test/example_cn-hangzhou_3.txt\&quot;, \&quot;/test/example_cn-hangzhou_9.txt\&quot;, \&quot;/test/example_cn-hangzhou_6.txt\&quot;]</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>The time when the snapshot expired. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640334062</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>This parameter is returned only if the <strong>SourceType</strong> parameter is set to <strong>NAS</strong>. This parameter indicates the ID of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>005494</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>Backup paths included in the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;/test/example_cn-huhehaote_3.txt\&quot;, \&quot;/test/example_cn-huhehaote_9.txt\&quot;, \&quot;/test/example_cn-huhehaote_5.txt\&quot;, \&quot;/test/example_cn-huhehaote_1.txt\&quot;, \&quot;/test/example_cn-huhehaote_7.txt\&quot;]</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-*********************</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Tablestore instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The number of objects that are backed up.</p>
         * <blockquote>
         * <p> This parameter is available only for file backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ItemsDone")
        public Long itemsDone;

        /**
         * <p>The total number of objects in the data source.</p>
         * <blockquote>
         * <p> This parameter is available only for file backup.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        /**
         * <p>The ID of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The hash value of the parent backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>f2fe..</p>
         */
        @NameInMap("ParentSnapshotHash")
        public String parentSnapshotHash;

        /**
         * <p>This parameter is returned only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the path to the files that are backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home&quot;]</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The source paths.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;/home&quot;</p>
         */
        @NameInMap("Paths")
        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths paths;

        /**
         * <p>This parameter is returned only if the <strong>SourceType</strong> parameter is set to <strong>OSS</strong>. This parameter indicates the prefix of objects that are backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>example/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The time when the backup job ended. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642521709966</p>
         */
        @NameInMap("RangeEnd")
        public Long rangeEnd;

        /**
         * <p>The time when the backup job started. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642492553038</p>
         */
        @NameInMap("RangeStart")
        public Long rangeStart;

        /**
         * <p>The retention period of the backup snapshot. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The hash value of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>f2fe...</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The ID of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-*********************</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>Parent snapshot HASH value before archiving.</p>
         * 
         * <strong>example:</strong>
         * <p>qwer***</p>
         */
        @NameInMap("SourceParentSnapshotHash")
        public String sourceParentSnapshotHash;

        /**
         * <p>Snapshot HASH value before archiving</p>
         * 
         * <strong>example:</strong>
         * <p>qwer***</p>
         */
        @NameInMap("SourceSnapshotHash")
        public String sourceSnapshotHash;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: backup snapshots for ECS files</li>
         * <li><strong>OSS</strong>: backup snapshots for OSS buckets</li>
         * <li><strong>NAS</strong>: backup snapshots for NAS file systems</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time when the backup snapshot started. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the backup job. Valid values:</p>
         * <ul>
         * <li><strong>COMPLETE</strong>: The backup job is completed.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The backup job is partially completed.</li>
         * <li><strong>FAILED</strong>: The backup job has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Storage type. Values: </p>
         * <ul>
         * <li><strong>Standard</strong>: Standard. </li>
         * <li><strong>Archive</strong>: Archive. </li>
         * <li><strong>ColdArchive</strong>: Cold Archive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The name of a table in the Tablestore instance.</p>
         * 
         * <strong>example:</strong>
         * <p>table2</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The time when the backup snapshot was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>Whether to use local NAS.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseCommonNas")
        public Boolean useCommonNas;

        /**
         * <p>The ID of the backup vault that stores the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0003rf9m17pap3ltpqx5</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot self = new SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setActualItems(Long actualItems) {
            this.actualItems = actualItems;
            return this;
        }
        public Long getActualItems() {
            return this.actualItems;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setArchiveTime(Long archiveTime) {
            this.archiveTime = archiveTime;
            return this;
        }
        public Long getArchiveTime() {
            return this.archiveTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setParentSnapshotHash(String parentSnapshotHash) {
            this.parentSnapshotHash = parentSnapshotHash;
            return this;
        }
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setPaths(SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths paths) {
            this.paths = paths;
            return this;
        }
        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshotPaths getPaths() {
            return this.paths;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setRangeEnd(Long rangeEnd) {
            this.rangeEnd = rangeEnd;
            return this;
        }
        public Long getRangeEnd() {
            return this.rangeEnd;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setRangeStart(Long rangeStart) {
            this.rangeStart = rangeStart;
            return this;
        }
        public Long getRangeStart() {
            return this.rangeStart;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setSourceParentSnapshotHash(String sourceParentSnapshotHash) {
            this.sourceParentSnapshotHash = sourceParentSnapshotHash;
            return this;
        }
        public String getSourceParentSnapshotHash() {
            return this.sourceParentSnapshotHash;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setSourceSnapshotHash(String sourceSnapshotHash) {
            this.sourceSnapshotHash = sourceSnapshotHash;
            return this;
        }
        public String getSourceSnapshotHash() {
            return this.sourceSnapshotHash;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setUseCommonNas(Boolean useCommonNas) {
            this.useCommonNas = useCommonNas;
            return this;
        }
        public Boolean getUseCommonNas() {
            return this.useCommonNas;
        }

        public SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class SearchHistoricalSnapshotsResponseBodySnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot> snapshot;

        public static SearchHistoricalSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            SearchHistoricalSnapshotsResponseBodySnapshots self = new SearchHistoricalSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public SearchHistoricalSnapshotsResponseBodySnapshots setSnapshot(java.util.List<SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<SearchHistoricalSnapshotsResponseBodySnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

}
