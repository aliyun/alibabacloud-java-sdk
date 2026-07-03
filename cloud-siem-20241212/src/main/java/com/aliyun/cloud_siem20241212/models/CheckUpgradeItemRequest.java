// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CheckUpgradeItemRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region of the Data Management center. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: The assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: The assets are in a region outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to switch to the member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public String roleFor;

    /**
     * <p>The ID of the upgrade item.</p>
     * 
     * <strong>example:</strong>
     * <p>dispose_task_upgrade</p>
     */
    @NameInMap("UpgradeItemId")
    public String upgradeItemId;

    public static CheckUpgradeItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeItemRequest self = new CheckUpgradeItemRequest();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckUpgradeItemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckUpgradeItemRequest setRoleFor(String roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public String getRoleFor() {
        return this.roleFor;
    }

    public CheckUpgradeItemRequest setUpgradeItemId(String upgradeItemId) {
        this.upgradeItemId = upgradeItemId;
        return this;
    }
    public String getUpgradeItemId() {
        return this.upgradeItemId;
    }

}
