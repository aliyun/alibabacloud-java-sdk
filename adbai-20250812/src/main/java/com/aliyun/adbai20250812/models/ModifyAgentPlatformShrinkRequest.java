// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyAgentPlatformShrinkRequest extends TeaModel {
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
     * <p>test_platform</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAgentPlatformShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentPlatformShrinkRequest self = new ModifyAgentPlatformShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentPlatformShrinkRequest setAiPlatformConfigShrink(String aiPlatformConfigShrink) {
        this.aiPlatformConfigShrink = aiPlatformConfigShrink;
        return this;
    }
    public String getAiPlatformConfigShrink() {
        return this.aiPlatformConfigShrink;
    }

    public ModifyAgentPlatformShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAgentPlatformShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAgentPlatformShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
