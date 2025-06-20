// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ExtendClusterRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i15b480fbd2fcdbc2869cd80</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to allow skipping failed nodes. Default value: False.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>The combined policies for assigning IP addresses: Only one policy type can be selected for each policy, and multiple policies can be combined.</p>
     */
    @NameInMap("IpAllocationPolicy")
    public java.util.List<ExtendClusterRequestIpAllocationPolicy> ipAllocationPolicy;

    /**
     * <p>The node groups.</p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<ExtendClusterRequestNodeGroups> nodeGroups;

    /**
     * <p>The ID of the zone to which the vSwitch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-b</p>
     */
    @NameInMap("VSwitchZoneId")
    public String vSwitchZoneId;

    /**
     * <p>The subnets of the cluster.</p>
     */
    @NameInMap("VpdSubnets")
    public java.util.List<String> vpdSubnets;

    public static ExtendClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendClusterRequest self = new ExtendClusterRequest();
        return TeaModel.build(map, self);
    }

    public ExtendClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExtendClusterRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ExtendClusterRequest setIpAllocationPolicy(java.util.List<ExtendClusterRequestIpAllocationPolicy> ipAllocationPolicy) {
        this.ipAllocationPolicy = ipAllocationPolicy;
        return this;
    }
    public java.util.List<ExtendClusterRequestIpAllocationPolicy> getIpAllocationPolicy() {
        return this.ipAllocationPolicy;
    }

    public ExtendClusterRequest setNodeGroups(java.util.List<ExtendClusterRequestNodeGroups> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<ExtendClusterRequestNodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    public ExtendClusterRequest setVSwitchZoneId(String vSwitchZoneId) {
        this.vSwitchZoneId = vSwitchZoneId;
        return this;
    }
    public String getVSwitchZoneId() {
        return this.vSwitchZoneId;
    }

    public ExtendClusterRequest setVpdSubnets(java.util.List<String> vpdSubnets) {
        this.vpdSubnets = vpdSubnets;
        return this;
    }
    public java.util.List<String> getVpdSubnets() {
        return this.vpdSubnets;
    }

    public static class ExtendClusterRequestIpAllocationPolicyBondPolicyBonds extends TeaModel {
        /**
         * <p>The bond name.</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster subnet from which the IP address originates.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-3od2fe</p>
         */
        @NameInMap("Subnet")
        public String subnet;

        public static ExtendClusterRequestIpAllocationPolicyBondPolicyBonds build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicyBondPolicyBonds self = new ExtendClusterRequestIpAllocationPolicyBondPolicyBonds();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicyBondPolicyBonds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExtendClusterRequestIpAllocationPolicyBondPolicyBonds setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class ExtendClusterRequestIpAllocationPolicyBondPolicy extends TeaModel {
        /**
         * <p>The default bond subnet for the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-3od2fe</p>
         */
        @NameInMap("BondDefaultSubnet")
        public String bondDefaultSubnet;

        /**
         * <p>The bonds.</p>
         */
        @NameInMap("Bonds")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyBondPolicyBonds> bonds;

        public static ExtendClusterRequestIpAllocationPolicyBondPolicy build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicyBondPolicy self = new ExtendClusterRequestIpAllocationPolicyBondPolicy();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicyBondPolicy setBondDefaultSubnet(String bondDefaultSubnet) {
            this.bondDefaultSubnet = bondDefaultSubnet;
            return this;
        }
        public String getBondDefaultSubnet() {
            return this.bondDefaultSubnet;
        }

        public ExtendClusterRequestIpAllocationPolicyBondPolicy setBonds(java.util.List<ExtendClusterRequestIpAllocationPolicyBondPolicyBonds> bonds) {
            this.bonds = bonds;
            return this;
        }
        public java.util.List<ExtendClusterRequestIpAllocationPolicyBondPolicyBonds> getBonds() {
            return this.bonds;
        }

    }

    public static class ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds extends TeaModel {
        /**
         * <p>The bond name.</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster subnet from which the IP address originates.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-fdo3dv</p>
         */
        @NameInMap("Subnet")
        public String subnet;

        public static ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds self = new ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class ExtendClusterRequestIpAllocationPolicyMachineTypePolicy extends TeaModel {
        /**
         * <p>The bonds.</p>
         */
        @NameInMap("Bonds")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds> bonds;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        public static ExtendClusterRequestIpAllocationPolicyMachineTypePolicy build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicyMachineTypePolicy self = new ExtendClusterRequestIpAllocationPolicyMachineTypePolicy();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicyMachineTypePolicy setBonds(java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds> bonds) {
            this.bonds = bonds;
            return this;
        }
        public java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds> getBonds() {
            return this.bonds;
        }

        public ExtendClusterRequestIpAllocationPolicyMachineTypePolicy setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

    }

    public static class ExtendClusterRequestIpAllocationPolicyNodePolicyBonds extends TeaModel {
        /**
         * <p>The bond name.</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster subnet from which the IP address originates.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-fdo3dv</p>
         */
        @NameInMap("Subnet")
        public String subnet;

        public static ExtendClusterRequestIpAllocationPolicyNodePolicyBonds build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicyNodePolicyBonds self = new ExtendClusterRequestIpAllocationPolicyNodePolicyBonds();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicyNodePolicyBonds setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExtendClusterRequestIpAllocationPolicyNodePolicyBonds setSubnet(String subnet) {
            this.subnet = subnet;
            return this;
        }
        public String getSubnet() {
            return this.subnet;
        }

    }

    public static class ExtendClusterRequestIpAllocationPolicyNodePolicy extends TeaModel {
        /**
         * <p>The bonds.</p>
         */
        @NameInMap("Bonds")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicyBonds> bonds;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>i22c11282.eu95sqa</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-3fdodw2</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ExtendClusterRequestIpAllocationPolicyNodePolicy build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicyNodePolicy self = new ExtendClusterRequestIpAllocationPolicyNodePolicy();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicyNodePolicy setBonds(java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicyBonds> bonds) {
            this.bonds = bonds;
            return this;
        }
        public java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicyBonds> getBonds() {
            return this.bonds;
        }

        public ExtendClusterRequestIpAllocationPolicyNodePolicy setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ExtendClusterRequestIpAllocationPolicyNodePolicy setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ExtendClusterRequestIpAllocationPolicy extends TeaModel {
        /**
         * <p>The bond policy that you specify the cluster subnet ID based on the bond name.</p>
         */
        @NameInMap("BondPolicy")
        public ExtendClusterRequestIpAllocationPolicyBondPolicy bondPolicy;

        /**
         * <p>The allocation policies for the instance type.</p>
         */
        @NameInMap("MachineTypePolicy")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicy> machineTypePolicy;

        /**
         * <p>The node allocation policies.</p>
         */
        @NameInMap("NodePolicy")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicy> nodePolicy;

        public static ExtendClusterRequestIpAllocationPolicy build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestIpAllocationPolicy self = new ExtendClusterRequestIpAllocationPolicy();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestIpAllocationPolicy setBondPolicy(ExtendClusterRequestIpAllocationPolicyBondPolicy bondPolicy) {
            this.bondPolicy = bondPolicy;
            return this;
        }
        public ExtendClusterRequestIpAllocationPolicyBondPolicy getBondPolicy() {
            return this.bondPolicy;
        }

        public ExtendClusterRequestIpAllocationPolicy setMachineTypePolicy(java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicy> machineTypePolicy) {
            this.machineTypePolicy = machineTypePolicy;
            return this;
        }
        public java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicy> getMachineTypePolicy() {
            return this.machineTypePolicy;
        }

        public ExtendClusterRequestIpAllocationPolicy setNodePolicy(java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicy> nodePolicy) {
            this.nodePolicy = nodePolicy;
            return this;
        }
        public java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicy> getNodePolicy() {
            return this.nodePolicy;
        }

    }

    public static class ExtendClusterRequestNodeGroupsNodeTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>my_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>my_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExtendClusterRequestNodeGroupsNodeTag build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestNodeGroupsNodeTag self = new ExtendClusterRequestNodeGroupsNodeTag();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestNodeGroupsNodeTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExtendClusterRequestNodeGroupsNodeTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExtendClusterRequestNodeGroupsNodesDataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithNode")
        public Boolean deleteWithNode;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public Integer size;

        public static ExtendClusterRequestNodeGroupsNodesDataDisk build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestNodeGroupsNodesDataDisk self = new ExtendClusterRequestNodeGroupsNodesDataDisk();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestNodeGroupsNodesDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ExtendClusterRequestNodeGroupsNodesDataDisk setDeleteWithNode(Boolean deleteWithNode) {
            this.deleteWithNode = deleteWithNode;
            return this;
        }
        public Boolean getDeleteWithNode() {
            return this.deleteWithNode;
        }

        public ExtendClusterRequestNodeGroupsNodesDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ExtendClusterRequestNodeGroupsNodesDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ExtendClusterRequestNodeGroupsNodes extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<ExtendClusterRequestNodeGroupsNodesDataDisk> dataDisk;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>d044d220-33fd-11ed-86a6</p>
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
         * <p>e01-cn-zvp2zdpy601</p>
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

        public static ExtendClusterRequestNodeGroupsNodes build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestNodeGroupsNodes self = new ExtendClusterRequestNodeGroupsNodes();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestNodeGroupsNodes setDataDisk(java.util.List<ExtendClusterRequestNodeGroupsNodesDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<ExtendClusterRequestNodeGroupsNodesDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public ExtendClusterRequestNodeGroupsNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ExtendClusterRequestNodeGroupsNodes setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ExtendClusterRequestNodeGroupsNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ExtendClusterRequestNodeGroupsNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ExtendClusterRequestNodeGroupsNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ExtendClusterRequestNodeGroups extends TeaModel {
        /**
         * <p>The number of nodes to be purchased. Valid values: 0 to 500. If you set the value of the Amount parameter to 0, you do not want to purchase nodes and scale out the cluster by using existing nodes. If you set the value of the Amount parameter to a value ranging from 1 to 500, you want to purchase a certain number of nodes for cluster scale-out. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>Specifies whether to enable auto-renewal for the purchased nodes. This parameter takes effect only when the Amount parameter is not set to 0 and the ChargeType parameter is set to PrePaid. Valid values: true and false. Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The billing method of the node. This parameter does not take effect if you set the Amount parameter to 0. Valid values: PrePaid (subscription) and PostPaid (pay-as-you-go). Default value: PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The hostname for the purchased node. This parameter does not take effect if you set the Amount parameter to 0.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The logon password of the purchased node. This parameter does not take effect if you set the Amount parameter to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>Addk(*78</p>
         */
        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i16d4883a46cbadeb4bc9</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("NodeTag")
        public java.util.List<ExtendClusterRequestNodeGroupsNodeTag> nodeTag;

        /**
         * <p>The nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ExtendClusterRequestNodeGroupsNodes> nodes;

        /**
         * <p>The duration of the purchased node. Unit: months. Valid values: 1, 6, 12, 24, 36, and 48. This parameter takes effect only when the Amount parameter is not set to 0 and the ChargeType parameter is set to PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Period")
        public Long period;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/sh
         * echo &quot;Hello World. The time is now $(date -R)!&quot; | tee /root/userdata_test.txt</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jly2d537ejphyq6h13ke</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-zq1econyv63tvyci5hefw</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ExtendClusterRequestNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestNodeGroups self = new ExtendClusterRequestNodeGroups();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestNodeGroups setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public ExtendClusterRequestNodeGroups setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ExtendClusterRequestNodeGroups setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ExtendClusterRequestNodeGroups setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public ExtendClusterRequestNodeGroups setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ExtendClusterRequestNodeGroups setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ExtendClusterRequestNodeGroups setNodeTag(java.util.List<ExtendClusterRequestNodeGroupsNodeTag> nodeTag) {
            this.nodeTag = nodeTag;
            return this;
        }
        public java.util.List<ExtendClusterRequestNodeGroupsNodeTag> getNodeTag() {
            return this.nodeTag;
        }

        public ExtendClusterRequestNodeGroups setNodes(java.util.List<ExtendClusterRequestNodeGroupsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ExtendClusterRequestNodeGroupsNodes> getNodes() {
            return this.nodes;
        }

        public ExtendClusterRequestNodeGroups setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public ExtendClusterRequestNodeGroups setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public ExtendClusterRequestNodeGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ExtendClusterRequestNodeGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ExtendClusterRequestNodeGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
