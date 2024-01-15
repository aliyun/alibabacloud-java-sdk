// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyEntitlementRequest extends TeaModel {
    /**
     * <p>The cloud desktop ID.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The usernames. You can specify 1 to 100 usernames.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyEntitlementRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEntitlementRequest self = new ModifyEntitlementRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEntitlementRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyEntitlementRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ModifyEntitlementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
