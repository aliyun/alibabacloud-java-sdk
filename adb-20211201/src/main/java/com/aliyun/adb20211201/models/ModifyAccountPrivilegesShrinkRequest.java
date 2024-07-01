// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegesShrinkRequest extends TeaModel {
    /**
     * <p>The name of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that you want to grant to the database account.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountPrivileges")
    public String accountPrivilegesShrink;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1k5p066e1a****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAccountPrivilegesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegesShrinkRequest self = new ModifyAccountPrivilegesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegesShrinkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountPrivilegesShrinkRequest setAccountPrivilegesShrink(String accountPrivilegesShrink) {
        this.accountPrivilegesShrink = accountPrivilegesShrink;
        return this;
    }
    public String getAccountPrivilegesShrink() {
        return this.accountPrivilegesShrink;
    }

    public ModifyAccountPrivilegesShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountPrivilegesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
