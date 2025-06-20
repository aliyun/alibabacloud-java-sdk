// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The cluster description.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster description</p>
     */
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster type.</p>
     * 
     * <strong>example:</strong>
     * <p>Lite</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The components (software instance).</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateClusterRequestComponents> components;

    /**
     * <p>The cluster number.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>Specifies whether to allow skipping failed nodes. Default value: False.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>The network information.</p>
     */
    @NameInMap("Networks")
    public CreateClusterRequestNetworks networks;

    /**
     * <p>The node vSwitch.</p>
     */
    @NameInMap("NimizVSwitches")
    public java.util.List<String> nimizVSwitches;

    /**
     * <p>The node groups.</p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<CreateClusterRequestNodeGroups> nodeGroups;

    /**
     * <p>Specifies whether the elastic network interface (ENI) supports the Jumbo Frames feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OpenEniJumboFrame")
    public Boolean openEniJumboFrame;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2xdkc6icwfha</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource tags.</p>
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
         * <p>The basic parameters of the component.</p>
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
         * <p>The node pool configurations, which are used to establish the mappings between node groups and node pools. This parameter is required when ComponentType is set to ACKEdge. Otherwise, this parameter is left empty.</p>
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
         * <p>The component configurations.</p>
         */
        @NameInMap("ComponentConfig")
        public CreateClusterRequestComponentsComponentConfig componentConfig;

        /**
         * <p>The component type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ARMS</li>
         * <li>ACKEdge</li>
         * </ul>
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
         * <p>The bond name.</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster subnet from which the IP address originates.</p>
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
         * <p>The default bond subnet for the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.0.0/24</p>
         */
        @NameInMap("BondDefaultSubnet")
        public String bondDefaultSubnet;

        /**
         * <p>The bond information.</p>
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
         * <p>The bond name.</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster subnet from which the IP address originates.</p>
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
         * <p>The bond information.</p>
         */
        @NameInMap("Bonds")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicyBonds> bonds;

        /**
         * <p>The instance type.</p>
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
         * <p>The bond name.</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster subnet from which the IP address originates.</p>
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
         * <p>The bond information.</p>
         */
        @NameInMap("Bonds")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyNodePolicyBonds> bonds;

        /**
         * <p>The node ID.</p>
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
         * <p>The bond policy.</p>
         */
        @NameInMap("BondPolicy")
        public CreateClusterRequestNetworksIpAllocationPolicyBondPolicy bondPolicy;

        /**
         * <p>The allocation policy for the instance type.</p>
         */
        @NameInMap("MachineTypePolicy")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicyMachineTypePolicy> machineTypePolicy;

        /**
         * <p>The node allocation policy.</p>
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
         * <p>The subnet CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.8/24</p>
         */
        @NameInMap("SubnetCidr")
        public String subnetCidr;

        /**
         * <p>The subnet type.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.2.8/24</p>
         */
        @NameInMap("SubnetType")
        public String subnetType;

        /**
         * <p>The zone ID.</p>
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
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-1gb1eftc5qp2ao75fo</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The CIDR block for Cloud Link.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CloudLinkCidr")
        public String cloudLinkCidr;

        /**
         * <p>The Cloud Link ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-c4dtycm5i08</p>
         */
        @NameInMap("CloudLinkId")
        public String cloudLinkId;

        /**
         * <p>The VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jl2x45apm6odc2c10h25</p>
         */
        @NameInMap("MonitorVpcId")
        public String monitorVpcId;

        /**
         * <p>The vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jl2w3ffbghkss0x2foff</p>
         */
        @NameInMap("MonitorVswitchId")
        public String monitorVswitchId;

        /**
         * <p>The CIDR block for the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("VpdCidr")
        public String vpdCidr;

        /**
         * <p>The cluster subnet.</p>
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
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-vfuz6ejv</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The IDs of the subnets for a cluster.</p>
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
         * <p>The IP allocation policy.</p>
         */
        @NameInMap("IpAllocationPolicy")
        public java.util.List<CreateClusterRequestNetworksIpAllocationPolicy> ipAllocationPolicy;

        /**
         * <p>The virtual private domain (VPD) configuration information.</p>
         */
        @NameInMap("NewVpdInfo")
        public CreateClusterRequestNetworksNewVpdInfo newVpdInfo;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1d3dvbh9by7j5rujax</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IP version.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("TailIpVersion")
        public String tailIpVersion;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-asjdfklj</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("VSwitchZoneId")
        public String vSwitchZoneId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jl36lqzmc06qogy0t5ll</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPD information.</p>
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

    public static class CreateClusterRequestNodeGroupsNodesDataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithNode")
        public Boolean deleteWithNode;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public Integer size;

        public static CreateClusterRequestNodeGroupsNodesDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNodeGroupsNodesDataDisk self = new CreateClusterRequestNodeGroupsNodesDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNodeGroupsNodesDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateClusterRequestNodeGroupsNodesDataDisk setDeleteWithNode(Boolean deleteWithNode) {
            this.deleteWithNode = deleteWithNode;
            return this;
        }
        public Boolean getDeleteWithNode() {
            return this.deleteWithNode;
        }

        public CreateClusterRequestNodeGroupsNodesDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateClusterRequestNodeGroupsNodesDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateClusterRequestNodeGroupsNodes extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<CreateClusterRequestNodeGroupsNodesDataDisk> dataDisk;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>8d13b784-17a9-11ed-bc7b-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The logon password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01poc-cn-i7m2wnivf0d</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp169pi5fj151rrms4sia</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
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

        public CreateClusterRequestNodeGroupsNodes setDataDisk(java.util.List<CreateClusterRequestNodeGroupsNodesDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<CreateClusterRequestNodeGroupsNodesDataDisk> getDataDisk() {
            return this.dataDisk;
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

    public static class CreateClusterRequestNodeGroupsSystemDisk extends TeaModel {
        /**
         * <p>The disk category. Valid values:</p>
         * <ul>
         * <li>cloud_essd</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The performance level of the ESSD that is used as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>Unit: GB</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateClusterRequestNodeGroupsSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestNodeGroupsSystemDisk self = new CreateClusterRequestNodeGroupsSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestNodeGroupsSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateClusterRequestNodeGroupsSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateClusterRequestNodeGroupsSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateClusterRequestNodeGroups extends TeaModel {
        /**
         * <p>Specifies whether to support file system mounting.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("FileSystemMountEnabled")
        public Boolean fileSystemMountEnabled;

        /**
         * <p>The system image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i190297201634099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-key</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>The node group description.</p>
         * 
         * <strong>example:</strong>
         * <p>Node group description</p>
         */
        @NameInMap("NodeGroupDescription")
        public String nodeGroupDescription;

        /**
         * <p>The node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-default</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<CreateClusterRequestNodeGroupsNodes> nodes;

        /**
         * <p>The system disk information.</p>
         */
        @NameInMap("SystemDisk")
        public CreateClusterRequestNodeGroupsSystemDisk systemDisk;

        /**
         * <p>The user data of the instance. The user data must be Base64-encoded. The raw data can be up to 16 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The zone ID.</p>
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

        public CreateClusterRequestNodeGroups setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }
        public Boolean getFileSystemMountEnabled() {
            return this.fileSystemMountEnabled;
        }

        public CreateClusterRequestNodeGroups setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterRequestNodeGroups setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateClusterRequestNodeGroups setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
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

        public CreateClusterRequestNodeGroups setSystemDisk(CreateClusterRequestNodeGroupsSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public CreateClusterRequestNodeGroupsSystemDisk getSystemDisk() {
            return this.systemDisk;
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env-name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
