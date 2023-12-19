// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobs2ResponseBody extends TeaModel {
    /**
     * <p>The response status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message. If the request was successful, "successful" is returned. If the request failed, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the restore jobs.</p>
     */
    @NameInMap("RestoreJobs")
    public DescribeRestoreJobs2ResponseBodyRestoreJobs restoreJobs;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRestoreJobs2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobs2ResponseBody self = new DescribeRestoreJobs2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobs2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRestoreJobs2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRestoreJobs2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRestoreJobs2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreJobs2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreJobs2ResponseBody setRestoreJobs(DescribeRestoreJobs2ResponseBodyRestoreJobs restoreJobs) {
        this.restoreJobs = restoreJobs;
        return this;
    }
    public DescribeRestoreJobs2ResponseBodyRestoreJobs getRestoreJobs() {
        return this.restoreJobs;
    }

    public DescribeRestoreJobs2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRestoreJobs2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail extends TeaModel {
        /**
         * <p>The number of channels processed by each Tablestore restore job.</p>
         */
        @NameInMap("BatchChannelCount")
        public Integer batchChannelCount;

        /**
         * <p>Indicates whether the existing Tablestore restore job was overwritten.</p>
         */
        @NameInMap("OverwriteExisting")
        public Boolean overwriteExisting;

        public static DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail self = new DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail setBatchChannelCount(Integer batchChannelCount) {
            this.batchChannelCount = batchChannelCount;
            return this;
        }
        public Integer getBatchChannelCount() {
            return this.batchChannelCount;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail setOverwriteExisting(Boolean overwriteExisting) {
            this.overwriteExisting = overwriteExisting;
            return this;
        }
        public Boolean getOverwriteExisting() {
            return this.overwriteExisting;
        }

    }

    public static class DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport extends TeaModel {
        @NameInMap("FailedFiles")
        public String failedFiles;

        @NameInMap("ReportTaskStatus")
        public String reportTaskStatus;

        @NameInMap("SkippedFiles")
        public String skippedFiles;

        @NameInMap("SuccessFiles")
        public String successFiles;

        @NameInMap("TotalFiles")
        public String totalFiles;

        public static DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport self = new DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport setFailedFiles(String failedFiles) {
            this.failedFiles = failedFiles;
            return this;
        }
        public String getFailedFiles() {
            return this.failedFiles;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport setReportTaskStatus(String reportTaskStatus) {
            this.reportTaskStatus = reportTaskStatus;
            return this;
        }
        public String getReportTaskStatus() {
            return this.reportTaskStatus;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport setSkippedFiles(String skippedFiles) {
            this.skippedFiles = skippedFiles;
            return this;
        }
        public String getSkippedFiles() {
            return this.skippedFiles;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport setSuccessFiles(String successFiles) {
            this.successFiles = successFiles;
            return this;
        }
        public String getSuccessFiles() {
            return this.successFiles;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport setTotalFiles(String totalFiles) {
            this.totalFiles = totalFiles;
            return this;
        }
        public String getTotalFiles() {
            return this.totalFiles;
        }

    }

    public static class DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob extends TeaModel {
        /**
         * <p>The actual amount of data that is restored after duplicates are removed. Unit: bytes.</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        /**
         * <p>This parameter is valid only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the actual number of objects that are restored by the restore job.</p>
         */
        @NameInMap("ActualItems")
        public Long actualItems;

        /**
         * <p>The amount of data that was restored. Unit: bytes.</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The total amount of data that is backed up from the data source. Unit: bytes.</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>The ID of the client group used for restoration.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the restore job was completed. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The time when the restore job was created. The value is a UNIX timestamp. Unit: seconds.</p>
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

        /**
         * <p>The list of the files that failed to be restored.</p>
         */
        @NameInMap("ErrorFile")
        public String errorFile;

        /**
         * <p>The error message that is returned for the restore job.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the paths to the files that are excluded from the restore job. The value can be 1 to 255 characters in length.</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>The time when the restore job expires.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("FailbackDetail")
        public String failbackDetail;

        /**
         * <p>The paths to the files that are included in the restore job.</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>This parameter is valid only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the number of restored objects.</p>
         */
        @NameInMap("ItemsDone")
        public Long itemsDone;

        /**
         * <p>This parameter is valid only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates the total number of objects in the data source.</p>
         */
        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        @NameInMap("MeteringBytesDone")
        public Long meteringBytesDone;

        @NameInMap("MeteringBytesTotal")
        public Long meteringBytesTotal;

        /**
         * <p>This parameter is returned only if the **SourceType** parameter is set to **ECS_FILE**. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a restoration path.</p>
         * <br>
         * <p>*   This parameter is available only for Windows ECS instances.</p>
         * <p>*   If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to `["UseVSS":true]`.</p>
         * <p>*   If you use VSS, you cannot restore data from multiple directories.</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The details about the Tablestore instance.</p>
         */
        @NameInMap("OtsDetail")
        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail otsDetail;

        /**
         * <p>The ID of the parent job.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The progress of the restore job. For example, 10000 indicates that the progress is 100%.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Report")
        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport report;

        /**
         * <p>The ID of the restore job.</p>
         */
        @NameInMap("RestoreId")
        public String restoreId;

        /**
         * <p>The type of the restore job.</p>
         */
        @NameInMap("RestoreType")
        public String restoreType;

        /**
         * <p>The hash value of the backup snapshot.</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The ID of the snapshot used for restoration.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   **ECS_FILE**: ECS files</p>
         * <p>*   **OSS**: OSS buckets</p>
         * <p>*   **NAS**: NAS file systems</p>
         * <p>*   **OTS_TABLE**: Tablestore instances</p>
         * <p>*   **UDM_ECS**: ECS instances</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The average speed at which data is backed up. Unit: KB/s.</p>
         */
        @NameInMap("Speed")
        public Long speed;

        /**
         * <p>The time when the restore job starts. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the restore job. Valid values:</p>
         * <br>
         * <p>*   **COMPLETE**: The restore job is completed.</p>
         * <p>*   **PARTIAL_COMPLETE**: The restore job is partially completed.</p>
         * <p>*   **FAILED**: The restore job has failed.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The name of the destination OSS bucket. This parameter is returned only for OSS buckets.</p>
         */
        @NameInMap("TargetBucket")
        public String targetBucket;

        /**
         * <p>The ID of the destination client.</p>
         */
        @NameInMap("TargetClientId")
        public String targetClientId;

        /**
         * <p>This parameter is returned only for NAS file systems. This parameter indicates the time when the file system was created.</p>
         */
        @NameInMap("TargetCreateTime")
        public Long targetCreateTime;

        /**
         * <p>The ID of the destination data source.</p>
         */
        @NameInMap("TargetDataSourceId")
        public String targetDataSourceId;

        /**
         * <p>The ID of the destination NAS file system. This parameter is returned only for NAS file systems.</p>
         */
        @NameInMap("TargetFileSystemId")
        public String targetFileSystemId;

        /**
         * <p>The ID of the destination instance for the restore job.</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The name of the destination Tablestore instance.</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The destination file path of the restore job.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The prefix of the objects that are restored. This parameter is returned only for OSS buckets.</p>
         */
        @NameInMap("TargetPrefix")
        public String targetPrefix;

        /**
         * <p>The name of the destination table in the Tablestore instance.</p>
         */
        @NameInMap("TargetTableName")
        public String targetTableName;

        /**
         * <p>The time when the Tablestore instance was backed up. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("TargetTime")
        public Long targetTime;

        /**
         * <p>The details about ECS instance backup.</p>
         */
        @NameInMap("UdmDetail")
        public String udmDetail;

        /**
         * <p>The time when the restore job was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the backup vault.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob self = new DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setActualBytes(Long actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public Long getActualBytes() {
            return this.actualBytes;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setActualItems(Long actualItems) {
            this.actualItems = actualItems;
            return this;
        }
        public Long getActualItems() {
            return this.actualItems;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setBytesDone(Long bytesDone) {
            this.bytesDone = bytesDone;
            return this;
        }
        public Long getBytesDone() {
            return this.bytesDone;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setFailbackDetail(String failbackDetail) {
            this.failbackDetail = failbackDetail;
            return this;
        }
        public String getFailbackDetail() {
            return this.failbackDetail;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setItemsDone(Long itemsDone) {
            this.itemsDone = itemsDone;
            return this;
        }
        public Long getItemsDone() {
            return this.itemsDone;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setItemsTotal(Long itemsTotal) {
            this.itemsTotal = itemsTotal;
            return this;
        }
        public Long getItemsTotal() {
            return this.itemsTotal;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setMeteringBytesDone(Long meteringBytesDone) {
            this.meteringBytesDone = meteringBytesDone;
            return this;
        }
        public Long getMeteringBytesDone() {
            return this.meteringBytesDone;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setMeteringBytesTotal(Long meteringBytesTotal) {
            this.meteringBytesTotal = meteringBytesTotal;
            return this;
        }
        public Long getMeteringBytesTotal() {
            return this.meteringBytesTotal;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setOtsDetail(DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail otsDetail) {
            this.otsDetail = otsDetail;
            return this;
        }
        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobOtsDetail getOtsDetail() {
            return this.otsDetail;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setReport(DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport report) {
            this.report = report;
            return this;
        }
        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport getReport() {
            return this.report;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setRestoreId(String restoreId) {
            this.restoreId = restoreId;
            return this;
        }
        public String getRestoreId() {
            return this.restoreId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setRestoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }
        public String getRestoreType() {
            return this.restoreType;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setSpeed(Long speed) {
            this.speed = speed;
            return this;
        }
        public Long getSpeed() {
            return this.speed;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetBucket(String targetBucket) {
            this.targetBucket = targetBucket;
            return this;
        }
        public String getTargetBucket() {
            return this.targetBucket;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetClientId(String targetClientId) {
            this.targetClientId = targetClientId;
            return this;
        }
        public String getTargetClientId() {
            return this.targetClientId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetCreateTime(Long targetCreateTime) {
            this.targetCreateTime = targetCreateTime;
            return this;
        }
        public Long getTargetCreateTime() {
            return this.targetCreateTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetDataSourceId(String targetDataSourceId) {
            this.targetDataSourceId = targetDataSourceId;
            return this;
        }
        public String getTargetDataSourceId() {
            return this.targetDataSourceId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetFileSystemId(String targetFileSystemId) {
            this.targetFileSystemId = targetFileSystemId;
            return this;
        }
        public String getTargetFileSystemId() {
            return this.targetFileSystemId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetPrefix(String targetPrefix) {
            this.targetPrefix = targetPrefix;
            return this;
        }
        public String getTargetPrefix() {
            return this.targetPrefix;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setTargetTime(Long targetTime) {
            this.targetTime = targetTime;
            return this;
        }
        public Long getTargetTime() {
            return this.targetTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setUdmDetail(String udmDetail) {
            this.udmDetail = udmDetail;
            return this;
        }
        public String getUdmDetail() {
            return this.udmDetail;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribeRestoreJobs2ResponseBodyRestoreJobs extends TeaModel {
        @NameInMap("RestoreJob")
        public java.util.List<DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob> restoreJob;

        public static DescribeRestoreJobs2ResponseBodyRestoreJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreJobs2ResponseBodyRestoreJobs self = new DescribeRestoreJobs2ResponseBodyRestoreJobs();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreJobs2ResponseBodyRestoreJobs setRestoreJob(java.util.List<DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob> restoreJob) {
            this.restoreJob = restoreJob;
            return this;
        }
        public java.util.List<DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob> getRestoreJob() {
            return this.restoreJob;
        }

    }

}
