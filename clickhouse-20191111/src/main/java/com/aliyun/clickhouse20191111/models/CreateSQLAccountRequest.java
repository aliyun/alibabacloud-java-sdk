// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSQLAccountRequest extends TeaModel {
    /**
     * <p>The description of the database account.</p>
     * <ul>
     * <li><p>It cannot start with http\:// or https\://.</p>
     * </li>
     * <li><p>It can be 0 to 256 characters in length.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>For testing</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the database account.</p>
     * <ul>
     * <li><p>The name must be unique.</p>
     * </li>
     * <li><p>It must consist of lowercase letters, digits, or underscores (_).</p>
     * </li>
     * <li><p>It must start with a lowercase letter and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>It must be 2 to 64 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password for the database account.</p>
     * <ul>
     * <li><p>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>The following characters are special characters: !@#$%^&amp;\*()_+-=</p>
     * </li>
     * <li><p>It must be 8 to 32 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test1234</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The type of the database account. Valid values:</p>
     * <ul>
     * <li><p><strong>Super</strong>: a privileged account.</p>
     * </li>
     * <li><p><strong>Normal</strong>: a standard account.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Super</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1p816075e21****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSQLAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLAccountRequest self = new CreateSQLAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateSQLAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateSQLAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateSQLAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateSQLAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateSQLAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSQLAccountRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSQLAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSQLAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSQLAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
