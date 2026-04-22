// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyEmbodiedAIPlatformShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DeviceCount")
    public String deviceCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eap_platform</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    @NameInMap("RayConfig")
    public String rayConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>large</p>
     */
    @NameInMap("WebserverSpecName")
    public String webserverSpecName;

    public static ModifyEmbodiedAIPlatformShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmbodiedAIPlatformShrinkRequest self = new ModifyEmbodiedAIPlatformShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEmbodiedAIPlatformShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyEmbodiedAIPlatformShrinkRequest setDeviceCount(String deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public String getDeviceCount() {
        return this.deviceCount;
    }

    public ModifyEmbodiedAIPlatformShrinkRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public ModifyEmbodiedAIPlatformShrinkRequest setRayConfigShrink(String rayConfigShrink) {
        this.rayConfigShrink = rayConfigShrink;
        return this;
    }
    public String getRayConfigShrink() {
        return this.rayConfigShrink;
    }

    public ModifyEmbodiedAIPlatformShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEmbodiedAIPlatformShrinkRequest setWebserverSpecName(String webserverSpecName) {
        this.webserverSpecName = webserverSpecName;
        return this;
    }
    public String getWebserverSpecName() {
        return this.webserverSpecName;
    }

}
