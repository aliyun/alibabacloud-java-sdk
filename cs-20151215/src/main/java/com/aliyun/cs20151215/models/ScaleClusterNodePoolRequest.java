// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolRequest extends TeaModel {
    // 扩容节点数量
    @NameInMap("count")
    public Long count;

    // 集群配置
    @NameInMap("kubernetes_config")
    public ScaleClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    // 节点池信息
    @NameInMap("nodepool_info")
    public ScaleClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    // 扩容组配置
    @NameInMap("scaling_group")
    public ScaleClusterNodePoolRequestScalingGroup scalingGroup;

    // 加密计算配置
    @NameInMap("tee_config")
    public ScaleClusterNodePoolRequestTeeConfig teeConfig;

    // 同步更新节点标签及污点
    @NameInMap("update_nodes")
    public Boolean updateNodes;

    public static ScaleClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterNodePoolRequest self = new ScaleClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public ScaleClusterNodePoolRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ScaleClusterNodePoolRequest setKubernetesConfig(ScaleClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public ScaleClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public ScaleClusterNodePoolRequest setNodepoolInfo(ScaleClusterNodePoolRequestNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public ScaleClusterNodePoolRequestNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public ScaleClusterNodePoolRequest setScalingGroup(ScaleClusterNodePoolRequestScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public ScaleClusterNodePoolRequestScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public ScaleClusterNodePoolRequest setTeeConfig(ScaleClusterNodePoolRequestTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public ScaleClusterNodePoolRequestTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public ScaleClusterNodePoolRequest setUpdateNodes(Boolean updateNodes) {
        this.updateNodes = updateNodes;
        return this;
    }
    public Boolean getUpdateNodes() {
        return this.updateNodes;
    }

    public static class ScaleClusterNodePoolRequestKubernetesConfigLabels extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static ScaleClusterNodePoolRequestKubernetesConfigLabels build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestKubernetesConfigLabels self = new ScaleClusterNodePoolRequestKubernetesConfigLabels();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestKubernetesConfigLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleClusterNodePoolRequestKubernetesConfigLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScaleClusterNodePoolRequestKubernetesConfigTaints extends TeaModel {
        // 污点策略
        @NameInMap("effect")
        public String effect;

        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static ScaleClusterNodePoolRequestKubernetesConfigTaints build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestKubernetesConfigTaints self = new ScaleClusterNodePoolRequestKubernetesConfigTaints();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestKubernetesConfigTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ScaleClusterNodePoolRequestKubernetesConfigTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleClusterNodePoolRequestKubernetesConfigTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScaleClusterNodePoolRequestKubernetesConfig extends TeaModel {
        // 节点是否开启云监控
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        // 节点标签。
        @NameInMap("labels")
        public java.util.List<ScaleClusterNodePoolRequestKubernetesConfigLabels> labels;

        // 容器运行时名称
        @NameInMap("runtime")
        public String runtime;

        // 容器运行时版本
        @NameInMap("runtime_version")
        public String runtimeVersion;

        // 污点信息
        @NameInMap("taints")
        public java.util.List<ScaleClusterNodePoolRequestKubernetesConfigTaints> taints;

        // 节点自定义数据
        @NameInMap("user_data")
        public String userData;

        public static ScaleClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestKubernetesConfig self = new ScaleClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public ScaleClusterNodePoolRequestKubernetesConfig setLabels(java.util.List<ScaleClusterNodePoolRequestKubernetesConfigLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ScaleClusterNodePoolRequestKubernetesConfigLabels> getLabels() {
            return this.labels;
        }

        public ScaleClusterNodePoolRequestKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ScaleClusterNodePoolRequestKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public ScaleClusterNodePoolRequestKubernetesConfig setTaints(java.util.List<ScaleClusterNodePoolRequestKubernetesConfigTaints> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<ScaleClusterNodePoolRequestKubernetesConfigTaints> getTaints() {
            return this.taints;
        }

        public ScaleClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ScaleClusterNodePoolRequestNodepoolInfo extends TeaModel {
        // 资源组ID
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        public static ScaleClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestNodepoolInfo self = new ScaleClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ScaleClusterNodePoolRequestScalingGroupDataDisks extends TeaModel {
        // 数据盘类型
        @NameInMap("category")
        public String category;

        // 数据盘是否加密
        @NameInMap("encrypted")
        public String encrypted;

        // 数据盘大小
        @NameInMap("size")
        public Long size;

        public static ScaleClusterNodePoolRequestScalingGroupDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestScalingGroupDataDisks self = new ScaleClusterNodePoolRequestScalingGroupDataDisks();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestScalingGroupDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScaleClusterNodePoolRequestScalingGroupDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ScaleClusterNodePoolRequestScalingGroupDataDisks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class ScaleClusterNodePoolRequestScalingGroupTags extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static ScaleClusterNodePoolRequestScalingGroupTags build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestScalingGroupTags self = new ScaleClusterNodePoolRequestScalingGroupTags();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestScalingGroupTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleClusterNodePoolRequestScalingGroupTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScaleClusterNodePoolRequestScalingGroup extends TeaModel {
        // 数据盘配置
        @NameInMap("data_disks")
        public java.util.List<ScaleClusterNodePoolRequestScalingGroupDataDisks> dataDisks;

        // 节点付费类型
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        // 节点实例规格
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        // 密钥对名称，和login_password二选一
        @NameInMap("key_pair")
        public String keyPair;

        // SSH登录密码，和key_pair二选一
        @NameInMap("login_password")
        public String loginPassword;

        // RDS实例列表
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        // 系统盘类型
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        // 系统盘大小
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        // ECS标签
        @NameInMap("tags")
        public java.util.List<ScaleClusterNodePoolRequestScalingGroupTags> tags;

        // VPC网络ID
        @NameInMap("vpc_id")
        public String vpcId;

        // 虚拟交换机ID
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static ScaleClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestScalingGroup self = new ScaleClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<ScaleClusterNodePoolRequestScalingGroupDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<ScaleClusterNodePoolRequestScalingGroupDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public ScaleClusterNodePoolRequestScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ScaleClusterNodePoolRequestScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public ScaleClusterNodePoolRequestScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public ScaleClusterNodePoolRequestScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ScaleClusterNodePoolRequestScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public ScaleClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ScaleClusterNodePoolRequestScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ScaleClusterNodePoolRequestScalingGroup setTags(java.util.List<ScaleClusterNodePoolRequestScalingGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ScaleClusterNodePoolRequestScalingGroupTags> getTags() {
            return this.tags;
        }

        public ScaleClusterNodePoolRequestScalingGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ScaleClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class ScaleClusterNodePoolRequestTeeConfig extends TeaModel {
        // 是否为加密计算节点池
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static ScaleClusterNodePoolRequestTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            ScaleClusterNodePoolRequestTeeConfig self = new ScaleClusterNodePoolRequestTeeConfig();
            return TeaModel.build(map, self);
        }

        public ScaleClusterNodePoolRequestTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
