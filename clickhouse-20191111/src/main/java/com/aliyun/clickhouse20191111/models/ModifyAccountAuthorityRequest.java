// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AllowDatabases")
    public String allowDatabases;

    @NameInMap("AllowDictionaries")
    public String allowDictionaries;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DdlAuthority")
    public Boolean ddlAuthority;

    @NameInMap("DmlAuthority")
    public String dmlAuthority;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TotalDatabases")
    public String totalDatabases;

    @NameInMap("TotalDictionaries")
    public String totalDictionaries;

    public static ModifyAccountAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityRequest self = new ModifyAccountAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountAuthorityRequest setAllowDatabases(String allowDatabases) {
        this.allowDatabases = allowDatabases;
        return this;
    }
    public String getAllowDatabases() {
        return this.allowDatabases;
    }

    public ModifyAccountAuthorityRequest setAllowDictionaries(String allowDictionaries) {
        this.allowDictionaries = allowDictionaries;
        return this;
    }
    public String getAllowDictionaries() {
        return this.allowDictionaries;
    }

    public ModifyAccountAuthorityRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountAuthorityRequest setDdlAuthority(Boolean ddlAuthority) {
        this.ddlAuthority = ddlAuthority;
        return this;
    }
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    public ModifyAccountAuthorityRequest setDmlAuthority(String dmlAuthority) {
        this.dmlAuthority = dmlAuthority;
        return this;
    }
    public String getDmlAuthority() {
        return this.dmlAuthority;
    }

    public ModifyAccountAuthorityRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAccountAuthorityRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAccountAuthorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAccountAuthorityRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAccountAuthorityRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAccountAuthorityRequest setTotalDatabases(String totalDatabases) {
        this.totalDatabases = totalDatabases;
        return this;
    }
    public String getTotalDatabases() {
        return this.totalDatabases;
    }

    public ModifyAccountAuthorityRequest setTotalDictionaries(String totalDictionaries) {
        this.totalDictionaries = totalDictionaries;
        return this;
    }
    public String getTotalDictionaries() {
        return this.totalDictionaries;
    }

}
