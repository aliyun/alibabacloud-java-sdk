// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateAccountShrinkRequest extends TeaModel {
    /**
     * <p>The database account. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be unique.</li>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit.</li>
     * <li>The name must be 2 to 64 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The type of the database account. Valid values:</p>
     * <ul>
     * <li><strong>NormalAccount</strong>: standard account.</li>
     * <li><strong>SuperAccount</strong>: privileged account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NormalAccount</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp100p4q1g9z3****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>For testing purposes</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The authorization information.</p>
     */
    @NameInMap("DmlAuthSetting")
    public String dmlAuthSettingShrink;

    /**
     * <p>The password of the database account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>Special characters include !@#$%^&amp;*()_+-=.</p>
     * </li>
     * <li><p>The password must be 8 to 32 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4@</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>clickhouse</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
