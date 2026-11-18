// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityRequest extends TeaModel {
    /**
     * <p>The database account.</p>
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
     * <p>The authorization information.</p>
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
         * <p>Specifies whether to grant DDL permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: DDL is allowed.</li>
         * <li><strong>false</strong>: DDL is not allowed.</li>
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
         * <li><p><strong>0</strong>: Read, write, and change settings queries are allowed.</p>
         * </li>
         * <li><p><strong>1</strong>: Only read data queries are allowed.</p>
         * </li>
         * <li><p><strong>2</strong>: Read data and change settings queries are allowed.</p>
         * </li>
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
