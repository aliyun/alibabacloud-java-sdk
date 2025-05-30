// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterNodesResponseBody extends TeaModel {
    /**
     * <p>The query token value returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAXW/ZB9TBvH+0ZK0phtCibQgQmu1RbqplAI6Velo2OKR</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>List of nodes</p>
     */
    @NameInMap("Nodes")
    public java.util.List<ListClusterNodesResponseBodyNodes> nodes;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>2BA76272-6608-5AEC-BBA8-B6F0D3D14CDB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodesResponseBody self = new ListClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterNodesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterNodesResponseBody setNodes(java.util.List<ListClusterNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListClusterNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterNodesResponseBodyNodesNetworks extends TeaModel {
        /**
         * <p>Machine network interface name</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <p>IP address within the VPC</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.22.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>VPC subnet ID</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-fwekrvg9</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-eoiy88ju</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static ListClusterNodesResponseBodyNodesNetworks build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNodesResponseBodyNodesNetworks self = new ListClusterNodesResponseBodyNodesNetworks();
            return TeaModel.build(map, self);
        }

        public ListClusterNodesResponseBodyNodesNetworks setBondName(String bondName) {
            this.bondName = bondName;
            return this;
        }
        public String getBondName() {
            return this.bondName;
        }

        public ListClusterNodesResponseBodyNodesNetworks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListClusterNodesResponseBodyNodesNetworks setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public ListClusterNodesResponseBodyNodesNetworks setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class ListClusterNodesResponseBodyNodesTags extends TeaModel {
        /**
         * <p>The key of tag object</p>
         * 
         * <strong>example:</strong>
         * <p>aa_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag object</p>
         * 
         * <strong>example:</strong>
         * <p>aa_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListClusterNodesResponseBodyNodesTags build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNodesResponseBodyNodesTags self = new ListClusterNodesResponseBodyNodesTags();
            return TeaModel.build(map, self);
        }

        public ListClusterNodesResponseBodyNodesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClusterNodesResponseBodyNodesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListClusterNodesResponseBodyNodes extends TeaModel {
        /**
         * <p>product code</p>
         * 
         * <strong>example:</strong>
         * <p>bcccluster</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1642472468000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Machine expiration time</p>
         * 
         * <strong>example:</strong>
         * <p>1762185600000</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>whether or not support file system mount</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("FileSystemMountEnabled")
        public Boolean fileSystemMountEnabled;

        /**
         * <p>Hostname</p>
         * 
         * <strong>example:</strong>
         * <p>72432f80-273e-11ed-b57a-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Hpn Zone</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <p>System image ID</p>
         * 
         * <strong>example:</strong>
         * <p>i190297201669099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>image name</p>
         * 
         * <strong>example:</strong>
         * <p>Alinux3_x86_AMD_R_Host_D3_E3_24.13.00_UEFI_N_250121</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Machine type</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b11</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Network information</p>
         */
        @NameInMap("Networks")
        public java.util.List<ListClusterNodesResponseBodyNodesNetworks> networks;

        /**
         * <p>Node group ID</p>
         * 
         * <strong>example:</strong>
         * <p>ng-e9b74f4d450cf18d</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>Node group name</p>
         * 
         * <strong>example:</strong>
         * <p>emr_master</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-2r42tmj4z02</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Node status</p>
         * 
         * <strong>example:</strong>
         * <p>Extending</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <p>Machine SN</p>
         * 
         * <strong>example:</strong>
         * <p>sn_tOuUk</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <p>tag information</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListClusterNodesResponseBodyNodesTags> tags;

        /**
         * <p>task id</p>
         * 
         * <strong>example:</strong>
         * <p>i28ddkdkkdkdd</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1mxqhw8o20tgv3xk47h</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jltf9vinjz3if3lltdy7</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClusterNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNodesResponseBodyNodes self = new ListClusterNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListClusterNodesResponseBodyNodes setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListClusterNodesResponseBodyNodes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterNodesResponseBodyNodes setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListClusterNodesResponseBodyNodes setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }
        public Boolean getFileSystemMountEnabled() {
            return this.fileSystemMountEnabled;
        }

        public ListClusterNodesResponseBodyNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListClusterNodesResponseBodyNodes setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListClusterNodesResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListClusterNodesResponseBodyNodes setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListClusterNodesResponseBodyNodes setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListClusterNodesResponseBodyNodes setNetworks(java.util.List<ListClusterNodesResponseBodyNodesNetworks> networks) {
            this.networks = networks;
            return this;
        }
        public java.util.List<ListClusterNodesResponseBodyNodesNetworks> getNetworks() {
            return this.networks;
        }

        public ListClusterNodesResponseBodyNodes setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ListClusterNodesResponseBodyNodes setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ListClusterNodesResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListClusterNodesResponseBodyNodes setOperatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }
        public String getOperatingState() {
            return this.operatingState;
        }

        public ListClusterNodesResponseBodyNodes setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListClusterNodesResponseBodyNodes setTags(java.util.List<ListClusterNodesResponseBodyNodesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListClusterNodesResponseBodyNodesTags> getTags() {
            return this.tags;
        }

        public ListClusterNodesResponseBodyNodes setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListClusterNodesResponseBodyNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClusterNodesResponseBodyNodes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClusterNodesResponseBodyNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
