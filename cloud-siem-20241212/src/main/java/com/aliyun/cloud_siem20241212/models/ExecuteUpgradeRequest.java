// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteUpgradeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
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
