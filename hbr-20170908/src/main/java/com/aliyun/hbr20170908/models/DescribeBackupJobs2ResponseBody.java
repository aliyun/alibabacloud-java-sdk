// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeBackupJobs2ResponseBody extends TeaModel {
    /**
     * <p>The returned backup jobs that meet the specified conditions.</p>
     */
    @NameInMap("BackupJobs")
    public DescribeBackupJobs2ResponseBodyBackupJobs backupJobs;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned backup jobs that meet the specified conditions.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBackupJobs2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupJobs2ResponseBody self = new DescribeBackupJobs2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupJobs2ResponseBody setBackupJobs(DescribeBackupJobs2ResponseBodyBackupJobs backupJobs) {
        this.backupJobs = backupJobs;
        return this;
    }
    public DescribeBackupJobs2ResponseBodyBackupJobs getBackupJobs() {
        return this.backupJobs;
    }

    public DescribeBackupJobs2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBackupJobs2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupJobs2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupJobs2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupJobs2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupJobs2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupJobs2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList extends TeaModel {
        @NameInMap("DiskNativeSnapshotId")
        public java.util.List<String> diskNativeSnapshotId;

        public static DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList self = new DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList setDiskNativeSnapshotId(java.util.List<String> diskNativeSnapshotId) {
            this.diskNativeSnapshotId = diskNativeSnapshotId;
            return this;
        }
        public java.util.List<String> getDiskNativeSnapshotId() {
            return this.diskNativeSnapshotId;
        }

    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail extends TeaModel {
        /**
         * <p>The information about the remote replication failure.</p>
         */
        @NameInMap("DestinationNativeSnapshotErrorMessage")
        public String destinationNativeSnapshotErrorMessage;

        /**
         * <p>The ID of the remote replication snapshot.</p>
         */
        @NameInMap("DestinationNativeSnapshotId")
        public String destinationNativeSnapshotId;

        /**
         * <p>The progress of the remote replication.</p>
         */
        @NameInMap("DestinationNativeSnapshotProgress")
        public Integer destinationNativeSnapshotProgress;

        /**
         * <p>The status of the remote replication.</p>
         */
        @NameInMap("DestinationNativeSnapshotStatus")
        public String destinationNativeSnapshotStatus;

        /**
         * <p>The retention period of the remote replication backup.</p>
         */
        @NameInMap("DestinationRetention")
        public Long destinationRetention;

        /**
         * <p>The ID of the remote replication backup.</p>
         */
        @NameInMap("DestinationSnapshotId")
        public String destinationSnapshotId;

        /**
         * <p>The mapping between snapshots and disks.</p>
         */
        @NameInMap("DiskNativeSnapshotIdList")
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList diskNativeSnapshotIdList;

        /**
         * <p>Indicates whether remote replication is enabled.</p>
         */
        @NameInMap("DoCopy")
        public Boolean doCopy;

        /**
         * <p>The ID of the backup snapshot.</p>
         */
        @NameInMap("NativeSnapshotId")
        public String nativeSnapshotId;

        public static DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail self = new DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDestinationNativeSnapshotErrorMessage(String destinationNativeSnapshotErrorMessage) {
            this.destinationNativeSnapshotErrorMessage = destinationNativeSnapshotErrorMessage;
            return this;
        }
        public String getDestinationNativeSnapshotErrorMessage() {
            return this.destinationNativeSnapshotErrorMessage;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDestinationNativeSnapshotId(String destinationNativeSnapshotId) {
            this.destinationNativeSnapshotId = destinationNativeSnapshotId;
            return this;
        }
        public String getDestinationNativeSnapshotId() {
            return this.destinationNativeSnapshotId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDestinationNativeSnapshotProgress(Integer destinationNativeSnapshotProgress) {
            this.destinationNativeSnapshotProgress = destinationNativeSnapshotProgress;
            return this;
        }
        public Integer getDestinationNativeSnapshotProgress() {
            return this.destinationNativeSnapshotProgress;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDestinationNativeSnapshotStatus(String destinationNativeSnapshotStatus) {
            this.destinationNativeSnapshotStatus = destinationNativeSnapshotStatus;
            return this;
        }
        public String getDestinationNativeSnapshotStatus() {
            return this.destinationNativeSnapshotStatus;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDestinationRetention(Long destinationRetention) {
            this.destinationRetention = destinationRetention;
            return this;
        }
        public Long getDestinationRetention() {
            return this.destinationRetention;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDestinationSnapshotId(String destinationSnapshotId) {
            this.destinationSnapshotId = destinationSnapshotId;
            return this;
        }
        public String getDestinationSnapshotId() {
            return this.destinationSnapshotId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDiskNativeSnapshotIdList(DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList diskNativeSnapshotIdList) {
            this.diskNativeSnapshotIdList = diskNativeSnapshotIdList;
            return this;
        }
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetailDiskNativeSnapshotIdList getDiskNativeSnapshotIdList() {
            return this.diskNativeSnapshotIdList;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setDoCopy(Boolean doCopy) {
            this.doCopy = doCopy;
            return this;
        }
        public Boolean getDoCopy() {
            return this.doCopy;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail setNativeSnapshotId(String nativeSnapshotId) {
            this.nativeSnapshotId = nativeSnapshotId;
            return this;
        }
        public String getNativeSnapshotId() {
            return this.nativeSnapshotId;
        }

    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames extends TeaModel {
        @NameInMap("TableName")
        public java.util.List<String> tableName;

        public static DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames self = new DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames setTableName(java.util.List<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public java.util.List<String> getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail extends TeaModel {
        /**
         * <p>The names of the tables in the Tablestore instance.</p>
         */
        @NameInMap("TableNames")
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames tableNames;

        public static DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail self = new DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail setTableNames(DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetailTableNames getTableNames() {
            return this.tableNames;
        }

    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths extends TeaModel {
        @NameInMap("Path")
        public java.util.List<String> path;

        public static DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths self = new DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobsBackupJob extends TeaModel {
        /**
         * <p>The actual amount of data that is backed up after duplicates are removed. Unit: bytes.</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        @NameInMap("ActualFiles")
        public Long actualFiles;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the actual number of objects that are backed up by the backup job.</p>
         */
        @NameInMap("ActualItems")
        public Long actualItems;

        /**
         * <p>The backup type. Valid value: **COMPLETE**, which indicates full backup.</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **OSS**. This parameter indicates the name of the OSS bucket that is backed up.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The actual amount of data that is generated by incremental backups. Unit: bytes.</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The total amount of data that is backed up from the data source. Unit: bytes.</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        @NameInMap("ChangeListPath")
        public String changeListPath;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the ID of the HBR client.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the backup job was completed. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **NAS**. This parameter indicates the time when the file system was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the backup job was created. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <br>
         * <p>*   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</p>
         * <p>*   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        @NameInMap("DestDataSourceDetail")
        public String destDataSourceDetail;

        @NameInMap("DestDataSourceId")
        public String destDataSourceId;

        @NameInMap("DestSourceType")
        public String destSourceType;

        /**
         * <p>The details of the ECS instance backup job.</p>
         */
        @NameInMap("Detail")
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail detail;

        /**
         * <p>The error message that is returned for the backup job.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the paths to the files that are excluded from the backup job. The value must be 1 to 255 characters in length.</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **NAS**. This parameter indicates the ID of the NAS file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FilesDone")
        public Long filesDone;

        @NameInMap("FilesTotal")
        public Long filesTotal;

        /**
         * <p>仅SourceType=CONTAINER时返回，表示容器备份任务备份的集群标识。当集群类型为阿里云容器服务Kubernetes集群时，该值为Kubernetes集群ID。</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The paths to the files that are included in the backup job.</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **NAS**. This parameter indicates the ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Tablestore instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the number of objects that are backed up.</p>
         */
        @NameInMap("ItemsDone")
        public Long itemsDone;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the total number of objects in the data source.</p>
         */
        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        /**
         * <p>The ID of the backup job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the backup job.</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a source path.</p>
         * <br>
         * <p>*   This parameter is available only for Windows ECS instances.</p>
         * <p>*   If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to `["UseVSS":true]`.</p>
         * <p>*   If you use VSS, you cannot back up data from multiple directories.</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The details of the Tablestore instance.</p>
         */
        @NameInMap("OtsDetail")
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail otsDetail;

        /**
         * <p>The source paths.</p>
         */
        @NameInMap("Paths")
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths paths;

        /**
         * <p>The ID of the backup plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **OSS**. This parameter indicates the prefix of objects that are backed up.</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The backup progress. For example, 10000 indicates that the progress is 100%.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   **ECS_FILE**: ECS files</p>
         * <p>*   **OSS**: OSS buckets</p>
         * <p>*   **NAS**: NAS file systems</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The average speed at which data is backed up. Unit: KB/s.</p>
         */
        @NameInMap("Speed")
        public Long speed;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the throttling rules. Format: `{start}|{end}|{bandwidth}`. Separate multiple throttling rules with vertical bars (`|`). A specified time range cannot overlap with another one.</p>
         * <br>
         * <p>*   **start**: the start hour.</p>
         * <p>*   **end**: the end hour.</p>
         * <p>*   **bandwidth**: the bandwidth. Unit: KB/s.</p>
         */
        @NameInMap("SpeedLimit")
        public String speedLimit;

        /**
         * <p>The time when the backup job started. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The name of a table in the Tablestore instance.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The time when the backup job was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the backup vault.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeBackupJobs2ResponseBodyBackupJobsBackupJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobsBackupJob self = new DescribeBackupJobs2ResponseBodyBackupJobsBackupJob();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setActualFiles(Long actualFiles) {
            this.actualFiles = actualFiles;
            return this;
        }
        public Long getActualFiles() {
            return this.actualFiles;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setActualItems(Long actualItems) {
            this.actualItems = actualItems;
            return this;
        }
        public Long getActualItems() {
            return this.actualItems;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setChangeListPath(String changeListPath) {
            this.changeListPath = changeListPath;
            return this;
        }
        public String getChangeListPath() {
            return this.changeListPath;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setDestDataSourceDetail(String destDataSourceDetail) {
            this.destDataSourceDetail = destDataSourceDetail;
            return this;
        }
        public String getDestDataSourceDetail() {
            return this.destDataSourceDetail;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setDestDataSourceId(String destDataSourceId) {
            this.destDataSourceId = destDataSourceId;
            return this;
        }
        public String getDestDataSourceId() {
            return this.destDataSourceId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setDestSourceType(String destSourceType) {
            this.destSourceType = destSourceType;
            return this;
        }
        public String getDestSourceType() {
            return this.destSourceType;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setDetail(DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobDetail getDetail() {
            return this.detail;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setFilesDone(Long filesDone) {
            this.filesDone = filesDone;
            return this;
        }
        public Long getFilesDone() {
            return this.filesDone;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setFilesTotal(Long filesTotal) {
            this.filesTotal = filesTotal;
            return this;
        }
        public Long getFilesTotal() {
            return this.filesTotal;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setOtsDetail(DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail otsDetail) {
            this.otsDetail = otsDetail;
            return this;
        }
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobOtsDetail getOtsDetail() {
            return this.otsDetail;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setPaths(DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths paths) {
            this.paths = paths;
            return this;
        }
        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJobPaths getPaths() {
            return this.paths;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setSpeed(Long speed) {
            this.speed = speed;
            return this;
        }
        public Long getSpeed() {
            return this.speed;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setSpeedLimit(String speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }
        public String getSpeedLimit() {
            return this.speedLimit;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeBackupJobs2ResponseBodyBackupJobsBackupJob setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribeBackupJobs2ResponseBodyBackupJobs extends TeaModel {
        @NameInMap("BackupJob")
        public java.util.List<DescribeBackupJobs2ResponseBodyBackupJobsBackupJob> backupJob;

        public static DescribeBackupJobs2ResponseBodyBackupJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupJobs2ResponseBodyBackupJobs self = new DescribeBackupJobs2ResponseBodyBackupJobs();
            return TeaModel.build(map, self);
        }

        public DescribeBackupJobs2ResponseBodyBackupJobs setBackupJob(java.util.List<DescribeBackupJobs2ResponseBodyBackupJobsBackupJob> backupJob) {
            this.backupJob = backupJob;
            return this;
        }
        public java.util.List<DescribeBackupJobs2ResponseBodyBackupJobsBackupJob> getBackupJob() {
            return this.backupJob;
        }

    }

}
