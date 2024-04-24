// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsShrinkRequest extends TeaModel {
    /**
     * <p>The configurations for upgrading Cloud Assistant Agent.</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public String agentUpgradeConfigShrink;

    /**
     * <p>The configurations for delivering records to Object Storage Service (OSS).</p>
     */
    @NameInMap("OssDeliveryConfig")
    public String ossDeliveryConfigShrink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Cloud Assistant feature. Valid values:</p>
     * <br>
     * <p>*   SessionManagerDelivery: the Session Record Delivery feature</p>
     * <p>*   InvocationDelivery: the Operation Content and Result Delivery feature</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The configurations for delivering records to Simple Log Service.</p>
     */
    @NameInMap("SlsDeliveryConfig")
    public String slsDeliveryConfigShrink;

    public static ModifyCloudAssistantSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudAssistantSettingsShrinkRequest self = new ModifyCloudAssistantSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudAssistantSettingsShrinkRequest setAgentUpgradeConfigShrink(String agentUpgradeConfigShrink) {
        this.agentUpgradeConfigShrink = agentUpgradeConfigShrink;
        return this;
    }
    public String getAgentUpgradeConfigShrink() {
        return this.agentUpgradeConfigShrink;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setOssDeliveryConfigShrink(String ossDeliveryConfigShrink) {
        this.ossDeliveryConfigShrink = ossDeliveryConfigShrink;
        return this;
    }
    public String getOssDeliveryConfigShrink() {
        return this.ossDeliveryConfigShrink;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setSlsDeliveryConfigShrink(String slsDeliveryConfigShrink) {
        this.slsDeliveryConfigShrink = slsDeliveryConfigShrink;
        return this;
    }
    public String getSlsDeliveryConfigShrink() {
        return this.slsDeliveryConfigShrink;
    }

}
