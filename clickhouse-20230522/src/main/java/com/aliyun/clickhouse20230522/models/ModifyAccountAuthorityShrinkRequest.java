// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyAccountAuthorityShrinkRequest extends TeaModel {
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
    public String dmlAuthSettingShrink;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAccountAuthorityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountAuthorityShrinkRequest self = new ModifyAccountAuthorityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountAuthorityShrinkRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyAccountAuthorityShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAccountAuthorityShrinkRequest setDmlAuthSettingShrink(String dmlAuthSettingShrink) {
        this.dmlAuthSettingShrink = dmlAuthSettingShrink;
        return this;
    }
    public String getDmlAuthSettingShrink() {
        return this.dmlAuthSettingShrink;
    }

    public ModifyAccountAuthorityShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
