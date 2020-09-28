// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponseBody extends TeaModel {
    // 节点池列表。	
    @NameInMap("nodepools")
    public java.util.List<DescribeClusterNodePoolsResponseBodyNodepools> nodepools;

    public static DescribeClusterNodePoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolsResponseBody self = new DescribeClusterNodePoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolsResponseBody setNodepools(java.util.List<DescribeClusterNodePoolsResponseBodyNodepools> nodepools) {
        this.nodepools = nodepools;
        return this;
    }
    public java.util.List<DescribeClusterNodePoolsResponseBodyNodepools> getNodepools() {
        return this.nodepools;
    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling extends TeaModel {
        // EIP带宽峰值	
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        // EIP付费类型	
        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        // 自动伸缩。	
        @NameInMap("enable")
        public Boolean enable;

        // 健康检查策略	
        @NameInMap("health_check_type")
        public String healthCheckType;

        // 最大节点数	
        @NameInMap("max_instances")
        public Long maxInstances;

        // 最小节点数	
        @NameInMap("min_instances")
        public Long minInstances;

        // 自动扩容节点类型。	
        @NameInMap("type")
        public String type;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling self = new DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels self = new DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints extends TeaModel {
        // 污点策略。
        @NameInMap("effect")
        public String effect;

        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints self = new DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig extends TeaModel {
        // 是否开启云监控	
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        // CPU管理策略	
        @NameInMap("cpu_policy")
        public String cpuPolicy;

        // ECS标签。	
        @NameInMap("labels")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels> labels;

        // 节点命名策略。	
        @NameInMap("node_name_mode")
        public String nodeNameMode;

        // 是否覆盖主机名。	
        @NameInMap("overwrite_hostname")
        public Boolean overwriteHostname;

        // 容器运行时	
        @NameInMap("runtime")
        public String runtime;

        // 容器运行时版本	
        @NameInMap("runtime_version")
        public String runtimeVersion;

        // 污点配置
        @NameInMap("taints")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints> taints;

        // 节点自定义数据
        @NameInMap("user_data")
        public String userData;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setLabels(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigLabels> getLabels() {
            return this.labels;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setOverwriteHostname(Boolean overwriteHostname) {
            this.overwriteHostname = overwriteHostname;
            return this;
        }
        public Boolean getOverwriteHostname() {
            return this.overwriteHostname;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setTaints(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfigTaints> getTaints() {
            return this.taints;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo extends TeaModel {
        // 节点池创建时间
        @NameInMap("created")
        public String created;

        // 默认节点池
        @NameInMap("is_default")
        public Boolean isDefault;

        // 节点池名称
        @NameInMap("name")
        public String name;

        // 节点池ID
        @NameInMap("nodepool_id")
        public String nodepoolId;

        // 节点池所在地域ID。
        @NameInMap("region_id")
        public String regionId;

        // 资源组ID
        @NameInMap("resource_group_id")
        public String resourceGroupId;

        // 节点池类型
        @NameInMap("type")
        public String type;

        // 节点池更新时间
        @NameInMap("updated")
        public String updated;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo self = new DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks extends TeaModel {
        // 数据盘类型	
        @NameInMap("category")
        public String category;

        // 数据盘是否加密	
        @NameInMap("encrypted")
        public String encrypted;

        // 数据盘大小	
        @NameInMap("size")
        public Long size;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup extends TeaModel {
        // 自动续费	
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        // 自动付费时长	
        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        // 数据盘配置	
        @NameInMap("data_disks")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks> dataDisks;

        // 镜像ID	
        @NameInMap("image_id")
        public String imageId;

        // 节点付费类型	
        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        // 节点类型	
        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        // 多可用去策略	
        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        // 包年包月时长	
        @NameInMap("period")
        public Long period;

        // 自动付费周期	
        @NameInMap("period_unit")
        public String periodUnit;

        // 操作系统发行版。	
        @NameInMap("platform")
        public String platform;

        // RAM 角色名称	
        @NameInMap("ram_policy")
        public String ramPolicy;

        // RDS列表	
        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        // 扩容组ID	
        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        // 扩容节点策略	
        @NameInMap("scaling_policy")
        public String scalingPolicy;

        // 安全组ID。	
        @NameInMap("security_group_id")
        public String securityGroupId;

        // 系统盘类型。	
        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        // 系统盘大小	
        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        // 节点标签	
        @NameInMap("tags")
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags> tags;

        // 虚拟交换机ID。	
        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        // 高性能计算集群ID	
        @NameInMap("worker_hpc_cluster_id")
        public String workerHpcClusterId;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDataDisks(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupDataDisks> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setRamPolicy(String ramPolicy) {
            this.ramPolicy = ramPolicy;
            return this;
        }
        public String getRamPolicy() {
            return this.ramPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setTags(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupTags> getTags() {
            return this.tags;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setWorkerHpcClusterId(String workerHpcClusterId) {
            this.workerHpcClusterId = workerHpcClusterId;
            return this;
        }
        public String getWorkerHpcClusterId() {
            return this.workerHpcClusterId;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsStatus extends TeaModel {
        // 失败的节点数	
        @NameInMap("failed_nodes")
        public Long failedNodes;

        // 处于健康状态的节点数	
        @NameInMap("healthy_nodes")
        public Long healthyNodes;

        // 正在创建的节点数	
        @NameInMap("initial_nodes")
        public Long initialNodes;

        // 离线节点数	
        @NameInMap("offline_nodes")
        public Long offlineNodes;

        // 真在被移除的节点数。	
        @NameInMap("removing_nodes")
        public Long removingNodes;

        // 正在工作节点数	
        @NameInMap("serving_nodes")
        public Long servingNodes;

        // 节点池状态	
        @NameInMap("state")
        public String state;

        // 节点总数	
        @NameInMap("total_nodes")
        public Long totalNodes;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsStatus self = new DescribeClusterNodePoolsResponseBodyNodepoolsStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setFailedNodes(Long failedNodes) {
            this.failedNodes = failedNodes;
            return this;
        }
        public Long getFailedNodes() {
            return this.failedNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setHealthyNodes(Long healthyNodes) {
            this.healthyNodes = healthyNodes;
            return this;
        }
        public Long getHealthyNodes() {
            return this.healthyNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setInitialNodes(Long initialNodes) {
            this.initialNodes = initialNodes;
            return this;
        }
        public Long getInitialNodes() {
            return this.initialNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setOfflineNodes(Long offlineNodes) {
            this.offlineNodes = offlineNodes;
            return this;
        }
        public Long getOfflineNodes() {
            return this.offlineNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setRemovingNodes(Long removingNodes) {
            this.removingNodes = removingNodes;
            return this;
        }
        public Long getRemovingNodes() {
            return this.removingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setServingNodes(Long servingNodes) {
            this.servingNodes = servingNodes;
            return this;
        }
        public Long getServingNodes() {
            return this.servingNodes;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus setTotalNodes(Long totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Long getTotalNodes() {
            return this.totalNodes;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig extends TeaModel {
        // 是否为加密计算节点池	
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepools extends TeaModel {
        // 自动伸缩配置。
        @NameInMap("auto_scaling")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling;

        // 集群配置。	
        @NameInMap("kubernetes_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig;

        // 节点池信息
        @NameInMap("nodepool_info")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo;

        // 扩容组配置。	
        @NameInMap("scaling_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup;

        // 节点池状态信息。	
        @NameInMap("status")
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus status;

        // 加密计算配置。	
        @NameInMap("tee_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig teeConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepools build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepools self = new DescribeClusterNodePoolsResponseBodyNodepools();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setAutoScaling(DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling getAutoScaling() {
            return this.autoScaling;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setKubernetesConfig(DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setNodepoolInfo(DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo) {
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo getNodepoolInfo() {
            return this.nodepoolInfo;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setScalingGroup(DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setStatus(DescribeClusterNodePoolsResponseBodyNodepoolsStatus status) {
            this.status = status;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus getStatus() {
            return this.status;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setTeeConfig(DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig teeConfig) {
            this.teeConfig = teeConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsTeeConfig getTeeConfig() {
            return this.teeConfig;
        }

    }

}
