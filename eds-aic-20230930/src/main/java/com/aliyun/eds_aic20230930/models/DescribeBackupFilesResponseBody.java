// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBackupFilesResponseBodyData> data;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        @NameInMap("BackupFileId")
        public String backupFileId;

        @NameInMap("BackupFileName")
        public String backupFileName;

        @NameInMap("BackupFilePath")
        public String backupFilePath;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceGroupId")
        public String instanceGroupId;

        @NameInMap("SourceFilePathList")
        public java.util.List<String> sourceFilePathList;

        @NameInMap("Status")
        public String status;

        @NameInMap("UploadEndpoint")
        public String uploadEndpoint;

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
