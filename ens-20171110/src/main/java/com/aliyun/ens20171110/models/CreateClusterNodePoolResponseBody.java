// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolResponseBody extends TeaModel {
    @NameInMap("Nodepool")
    public CreateClusterNodePoolResponseBodyNodepool nodepool;

    /**
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolResponseBody self = new CreateClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolResponseBody setNodepool(CreateClusterNodePoolResponseBodyNodepool nodepool) {
        this.nodepool = nodepool;
        return this;
    }
    public CreateClusterNodePoolResponseBodyNodepool getNodepool() {
        return this.nodepool;
    }

    public CreateClusterNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig extends TeaModel {
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

        public static CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig self = new CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
        }

        public CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-guiyang-14</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>np1176939548ac49e59febe82dcbf1ad56</p>
         */
        @NameInMap("NodepoolId")
        public String nodepoolId;

        public static CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo self = new CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

    }

    public static class CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks extends TeaModel {
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

        public static CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks self = new CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateClusterNodePoolResponseBodyNodepoolScalingGroup extends TeaModel {
        @NameInMap("DataDisks")
        public java.util.List<CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks> dataDisks;

        /**
         * <strong>example:</strong>
         * <p>m-67bdk1kpu1ylmt7k33h5dbiov</p>
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

        public static CreateClusterNodePoolResponseBodyNodepoolScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolResponseBodyNodepoolScalingGroup self = new CreateClusterNodePoolResponseBodyNodepoolScalingGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setDataDisks(java.util.List<CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<CreateClusterNodePoolResponseBodyNodepoolScalingGroupDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class CreateClusterNodePoolResponseBodyNodepoolStatus extends TeaModel {
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

        public static CreateClusterNodePoolResponseBodyNodepoolStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolResponseBodyNodepoolStatus self = new CreateClusterNodePoolResponseBodyNodepoolStatus();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolResponseBodyNodepoolStatus setDesiredNodes(Integer desiredNodes) {
            this.desiredNodes = desiredNodes;
            return this;
        }
        public Integer getDesiredNodes() {
            return this.desiredNodes;
        }

        public CreateClusterNodePoolResponseBodyNodepoolStatus setInitialNodes(Integer initialNodes) {
            this.initialNodes = initialNodes;
            return this;
        }
        public Integer getInitialNodes() {
            return this.initialNodes;
        }

        public CreateClusterNodePoolResponseBodyNodepoolStatus setRemovingNodes(Integer removingNodes) {
            this.removingNodes = removingNodes;
            return this;
        }
        public Integer getRemovingNodes() {
            return this.removingNodes;
        }

        public CreateClusterNodePoolResponseBodyNodepoolStatus setServingNodes(Integer servingNodes) {
            this.servingNodes = servingNodes;
            return this;
        }
        public Integer getServingNodes() {
            return this.servingNodes;
        }

        public CreateClusterNodePoolResponseBodyNodepoolStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateClusterNodePoolResponseBodyNodepoolStatus setTotalNodes(Integer totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Integer getTotalNodes() {
            return this.totalNodes;
        }

    }

    public static class CreateClusterNodePoolResponseBodyNodepool extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eck-d2666c5f</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("KubernetesConfig")
        public CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig kubernetesConfig;

        @NameInMap("NodepoolInfo")
        public CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo nodepoolInfo;

        @NameInMap("ScalingGroup")
        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup scalingGroup;

        @NameInMap("Status")
        public CreateClusterNodePoolResponseBodyNodepoolStatus status;

        public static CreateClusterNodePoolResponseBodyNodepool build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolResponseBodyNodepool self = new CreateClusterNodePoolResponseBodyNodepool();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolResponseBodyNodepool setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateClusterNodePoolResponseBodyNodepool setKubernetesConfig(CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public CreateClusterNodePoolResponseBodyNodepoolKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public CreateClusterNodePoolResponseBodyNodepool setNodepoolInfo(CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }
        public CreateClusterNodePoolResponseBodyNodepoolNodepoolInfo getNodepoolInfo() {
            return this.nodepoolInfo;
        }

        public CreateClusterNodePoolResponseBodyNodepool setScalingGroup(CreateClusterNodePoolResponseBodyNodepoolScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }
        public CreateClusterNodePoolResponseBodyNodepoolScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        public CreateClusterNodePoolResponseBodyNodepool setStatus(CreateClusterNodePoolResponseBodyNodepoolStatus status) {
            this.status = status;
            return this;
        }
        public CreateClusterNodePoolResponseBodyNodepoolStatus getStatus() {
            return this.status;
        }

    }

}
