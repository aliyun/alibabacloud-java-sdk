// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DmlAuthSetting")
    public ModifyAccountAuthorityRequestDmlAuthSetting dmlAuthSetting;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAccountAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityRequest self = new ModifyAccountAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyAccountAuthorityRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAccountAuthorityRequest setDmlAuthSetting(ModifyAccountAuthorityRequestDmlAuthSetting dmlAuthSetting) {
        this.dmlAuthSetting = dmlAuthSetting;
        return this;
    }
    public ModifyAccountAuthorityRequestDmlAuthSetting getDmlAuthSetting() {
        return this.dmlAuthSetting;
    }

    public ModifyAccountAuthorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyAccountAuthorityRequestDmlAuthSetting extends TeaModel {
        @NameInMap("AllowDatabases")
        public java.util.List<String> allowDatabases;

        @NameInMap("AllowDictionaries")
        public java.util.List<String> allowDictionaries;

        @NameInMap("DdlAuthority")
        public Boolean ddlAuthority;

        @NameInMap("DmlAuthority")
        public Integer dmlAuthority;

        public static ModifyAccountAuthorityRequestDmlAuthSetting build(java.util.Map<String, ?> map) throws Exception {
            ModifyAccountAuthorityRequestDmlAuthSetting self = new ModifyAccountAuthorityRequestDmlAuthSetting();
            return TeaModel.build(map, self);
        }

        public ModifyAccountAuthorityRequestDmlAuthSetting setAllowDatabases(java.util.List<String> allowDatabases) {
            this.allowDatabases = allowDatabases;
            return this;
        }
        public java.util.List<String> getAllowDatabases() {
            return this.allowDatabases;
        }

        public ModifyAccountAuthorityRequestDmlAuthSetting setAllowDictionaries(java.util.List<String> allowDictionaries) {
            this.allowDictionaries = allowDictionaries;
            return this;
        }
        public java.util.List<String> getAllowDictionaries() {
            return this.allowDictionaries;
        }

        public ModifyAccountAuthorityRequestDmlAuthSetting setDdlAuthority(Boolean ddlAuthority) {
            this.ddlAuthority = ddlAuthority;
            return this;
        }
        public Boolean getDdlAuthority() {
            return this.ddlAuthority;
        }

        public ModifyAccountAuthorityRequestDmlAuthSetting setDmlAuthority(Integer dmlAuthority) {
            this.dmlAuthority = dmlAuthority;
            return this;
        }
        public Integer getDmlAuthority() {
            return this.dmlAuthority;
        }

    }

}
