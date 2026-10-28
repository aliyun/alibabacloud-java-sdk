// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAccountShrinkRequest extends TeaModel {
    /**
     * <p>The description of the account. The description must meet the following requirements:</p>
     * <ul>
     * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can be up to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Database connection test account</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the database account. The name must meet the following requirements:</p>
     * <ul>
     * <li>It must start with a lowercase letter and end with a lowercase letter or a digit.</li>
     * <li>It can contain only lowercase letters, digits, and underscores (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_accout</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account. The password must meet the following requirements:</p>
     * <ul>
     * <li>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include: <code>!@#$%^&amp;*()_+-=</code></li>
     * <li>It must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test_accout1</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The type of the account. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard account.</li>
     * <li><strong>Super</strong>: privileged account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>AnalyticDB</strong> (default): AnalyticDB for MySQL engine.</li>
     * <li><strong>Clickhouse</strong>: wide table engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Clickhouse</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The list of PromQL write permissions.</p>
     */
    @NameInMap("PromqlInsertPrivileges")
    public String promqlInsertPrivilegesShrink;

    /**
     * <p>The percentage of PromQL query nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>0.6</p>
     */
    @NameInMap("PromqlSelectNodePercentage")
    public Double promqlSelectNodePercentage;

    /**
     * <p>The list of PromQL query permissions.</p>
     */
    @NameInMap("PromqlSelectPrivileges")
    public String promqlSelectPrivilegesShrink;

    /**
     * <p>The IDs of the Alibaba Cloud Resource Access Management (RAM) users to bind. Currently, only one RAM user can be bound.</p>
     */
    @NameInMap("RamUserList")
    public String ramUserListShrink;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static CreateAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountShrinkRequest self = new CreateAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountShrinkRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountShrinkRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAccountShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateAccountShrinkRequest setPromqlInsertPrivilegesShrink(String promqlInsertPrivilegesShrink) {
        this.promqlInsertPrivilegesShrink = promqlInsertPrivilegesShrink;
        return this;
    }
    public String getPromqlInsertPrivilegesShrink() {
        return this.promqlInsertPrivilegesShrink;
    }

    public CreateAccountShrinkRequest setPromqlSelectNodePercentage(Double promqlSelectNodePercentage) {
        this.promqlSelectNodePercentage = promqlSelectNodePercentage;
        return this;
    }
    public Double getPromqlSelectNodePercentage() {
        return this.promqlSelectNodePercentage;
    }

    public CreateAccountShrinkRequest setPromqlSelectPrivilegesShrink(String promqlSelectPrivilegesShrink) {
        this.promqlSelectPrivilegesShrink = promqlSelectPrivilegesShrink;
        return this;
    }
    public String getPromqlSelectPrivilegesShrink() {
        return this.promqlSelectPrivilegesShrink;
    }

    public CreateAccountShrinkRequest setRamUserListShrink(String ramUserListShrink) {
        this.ramUserListShrink = ramUserListShrink;
        return this;
    }
    public String getRamUserListShrink() {
        return this.ramUserListShrink;
    }

    public CreateAccountShrinkRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
