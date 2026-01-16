// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("KubernetesConfig")
    public CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodepoolInfo")
    public CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingGroup")
    public CreateClusterNodePoolRequestScalingGroup scalingGroup;

    public static CreateClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolRequest self = new CreateClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterNodePoolRequest setKubernetesConfig(CreateClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public CreateClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public CreateClusterNodePoolRequest setNodepoolInfo(CreateClusterNodePoolRequestNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public CreateClusterNodePoolRequestNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public CreateClusterNodePoolRequest setScalingGroup(CreateClusterNodePoolRequestScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public CreateClusterNodePoolRequestScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public static class CreateClusterNodePoolRequestKubernetesConfig extends TeaModel {
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

        public static CreateClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestKubernetesConfig self = new CreateClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
        }

        public CreateClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateClusterNodePoolRequestNodepoolInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestNodepoolInfo self = new CreateClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroupDataDisks extends TeaModel {
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

        public static CreateClusterNodePoolRequestScalingGroupDataDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroupDataDisks self = new CreateClusterNodePoolRequestScalingGroupDataDisks();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroupDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateClusterNodePoolRequestScalingGroupDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateClusterNodePoolRequestScalingGroup extends TeaModel {
        @NameInMap("DataDisks")
        public java.util.List<CreateClusterNodePoolRequestScalingGroupDataDisks> dataDisks;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DesiredSize")
        public Integer desiredSize;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-6734fzvcwcv2o8jj201cpa7ox</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>This parameter is required.</p>
         */
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
         * <p>some-test-password</p>
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

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        public static CreateClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterNodePoolRequestScalingGroup self = new CreateClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public CreateClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<CreateClusterNodePoolRequestScalingGroupDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<CreateClusterNodePoolRequestScalingGroupDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public CreateClusterNodePoolRequestScalingGroup setDesiredSize(Integer desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Integer getDesiredSize() {
            return this.desiredSize;
        }

        public CreateClusterNodePoolRequestScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public CreateClusterNodePoolRequestScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateClusterNodePoolRequestScalingGroup setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateClusterNodePoolRequestScalingGroup setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateClusterNodePoolRequestScalingGroup setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

}
