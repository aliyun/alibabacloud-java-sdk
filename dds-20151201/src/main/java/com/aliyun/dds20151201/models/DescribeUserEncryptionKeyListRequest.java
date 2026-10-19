// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the specified role. Format: <code>acs:ram::$accountID:role/$roleName </code>. Default value: <code>acs:ram::$accountID:role/aliyunrdsinstanceencryptiondefaultrole</code>.</p>
     * <blockquote>
     * <ul>
     * <li><code>$accountID</code>: the Alibaba Cloud account ID. You can log on to the Alibaba Cloud Management Console, move the mouse over the profile picture in the upper-right corner, and click Security Settings to view it.</li>
     * <li><code>$roleName</code>: the name of the RAM role. You can log on to the Resource Access Management (RAM) console, click RAM Roles in the left-side navigation pane, and view the name in the RAM role name list.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The target zone ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query available zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("TargetRegionId")
    public String targetRegionId;

    public static DescribeUserEncryptionKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListRequest self = new DescribeUserEncryptionKeyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeUserEncryptionKeyListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeUserEncryptionKeyListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserEncryptionKeyListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeUserEncryptionKeyListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeUserEncryptionKeyListRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public DescribeUserEncryptionKeyListRequest setTargetRegionId(String targetRegionId) {
        this.targetRegionId = targetRegionId;
        return this;
    }
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

}
