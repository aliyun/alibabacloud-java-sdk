// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateAccountAndAuthorityRequest extends TeaModel {
    /**
     * <p>The description of the database account.</p>
     * <ul>
     * <li>The description cannot start with http:// or https://.</li>
     * <li>The description must be 0 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The database account.</p>
     * <ul>
     * <li>The name must be unique within the cluster.</li>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must start with a lowercase letter and end with a lowercase letter or digit.</li>
     * <li>The name must be 2 to 64 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of your database account.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The password contains at least three types of the following characters: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>The password can contain the following special characters: ! @ # $ % ^ &amp; \* ( ) _ + - =</p>
     * </li>
     * <li><p>The password must be 8 to 32 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The databases to which you want to grant permissions. Separate databases with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db1</p>
     */
    @NameInMap("AllowDatabases")
    public String allowDatabases;

    /**
     * <p>The dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dt1</p>
     */
    @NameInMap("AllowDictionaries")
    public String allowDictionaries;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1p816075e21****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to grant the DDL permissions to the database account. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DdlAuthority")
    public Boolean ddlAuthority;

    /**
     * <p>Specifies whether to grant DML permissions to the database account. Valid values:</p>
     * <ul>
     * <li><strong>all</strong></li>
     * <li><strong>readOnly,modify</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("DmlAuthority")
    public String dmlAuthority;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>All databases. Separate databases with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>db1,db2</p>
     */
    @NameInMap("TotalDatabases")
    public String totalDatabases;

    /**
     * <p>All dictionaries. Separate dictionaries with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>dt1,dt2</p>
     */
    @NameInMap("TotalDictionaries")
    public String totalDictionaries;

    public static CreateAccountAndAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountAndAuthorityRequest self = new CreateAccountAndAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountAndAuthorityRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountAndAuthorityRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountAndAuthorityRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountAndAuthorityRequest setAllowDatabases(String allowDatabases) {
        this.allowDatabases = allowDatabases;
        return this;
    }
    public String getAllowDatabases() {
        return this.allowDatabases;
    }

    public CreateAccountAndAuthorityRequest setAllowDictionaries(String allowDictionaries) {
        this.allowDictionaries = allowDictionaries;
        return this;
    }
    public String getAllowDictionaries() {
        return this.allowDictionaries;
    }

    public CreateAccountAndAuthorityRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAccountAndAuthorityRequest setDdlAuthority(Boolean ddlAuthority) {
        this.ddlAuthority = ddlAuthority;
        return this;
    }
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    public CreateAccountAndAuthorityRequest setDmlAuthority(String dmlAuthority) {
        this.dmlAuthority = dmlAuthority;
        return this;
    }
    public String getDmlAuthority() {
        return this.dmlAuthority;
    }

    public CreateAccountAndAuthorityRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccountAndAuthorityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccountAndAuthorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAccountAndAuthorityRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccountAndAuthorityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAccountAndAuthorityRequest setTotalDatabases(String totalDatabases) {
        this.totalDatabases = totalDatabases;
        return this;
    }
    public String getTotalDatabases() {
        return this.totalDatabases;
    }

    public CreateAccountAndAuthorityRequest setTotalDictionaries(String totalDictionaries) {
        this.totalDictionaries = totalDictionaries;
        return this;
    }
    public String getTotalDictionaries() {
        return this.totalDictionaries;
    }

}
