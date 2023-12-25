// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSQLAccountRequest extends TeaModel {
    /**
     * <p>The description of the database account.</p>
     * <br>
     * <p>*   The description cannot start with http:// or https://.</p>
     * <p>*   The description can be up to 256 characters in length or be an empty string.</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the database account.</p>
     * <br>
     * <p>*   The name must be unique in the cluster.</p>
     * <p>*   The name can contain lowercase letters, digits, or underscores (\_).</p>
     * <p>*   The name must start with a lowercase letter and end with a lowercase letter or a digit.</p>
     * <p>*   The name must be 2 to 64 characters in length.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account.</p>
     * <br>
     * <p>*   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   Special characters include ! @ # $ % ^ & \* ( ) \_ + - =</p>
     * <p>*   The password must be 8 to 32 characters in length.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The type of the database account. Valid values:</p>
     * <br>
     * <p>*   **Super**: privileged account.</p>
     * <p>*   **Normal**: standard account.</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The cluster ID.</p>
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
