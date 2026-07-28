// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateEmbodiedAIPlatformShrinkRequest extends TeaModel {
    /**
     * <p>The instance cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ontology count.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DeviceCount")
    public Integer deviceCount;

    /**
     * <p>The name of the embodied intelligence multimodal data platform.</p>
     * <blockquote>
     * <p>The name can contain lowercase letters, digits, and underscores. It must start with a letter and end with a letter or digit. The name can be up to 16 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>platform1</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    /**
     * <p>The Ray specification information of the platform.</p>
     */
    @NameInMap("RayConfig")
    public String rayConfigShrink;

    /**
     * <p>The development and training resource configuration.</p>
     */
    @NameInMap("RayTrainConfig")
    public String rayTrainConfigShrink;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The webserver specification of the platform.</p>
     * 
     * <strong>example:</strong>
     * <p>large</p>
     */
    @NameInMap("WebserverSpecName")
    public String webserverSpecName;

    public static CreateEmbodiedAIPlatformShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEmbodiedAIPlatformShrinkRequest self = new CreateEmbodiedAIPlatformShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEmbodiedAIPlatformShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateEmbodiedAIPlatformShrinkRequest setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

    public CreateEmbodiedAIPlatformShrinkRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public CreateEmbodiedAIPlatformShrinkRequest setRayConfigShrink(String rayConfigShrink) {
        this.rayConfigShrink = rayConfigShrink;
        return this;
    }
    public String getRayConfigShrink() {
        return this.rayConfigShrink;
    }

    public CreateEmbodiedAIPlatformShrinkRequest setRayTrainConfigShrink(String rayTrainConfigShrink) {
        this.rayTrainConfigShrink = rayTrainConfigShrink;
        return this;
    }
    public String getRayTrainConfigShrink() {
        return this.rayTrainConfigShrink;
    }

    public CreateEmbodiedAIPlatformShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEmbodiedAIPlatformShrinkRequest setWebserverSpecName(String webserverSpecName) {
        this.webserverSpecName = webserverSpecName;
        return this;
    }
    public String getWebserverSpecName() {
        return this.webserverSpecName;
    }

}
