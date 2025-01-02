// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ExtendClusterRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i15b480fbd2fcdbc2869cd80</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Whether to allow skipping failed node tasks, default value is False</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>IP allocation policy combination: Each policy can only choose one type, and multiple policies can be combined</p>
     */
    @NameInMap("IpAllocationPolicy")
    public java.util.List<ExtendClusterRequestIpAllocationPolicy> ipAllocationPolicy;

    /**
     * <p>Node Group</p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<ExtendClusterRequestNodeGroups> nodeGroups;

    /**
     * <p>VSwitch availability zone ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-b</p>
     */
    @NameInMap("VSwitchZoneId")
    public String vSwitchZoneId;

    /**
     * <p>List of cluster subnets</p>
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
         * <p>Bond name</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IP source cluster subnet</p>
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
         * <p>Default bond cluster subnet</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-3od2fe</p>
         */
        @NameInMap("BondDefaultSubnet")
        public String bondDefaultSubnet;

        /**
         * <p>Bond information</p>
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
         * <p>Bond name</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IP source cluster subnet</p>
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
         * <p>Bond information</p>
         */
        @NameInMap("Bonds")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicyBonds> bonds;

        /**
         * <p>Machine Type</p>
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
         * <p>Bond name</p>
         * 
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>IP source cluster subnet</p>
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
         * <p>Bond information</p>
         */
        @NameInMap("Bonds")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyNodePolicyBonds> bonds;

        /**
         * <p>Node ID</p>
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
         * <p>Specify the cluster subnet ID based on the bond name</p>
         */
        @NameInMap("BondPolicy")
        public ExtendClusterRequestIpAllocationPolicyBondPolicy bondPolicy;

        /**
         * <p>Machine type allocation policy</p>
         */
        @NameInMap("MachineTypePolicy")
        public java.util.List<ExtendClusterRequestIpAllocationPolicyMachineTypePolicy> machineTypePolicy;

        /**
         * <p>Node allocation policy</p>
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

    public static class ExtendClusterRequestNodeGroupsNodes extends TeaModel {
        /**
         * <p>Hostname</p>
         * 
         * <strong>example:</strong>
         * <p>d044d220-33fd-11ed-86a6</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Login Password</p>
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
         * <p>e01-cn-zvp2zdpy601</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>VSwitch ID</p>
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

        public static ExtendClusterRequestNodeGroupsNodes build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestNodeGroupsNodes self = new ExtendClusterRequestNodeGroupsNodes();
            return TeaModel.build(map, self);
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
         * <p>Node Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>i16d4883a46cbadeb4bc9</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>List of Nodes</p>
         */
        @NameInMap("Nodes")
        public java.util.List<ExtendClusterRequestNodeGroupsNodes> nodes;

        /**
         * <p>Custom Data</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/sh
         * echo &quot;Hello World. The time is now $(date -R)!&quot; | tee /root/userdata_test.txt</p>
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

        public static ExtendClusterRequestNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            ExtendClusterRequestNodeGroups self = new ExtendClusterRequestNodeGroups();
            return TeaModel.build(map, self);
        }

        public ExtendClusterRequestNodeGroups setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ExtendClusterRequestNodeGroups setNodes(java.util.List<ExtendClusterRequestNodeGroupsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ExtendClusterRequestNodeGroupsNodes> getNodes() {
            return this.nodes;
        }

        public ExtendClusterRequestNodeGroups setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
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
