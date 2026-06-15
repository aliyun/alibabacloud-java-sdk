// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of upgrading the Cloud Assistant agent.</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public String agentUpgradeConfigShrink;

    /**
     * <p>The configurations of delivering records to OSS.</p>
     */
    @NameInMap("OssDeliveryConfig")
    public String ossDeliveryConfigShrink;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
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
     * <p>The configurations of resource usage for Cloud Assistant. This setting takes effect only when the version of the Cloud Assistant agent is not earlier than the following versions:</p>
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
     * <p>The configurations of the Session Manager feature.</p>
     */
    @NameInMap("SessionManagerConfig")
    public String sessionManagerConfigShrink;

    /**
     * <p>The type of the service configurations. Valid values:</p>
     * <ul>
     * <li><p><code>SessionManagerDelivery</code>: the configurations of delivering session records.</p>
     * </li>
     * <li><p><code>InvocationDelivery</code>: the configurations of delivering command execution records.</p>
     * </li>
     * <li><p><code>AgentUpgradeConfig</code>: the configurations of upgrading the Cloud Assistant agent.</p>
     * </li>
     * <li><p><code>SessionManagerConfig</code>: the configurations of Cloud Assistant Session Manager.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionManagerDelivery</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The configurations of delivering records to SLS.</p>
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
