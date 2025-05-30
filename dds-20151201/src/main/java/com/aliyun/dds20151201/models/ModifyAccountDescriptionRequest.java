// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the account.</p>
     * <ul>
     * <li>The description must start with a letter and cannot start with http:// or https://.</li>
     * <li>The description must be 2 to 256 characters in length, and can contain letters, digits, underscores (_), and hyphens (-).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>superadmin</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the account whose description is to be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The type of the account whose description you can modify. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: shard account</li>
     * <li><strong>cs</strong>: ConfigServer account</li>
     * <li><strong>normal</strong> (default): replica set account (available)</li>
     * </ul>
     * <blockquote>
     * <p> You can set this parameter only to <strong>normal</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("CharacterType")
    public String characterType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp2356****</p>
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

    public static ModifyAccountDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionRequest self = new ModifyAccountDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public ModifyAccountDescriptionRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountDescriptionRequest setCharacterType(String characterType) {
        this.characterType = characterType;
        return this;
    }
    public String getCharacterType() {
        return this.characterType;
    }

    public ModifyAccountDescriptionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAccountDescriptionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAccountDescriptionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAccountDescriptionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAccountDescriptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
