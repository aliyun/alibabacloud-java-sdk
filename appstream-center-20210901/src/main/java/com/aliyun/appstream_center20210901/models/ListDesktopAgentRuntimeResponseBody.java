// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListDesktopAgentRuntimeResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListDesktopAgentRuntimeResponseBodyData> data;

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
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AgentImStatus")
        public String agentImStatus;

        /**
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
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("AgentInstanceStatus")
        public String agentInstanceStatus;

        /**
         * <strong>example:</strong>
         * <p>2026.3.13</p>
         */
        @NameInMap("AgentInstanceVersion")
        public String agentInstanceVersion;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChannelConfigure")
        public Boolean channelConfigure;

        @NameInMap("ChannelConfiguredList")
        public java.util.List<String> channelConfiguredList;

        /**
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("DeploymentSource")
        public String deploymentSource;

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
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AgentUninstalled")
        public Boolean agentUninstalled;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChannelModified")
        public Boolean channelModified;

        /**
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
        @NameInMap("AgentImInfo")
        public ListDesktopAgentRuntimeResponseBodyDataAgentImInfo agentImInfo;

        @NameInMap("AgentInstanceInfoList")
        public java.util.List<ListDesktopAgentRuntimeResponseBodyDataAgentInstanceInfoList> agentInstanceInfoList;

        @NameInMap("AuthUsers")
        public java.util.List<String> authUsers;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChannelConfigure")
        public Boolean channelConfigure;

        @NameInMap("ChannelConfiguredList")
        public java.util.List<String> channelConfiguredList;

        /**
         * <strong>example:</strong>
         * <p>ecd-xxxx</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>Agent-001</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

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
        @NameInMap("ModelConfigure")
        public Boolean modelConfigure;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroup")
        public ListDesktopAgentRuntimeResponseBodyDataResourceGroup resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>ecd-xxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

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

        public ListDesktopAgentRuntimeResponseBodyData setModelConfigure(Boolean modelConfigure) {
            this.modelConfigure = modelConfigure;
            return this;
        }
        public Boolean getModelConfigure() {
            return this.modelConfigure;
        }

        public ListDesktopAgentRuntimeResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
