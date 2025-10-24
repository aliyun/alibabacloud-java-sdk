// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class GetHyperNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i112138561737531371671</p>
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
     * <p>2022-11-30T02:00:00.852Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2026-05-14T00:00:00</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("FileSystemMountEnabled")
    public Boolean fileSystemMountEnabled;

    /**
     * <strong>example:</strong>
     * <p>alywlcb-lingjun-gpu-0025</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("HyperNodeId")
    public String hyperNodeId;

    /**
     * <strong>example:</strong>
     * <p>efg2.C48cNHmcn</p>
     */
    @NameInMap("MachineType")
    public String machineType;

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

    @NameInMap("Nodes")
    public java.util.List<GetHyperNodeResponseBodyNodes> nodes;

    /**
     * <strong>example:</strong>
     * <p>2FE2B22C-CF9D-59DE-BF63-DC9B9B33A9D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwfm33rlt6zi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Using</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>cn-wulanchabu-c</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static GetHyperNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHyperNodeResponseBody self = new GetHyperNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHyperNodeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetHyperNodeResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetHyperNodeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetHyperNodeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GetHyperNodeResponseBody setFileSystemMountEnabled(Boolean fileSystemMountEnabled) {
        this.fileSystemMountEnabled = fileSystemMountEnabled;
        return this;
    }
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    public GetHyperNodeResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public GetHyperNodeResponseBody setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public GetHyperNodeResponseBody setHyperNodeId(String hyperNodeId) {
        this.hyperNodeId = hyperNodeId;
        return this;
    }
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    public GetHyperNodeResponseBody setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public GetHyperNodeResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public GetHyperNodeResponseBody setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public GetHyperNodeResponseBody setNodes(java.util.List<GetHyperNodeResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<GetHyperNodeResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public GetHyperNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHyperNodeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetHyperNodeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetHyperNodeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class GetHyperNodeResponseBodyNodesDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DOWNLINK_PACKET</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>d-bp1564bcc2306uui4zpk</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetHyperNodeResponseBodyNodesDisks build(java.util.Map<String, ?> map) throws Exception {
            GetHyperNodeResponseBodyNodesDisks self = new GetHyperNodeResponseBodyNodesDisks();
            return TeaModel.build(map, self);
        }

        public GetHyperNodeResponseBodyNodesDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetHyperNodeResponseBodyNodesDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public GetHyperNodeResponseBodyNodesDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public GetHyperNodeResponseBodyNodesDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetHyperNodeResponseBodyNodesDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetHyperNodeResponseBodyNodesNetworks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("BondName")
        public String bondName;

        /**
         * <strong>example:</strong>
         * <p>172.17.231.113</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static GetHyperNodeResponseBodyNodesNetworks build(java.util.Map<String, ?> map) throws Exception {
            GetHyperNodeResponseBodyNodesNetworks self = new GetHyperNodeResponseBodyNodesNetworks();
            return TeaModel.build(map, self);
        }

        public GetHyperNodeResponseBodyNodesNetworks setBondName(String bondName) {
            this.bondName = bondName;
            return this;
        }
        public String getBondName() {
            return this.bondName;
        }

        public GetHyperNodeResponseBodyNodesNetworks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class GetHyperNodeResponseBodyNodes extends TeaModel {
        @NameInMap("Disks")
        public java.util.List<GetHyperNodeResponseBodyNodesDisks> disks;

        /**
         * <strong>example:</strong>
         * <p>alywlcb-lingjun-gpu-0025</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>i190297201669099844192</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>Alinux3_x86_5.10.134-16.3_NV_RunC_D3_E3C7_570.133.20_V1.0_250428</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("Networks")
        public GetHyperNodeResponseBodyNodesNetworks networks;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr0b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * uptime
         * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetHyperNodeResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            GetHyperNodeResponseBodyNodes self = new GetHyperNodeResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public GetHyperNodeResponseBodyNodes setDisks(java.util.List<GetHyperNodeResponseBodyNodesDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<GetHyperNodeResponseBodyNodesDisks> getDisks() {
            return this.disks;
        }

        public GetHyperNodeResponseBodyNodes setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetHyperNodeResponseBodyNodes setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetHyperNodeResponseBodyNodes setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetHyperNodeResponseBodyNodes setNetworks(GetHyperNodeResponseBodyNodesNetworks networks) {
            this.networks = networks;
            return this;
        }
        public GetHyperNodeResponseBodyNodesNetworks getNetworks() {
            return this.networks;
        }

        public GetHyperNodeResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetHyperNodeResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetHyperNodeResponseBodyNodes setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
