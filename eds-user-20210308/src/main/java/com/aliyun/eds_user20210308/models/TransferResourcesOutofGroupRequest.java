// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesOutofGroupRequest extends TeaModel {
    /**
     * <p>The software blacklists and whitelists rule ID to associate with the resources after they are moved out of the resource group. This parameter is used only for pure move-out operations and cannot be set together with TargetResourceGroupId. If this parameter is left empty, no rule is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>bwr-47wdwfe5x3ql7qwf4</p>
     */
    @NameInMap("AppRuleId")
    public String appRuleId;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <blockquote>
     * <p>Fixed value: AliyunConsole.</p>
     * <ul>
     * <li>For Wuying Enterprise Edition, set this parameter to AliyunConsole. Other platforms are not publicly available.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AliyunConsole</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The policy ID to associate with the resources after they are moved out of the resource group. This parameter is used only for pure move-out operations and cannot be specified together with TargetResourceGroupId. If this parameter is left empty, the system default behavior is used.</p>
     * 
     * <strong>example:</strong>
     * <p>system-all-enabled-policy</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-66konqltcpx43****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<TransferResourcesOutofGroupRequestResources> resources;

    /**
     * <p>The ID of the target resource group to which you want to move the resources.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-hcjo6dugpo1****</p>
     */
    @NameInMap("TargetResourceGroupId")
    public String targetResourceGroupId;

    /**
     * <p>The scheduled task ID to associate with the resources after they are moved out of the resource group. This parameter is used only for pure move-out operations and cannot be specified together with TargetResourceGroupId. If this parameter is left empty, no scheduled task is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0bf5d87dtipve4aqt</p>
     */
    @NameInMap("TimerId")
    public String timerId;

    public static TransferResourcesOutofGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesOutofGroupRequest self = new TransferResourcesOutofGroupRequest();
        return TeaModel.build(map, self);
    }

    public TransferResourcesOutofGroupRequest setAppRuleId(String appRuleId) {
        this.appRuleId = appRuleId;
        return this;
    }
    public String getAppRuleId() {
        return this.appRuleId;
    }

    public TransferResourcesOutofGroupRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public TransferResourcesOutofGroupRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public TransferResourcesOutofGroupRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public TransferResourcesOutofGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public TransferResourcesOutofGroupRequest setResources(java.util.List<TransferResourcesOutofGroupRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<TransferResourcesOutofGroupRequestResources> getResources() {
        return this.resources;
    }

    public TransferResourcesOutofGroupRequest setTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    public TransferResourcesOutofGroupRequest setTimerId(String timerId) {
        this.timerId = timerId;
        return this;
    }
    public String getTimerId() {
        return this.timerId;
    }

    public static class TransferResourcesOutofGroupRequestResources extends TeaModel {
        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-1shc5sk0vo****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static TransferResourcesOutofGroupRequestResources build(java.util.Map<String, ?> map) throws Exception {
            TransferResourcesOutofGroupRequestResources self = new TransferResourcesOutofGroupRequestResources();
            return TeaModel.build(map, self);
        }

        public TransferResourcesOutofGroupRequestResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public TransferResourcesOutofGroupRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public TransferResourcesOutofGroupRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
