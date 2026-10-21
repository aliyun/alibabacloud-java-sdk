// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CheckUpgradeItemRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public String roleFor;

    /**
     * <p>The upgrade item ID.</p>
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
