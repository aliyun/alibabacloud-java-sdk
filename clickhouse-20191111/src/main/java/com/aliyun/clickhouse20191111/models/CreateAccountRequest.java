// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    @NameInMap("AccountDescription")
    public String accountDescription;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPassword")
    public String accountPassword;

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

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAccountRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
