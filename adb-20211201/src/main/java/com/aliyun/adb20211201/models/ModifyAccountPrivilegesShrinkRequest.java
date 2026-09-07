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
     * <p>The list of granted permissions.</p>
     */
    @NameInMap("AccountPrivileges")
    public String accountPrivilegesShrink;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The cluster ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The cluster ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1k5p066e1a****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("PromqlInsertPrivileges")
    public String promqlInsertPrivilegesShrink;

    @NameInMap("PromqlSelectNodePercentage")
    public Double promqlSelectNodePercentage;

    @NameInMap("PromqlSelectPrivileges")
    public String promqlSelectPrivilegesShrink;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

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

    public ModifyAccountPrivilegesShrinkRequest setPromqlInsertPrivilegesShrink(String promqlInsertPrivilegesShrink) {
        this.promqlInsertPrivilegesShrink = promqlInsertPrivilegesShrink;
        return this;
    }
    public String getPromqlInsertPrivilegesShrink() {
        return this.promqlInsertPrivilegesShrink;
    }

    public ModifyAccountPrivilegesShrinkRequest setPromqlSelectNodePercentage(Double promqlSelectNodePercentage) {
        this.promqlSelectNodePercentage = promqlSelectNodePercentage;
        return this;
    }
    public Double getPromqlSelectNodePercentage() {
        return this.promqlSelectNodePercentage;
    }

    public ModifyAccountPrivilegesShrinkRequest setPromqlSelectPrivilegesShrink(String promqlSelectPrivilegesShrink) {
        this.promqlSelectPrivilegesShrink = promqlSelectPrivilegesShrink;
        return this;
    }
    public String getPromqlSelectPrivilegesShrink() {
        return this.promqlSelectPrivilegesShrink;
    }

    public ModifyAccountPrivilegesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAccountPrivilegesShrinkRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
