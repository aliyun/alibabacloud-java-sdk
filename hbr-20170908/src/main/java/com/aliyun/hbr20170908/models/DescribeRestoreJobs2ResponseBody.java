// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobs2ResponseBody extends TeaModel {
    /**
     * <p>The response status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried restore jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;RestoreJob\&quot;: []}</p>
     */
    @NameInMap("RestoreJobs")
    public DescribeRestoreJobs2ResponseBodyRestoreJobs restoreJobs;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BatchChannelCount")
        public Integer batchChannelCount;

        /**
         * <p>Indicates whether the existing Tablestore restore job was overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
        /**
         * <p>The files that failed to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>/temp/report/158975xxxxxx4625/r-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_failed.zip</p>
         */
        @NameInMap("FailedFiles")
        public String failedFiles;

        /**
         * <p>The status of the report generation.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("ReportTaskStatus")
        public String reportTaskStatus;

        /**
         * <p>The skipped files.</p>
         * 
         * <strong>example:</strong>
         * <p>/temp/report/158975xxxxxx4625/r-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_skipped.zip</p>
         */
        @NameInMap("SkippedFiles")
        public String skippedFiles;

        /**
         * <p>The files that are successfully executed.</p>
         * 
         * <strong>example:</strong>
         * <p>/temp/report/158975xxxxxx4625/r-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_success.zip</p>
         */
        @NameInMap("SuccessFiles")
        public String successFiles;

        /**
         * <p>The full files that are restored based on the file list.</p>
         * 
         * <strong>example:</strong>
         * <p>/temp/report/158975xxxxxx4625/job-0001hfxxxxxymsspjjtl/job-0001hfxxxxxymsspjjtl_total.csv</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ActualBytes")
        public Long actualBytes;

        /**
         * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the actual number of objects that are restored by the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ActualItems")
        public Long actualItems;

        /**
         * <p>The amount of data that was restored. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("BytesDone")
        public Long bytesDone;

        /**
         * <p>The total amount of data that was backed up from the data source. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>The ID of the client group used for restoration.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000******hp6</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the restore job was completed. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The time when the restore job was created. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>BackupRole</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
         * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELF_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxxx4625</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The files that failed to be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;test.csv&quot;</p>
         */
        @NameInMap("ErrorFile")
        public String errorFile;

        /**
         * <p>The error message that is returned for the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>PARTIAL_COMPLETE</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the paths to the files that are excluded from the restore job. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>The time when the restore job expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1634714531</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The details about the VMware failback task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpu&quot;:4,&quot;extra&quot;:&quot;{\&quot;restoreVMNamePrefix\&quot;:\&quot;627-\&quot;,\&quot;dataCenterName\&quot;:\&quot;SDDC-Datacenter\&quot;,\&quot;dataStoreId\&quot;:\&quot;datastore-50\&quot;,\&quot;folderId\&quot;:\&quot;group-v49\&quot;,\&quot;resourcePoolId\&quot;:\&quot;resgroup-46\&quot;,\&quot;locationName\&quot;:\&quot;vcenter.pc-uf600arcwi9td3eyj641.acvs.aliyuncs.com/SDDC-Datacenter/Workloads\&quot;,\&quot;computeResourceName\&quot;:\&quot;SDDC-Datacenter/Default_c-uf600arcwi9td3eyj640\&quot;,\&quot;dataStoreName\&quot;:\&quot;Default_c-uf600arcwi9td3eyj640/WorkloadDatastore\&quot;,\&quot;networkMoReference\&quot;:\&quot;DistributedVirtualPortgroup:dvportgroup-1001\&quot;,\&quot;useHotAdd\&quot;:false}&quot;,&quot;instanceId&quot;:&quot;i-2vc357i2eannmmotcagz&quot;,&quot;memoryInMB&quot;:8192,&quot;serverId&quot;:&quot;0fdc0c86-eb92-4e05-91ab-eeaf9fb6ad01&quot;,&quot;uefiBoot&quot;:false}</p>
         */
        @NameInMap("FailbackDetail")
        public String failbackDetail;

        /**
         * <p>The paths to the files that are included in the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the number of restored objects.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ItemsDone")
        public Long itemsDone;

        /**
         * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates the total number of objects in the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ItemsTotal")
        public Long itemsTotal;

        /**
         * <p>The amount of data that was restored. Unit: bytes. This parameter is valid only if the StorageClass parameter is set to ARCHIVE. The minimum billable size of the data stored at the Archive tier is 1 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("MeteringBytesDone")
        public Long meteringBytesDone;

        /**
         * <p>The total amount of data that was backed up from the data source. Unit: bytes. This parameter is valid only if the StorageClass parameter is set to ARCHIVE. The minimum billable size of the data stored at the Archive tier is 1 MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("MeteringBytesTotal")
        public Long meteringBytesTotal;

        /**
         * <p>This parameter is valid only if the <strong>SourceType</strong> parameter is set to <strong>ECS_FILE</strong>. This parameter indicates whether Windows Volume Shadow Copy Service (VSS) is used to define a restoration path.</p>
         * <ul>
         * <li>This parameter is available only for Windows ECS instances.</li>
         * <li>If data changes occur in the backup source, the source data must be the same as the data to be backed up before you can set this parameter to <code>[&quot;UseVSS&quot;:true]</code>.</li>
         * <li>If you use VSS, you cannot restore data from multiple directories.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;UseVSS&quot;:false}</p>
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
         * 
         * <strong>example:</strong>
         * <p>r-0003hd2an3x4dyv0l18b</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The progress of the restore job. Valid values: [0,10000]. For example, 10000 indicates that the progress is 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The report of the restore job.</p>
         */
        @NameInMap("Report")
        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJobReport report;

        /**
         * <p>The ID of the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>r-0003*****8a</p>
         */
        @NameInMap("RestoreId")
        public String restoreId;

        /**
         * <p>The type of the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("RestoreType")
        public String restoreType;

        /**
         * <p>The hash value of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>f2fe...</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The ID of the snapshot used for restoration.</p>
         * 
         * <strong>example:</strong>
         * <p>s-0002******ga88</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: ECS files</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
         * <li><strong>NAS</strong>: Apsara File Storage NAS (NAS) file systems</li>
         * <li><strong>OTS_TABLE</strong>: Tablestore instances</li>
         * <li><strong>UDM_ECS</strong>: ECS instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The average speed at which data is backed up. Unit: KB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Speed")
        public Long speed;

        /**
         * <p>The time when the restore job started. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the restore job. Valid values:</p>
         * <ul>
         * <li><strong>COMPLETE</strong>: The job is completed.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The job is partially completed.</li>
         * <li><strong>FAILED</strong>: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage class of the backup data. Valid values:</p>
         * <ul>
         * <li><strong>STANDARD</strong></li>
         * <li><strong>ARCHIVE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The name of the destination OSS bucket. This parameter is returned only for OSS buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>target-bucket</p>
         */
        @NameInMap("TargetBucket")
        public String targetBucket;

        /**
         * <p>The ID of the destination client.</p>
         * 
         * <strong>example:</strong>
         * <p>c-000e*****397</p>
         */
        @NameInMap("TargetClientId")
        public String targetClientId;

        /**
         * <p>The time when the file system was created. This parameter is returned only for NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>1634714531</p>
         */
        @NameInMap("TargetCreateTime")
        public Long targetCreateTime;

        /**
         * <p>The ID of the destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-000*****997</p>
         */
        @NameInMap("TargetDataSourceId")
        public String targetDataSourceId;

        /**
         * <p>The ID of the destination NAS file system. This parameter is returned only for NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>0be9****9c9</p>
         */
        @NameInMap("TargetFileSystemId")
        public String targetFileSystemId;

        /**
         * <p>The ID of the destination instance for the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze3m7ktcgw******cs</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The name of the destination Tablestore instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The destination file path of the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;D:\\rebk&quot;</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The prefix of the objects that are restored. This parameter is returned only for OSS buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;/target&quot;</p>
         */
        @NameInMap("TargetPrefix")
        public String targetPrefix;

        /**
         * <p>The name of the destination table in the Tablestore instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tablename</p>
         */
        @NameInMap("TargetTableName")
        public String targetTableName;

        /**
         * <p>The time when the Tablestore instance was backed up. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642560261</p>
         */
        @NameInMap("TargetTime")
        public Long targetTime;

        /**
         * <p>The details about Elastic Compute Service (ECS) instance backup.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;doCopy\&quot;:true,\&quot;doBackup\&quot;:false,\&quot;instanceName\&quot;:\&quot;instance example\&quot;,\&quot;appConsistent\&quot;:false,\&quot;destinationRegionId\&quot;:\&quot;cn-shanghai\&quot;,\&quot;enableFsFreeze\&quot;:true,\&quot;osNameEn\&quot;:\&quot;Windows Server  2019 Data Center Edition 64bit Chinese Edition\&quot;,\&quot;osName\&quot;:\&quot;Windows Server  2019 Data Center Edition 64bit Chinese Edition\&quot;,\&quot;diskIdList\&quot;:[],\&quot;backupVaultId\&quot;:\&quot;\&quot;,\&quot;snapshotGroup\&quot;:true,\&quot;destinationRetention\&quot;:35,\&quot;platform\&quot;:\&quot;Windows Server 2012\&quot;,\&quot;timeoutInSeconds\&quot;:60,\&quot;backupRetention\&quot;:1,\&quot;osType\&quot;:\&quot;windows\&quot;,\&quot;preScriptPath\&quot;:\&quot;\&quot;,\&quot;postScriptPath\&quot;:\&quot;\&quot;,\&quot;enableWriters\&quot;:true,\&quot;ecsDeleted\&quot;:false}</p>
         */
        @NameInMap("UdmDetail")
        public String udmDetail;

        /**
         * <p>The time when the restore job was updated. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0006******q</p>
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

        public DescribeRestoreJobs2ResponseBodyRestoreJobsRestoreJob setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
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
