// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesResponseBody extends TeaModel {
    /**
     * <p>The backup files that are returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeBackupFilesResponseBodyData> data;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request. If the request fails, provide this ID to technical support to assist in diagnosing the issue.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultInstanceName</p>
         */
        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        /**
         * <p>Indicates whether the whole instance is backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BackupAll")
        public Boolean backupAll;

        /**
         * <p>The ID of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>bf-b0qbg3pbpjkn7****</p>
         */
        @NameInMap("BackupFileId")
        public String backupFileId;

        /**
         * <p>The name of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>a-58ftsoo90p0qa****.ab</p>
         */
        @NameInMap("BackupFileName")
        public String backupFileName;

        /**
         * <p>The directory in which the backup file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://cloudphone-saved-bucket-cn-shanghai/backup/aic-58ftsoo90p0qa****.ab</p>
         */
        @NameInMap("BackupFilePath")
        public String backupFilePath;

        /**
         * <p>The description of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>This is default description.</p>
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
         * <p>The total size of the source files.</p>
         * 
         * <strong>example:</strong>
         * <p>10227168</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The time when the backup file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the backup file was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the instance group.</p>
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
         * <p>The names of the application packages that are backed up.</p>
         */
        @NameInMap("SourceAppInfoList")
        public java.util.List<String> sourceAppInfoList;

        /**
         * <p>The directories of the source files.</p>
         */
        @NameInMap("SourceFilePathList")
        public java.util.List<String> sourceFilePathList;

        /**
         * <p>The status of the backup file.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE</li>
         * <li>RECOVERING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bp67acfmxazb4p****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The endpoint of the OSS bucket that stores the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("UploadEndpoint")
        public String uploadEndpoint;

        /**
         * <p>The type of the backup.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OSS: backup files are stored in OSS buckets. .</li>
         * </ul>
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
