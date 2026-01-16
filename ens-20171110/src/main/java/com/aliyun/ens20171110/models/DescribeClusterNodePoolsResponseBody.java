// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponseBody extends TeaModel {
    @NameInMap("NodePools")
    public java.util.List<DescribeClusterNodePoolsResponseBodyNodePools> nodePools;

    @NameInMap("Page")
    public DescribeClusterNodePoolsResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterNodePoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolsResponseBody self = new DescribeClusterNodePoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolsResponseBody setNodePools(java.util.List<DescribeClusterNodePoolsResponseBodyNodePools> nodePools) {
        this.nodePools = nodePools;
        return this;
    }
    public java.util.List<DescribeClusterNodePoolsResponseBodyNodePools> getNodePools() {
        return this.nodePools;
    }

    public DescribeClusterNodePoolsResponseBody setPage(DescribeClusterNodePoolsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeClusterNodePoolsResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeClusterNodePoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZWNobyBvawo=</p>
         */
        @NameInMap("PreUserData")
        public String preUserData;

        /**
         * <strong>example:</strong>
         * <p>ZWNobyBvawo=</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig self = new DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-fuzhou-23</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>eck-node-pool-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
         */
        @NameInMap("NodepoolId")
        public String nodepoolId;

        public static DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo self = new DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks self = new DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup extends TeaModel {
        @NameInMap("DataDisks")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks> dataDisks;

        /**
         * <strong>example:</strong>
         * <p>m-673f5z4h69ibwtallg6zmcaxr</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <strong>example:</strong>
         * <p>key-pair-name</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        public static DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup self = new DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setDataDisks(java.util.List<DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroupDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodePoolsStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DesiredNodes")
        public Integer desiredNodes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InitialNodes")
        public Integer initialNodes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemovingNodes")
        public Integer removingNodes;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ServingNodes")
        public Integer servingNodes;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalNodes")
        public Integer totalNodes;

        public static DescribeClusterNodePoolsResponseBodyNodePoolsStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodePoolsStatus self = new DescribeClusterNodePoolsResponseBodyNodePoolsStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus setDesiredNodes(Integer desiredNodes) {
            this.desiredNodes = desiredNodes;
            return this;
        }
        public Integer getDesiredNodes() {
            return this.desiredNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus setInitialNodes(Integer initialNodes) {
            this.initialNodes = initialNodes;
            return this;
        }
        public Integer getInitialNodes() {
            return this.initialNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus setRemovingNodes(Integer removingNodes) {
            this.removingNodes = removingNodes;
            return this;
        }
        public Integer getRemovingNodes() {
            return this.removingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus setServingNodes(Integer servingNodes) {
            this.servingNodes = servingNodes;
            return this;
        }
        public Integer getServingNodes() {
            return this.servingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus setTotalNodes(Integer totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Integer getTotalNodes() {
            return this.totalNodes;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodePools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("KubernetesConfig")
        public DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig kubernetesConfig;

        @NameInMap("NodepoolInfo")
        public DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo nodepoolInfo;

        @NameInMap("ScalingGroup")
        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup scalingGroup;

        @NameInMap("Status")
        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus status;

        public static DescribeClusterNodePoolsResponseBodyNodePools build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodePools self = new DescribeClusterNodePoolsResponseBodyNodePools();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodePools setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterNodePoolsResponseBodyNodePools setKubernetesConfig(DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodePoolsKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodePools setNodepoolInfo(DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodePoolsNodepoolInfo getNodepoolInfo() {
            return this.nodepoolInfo;
        }

        public DescribeClusterNodePoolsResponseBodyNodePools setScalingGroup(DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodePoolsScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        public DescribeClusterNodePoolsResponseBodyNodePools setStatus(DescribeClusterNodePoolsResponseBodyNodePoolsStatus status) {
            this.status = status;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodePoolsStatus getStatus() {
            return this.status;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeClusterNodePoolsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyPage self = new DescribeClusterNodePoolsResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeClusterNodePoolsResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeClusterNodePoolsResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
