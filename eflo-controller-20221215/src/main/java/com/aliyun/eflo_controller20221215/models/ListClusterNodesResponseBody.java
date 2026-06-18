// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterNodesResponseBody extends TeaModel {
    /**
     * <p>The token to retrieve the next page of results. If this parameter is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAXW/ZB9TBvH+0ZK0phtCibQgQmu1RbqplAI6Velo2OKR</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<ListClusterNodesResponseBodyNodes> nodes;

    /**
     * <p>The request ID.</p>
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
         * <p>The name of the network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <p>The IP address of the node in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.22.2</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The subnet ID.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-fwekrvg9</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>The ID of the VPC to which the network interface belongs.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>alarm_xdc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The unique code that identifies the cloud product or service.</p>
         * 
         * <strong>example:</strong>
         * <p>bccluster_eflocomputing_public_cn（表示灵骏中国站包年包月）、bccluster_eflocomputing_public_intl（表示灵骏国际站包年包月）</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-02T11:27:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-03T00:00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Indicates whether the node supports mounting file storage.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("FileSystemMountEnabled")
        public Boolean fileSystemMountEnabled;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>72432f80-273e-11ed-b57a-acde48001122</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The ID of the HPN zone.</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <p>The hyper node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-2r42tmj4z02</p>
         */
        @NameInMap("HyperNodeId")
        public String hyperNodeId;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i190297201669099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alinux3_x86_gu8xf_P_Host_D3_C7E3_550.127_Legacy_N_241230</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The machine type.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b11</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Network details.</p>
         */
        @NameInMap("Networks")
        public java.util.List<ListClusterNodesResponseBodyNodesNetworks> networks;

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-e9b74f4d450cf18d</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>emr_master</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-2r42tmj4z02</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The status of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Extending</p>
         */
        @NameInMap("OperatingState")
        public String operatingState;

        /**
         * <p>The serial number (SN) of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>sn_tOuUk</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <p>The list of tags attached to the node.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListClusterNodesResponseBodyNodesTags> tags;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-skkdsdl83ksxxs3</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jlohur7nhbxd1ttyq8p8</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC where the node is located.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8zcet5mwerafyqlrhyoi</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The availability zone ID.</p>
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

        public ListClusterNodesResponseBodyNodes setHyperNodeId(String hyperNodeId) {
            this.hyperNodeId = hyperNodeId;
            return this;
        }
        public String getHyperNodeId() {
            return this.hyperNodeId;
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

        public ListClusterNodesResponseBodyNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
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
