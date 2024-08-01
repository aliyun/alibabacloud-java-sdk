// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRequest extends TeaModel {
    /**
     * <p>The account whose password needs to be reset. Set the value to <strong>root</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The new password.</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! # $ % ^ &amp; * ( ) _ + - =</code></li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ali!123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The role of the instance.</p>
     * <ul>
     * <li>If the instance is a sharded cluster instance, this parameter is required. Valid values: db and cs.</li>
     * <li>If the instance is a replica set instance, you can leave this parameter empty or set the parameter to normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

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

    public static ResetAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordRequest self = new ResetAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ResetAccountPasswordRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public ResetAccountPasswordRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public ResetAccountPasswordRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ResetAccountPasswordRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResetAccountPasswordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResetAccountPasswordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResetAccountPasswordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
