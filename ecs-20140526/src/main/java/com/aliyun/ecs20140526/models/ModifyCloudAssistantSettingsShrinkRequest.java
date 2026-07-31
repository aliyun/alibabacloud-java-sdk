// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsShrinkRequest extends TeaModel {
    /**
     * <p>The Cloud Assistant Agent upgrade configuration.</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public String agentUpgradeConfigShrink;

    /**
     * <p>The OSS delivery configuration.</p>
     */
    @NameInMap("OssDeliveryConfig")
    public String ossDeliveryConfigShrink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Cloud Assistant resource usage configuration. This parameter takes effect only when the Cloud Assistant Agent version meets the following minimum requirements:</p>
     * <ul>
     * <li><p>Windows: 2.1.4.1065</p>
     * </li>
     * <li><p>Linux: 2.2.4.1065</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourceUsageConfig")
    public String resourceUsageConfigShrink;

    /**
     * <p>The Cloud Assistant session feature configuration.</p>
     */
    @NameInMap("SessionManagerConfig")
    public String sessionManagerConfigShrink;

    /**
     * <p>The service configuration type. Valid values:</p>
     * <ul>
     * <li>SessionManagerDelivery: session operation log delivery.</li>
     * <li>InvocationDelivery: task execution log delivery.</li>
     * <li>AgentUpgradeConfig: Cloud Assistant Agent upgrade configuration.</li>
     * <li>SessionManagerConfig: Cloud Assistant SessionManager configuration.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionManagerDelivery</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The Simple Log Service (SLS) delivery configuration.</p>
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

    public ModifyCloudAssistantSettingsShrinkRequest setResourceUsageConfigShrink(String resourceUsageConfigShrink) {
        this.resourceUsageConfigShrink = resourceUsageConfigShrink;
        return this;
    }
    public String getResourceUsageConfigShrink() {
        return this.resourceUsageConfigShrink;
    }

    public ModifyCloudAssistantSettingsShrinkRequest setSessionManagerConfigShrink(String sessionManagerConfigShrink) {
        this.sessionManagerConfigShrink = sessionManagerConfigShrink;
        return this;
    }
    public String getSessionManagerConfigShrink() {
        return this.sessionManagerConfigShrink;
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
