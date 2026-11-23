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
     * <li>The name must be unique.</li>
     * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
     * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit.</li>
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
     * <p>The password of the database account.</p>
     * <blockquote>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The list of databases to be authorized. Separate multiple databases with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db1</p>
     */
    @NameInMap("AllowDatabases")
    public String allowDatabases;

    /**
     * <p>The list of dictionaries to be authorized. Separate multiple dictionaries with commas (,).</p>
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
     * <p>Specifies whether to grant Data Definition Language (DDL) permissions to the database account. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: allows DDL operations.</li>
     * <li><strong>false</strong>: prohibits DDL operations.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DdlAuthority")
    public Boolean ddlAuthority;

    /**
     * <p>Specifies whether to grant Data Manipulation Language (DML) permissions to the database account. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: read, write, and settings permissions.</li>
     * <li><strong>readOnly,modify</strong>: read and settings permissions.</li>
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
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The list of all databases. Separate multiple databases with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>db1,db2</p>
     */
    @NameInMap("TotalDatabases")
    public String totalDatabases;

    /**
     * <p>The list of all dictionaries. Separate multiple dictionaries with commas (,).</p>
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
