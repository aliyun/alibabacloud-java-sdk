// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("KubernetesConfig")
    public ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodepoolInfo")
    public ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    @NameInMap("ScalingGroup")
    public ModifyClusterNodePoolRequestScalingGroup scalingGroup;

    public static ModifyClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolRequest self = new ModifyClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterNodePoolRequest setKubernetesConfig(ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public ModifyClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public ModifyClusterNodePoolRequest setNodepoolInfo(ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public ModifyClusterNodePoolRequestNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public ModifyClusterNodePoolRequest setScalingGroup(ModifyClusterNodePoolRequestScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public ModifyClusterNodePoolRequestScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public static class ModifyClusterNodePoolRequestKubernetesConfig extends TeaModel {
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

        public static ModifyClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestKubernetesConfig self = new ModifyClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setPreUserData(String preUserData) {
            this.preUserData = preUserData;
            return this;
        }
        public String getPreUserData() {
            return this.preUserData;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ModifyClusterNodePoolRequestNodepoolInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
         */
        @NameInMap("NodepoolId")
        public String nodepoolId;

        public static ModifyClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestNodepoolInfo self = new ModifyClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroupDataDisks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ModifyClusterNodePoolRequestScalingGroupDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroupDataDisks self = new ModifyClusterNodePoolRequestScalingGroupDataDisks();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroupDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyClusterNodePoolRequestScalingGroupDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroup extends TeaModel {
        @NameInMap("DataDisks")
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupDataDisks> dataDisks;

        /**
         * <strong>example:</strong>
         * <p>m-68bysm5a8gkm7oik7ngacf0in</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <strong>example:</strong>
         * <p>tf-testAcc</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <strong>example:</strong>
         * <p>@AN5Ejx1YyzzK</p>
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

        public static ModifyClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroup self = new ModifyClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<ModifyClusterNodePoolRequestScalingGroupDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public ModifyClusterNodePoolRequestScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public ModifyClusterNodePoolRequestScalingGroup setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ModifyClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

}
