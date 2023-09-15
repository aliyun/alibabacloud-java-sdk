// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateAccountShrinkRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DmlAuthSetting")
    public String dmlAuthSettingShrink;

    @NameInMap("Password")
    public String password;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountShrinkRequest self = new CreateAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountShrinkRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAccountShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateAccountShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccountShrinkRequest setDmlAuthSettingShrink(String dmlAuthSettingShrink) {
        this.dmlAuthSettingShrink = dmlAuthSettingShrink;
        return this;
    }
    public String getDmlAuthSettingShrink() {
        return this.dmlAuthSettingShrink;
    }

    public CreateAccountShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAccountShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateAccountShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
