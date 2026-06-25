// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-34pqe4r0kd9kn****</p>
     */
    @NameInMap("AndroidInstanceId")
    public String androidInstanceId;

    /**
     * <p>The instance name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-34pqe4r0kd9kn****</p>
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
     * <p>bf-dxrh5jrv0zpb8****</p>
     */
    @NameInMap("BackupFileId")
    public String backupFileId;

    /**
     * <p>The backup file name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("BackupFileName")
    public String backupFileName;

    /**
     * <p>The description. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Queries backup files created before the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-20 10:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The owner of the backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The instance group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-fxdx91jsfyiy3****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    /**
     * <p>The maximum number of entries per page for a paged query. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that indicates the position from which to start reading. Leave this parameter empty to start reading from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>Queries backup files created after the specified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-23 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The list of backup file statuses.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

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

    public DescribeBackupFilesRequest setBackupAll(Boolean backupAll) {
        this.backupAll = backupAll;
        return this;
    }
    public Boolean getBackupAll() {
        return this.backupAll;
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

    public DescribeBackupFilesRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public DescribeBackupFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeBackupFilesRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
