// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("DmlAuthority")
    @Validation(required = true)
    public String dmlAuthority;

    @NameInMap("DdlAuthority")
    @Validation(required = true)
    public Boolean ddlAuthority;

    @NameInMap("AllowDatabases")
    @Validation(required = true)
    public String allowDatabases;

    @NameInMap("TotalDatabases")
    @Validation(required = true)
    public String totalDatabases;

    @NameInMap("AllowDictionaries")
    @Validation(required = true)
    public String allowDictionaries;

    @NameInMap("TotalDictionaries")
    @Validation(required = true)
    public String totalDictionaries;

    public static ModifyAccountAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityRequest self = new ModifyAccountAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAccountAuthorityRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountAuthorityRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountAuthorityRequest setDmlAuthority(String dmlAuthority) {
        this.dmlAuthority = dmlAuthority;
        return this;
    }
    public String getDmlAuthority() {
        return this.dmlAuthority;
    }

    public ModifyAccountAuthorityRequest setDdlAuthority(Boolean ddlAuthority) {
        this.ddlAuthority = ddlAuthority;
        return this;
    }
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    public ModifyAccountAuthorityRequest setAllowDatabases(String allowDatabases) {
        this.allowDatabases = allowDatabases;
        return this;
    }
    public String getAllowDatabases() {
        return this.allowDatabases;
    }

    public ModifyAccountAuthorityRequest setTotalDatabases(String totalDatabases) {
        this.totalDatabases = totalDatabases;
        return this;
    }
    public String getTotalDatabases() {
        return this.totalDatabases;
    }

    public ModifyAccountAuthorityRequest setAllowDictionaries(String allowDictionaries) {
        this.allowDictionaries = allowDictionaries;
        return this;
    }
    public String getAllowDictionaries() {
        return this.allowDictionaries;
    }

    public ModifyAccountAuthorityRequest setTotalDictionaries(String totalDictionaries) {
        this.totalDictionaries = totalDictionaries;
        return this;
    }
    public String getTotalDictionaries() {
        return this.totalDictionaries;
    }

}
