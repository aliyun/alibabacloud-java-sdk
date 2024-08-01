// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupDBsRequest extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/62172.html">DescribeBackups</a> operation to query the backup ID.</p>
     * </li>
     * <li><p>You must specify one of the <strong>RestoreTime</strong> and BackupId parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5664****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Default value: 30. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ax68****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which the instance is restored. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The time can be a point in time within the previous seven days. The time must be earlier than the current time, but later than the time when the instance was created.</p>
     * </li>
     * <li><p>You must specify one of the RestoreTime and <strong>BackupId</strong> parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-08-22T12:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The ID of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2286****</p>
     */
    @NameInMap("SourceDBInstance")
    public String sourceDBInstance;

    public static DescribeBackupDBsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDBsRequest self = new DescribeBackupDBsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDBsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeBackupDBsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeBackupDBsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupDBsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupDBsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupDBsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeBackupDBsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeBackupDBsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeBackupDBsRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public DescribeBackupDBsRequest setSourceDBInstance(String sourceDBInstance) {
        this.sourceDBInstance = sourceDBInstance;
        return this;
    }
    public String getSourceDBInstance() {
        return this.sourceDBInstance;
    }

}
