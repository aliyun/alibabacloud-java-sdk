// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolRequest extends TeaModel {
    @NameInMap("auto_scaling")
    public ModifyClusterNodePoolRequestAutoScaling autoScaling;

    @NameInMap("kubernetes_config")
    public ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig;

    @NameInMap("management")
    public ModifyClusterNodePoolRequestManagement management;

    @NameInMap("node_config")
    public ModifyClusterNodePoolRequestNodeConfig nodeConfig;

    @NameInMap("nodepool_info")
    public ModifyClusterNodePoolRequestNodepoolInfo nodepoolInfo;

    @NameInMap("scaling_group")
    public ModifyClusterNodePoolRequestScalingGroup scalingGroup;

    @NameInMap("tee_config")
    public ModifyClusterNodePoolRequestTeeConfig teeConfig;

    @NameInMap("update_nodes")
    public Boolean updateNodes;

    public static ModifyClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolRequest self = new ModifyClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolRequest setAutoScaling(ModifyClusterNodePoolRequestAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public ModifyClusterNodePoolRequestAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    public ModifyClusterNodePoolRequest setKubernetesConfig(ModifyClusterNodePoolRequestKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public ModifyClusterNodePoolRequestKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public ModifyClusterNodePoolRequest setManagement(ModifyClusterNodePoolRequestManagement management) {
        this.management = management;
        return this;
    }
    public ModifyClusterNodePoolRequestManagement getManagement() {
        return this.management;
    }

    public ModifyClusterNodePoolRequest setNodeConfig(ModifyClusterNodePoolRequestNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public ModifyClusterNodePoolRequestNodeConfig getNodeConfig() {
        return this.nodeConfig;
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

    public ModifyClusterNodePoolRequest setTeeConfig(ModifyClusterNodePoolRequestTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public ModifyClusterNodePoolRequestTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public ModifyClusterNodePoolRequest setUpdateNodes(Boolean updateNodes) {
        this.updateNodes = updateNodes;
        return this;
    }
    public Boolean getUpdateNodes() {
        return this.updateNodes;
    }

    public static class ModifyClusterNodePoolRequestAutoScaling extends TeaModel {
        @NameInMap("eip_bandwidth")
        public Long eipBandwidth;

        @NameInMap("eip_internet_charge_type")
        public String eipInternetChargeType;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("is_bond_eip")
        public Boolean isBondEip;

        @NameInMap("max_instances")
        public Long maxInstances;

        @NameInMap("min_instances")
        public Long minInstances;

        @NameInMap("type")
        public String type;

        public static ModifyClusterNodePoolRequestAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestAutoScaling self = new ModifyClusterNodePoolRequestAutoScaling();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public ModifyClusterNodePoolRequestAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public ModifyClusterNodePoolRequestAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyClusterNodePoolRequestAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public ModifyClusterNodePoolRequestAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public ModifyClusterNodePoolRequestAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public ModifyClusterNodePoolRequestAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyClusterNodePoolRequestKubernetesConfig extends TeaModel {
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        @NameInMap("cpu_policy")
        public String cpuPolicy;

        @NameInMap("labels")
        public java.util.List<Tag> labels;

        @NameInMap("runtime")
        public String runtime;

        @NameInMap("runtime_version")
        public String runtimeVersion;

        @NameInMap("taints")
        public java.util.List<Taint> taints;

        @NameInMap("user_data")
        public String userData;

        public static ModifyClusterNodePoolRequestKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestKubernetesConfig self = new ModifyClusterNodePoolRequestKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public ModifyClusterNodePoolRequestKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ModifyClusterNodePoolRequestManagementUpgradeConfig extends TeaModel {
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        @NameInMap("surge")
        public Long surge;

        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static ModifyClusterNodePoolRequestManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagementUpgradeConfig self = new ModifyClusterNodePoolRequestManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public ModifyClusterNodePoolRequestManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class ModifyClusterNodePoolRequestManagement extends TeaModel {
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("upgrade_config")
        public ModifyClusterNodePoolRequestManagementUpgradeConfig upgradeConfig;

        public static ModifyClusterNodePoolRequestManagement build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestManagement self = new ModifyClusterNodePoolRequestManagement();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public ModifyClusterNodePoolRequestManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyClusterNodePoolRequestManagement setUpgradeConfig(ModifyClusterNodePoolRequestManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public ModifyClusterNodePoolRequestManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration extends TeaModel {
        @NameInMap("cpuManagerPolicy")
        public String cpuManagerPolicy;

        @NameInMap("eventBurst")
        public Long eventBurst;

        @NameInMap("eventRecordQPS")
        public Long eventRecordQPS;

        @NameInMap("evictionHard")
        public java.util.Map<String, ?> evictionHard;

        @NameInMap("evictionSoft")
        public java.util.Map<String, ?> evictionSoft;

        @NameInMap("evictionSoftGracePeriod")
        public java.util.Map<String, ?> evictionSoftGracePeriod;

        @NameInMap("kubeAPIBurst")
        public Long kubeAPIBurst;

        @NameInMap("kubeAPIQPS")
        public Long kubeAPIQPS;

        @NameInMap("kubeReserved")
        public java.util.Map<String, ?> kubeReserved;

        @NameInMap("registryBurst")
        public Long registryBurst;

        @NameInMap("registryPullQPS")
        public Long registryPullQPS;

        @NameInMap("serializeImagePulls")
        public Boolean serializeImagePulls;

        @NameInMap("systemReserved")
        public java.util.Map<String, ?> systemReserved;

        public static ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration self = new ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setCpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }
        public String getCpuManagerPolicy() {
            return this.cpuManagerPolicy;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setEventBurst(Long eventBurst) {
            this.eventBurst = eventBurst;
            return this;
        }
        public Long getEventBurst() {
            return this.eventBurst;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setEventRecordQPS(Long eventRecordQPS) {
            this.eventRecordQPS = eventRecordQPS;
            return this;
        }
        public Long getEventRecordQPS() {
            return this.eventRecordQPS;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setEvictionHard(java.util.Map<String, ?> evictionHard) {
            this.evictionHard = evictionHard;
            return this;
        }
        public java.util.Map<String, ?> getEvictionHard() {
            return this.evictionHard;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setEvictionSoft(java.util.Map<String, ?> evictionSoft) {
            this.evictionSoft = evictionSoft;
            return this;
        }
        public java.util.Map<String, ?> getEvictionSoft() {
            return this.evictionSoft;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setEvictionSoftGracePeriod(java.util.Map<String, ?> evictionSoftGracePeriod) {
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
            return this;
        }
        public java.util.Map<String, ?> getEvictionSoftGracePeriod() {
            return this.evictionSoftGracePeriod;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setKubeAPIBurst(Long kubeAPIBurst) {
            this.kubeAPIBurst = kubeAPIBurst;
            return this;
        }
        public Long getKubeAPIBurst() {
            return this.kubeAPIBurst;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setKubeAPIQPS(Long kubeAPIQPS) {
            this.kubeAPIQPS = kubeAPIQPS;
            return this;
        }
        public Long getKubeAPIQPS() {
            return this.kubeAPIQPS;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setKubeReserved(java.util.Map<String, ?> kubeReserved) {
            this.kubeReserved = kubeReserved;
            return this;
        }
        public java.util.Map<String, ?> getKubeReserved() {
            return this.kubeReserved;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setRegistryBurst(Long registryBurst) {
            this.registryBurst = registryBurst;
            return this;
        }
        public Long getRegistryBurst() {
            return this.registryBurst;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setRegistryPullQPS(Long registryPullQPS) {
            this.registryPullQPS = registryPullQPS;
            return this;
        }
        public Long getRegistryPullQPS() {
            return this.registryPullQPS;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setSerializeImagePulls(Boolean serializeImagePulls) {
            this.serializeImagePulls = serializeImagePulls;
            return this;
        }
        public Boolean getSerializeImagePulls() {
            return this.serializeImagePulls;
        }

        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration setSystemReserved(java.util.Map<String, ?> systemReserved) {
            this.systemReserved = systemReserved;
            return this;
        }
        public java.util.Map<String, ?> getSystemReserved() {
            return this.systemReserved;
        }

    }

    public static class ModifyClusterNodePoolRequestNodeConfigRolloutPolicy extends TeaModel {
        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        public static ModifyClusterNodePoolRequestNodeConfigRolloutPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestNodeConfigRolloutPolicy self = new ModifyClusterNodePoolRequestNodeConfigRolloutPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestNodeConfigRolloutPolicy setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

    }

    public static class ModifyClusterNodePoolRequestNodeConfig extends TeaModel {
        @NameInMap("kubelet_configuration")
        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration kubeletConfiguration;

        @NameInMap("rollout_policy")
        public ModifyClusterNodePoolRequestNodeConfigRolloutPolicy rolloutPolicy;

        public static ModifyClusterNodePoolRequestNodeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestNodeConfig self = new ModifyClusterNodePoolRequestNodeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestNodeConfig setKubeletConfiguration(ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration kubeletConfiguration) {
            this.kubeletConfiguration = kubeletConfiguration;
            return this;
        }
        public ModifyClusterNodePoolRequestNodeConfigKubeletConfiguration getKubeletConfiguration() {
            return this.kubeletConfiguration;
        }

        public ModifyClusterNodePoolRequestNodeConfig setRolloutPolicy(ModifyClusterNodePoolRequestNodeConfigRolloutPolicy rolloutPolicy) {
            this.rolloutPolicy = rolloutPolicy;
            return this;
        }
        public ModifyClusterNodePoolRequestNodeConfigRolloutPolicy getRolloutPolicy() {
            return this.rolloutPolicy;
        }

    }

    public static class ModifyClusterNodePoolRequestNodepoolInfo extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("resource_group_id")
        public String resourceGroupId;

        public static ModifyClusterNodePoolRequestNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestNodepoolInfo self = new ModifyClusterNodePoolRequestNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyClusterNodePoolRequestNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit extends TeaModel {
        @NameInMap("instance_type")
        public String instanceType;

        @NameInMap("price_limit")
        public String priceLimit;

        public static ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit self = new ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class ModifyClusterNodePoolRequestScalingGroup extends TeaModel {
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        @NameInMap("desired_size")
        public Long desiredSize;

        @NameInMap("image_id")
        public String imageId;

        @NameInMap("instance_charge_type")
        public String instanceChargeType;

        @NameInMap("instance_types")
        public java.util.List<String> instanceTypes;

        @NameInMap("internet_charge_type")
        public String internetChargeType;

        @NameInMap("internet_max_bandwidth_out")
        public Long internetMaxBandwidthOut;

        @NameInMap("key_pair")
        public String keyPair;

        @NameInMap("login_password")
        public String loginPassword;

        @NameInMap("multi_az_policy")
        public String multiAzPolicy;

        @NameInMap("on_demand_base_capacity")
        public Long onDemandBaseCapacity;

        @NameInMap("on_demand_percentage_above_base_capacity")
        public Long onDemandPercentageAboveBaseCapacity;

        @NameInMap("period")
        public Long period;

        @NameInMap("period_unit")
        public String periodUnit;

        @NameInMap("platform")
        public String platform;

        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        @NameInMap("scaling_policy")
        public String scalingPolicy;

        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        @NameInMap("spot_price_limit")
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit;

        @NameInMap("spot_strategy")
        public String spotStrategy;

        @NameInMap("system_disk_category")
        public String systemDiskCategory;

        @NameInMap("system_disk_performance_level")
        public String systemDiskPerformanceLevel;

        @NameInMap("system_disk_size")
        public Long systemDiskSize;

        @NameInMap("tags")
        public java.util.List<Tag> tags;

        @NameInMap("vswitch_ids")
        public java.util.List<String> vswitchIds;

        public static ModifyClusterNodePoolRequestScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestScalingGroup self = new ModifyClusterNodePoolRequestScalingGroup();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ModifyClusterNodePoolRequestScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public ModifyClusterNodePoolRequestScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public ModifyClusterNodePoolRequestScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public ModifyClusterNodePoolRequestScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
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

        public ModifyClusterNodePoolRequestScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public ModifyClusterNodePoolRequestScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public ModifyClusterNodePoolRequestScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public ModifyClusterNodePoolRequestScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ModifyClusterNodePoolRequestScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public ModifyClusterNodePoolRequestScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ModifyClusterNodePoolRequestScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ModifyClusterNodePoolRequestScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public ModifyClusterNodePoolRequestScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotPriceLimit(java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<ModifyClusterNodePoolRequestScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public ModifyClusterNodePoolRequestScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ModifyClusterNodePoolRequestScalingGroup setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public ModifyClusterNodePoolRequestScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class ModifyClusterNodePoolRequestTeeConfig extends TeaModel {
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static ModifyClusterNodePoolRequestTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterNodePoolRequestTeeConfig self = new ModifyClusterNodePoolRequestTeeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterNodePoolRequestTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
