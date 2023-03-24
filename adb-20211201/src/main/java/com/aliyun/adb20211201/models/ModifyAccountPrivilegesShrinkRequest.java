// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegesShrinkRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPrivileges")
    public String accountPrivilegesShrink;

    @NameInMap("DBClusterId")
    public String DBClusterId;

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
