// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityRequest extends TeaModel {
    /**
     * <p>The name of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Account")
    public String account;

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
     * <p>The information about permissions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DmlAuthSetting")
    public ModifyAccountAuthorityRequestDmlAuthSetting dmlAuthSetting;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
        /**
         * <p>The databases on which you want to grant permissions. Separate multiple databases with commas (,).</p>
         */
        @NameInMap("AllowDatabases")
        public java.util.List<String> allowDatabases;

        /**
         * <p>The dictionaries on which you want to grant permissions. Separate multiple dictionaries with commas (,).</p>
         */
        @NameInMap("AllowDictionaries")
        public java.util.List<String> allowDictionaries;

        /**
         * <p>Specifies whether to grant the DDL permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The account has the permissions to execute DDL statements.</li>
         * <li><strong>false</strong>: The account does not have the permissions to execute DDL statements.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DdlAuthority")
        public Boolean ddlAuthority;

        /**
         * <p>Specifies whether to grant the DML permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The account has the permissions to read data from the database, write data to the database, and modify the settings of the database.</li>
         * <li><strong>1</strong>: The account only has the permissions to read data from the database.</li>
         * <li><strong>2</strong>: The account only has the permissions to read data from the database and modify the settings of the database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
