// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEncryptionKeyRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2235****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The custom encryption key of the instance. You can call <a href="https://help.aliyun.com/document_detail/151729.html">DescribeUserEncryptionKeyList</a> to query the custom keys of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The key scenario to query. Valid values:</p>
     * <ul>
     * <li>TDE: Queries transparent data encryption key information.</li>
     * <li>CloudDisk: Queries cloud disk encryption key information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TDE</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDBInstanceEncryptionKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEncryptionKeyRequest self = new DescribeDBInstanceEncryptionKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEncryptionKeyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceEncryptionKeyRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBInstanceEncryptionKeyRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public DescribeDBInstanceEncryptionKeyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstanceEncryptionKeyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceEncryptionKeyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstanceEncryptionKeyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
