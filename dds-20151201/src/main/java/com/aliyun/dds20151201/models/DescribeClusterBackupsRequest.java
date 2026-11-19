// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupsRequest extends TeaModel {
    /**
     * <p>The cluster backup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5664****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>775051</p>
     */
    @NameInMap("BackupJobId")
    public String backupJobId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp16cb162771****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region where the cross-region backup resides.</p>
     * <blockquote>
     * <p>This parameter is required when you query cross-region backups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>The end time of the query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter does not take effect when BackupId is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-03-14T13:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to query the information about child nodes in the cluster backup. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: returns only the basic information about the cluster backup and does not return the backup information about all child nodes.</li>
     * <li><strong>false</strong> (default): returns the backup information about all child nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOnlyGetClusterBackUp")
    public Boolean isOnlyGetClusterBackUp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>. Valid values: positive integers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The region where the instance resides.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when you query the backup sets of a released instance.</li>
     * <li>This parameter is required when you query cross-region backups.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter does not take effect when BackupId is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-03-13T12:11Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeClusterBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBackupsRequest self = new DescribeClusterBackupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBackupsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeClusterBackupsRequest setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public String getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeClusterBackupsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeClusterBackupsRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public DescribeClusterBackupsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeClusterBackupsRequest setIsOnlyGetClusterBackUp(Boolean isOnlyGetClusterBackUp) {
        this.isOnlyGetClusterBackUp = isOnlyGetClusterBackUp;
        return this;
    }
    public Boolean getIsOnlyGetClusterBackUp() {
        return this.isOnlyGetClusterBackUp;
    }

    public DescribeClusterBackupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeClusterBackupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeClusterBackupsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeClusterBackupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterBackupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeClusterBackupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeClusterBackupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClusterBackupsRequest setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

    public DescribeClusterBackupsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
