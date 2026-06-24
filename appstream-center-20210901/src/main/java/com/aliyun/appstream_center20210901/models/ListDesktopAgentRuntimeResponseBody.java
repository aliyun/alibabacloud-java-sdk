// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListDesktopAgentRuntimeResponseBody extends TeaModel {
    /**
     * <p>The list of returned result objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDesktopAgentRuntimeResponseBodyData> data;

    /**
     * <p>The page number.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDesktopAgentRuntimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDesktopAgentRuntimeResponseBody self = new ListDesktopAgentRuntimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDesktopAgentRuntimeResponseBody setData(java.util.List<ListDesktopAgentRuntimeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDesktopAgentRuntimeResponseBodyData> getData() {
        return this.data;
    }

    public ListDesktopAgentRuntimeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDesktopAgentRuntimeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDesktopAgentRuntimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDesktopAgentRuntimeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDesktopAgentRuntimeResponseBodyDataAgentImInfo extends TeaModel {
        /**
         * <p>The agent IM status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AgentImStatus")
        public String agentImStatus;

        /**
         * <p>The CloudSpace status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("CloudSpaceStatus")
        public String cloudSpaceStatus;

        public static ListDesktopAgentRuntimeResponseBodyDataAgentImInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDesktopAgentRuntimeResponseBodyDataAgentImInfo self = new ListDesktopAgentRuntimeResponseBodyDataAgentImInfo();
            return TeaModel.build(map, self);
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentImInfo setAgentImStatus(String agentImStatus) {
            this.agentImStatus = agentImStatus;
            return this;
        }
        public String getAgentImStatus() {
            return this.agentImStatus;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentImInfo setCloudSpaceStatus(String cloudSpaceStatus) {
            this.cloudSpaceStatus = cloudSpaceStatus;
            return this;
        }
        public String getCloudSpaceStatus() {
            return this.cloudSpaceStatus;
        }

    }

    public static class ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList extends TeaModel {
        /**
         * <p>The agent instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("AgentInstanceStatus")
        public String agentInstanceStatus;

        /**
         * <p>The agent instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>2026.3.13</p>
         */
        @NameInMap("AgentInstanceVersion")
        public String agentInstanceVersion;

        @NameInMap("AgentPlatform")
        public String agentPlatform;

        @NameInMap("AgentProvider")
        public String agentProvider;

        /**
         * <p>Indicates whether the agent instance has a configured third-party channel.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChannelConfigure")
        public Boolean channelConfigure;

        /**
         * <p>The list of third-party channels configured for the agent instance.</p>
         */
        @NameInMap("ChannelConfiguredList")
        public java.util.List<String> channelConfiguredList;

        /**
         * <p>The deployment source.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("DeploymentSource")
        public String deploymentSource;

        /**
         * <p>Indicates whether the agent instance has a configured model.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModelConfigure")
        public Boolean modelConfigure;

        /**
         * <p>The configured model group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        public static ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList self = new ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setAgentInstanceStatus(String agentInstanceStatus) {
            this.agentInstanceStatus = agentInstanceStatus;
            return this;
        }
        public String getAgentInstanceStatus() {
            return this.agentInstanceStatus;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setAgentInstanceVersion(String agentInstanceVersion) {
            this.agentInstanceVersion = agentInstanceVersion;
            return this;
        }
        public String getAgentInstanceVersion() {
            return this.agentInstanceVersion;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setAgentPlatform(String agentPlatform) {
            this.agentPlatform = agentPlatform;
            return this;
        }
        public String getAgentPlatform() {
            return this.agentPlatform;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setAgentProvider(String agentProvider) {
            this.agentProvider = agentProvider;
            return this;
        }
        public String getAgentProvider() {
            return this.agentProvider;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setChannelConfigure(Boolean channelConfigure) {
            this.channelConfigure = channelConfigure;
            return this;
        }
        public Boolean getChannelConfigure() {
            return this.channelConfigure;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setChannelConfiguredList(java.util.List<String> channelConfiguredList) {
            this.channelConfiguredList = channelConfiguredList;
            return this;
        }
        public java.util.List<String> getChannelConfiguredList() {
            return this.channelConfiguredList;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setDeploymentSource(String deploymentSource) {
            this.deploymentSource = deploymentSource;
            return this;
        }
        public String getDeploymentSource() {
            return this.deploymentSource;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setModelConfigure(Boolean modelConfigure) {
            this.modelConfigure = modelConfigure;
            return this;
        }
        public Boolean getModelConfigure() {
            return this.modelConfigure;
        }

        public ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

    }

    public static class ListDesktopAgentRuntimeResponseBodyDataResourceGroup extends TeaModel {
        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>resource-group-001</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static ListDesktopAgentRuntimeResponseBodyDataResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            ListDesktopAgentRuntimeResponseBodyDataResourceGroup self = new ListDesktopAgentRuntimeResponseBodyDataResourceGroup();
            return TeaModel.build(map, self);
        }

        public ListDesktopAgentRuntimeResponseBodyDataResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListDesktopAgentRuntimeResponseBodyDataResourceGroup setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

    public static class ListDesktopAgentRuntimeResponseBodyDataRiskInfo extends TeaModel {
        /**
         * <p>Indicates whether the agent is uninstalled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AgentUninstalled")
        public Boolean agentUninstalled;

        /**
         * <p>Indicates whether the third-party channel configuration is modified (inconsistent with the admin-distributed configuration).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChannelModified")
        public Boolean channelModified;

        /**
         * <p>Indicates whether the model configuration is modified (inconsistent with the admin-distributed configuration).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModelModified")
        public Boolean modelModified;

        public static ListDesktopAgentRuntimeResponseBodyDataRiskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDesktopAgentRuntimeResponseBodyDataRiskInfo self = new ListDesktopAgentRuntimeResponseBodyDataRiskInfo();
            return TeaModel.build(map, self);
        }

        public ListDesktopAgentRuntimeResponseBodyDataRiskInfo setAgentUninstalled(Boolean agentUninstalled) {
            this.agentUninstalled = agentUninstalled;
            return this;
        }
        public Boolean getAgentUninstalled() {
            return this.agentUninstalled;
        }

        public ListDesktopAgentRuntimeResponseBodyDataRiskInfo setChannelModified(Boolean channelModified) {
            this.channelModified = channelModified;
            return this;
        }
        public Boolean getChannelModified() {
            return this.channelModified;
        }

        public ListDesktopAgentRuntimeResponseBodyDataRiskInfo setModelModified(Boolean modelModified) {
            this.modelModified = modelModified;
            return this;
        }
        public Boolean getModelModified() {
            return this.modelModified;
        }

    }

    public static class ListDesktopAgentRuntimeResponseBodyData extends TeaModel {
        /**
         * <p>The agent IM information.</p>
         */
        @NameInMap("AgentImInfo")
        public ListDesktopAgentRuntimeResponseBodyDataAgentImInfo agentImInfo;

        /**
         * <p>The list of agent instance information.</p>
         */
        @NameInMap("AgentInstanceInfoList")
        public java.util.List<ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList> agentInstanceInfoList;

        /**
         * <p>The list of authorized users.</p>
         */
        @NameInMap("AuthUsers")
        public java.util.List<String> authUsers;

        /**
         * <p>Indicates whether the agent runtime has a configured third-party channel.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChannelConfigure")
        public Boolean channelConfigure;

        /**
         * <p>The list of third-party channels configured for the agent runtime.</p>
         */
        @NameInMap("ChannelConfiguredList")
        public java.util.List<String> channelConfiguredList;

        /**
         * <p>The agent runtime ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxxx</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The agent runtime name.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent-001</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The cloud computer status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>Indicates whether authorized users exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAuthUser")
        public Boolean hasAuthUser;

        @NameInMap("ManagementStatuses")
        public java.util.List<String> managementStatuses;

        /**
         * <p>Indicates whether the agent runtime has a configured model.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ModelConfigure")
        public Boolean modelConfigure;

        /**
         * <p>The effective model template ID (returned only when modelConfigure=true).</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        /**
         * <p>The effective model template name (returned only when modelConfigure=true).</p>
         * 
         * <strong>example:</strong>
         * <p>model-template-001</p>
         */
        @NameInMap("ModelTemplateName")
        public String modelTemplateName;

        /**
         * <p>The operating system type.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The list of channels in QR code configuration.</p>
         */
        @NameInMap("QrCodeConfiguringList")
        public java.util.List<String> qrCodeConfiguringList;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region location (domestic/overseas).</p>
         * 
         * <strong>example:</strong>
         * <p>Mainland</p>
         */
        @NameInMap("RegionLocation")
        public String regionLocation;

        /**
         * <p>The resource group information.</p>
         */
        @NameInMap("ResourceGroup")
        public ListDesktopAgentRuntimeResponseBodyDataResourceGroup resourceGroup;

        /**
         * <p>The resource ID, which is the cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The risk information (returned only when the request parameter IncludeRiskInfo is set to true, otherwise null).</p>
         */
        @NameInMap("RiskInfo")
        public ListDesktopAgentRuntimeResponseBodyDataRiskInfo riskInfo;

        public static ListDesktopAgentRuntimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDesktopAgentRuntimeResponseBodyData self = new ListDesktopAgentRuntimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDesktopAgentRuntimeResponseBodyData setAgentImInfo(ListDesktopAgentRuntimeResponseBodyDataAgentImInfo agentImInfo) {
            this.agentImInfo = agentImInfo;
            return this;
        }
        public ListDesktopAgentRuntimeResponseBodyDataAgentImInfo getAgentImInfo() {
            return this.agentImInfo;
        }

        public ListDesktopAgentRuntimeResponseBodyData setAgentInstanceInfoList(java.util.List<ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList> agentInstanceInfoList) {
            this.agentInstanceInfoList = agentInstanceInfoList;
            return this;
        }
        public java.util.List<ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList> getAgentInstanceInfoList() {
            return this.agentInstanceInfoList;
        }

        public ListDesktopAgentRuntimeResponseBodyData setAuthUsers(java.util.List<String> authUsers) {
            this.authUsers = authUsers;
            return this;
        }
        public java.util.List<String> getAuthUsers() {
            return this.authUsers;
        }

        public ListDesktopAgentRuntimeResponseBodyData setChannelConfigure(Boolean channelConfigure) {
            this.channelConfigure = channelConfigure;
            return this;
        }
        public Boolean getChannelConfigure() {
            return this.channelConfigure;
        }

        public ListDesktopAgentRuntimeResponseBodyData setChannelConfiguredList(java.util.List<String> channelConfiguredList) {
            this.channelConfiguredList = channelConfiguredList;
            return this;
        }
        public java.util.List<String> getChannelConfiguredList() {
            return this.channelConfiguredList;
        }

        public ListDesktopAgentRuntimeResponseBodyData setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ListDesktopAgentRuntimeResponseBodyData setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public ListDesktopAgentRuntimeResponseBodyData setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public ListDesktopAgentRuntimeResponseBodyData setHasAuthUser(Boolean hasAuthUser) {
            this.hasAuthUser = hasAuthUser;
            return this;
        }
        public Boolean getHasAuthUser() {
            return this.hasAuthUser;
        }

        public ListDesktopAgentRuntimeResponseBodyData setManagementStatuses(java.util.List<String> managementStatuses) {
            this.managementStatuses = managementStatuses;
            return this;
        }
        public java.util.List<String> getManagementStatuses() {
            return this.managementStatuses;
        }

        public ListDesktopAgentRuntimeResponseBodyData setModelConfigure(Boolean modelConfigure) {
            this.modelConfigure = modelConfigure;
            return this;
        }
        public Boolean getModelConfigure() {
            return this.modelConfigure;
        }

        public ListDesktopAgentRuntimeResponseBodyData setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        public ListDesktopAgentRuntimeResponseBodyData setModelTemplateName(String modelTemplateName) {
            this.modelTemplateName = modelTemplateName;
            return this;
        }
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        public ListDesktopAgentRuntimeResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListDesktopAgentRuntimeResponseBodyData setQrCodeConfiguringList(java.util.List<String> qrCodeConfiguringList) {
            this.qrCodeConfiguringList = qrCodeConfiguringList;
            return this;
        }
        public java.util.List<String> getQrCodeConfiguringList() {
            return this.qrCodeConfiguringList;
        }

        public ListDesktopAgentRuntimeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDesktopAgentRuntimeResponseBodyData setRegionLocation(String regionLocation) {
            this.regionLocation = regionLocation;
            return this;
        }
        public String getRegionLocation() {
            return this.regionLocation;
        }

        public ListDesktopAgentRuntimeResponseBodyData setResourceGroup(ListDesktopAgentRuntimeResponseBodyDataResourceGroup resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public ListDesktopAgentRuntimeResponseBodyDataResourceGroup getResourceGroup() {
            return this.resourceGroup;
        }

        public ListDesktopAgentRuntimeResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListDesktopAgentRuntimeResponseBodyData setRiskInfo(ListDesktopAgentRuntimeResponseBodyDataRiskInfo riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public ListDesktopAgentRuntimeResponseBodyDataRiskInfo getRiskInfo() {
            return this.riskInfo;
        }

    }

}
