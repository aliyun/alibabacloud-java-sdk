// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteUpgradeRequest extends TeaModel {
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
     * <p>The region of the Data Management center for threat analysis. Select a region for the Management Hub based on the region of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can switch to the perspective of this member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public String roleFor;

    public static ExecuteUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteUpgradeRequest self = new ExecuteUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteUpgradeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteUpgradeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteUpgradeRequest setRoleFor(String roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public String getRoleFor() {
        return this.roleFor;
    }

}
