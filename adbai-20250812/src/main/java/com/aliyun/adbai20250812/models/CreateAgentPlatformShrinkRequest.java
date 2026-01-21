// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateAgentPlatformShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AiPlatformConfig")
    public String aiPlatformConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testplatform</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateAgentPlatformShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentPlatformShrinkRequest self = new CreateAgentPlatformShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentPlatformShrinkRequest setAiPlatformConfigShrink(String aiPlatformConfigShrink) {
        this.aiPlatformConfigShrink = aiPlatformConfigShrink;
        return this;
    }
    public String getAiPlatformConfigShrink() {
        return this.aiPlatformConfigShrink;
    }

    public CreateAgentPlatformShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgentPlatformShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentPlatformShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
