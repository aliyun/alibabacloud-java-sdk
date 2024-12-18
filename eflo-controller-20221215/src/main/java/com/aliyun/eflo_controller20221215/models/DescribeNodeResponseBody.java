// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i116913051662373010974</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>2022-09-30T03:35:53Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2022-06-23T16:00:00Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <strong>example:</strong>
     * <p>31d38530-241e-11ed-bc63-acde48001122</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <strong>example:</strong>
     * <p>i190297201634099844192</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>镜像名称</p>
     * 
     * <strong>example:</strong>
     * <p>Centos7.9_all_0811</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    @NameInMap("Networks")
    public java.util.List<DescribeNodeResponseBodyNetworks> networks;

    /**
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>emr-default</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OperatingState")
    public String operatingState;

    /**
     * <strong>example:</strong>
     * <p>AC4F0004-7BCE-52E0-891B-CAC7D64E3368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>sag42ckf4jx</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeResponseBody self = new DescribeNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeNodeResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeNodeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeNodeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeNodeResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeNodeResponseBody setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public DescribeNodeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeNodeResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeNodeResponseBody setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public DescribeNodeResponseBody setNetworks(java.util.List<DescribeNodeResponseBodyNetworks> networks) {
        this.networks = networks;
        return this;
    }
    public java.util.List<DescribeNodeResponseBodyNetworks> getNetworks() {
        return this.networks;
    }

    public DescribeNodeResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DescribeNodeResponseBody setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public DescribeNodeResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeNodeResponseBody setOperatingState(String operatingState) {
        this.operatingState = operatingState;
        return this;
    }
    public String getOperatingState() {
        return this.operatingState;
    }

    public DescribeNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNodeResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public DescribeNodeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeNodeResponseBodyNetworks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <strong>example:</strong>
         * <p>47.254.235.44</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>vsw-uf68v51fldm5egmui5a6k</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <strong>example:</strong>
         * <p>vpd-xcuhjyrj</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static DescribeNodeResponseBodyNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeResponseBodyNetworks self = new DescribeNodeResponseBodyNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeNodeResponseBodyNetworks setBondName(String bondName) {
            this.bondName = bondName;
            return this;
        }
        public String getBondName() {
            return this.bondName;
        }

        public DescribeNodeResponseBodyNetworks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeNodeResponseBodyNetworks setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public DescribeNodeResponseBodyNetworks setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
