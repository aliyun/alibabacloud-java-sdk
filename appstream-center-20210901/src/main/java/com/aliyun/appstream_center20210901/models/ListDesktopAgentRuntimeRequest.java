// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListDesktopAgentRuntimeRequest extends TeaModel {
    /**
     * <p>The list of agent instance statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("AgentInstanceStatuses")
    public java.util.List<String> agentInstanceStatuses;

    /**
     * <p>The list of agent instance versions.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw 2026.4.15</p>
     */
    @NameInMap("AgentInstanceVersions")
    public java.util.List<String> agentInstanceVersions;

    /**
     * <p>The agent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The name of the agent provider.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The list of authorized users.</p>
     * 
     * <strong>example:</strong>
     * <p>user001</p>
     */
    @NameInMap("AuthUsers")
    public java.util.List<String> authUsers;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>Specifies whether the third-party channel is configured.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ChannelConfigure")
    public Boolean channelConfigure;

    /**
     * <p>The deployment source.</p>
     * 
     * <strong>example:</strong>
     * <p>Admin</p>
     */
    @NameInMap("DeploymentSource")
    public String deploymentSource;

    /**
     * <p>The list of agent runtime IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>jvs-xxxxx</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The list of agent runtime names.</p>
     * 
     * <strong>example:</strong>
     * <p>Desktop001</p>
     */
    @NameInMap("DesktopNames")
    public java.util.List<String> desktopNames;

    /**
     * <p>The list of cloud computer statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DesktopStatuses")
    public java.util.List<String> desktopStatuses;

    /**
     * <p>Specifies whether authorized users exist.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAuthUser")
    public Boolean hasAuthUser;

    /**
     * <p>Specifies whether a risk exists. Used to filter cloud computers with or without risks. This parameter takes effect only when IncludeRiskInfo is set to true.</p>
     * <p>Set to true to return only records with risks. Set to false to return only records without risks. If not specified, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasRisk")
    public Boolean hasRisk;

    /**
     * <p>Specifies whether to query and return risk information. Default value: false. When set to true, the response includes the RiskInfo field, and the HasRisk filter condition takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRiskInfo")
    public Boolean includeRiskInfo;

    /**
     * <strong>example:</strong>
     * <p>Hibernated</p>
     */
    @NameInMap("ManagementStatus")
    public String managementStatus;

    /**
     * <p>Specifies whether the model is configured.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModelConfigure")
    public Boolean modelConfigure;

    /**
     * <p>The model group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The page number, starting from 1. Values 0 and 1 return the same result.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resource IDs (underlying real resource IDs).</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-xxxxx</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    public static ListDesktopAgentRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDesktopAgentRuntimeRequest self = new ListDesktopAgentRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public ListDesktopAgentRuntimeRequest setAgentInstanceStatuses(java.util.List<String> agentInstanceStatuses) {
        this.agentInstanceStatuses = agentInstanceStatuses;
        return this;
    }
    public java.util.List<String> getAgentInstanceStatuses() {
        return this.agentInstanceStatuses;
    }

    public ListDesktopAgentRuntimeRequest setAgentInstanceVersions(java.util.List<String> agentInstanceVersions) {
        this.agentInstanceVersions = agentInstanceVersions;
        return this;
    }
    public java.util.List<String> getAgentInstanceVersions() {
        return this.agentInstanceVersions;
    }

    public ListDesktopAgentRuntimeRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ListDesktopAgentRuntimeRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public ListDesktopAgentRuntimeRequest setAuthUsers(java.util.List<String> authUsers) {
        this.authUsers = authUsers;
        return this;
    }
    public java.util.List<String> getAuthUsers() {
        return this.authUsers;
    }

    public ListDesktopAgentRuntimeRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListDesktopAgentRuntimeRequest setChannelConfigure(Boolean channelConfigure) {
        this.channelConfigure = channelConfigure;
        return this;
    }
    public Boolean getChannelConfigure() {
        return this.channelConfigure;
    }

    public ListDesktopAgentRuntimeRequest setDeploymentSource(String deploymentSource) {
        this.deploymentSource = deploymentSource;
        return this;
    }
    public String getDeploymentSource() {
        return this.deploymentSource;
    }

    public ListDesktopAgentRuntimeRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public ListDesktopAgentRuntimeRequest setDesktopNames(java.util.List<String> desktopNames) {
        this.desktopNames = desktopNames;
        return this;
    }
    public java.util.List<String> getDesktopNames() {
        return this.desktopNames;
    }

    public ListDesktopAgentRuntimeRequest setDesktopStatuses(java.util.List<String> desktopStatuses) {
        this.desktopStatuses = desktopStatuses;
        return this;
    }
    public java.util.List<String> getDesktopStatuses() {
        return this.desktopStatuses;
    }

    public ListDesktopAgentRuntimeRequest setHasAuthUser(Boolean hasAuthUser) {
        this.hasAuthUser = hasAuthUser;
        return this;
    }
    public Boolean getHasAuthUser() {
        return this.hasAuthUser;
    }

    public ListDesktopAgentRuntimeRequest setHasRisk(Boolean hasRisk) {
        this.hasRisk = hasRisk;
        return this;
    }
    public Boolean getHasRisk() {
        return this.hasRisk;
    }

    public ListDesktopAgentRuntimeRequest setIncludeRiskInfo(Boolean includeRiskInfo) {
        this.includeRiskInfo = includeRiskInfo;
        return this;
    }
    public Boolean getIncludeRiskInfo() {
        return this.includeRiskInfo;
    }

    public ListDesktopAgentRuntimeRequest setManagementStatus(String managementStatus) {
        this.managementStatus = managementStatus;
        return this;
    }
    public String getManagementStatus() {
        return this.managementStatus;
    }

    public ListDesktopAgentRuntimeRequest setModelConfigure(Boolean modelConfigure) {
        this.modelConfigure = modelConfigure;
        return this;
    }
    public Boolean getModelConfigure() {
        return this.modelConfigure;
    }

    public ListDesktopAgentRuntimeRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public ListDesktopAgentRuntimeRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDesktopAgentRuntimeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDesktopAgentRuntimeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDesktopAgentRuntimeRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}
