// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesResponseBody extends TeaModel {
    /**
     * <p>The list of returned result objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeBackupFilesResponseBodyData> data;

    /**
     * <p>The maximum number of entries returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that indicates the position up to which data has been read in the current call. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. If you encounter an issue, provide this request ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>91</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupFilesResponseBody self = new DescribeBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupFilesResponseBody setData(java.util.List<DescribeBackupFilesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupFilesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBackupFilesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeBackupFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupFilesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupFilesResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test cloud phone</p>
         */
        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        /**
         * <p>Specifies whether to perform a full device backup.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BackupAll")
        public Boolean backupAll;

        /**
         * <p>The backup file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bf-b0qbg3pbpjkn7****</p>
         */
        @NameInMap("BackupFileId")
        public String backupFileId;

        /**
         * <p>The backup file name.</p>
         * 
         * <strong>example:</strong>
         * <p>a-58ftsoo90p0qa****.ab</p>
         */
        @NameInMap("BackupFileName")
        public String backupFileName;

        /**
         * <p>The directory where the backup file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://cloudphone-saved-bucket-cn-shanghai/backup/aic-58ftsoo90p0qa****.ab</p>
         */
        @NameInMap("BackupFilePath")
        public String backupFilePath;

        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The description of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>Backup file for /data/media directory.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The owner of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The total size of the source backup files.</p>
         * 
         * <strong>example:</strong>
         * <p>10227168</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-58ftsoo90p0qi****</p>
         */
        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of backed-up application package names.</p>
         */
        @NameInMap("SourceAppInfoList")
        public java.util.List<String> sourceAppInfoList;

        /**
         * <p>The list of source backup file directories.</p>
         */
        @NameInMap("SourceFilePathList")
        public java.util.List<String> sourceFilePathList;

        /**
         * <p>The backup file status.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SystemVersion")
        public String systemVersion;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bp67acfmxazb4p****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The domain name of the upload endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("UploadEndpoint")
        public String uploadEndpoint;

        /**
         * <p>The backup type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("UploadType")
        public String uploadType;

        public static DescribeBackupFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupFilesResponseBodyData self = new DescribeBackupFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupFilesResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeBackupFilesResponseBodyData setAndroidInstanceName(String androidInstanceName) {
            this.androidInstanceName = androidInstanceName;
            return this;
        }
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        public DescribeBackupFilesResponseBodyData setBackupAll(Boolean backupAll) {
            this.backupAll = backupAll;
            return this;
        }
        public Boolean getBackupAll() {
            return this.backupAll;
        }

        public DescribeBackupFilesResponseBodyData setBackupFileId(String backupFileId) {
            this.backupFileId = backupFileId;
            return this;
        }
        public String getBackupFileId() {
            return this.backupFileId;
        }

        public DescribeBackupFilesResponseBodyData setBackupFileName(String backupFileName) {
            this.backupFileName = backupFileName;
            return this;
        }
        public String getBackupFileName() {
            return this.backupFileName;
        }

        public DescribeBackupFilesResponseBodyData setBackupFilePath(String backupFilePath) {
            this.backupFilePath = backupFilePath;
            return this;
        }
        public String getBackupFilePath() {
            return this.backupFilePath;
        }

        public DescribeBackupFilesResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeBackupFilesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBackupFilesResponseBodyData setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeBackupFilesResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeBackupFilesResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeBackupFilesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBackupFilesResponseBodyData setInstanceGroupId(String instanceGroupId) {
            this.instanceGroupId = instanceGroupId;
            return this;
        }
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        public DescribeBackupFilesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupFilesResponseBodyData setSourceAppInfoList(java.util.List<String> sourceAppInfoList) {
            this.sourceAppInfoList = sourceAppInfoList;
            return this;
        }
        public java.util.List<String> getSourceAppInfoList() {
            return this.sourceAppInfoList;
        }

        public DescribeBackupFilesResponseBodyData setSourceFilePathList(java.util.List<String> sourceFilePathList) {
            this.sourceFilePathList = sourceFilePathList;
            return this;
        }
        public java.util.List<String> getSourceFilePathList() {
            return this.sourceFilePathList;
        }

        public DescribeBackupFilesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupFilesResponseBodyData setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public DescribeBackupFilesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeBackupFilesResponseBodyData setUploadEndpoint(String uploadEndpoint) {
            this.uploadEndpoint = uploadEndpoint;
            return this;
        }
        public String getUploadEndpoint() {
            return this.uploadEndpoint;
        }

        public DescribeBackupFilesResponseBodyData setUploadType(String uploadType) {
            this.uploadType = uploadType;
            return this;
        }
        public String getUploadType() {
            return this.uploadType;
        }

    }

}
