// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
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
    public CreateAccountRequestDmlAuthSetting dmlAuthSetting;

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
        /**
         * <p>The list of databases to be authorized. Separate multiple databases with commas (,).</p>
         */
        @NameInMap("AllowDatabases")
        public java.util.List<String> allowDatabases;

        /**
         * <p>The list of dictionaries to be authorized. Separate multiple dictionaries with commas (,).</p>
         */
        @NameInMap("AllowDictionaries")
        public java.util.List<String> allowDictionaries;

        /**
         * <p>Specifies whether to grant Data Definition Language (DDL) permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Allows DDL operations.</li>
         * <li><strong>false</strong>: Prohibits DDL operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DdlAuthority")
        public Boolean ddlAuthority;

        /**
         * <p>Specifies whether to grant Data Manipulation Language (DML) permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Allows queries for reading, writing, and changing settings.</li>
         * <li><strong>1</strong>: Allows only queries for reading data.</li>
         * <li><strong>2</strong>: Allows queries for reading data and changing settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
