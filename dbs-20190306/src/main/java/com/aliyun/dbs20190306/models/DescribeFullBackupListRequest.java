// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeFullBackupListRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsr179qz******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>1iukx5h******</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("BackupSetStatus")
    public String backupSetStatus;

    /**
     * <p>A token that ensures idempotence and prevents duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end time of the backup, in UNIX timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1676887128</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. Valid values: integers from 0 to the maximum integer value. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p>30</p>
     * </li>
     * <li><p>50</p>
     * </li>
     * <li><p>100</p>
     * </li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowProgress")
    public String showProgress;

    /**
     * <p>Specifies whether to return the storage class.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowStorageType")
    public Boolean showStorageType;

    /**
     * <p>The start time of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>1676887100</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DescribeFullBackupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullBackupListRequest self = new DescribeFullBackupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFullBackupListRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeFullBackupListRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeFullBackupListRequest setBackupSetStatus(String backupSetStatus) {
        this.backupSetStatus = backupSetStatus;
        return this;
    }
    public String getBackupSetStatus() {
        return this.backupSetStatus;
    }

    public DescribeFullBackupListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeFullBackupListRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeFullBackupListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeFullBackupListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeFullBackupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFullBackupListRequest setShowProgress(String showProgress) {
        this.showProgress = showProgress;
        return this;
    }
    public String getShowProgress() {
        return this.showProgress;
    }

    public DescribeFullBackupListRequest setShowStorageType(Boolean showStorageType) {
        this.showStorageType = showStorageType;
        return this;
    }
    public Boolean getShowStorageType() {
        return this.showStorageType;
    }

    public DescribeFullBackupListRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
