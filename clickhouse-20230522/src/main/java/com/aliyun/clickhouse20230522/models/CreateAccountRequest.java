// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DmlAuthSetting")
    public CreateAccountRequestDmlAuthSetting dmlAuthSetting;

    @NameInMap("Password")
    public String password;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccountRequest setDmlAuthSetting(CreateAccountRequestDmlAuthSetting dmlAuthSetting) {
        this.dmlAuthSetting = dmlAuthSetting;
        return this;
    }
    public CreateAccountRequestDmlAuthSetting getDmlAuthSetting() {
        return this.dmlAuthSetting;
    }

    public CreateAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAccountRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateAccountRequestDmlAuthSetting extends TeaModel {
        @NameInMap("AllowDatabases")
        public java.util.List<String> allowDatabases;

        @NameInMap("AllowDictionaries")
        public java.util.List<String> allowDictionaries;

        @NameInMap("DdlAuthority")
        public Boolean ddlAuthority;

        @NameInMap("DmlAuthority")
        public Integer dmlAuthority;

        public static CreateAccountRequestDmlAuthSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateAccountRequestDmlAuthSetting self = new CreateAccountRequestDmlAuthSetting();
            return TeaModel.build(map, self);
        }

        public CreateAccountRequestDmlAuthSetting setAllowDatabases(java.util.List<String> allowDatabases) {
            this.allowDatabases = allowDatabases;
            return this;
        }
        public java.util.List<String> getAllowDatabases() {
            return this.allowDatabases;
        }

        public CreateAccountRequestDmlAuthSetting setAllowDictionaries(java.util.List<String> allowDictionaries) {
            this.allowDictionaries = allowDictionaries;
            return this;
        }
        public java.util.List<String> getAllowDictionaries() {
            return this.allowDictionaries;
        }

        public CreateAccountRequestDmlAuthSetting setDdlAuthority(Boolean ddlAuthority) {
            this.ddlAuthority = ddlAuthority;
            return this;
        }
        public Boolean getDdlAuthority() {
            return this.ddlAuthority;
        }

        public CreateAccountRequestDmlAuthSetting setDmlAuthority(Integer dmlAuthority) {
            this.dmlAuthority = dmlAuthority;
            return this;
        }
        public Integer getDmlAuthority() {
            return this.dmlAuthority;
        }

    }

}
