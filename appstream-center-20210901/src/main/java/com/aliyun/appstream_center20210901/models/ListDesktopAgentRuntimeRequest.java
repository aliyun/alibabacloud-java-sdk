// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListDesktopAgentRuntimeRequest extends TeaModel {
    @NameInMap("AgentInstanceStatuses")
    public java.util.List<String> agentInstanceStatuses;

    @NameInMap("AgentInstanceVersions")
    public java.util.List<String> agentInstanceVersions;

    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    @NameInMap("AuthUsers")
    public java.util.List<String> authUsers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ChannelConfigure")
    public Boolean channelConfigure;

    /**
     * <strong>example:</strong>
     * <p>Admin</p>
     */
    @NameInMap("DeploymentSource")
    public String deploymentSource;

    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    @NameInMap("DesktopNames")
    public java.util.List<String> desktopNames;

    @NameInMap("DesktopStatuses")
    public java.util.List<String> desktopStatuses;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAuthUser")
    public Boolean hasAuthUser;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasRisk")
    public Boolean hasRisk;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRiskInfo")
    public Boolean includeRiskInfo;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModelConfigure")
    public Boolean modelConfigure;

    /**
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>rg-xxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
