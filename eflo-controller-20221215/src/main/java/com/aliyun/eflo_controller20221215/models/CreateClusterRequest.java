// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Components")
    public java.util.List<CreateClusterRequestComponents> components;

    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    @NameInMap("Networks")
    public CreateClusterRequestNetworks networks;

    @NameInMap("NodeGroups")
    public java.util.List<CreateClusterRequestNodeGroups> nodeGroups;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<CreateClusterRequestTag> tag;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public CreateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setComponents(java.util.List<CreateClusterRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateClusterRequestComponents> getComponents() {
        return this.components;
    }

    public CreateClusterRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public CreateClusterRequest setNetworks(CreateClusterRequestNetworks networks) {
        this.networks = networks;
        return this;
    }
    public CreateClusterRequestNetworks getNetworks() {
        return this.networks;
    }

    public CreateClusterRequest setNodeGroups(java.util.List<CreateClusterRequestNodeGroups> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<CreateClusterRequestNodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setTag(java.util.List<CreateClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateClusterRequestComponentsComponentConfig extends TeaModel {
        @NameInMap("BasicArgs")
        public Object basicArgs;

        @NameInMap("NodeUnits")
        public java.util.List<?> nodeUnits;

        public static CreateClusterRequestComponentsComponentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestComponentsComponentConfig self = new CreateClusterRequestComponentsComponentConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestComponentsComponentConfig setBasicArgs(Object basicArgs) {
            this.basicArgs = basicArgs;
            return this;
        }
        public Object getBasicArgs() {
            return this.basicArgs;
        }

        public CreateClusterRequestComponentsComponentConfig setNodeUnits(java.util.List<?> nodeUnits) {
            this.nodeUnits = nodeUnits;
            return this;
        }
        public java.util.List<?> getNodeUnits() {
            return this.nodeUnits;
        }

    }

    public static class CreateClusterRequestComponents extends TeaModel {
        @NameInMap("ComponentConfig")
        public CreateClusterRequestComponentsComponentConfig componentConfig;

        @NameInMap("ComponentType")
        public String componentType;

        public static CreateClusterRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestComponents self = new CreateClusterRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestComponents setComponentConfig(CreateClusterRequestComponentsComponentConfig componentConfig) {
            this.componentConfig = componentConfig;
            return this;
        }
        public CreateClusterRequestComponentsComponentConfig getComponentConfig() {
            return this.componentConfig;
        }

        public CreateClusterRequestComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

    }

    public static class CreateClusterRequestNetworksNewVpdInfoVpdSubnets extends TeaModel {
        @NameInMap("SubnetCidr")
        public String subnetCidr;

        @NameInMap("SubnetType")
        public String subnetType;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateClusterRequestNetworksNewVpdInfoVpdSubnets build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksNewVpdInfoVpdSubnets self = new CreateClusterRequestNetworksNewVpdInfoVpdSubnets();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksNewVpdInfoVpdSubnets setSubnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        public CreateClusterRequestNetworksNewVpdInfoVpdSubnets setSubnetType(String subnetType) {
            this.subnetType = subnetType;
            return this;
        }
        public String getSubnetType() {
            return this.subnetType;
        }

        public CreateClusterRequestNetworksNewVpdInfoVpdSubnets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateClusterRequestNetworksNewVpdInfo extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CloudLinkCidr")
        public String cloudLinkCidr;

        @NameInMap("CloudLinkId")
        public String cloudLinkId;

        @NameInMap("MonitorVpcId")
        public String monitorVpcId;

        @NameInMap("MonitorVswitchId")
        public String monitorVswitchId;

        @NameInMap("VpdCidr")
        public String vpdCidr;

        @NameInMap("VpdSubnets")
        public java.util.List<CreateClusterRequestNetworksNewVpdInfoVpdSubnets> vpdSubnets;

        public static CreateClusterRequestNetworksNewVpdInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksNewVpdInfo self = new CreateClusterRequestNetworksNewVpdInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksNewVpdInfo setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public CreateClusterRequestNetworksNewVpdInfo setCloudLinkCidr(String cloudLinkCidr) {
            this.cloudLinkCidr = cloudLinkCidr;
            return this;
        }
        public String getCloudLinkCidr() {
            return this.cloudLinkCidr;
        }

        public CreateClusterRequestNetworksNewVpdInfo setCloudLinkId(String cloudLinkId) {
            this.cloudLinkId = cloudLinkId;
            return this;
        }
        public String getCloudLinkId() {
            return this.cloudLinkId;
        }

        public CreateClusterRequestNetworksNewVpdInfo setMonitorVpcId(String monitorVpcId) {
            this.monitorVpcId = monitorVpcId;
            return this;
        }
        public String getMonitorVpcId() {
            return this.monitorVpcId;
        }

        public CreateClusterRequestNetworksNewVpdInfo setMonitorVswitchId(String monitorVswitchId) {
            this.monitorVswitchId = monitorVswitchId;
            return this;
        }
        public String getMonitorVswitchId() {
            return this.monitorVswitchId;
        }

        public CreateClusterRequestNetworksNewVpdInfo setVpdCidr(String vpdCidr) {
            this.vpdCidr = vpdCidr;
            return this;
        }
        public String getVpdCidr() {
            return this.vpdCidr;
        }

        public CreateClusterRequestNetworksNewVpdInfo setVpdSubnets(java.util.List<CreateClusterRequestNetworksNewVpdInfoVpdSubnets> vpdSubnets) {
            this.vpdSubnets = vpdSubnets;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksNewVpdInfoVpdSubnets> getVpdSubnets() {
            return this.vpdSubnets;
        }

    }

    public static class CreateClusterRequestNetworksVpdInfo extends TeaModel {
        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("VpdSubnets")
        public java.util.List<String> vpdSubnets;

        public static CreateClusterRequestNetworksVpdInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksVpdInfo self = new CreateClusterRequestNetworksVpdInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksVpdInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public CreateClusterRequestNetworksVpdInfo setVpdSubnets(java.util.List<String> vpdSubnets) {
            this.vpdSubnets = vpdSubnets;
            return this;
        }
        public java.util.List<String> getVpdSubnets() {
            return this.vpdSubnets;
        }

    }

    public static class CreateClusterRequestNetworks extends TeaModel {
        @NameInMap("NewVpdInfo")
        public CreateClusterRequestNetworksNewVpdInfo newVpdInfo;

        @NameInMap("VpdInfo")
        public CreateClusterRequestNetworksVpdInfo vpdInfo;

        public static CreateClusterRequestNetworks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworks self = new CreateClusterRequestNetworks();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworks setNewVpdInfo(CreateClusterRequestNetworksNewVpdInfo newVpdInfo) {
            this.newVpdInfo = newVpdInfo;
            return this;
        }
        public CreateClusterRequestNetworksNewVpdInfo getNewVpdInfo() {
            return this.newVpdInfo;
        }

        public CreateClusterRequestNetworks setVpdInfo(CreateClusterRequestNetworksVpdInfo vpdInfo) {
            this.vpdInfo = vpdInfo;
            return this;
        }
        public CreateClusterRequestNetworksVpdInfo getVpdInfo() {
            return this.vpdInfo;
        }

    }

    public static class CreateClusterRequestNodeGroupsNodes extends TeaModel {
        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("LoginPassword")
        public String loginPassword;

        @NameInMap("NodeId")
        public String nodeId;

        public static CreateClusterRequestNodeGroupsNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNodeGroupsNodes self = new CreateClusterRequestNodeGroupsNodes();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNodeGroupsNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public CreateClusterRequestNodeGroupsNodes setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public CreateClusterRequestNodeGroupsNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class CreateClusterRequestNodeGroups extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("NodeGroupDescription")
        public String nodeGroupDescription;

        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        @NameInMap("Nodes")
        public java.util.List<CreateClusterRequestNodeGroupsNodes> nodes;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateClusterRequestNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNodeGroups self = new CreateClusterRequestNodeGroups();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNodeGroups setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterRequestNodeGroups setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public CreateClusterRequestNodeGroups setNodeGroupDescription(String nodeGroupDescription) {
            this.nodeGroupDescription = nodeGroupDescription;
            return this;
        }
        public String getNodeGroupDescription() {
            return this.nodeGroupDescription;
        }

        public CreateClusterRequestNodeGroups setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public CreateClusterRequestNodeGroups setNodes(java.util.List<CreateClusterRequestNodeGroupsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<CreateClusterRequestNodeGroupsNodes> getNodes() {
            return this.nodes;
        }

        public CreateClusterRequestNodeGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateClusterRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestTag self = new CreateClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
