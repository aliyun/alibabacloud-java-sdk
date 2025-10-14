// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CheckUpgradeItemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public String roleFor;

    /**
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
