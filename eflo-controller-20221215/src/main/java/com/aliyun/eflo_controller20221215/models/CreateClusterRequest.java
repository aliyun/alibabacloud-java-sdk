// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>Cluster description</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster description</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>Cluster name</p>
     * 
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Cluster type</p>
     * 
     * <strong>example:</strong>
     * <p>Lite</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Components (software instances)</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateClusterRequestComponents> components;

    /**
     * <p>Cluster number</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>Whether to allow skipping failed nodes, default value is False</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>Network information</p>
     */
    @NameInMap("Networks")
    public CreateClusterRequestNetworks networks;

    /**
     * <p>Node VSwitches</p>
     */
    @NameInMap("NimizVSwitches")
    public java.util.List<String> nimizVSwitches;

    /**
     * <p>Node group list</p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<CreateClusterRequestNodeGroups> nodeGroups;

    /**
     * <p>Open Eni Jumbo Frame</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenEniJumboFrame")
    public Boolean openEniJumboFrame;

    /**
     * <p>Resource group ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2xdkc6icwfha</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource tags</p>
     */
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

    public CreateClusterRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
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

    public CreateClusterRequest setNimizVSwitches(java.util.List<String> nimizVSwitches) {
        this.nimizVSwitches = nimizVSwitches;
        return this;
    }
    public java.util.List<String> getNimizVSwitches() {
        return this.nimizVSwitches;
    }

    public CreateClusterRequest setNodeGroups(java.util.List<CreateClusterRequestNodeGroups> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<CreateClusterRequestNodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    public CreateClusterRequest setOpenEniJumboFrame(Boolean openEniJumboFrame) {
        this.openEniJumboFrame = openEniJumboFrame;
        return this;
    }
    public Boolean getOpenEniJumboFrame() {
        return this.openEniJumboFrame;
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
        /**
         * <p>Basic component parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;EndpointPublicAccess&quot;: false,
         *       &quot;ContainerCidr&quot;: &quot;10.4.0.0/24&quot;,
         *       &quot;KeyPair&quot;: &quot;test&quot;,
         *       &quot;NodeCidrMask&quot;: &quot;25&quot;,
         *       &quot;ResourceGroupId&quot;: &quot;rg-axsadm3sdzsdvdsndstdisd&quot;,
         *       &quot;WorkerSystemDiskCategory&quot;: &quot;da&quot;,
         *       &quot;WorkerSystemDiskSize&quot;: 40,
         *       &quot;DeletionProtection&quot;: false,
         *       &quot;KubeProxy&quot;: &quot;iptables&quot;,
         *       &quot;Name&quot;: &quot;da&quot;,
         *       &quot;LoadBalancerSpec&quot;: &quot;slb.s1.small&quot;,
         *       &quot;Runtime&quot;: {
         *             &quot;Version&quot;: &quot;19.03.15&quot;,
         *             &quot;Name&quot;: &quot;docker&quot;
         *       },
         *       &quot;IsEnterpriseSecurityGroup&quot;: true,
         *       &quot;Vpcid&quot;: &quot;192.168.23.0/24&quot;,
         *       &quot;NumOfNodes&quot;: 1,
         *       &quot;VswitchIds&quot;: [
         *             &quot;dad&quot;
         *       ],
         *       &quot;ServiceCidr&quot;: &quot;10.0.0.0/16&quot;,
         *       &quot;SnatEntry&quot;: false,
         *       &quot;kubernetesVersion&quot;: &quot;1.20.11-aliyunedge.1&quot;,
         *       &quot;WorkerInstanceTypes&quot;: [
         *             &quot;da&quot;
         *       ]
         * }</p>
         */
        @NameInMap("BasicArgs")
        public Object basicArgs;

        /**
         * <p>Node pool configuration, used to establish the correspondence between node groups and node pools. Required when ComponentType is &quot;ACKEdge&quot;, otherwise it can be empty.</p>
         */
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
        /**
         * <p>Component configuration</p>
         */
        @NameInMap("ComponentConfig")
        public CreateClusterRequestComponentsComponentConfig componentConfig;

        /**
         * <p>Component type</p>
         * 
         * <strong>example:</strong>
         * <p>ACKEdge</p>
         */
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

    public static class CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds extends TeaModel {
        /**
         * <p>Bond name</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IP source cluster subnet</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("Subnet")
        public String subnet;

        public static CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds self = new CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class CreateClusterRequestNetworksIpAllocationPolicyBondPolicy extends TeaModel {
        /**
         * <p>Default bond cluster subnet</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.0.0/24</p>
         */
        @NameInMap("BondDefaultSubnet")
        public String bondDefaultSubnet;

        /**
         * <p>Bond information</p>
         */
        @NameInMap("Bonds")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds> bonds;

        public static CreateClusterRequestNetworksIpAllocationPolicyBondPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicyBondPolicy self = new CreateClusterRequestNetworksIpAllocationPolicyBondPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicy setBondDefaultSubnet(String bondDefaultSubnet) {
            this.bondDefaultSubnet = bondDefaultSubnet;
            return this;
        }
        public String getBondDefaultSubnet() {
            return this.bondDefaultSubnet;
        }

        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicy setBonds(java.util.List<CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds> bonds) {
            this.bonds = bonds;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyBondPolicyBonds> getBonds() {
            return this.bonds;
        }

    }

    public static class CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds extends TeaModel {
        /**
         * <p>Bond name</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IP source cluster subnet</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Subnet")
        public String subnet;

        public static CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds self = new CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy extends TeaModel {
        /**
         * <p>Bond information</p>
         */
        @NameInMap("Bonds")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds> bonds;

        /**
         * <p>Machine type</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga8n</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        public static CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy self = new CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy setBonds(java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds> bonds) {
            this.bonds = bonds;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds> getBonds() {
            return this.bonds;
        }

        public CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

    }

    public static class CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds extends TeaModel {
        /**
         * <p>Bond name</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IP source cluster subnet</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("Subnet")
        public String subnet;

        public static CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds self = new CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class CreateClusterRequestNetworksIpAllocationPolicyNodePolicy extends TeaModel {
        /**
         * <p>Bond information</p>
         */
        @NameInMap("Bonds")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds> bonds;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-2r42vq62001</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static CreateClusterRequestNetworksIpAllocationPolicyNodePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicyNodePolicy self = new CreateClusterRequestNetworksIpAllocationPolicyNodePolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicyNodePolicy setBonds(java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds> bonds) {
            this.bonds = bonds;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds> getBonds() {
            return this.bonds;
        }

        public CreateClusterRequestNetworksIpAllocationPolicyNodePolicy setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class CreateClusterRequestNetworksIpAllocationPolicy extends TeaModel {
        /**
         * <p>Bond policy</p>
         */
        @NameInMap("BondPolicy")
        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicy bondPolicy;

        /**
         * <p>Machine type allocation policy</p>
         */
        @NameInMap("MachineTypePolicy")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy> machineTypePolicy;

        /**
         * <p>Node allocation policy</p>
         */
        @NameInMap("NodePolicy")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicy> nodePolicy;

        public static CreateClusterRequestNetworksIpAllocationPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworksIpAllocationPolicy self = new CreateClusterRequestNetworksIpAllocationPolicy();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworksIpAllocationPolicy setBondPolicy(CreateClusterRequestNetworksIpAllocationPolicyBondPolicy bondPolicy) {
            this.bondPolicy = bondPolicy;
            return this;
        }
        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicy getBondPolicy() {
            return this.bondPolicy;
        }

        public CreateClusterRequestNetworksIpAllocationPolicy setMachineTypePolicy(java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy> machineTypePolicy) {
            this.machineTypePolicy = machineTypePolicy;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy> getMachineTypePolicy() {
            return this.machineTypePolicy;
        }

        public CreateClusterRequestNetworksIpAllocationPolicy setNodePolicy(java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicy> nodePolicy) {
            this.nodePolicy = nodePolicy;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicy> getNodePolicy() {
            return this.nodePolicy;
        }

    }

    public static class CreateClusterRequestNetworksNewVpdInfoVpdSubnets extends TeaModel {
        /**
         * <p>Subnet CIDR</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.8/24</p>
         */
        @NameInMap("SubnetCidr")
        public String subnetCidr;

        /**
         * <p>Subnet type</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.2.8/24</p>
         */
        @NameInMap("SubnetType")
        public String subnetType;

        /**
         * <p>Zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
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
        /**
         * <p>Cloud Enterprise Network ID</p>
         * 
         * <strong>example:</strong>
         * <p>cen-1gb1eftc5qp2ao75fo</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>Cloud link CIDR</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CloudLinkCidr")
        public String cloudLinkCidr;

        /**
         * <p>Cloud link ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-c4dtycm5i08</p>
         */
        @NameInMap("CloudLinkId")
        public String cloudLinkId;

        /**
         * <p>VPC</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jl2x45apm6odc2c10h25</p>
         */
        @NameInMap("MonitorVpcId")
        public String monitorVpcId;

        /**
         * <p>VPC switch</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jl2w3ffbghkss0x2foff</p>
         */
        @NameInMap("MonitorVswitchId")
        public String monitorVswitchId;

        /**
         * <p>Cluster Network Segment</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("VpdCidr")
        public String vpdCidr;

        /**
         * <p>Cluster subnets</p>
         */
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
        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-vfuz6ejv</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>List of cluster subnet IDs</p>
         */
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
        /**
         * <p>IP allocation policy</p>
         */
        @NameInMap("IpAllocationPolicy")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicy> ipAllocationPolicy;

        /**
         * <p>Vpd configuration information</p>
         */
        @NameInMap("NewVpdInfo")
        public CreateClusterRequestNetworksNewVpdInfo newVpdInfo;

        /**
         * <p>Security group ID</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1d3dvbh9by7j5rujax</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>IP version</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("TailIpVersion")
        public String tailIpVersion;

        /**
         * <p>VSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-asjdfklj</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VSwitch Zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("VSwitchZoneId")
        public String vSwitchZoneId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jl36lqzmc06qogy0t5ll</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Reuse VPD information</p>
         */
        @NameInMap("VpdInfo")
        public CreateClusterRequestNetworksVpdInfo vpdInfo;

        public static CreateClusterRequestNetworks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNetworks self = new CreateClusterRequestNetworks();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNetworks setIpAllocationPolicy(java.util.List<CreateClusterRequestNetworksIpAllocationPolicy> ipAllocationPolicy) {
            this.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicy> getIpAllocationPolicy() {
            return this.ipAllocationPolicy;
        }

        public CreateClusterRequestNetworks setNewVpdInfo(CreateClusterRequestNetworksNewVpdInfo newVpdInfo) {
            this.newVpdInfo = newVpdInfo;
            return this;
        }
        public CreateClusterRequestNetworksNewVpdInfo getNewVpdInfo() {
            return this.newVpdInfo;
        }

        public CreateClusterRequestNetworks setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateClusterRequestNetworks setTailIpVersion(String tailIpVersion) {
            this.tailIpVersion = tailIpVersion;
            return this;
        }
        public String getTailIpVersion() {
            return this.tailIpVersion;
        }

        public CreateClusterRequestNetworks setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateClusterRequestNetworks setVSwitchZoneId(String vSwitchZoneId) {
            this.vSwitchZoneId = vSwitchZoneId;
            return this;
        }
        public String getVSwitchZoneId() {
            return this.vSwitchZoneId;
        }

        public CreateClusterRequestNetworks setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
        /**
         * <p>Hostname</p>
         * 
         * <strong>example:</strong>
         * <p>8d13b784-17a9-11ed-bc7b-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Login password</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01poc-cn-i7m2wnivf0d</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Virtual switch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp169pi5fj151rrms4sia</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jlasms92fdxqd3wlf8ny</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

        public CreateClusterRequestNodeGroupsNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateClusterRequestNodeGroupsNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateClusterRequestNodeGroups extends TeaModel {
        /**
         * <p>System image ID</p>
         * 
         * <strong>example:</strong>
         * <p>i190297201634099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Machine type</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Node group description</p>
         * 
         * <strong>example:</strong>
         * <p>Node group description</p>
         */
        @NameInMap("NodeGroupDescription")
        public String nodeGroupDescription;

        /**
         * <p>Node group name</p>
         * 
         * <strong>example:</strong>
         * <p>emr-default</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>Node list</p>
         */
        @NameInMap("Nodes")
        public java.util.List<CreateClusterRequestNodeGroupsNodes> nodes;

        /**
         * <p>Instance custom data. It needs to be Base64 encoded, and the original data should not exceed 16 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>Zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
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

        public CreateClusterRequestNodeGroups setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
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
        /**
         * <p>Key</p>
         * 
         * <strong>example:</strong>
         * <p>env-name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
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
