// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesRequest extends TeaModel {
    @NameInMap("AndroidInstanceId")
    public String androidInstanceId;

    @NameInMap("AndroidInstanceName")
    public String androidInstanceName;

    @NameInMap("BackupFileId")
    public String backupFileId;

    @NameInMap("BackupFileName")
    public String backupFileName;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeBackupFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupFilesRequest self = new DescribeBackupFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupFilesRequest setAndroidInstanceId(String androidInstanceId) {
        this.androidInstanceId = androidInstanceId;
        return this;
    }
    public String getAndroidInstanceId() {
        return this.androidInstanceId;
    }

    public DescribeBackupFilesRequest setAndroidInstanceName(String androidInstanceName) {
        this.androidInstanceName = androidInstanceName;
        return this;
    }
    public String getAndroidInstanceName() {
        return this.androidInstanceName;
    }

    public DescribeBackupFilesRequest setBackupFileId(String backupFileId) {
        this.backupFileId = backupFileId;
        return this;
    }
    public String getBackupFileId() {
        return this.backupFileId;
    }

    public DescribeBackupFilesRequest setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        return this;
    }
    public String getBackupFileName() {
        return this.backupFileName;
    }

    public DescribeBackupFilesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeBackupFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeBackupFilesRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeBackupFilesRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public DescribeBackupFilesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeBackupFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBackupFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
