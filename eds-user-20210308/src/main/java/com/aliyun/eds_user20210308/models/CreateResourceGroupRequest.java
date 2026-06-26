// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateResourceGroupRequest extends TeaModel {
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    @NameInMap("EnableAliyunResourceGroup")
    public Boolean enableAliyunResourceGroup;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsResourceGroupWithOfficeSite")
    public Long isResourceGroupWithOfficeSite;

    /**
     * <p>For WUYING Workspace Enterprise Edition, set this parameter to <code>AliyunConsole</code>. Other platforms are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunConsole</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceClassification")
    public String resourceClassification;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>部门A资源组</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static CreateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupRequest self = new CreateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public CreateResourceGroupRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public CreateResourceGroupRequest setEnableAliyunResourceGroup(Boolean enableAliyunResourceGroup) {
        this.enableAliyunResourceGroup = enableAliyunResourceGroup;
        return this;
    }
    public Boolean getEnableAliyunResourceGroup() {
        return this.enableAliyunResourceGroup;
    }

    public CreateResourceGroupRequest setIsResourceGroupWithOfficeSite(Long isResourceGroupWithOfficeSite) {
        this.isResourceGroupWithOfficeSite = isResourceGroupWithOfficeSite;
        return this;
    }
    public Long getIsResourceGroupWithOfficeSite() {
        return this.isResourceGroupWithOfficeSite;
    }

    public CreateResourceGroupRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateResourceGroupRequest setResourceClassification(String resourceClassification) {
        this.resourceClassification = resourceClassification;
        return this;
    }
    public String getResourceClassification() {
        return this.resourceClassification;
    }

    public CreateResourceGroupRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
