// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolDetailResponseBody extends TeaModel {
    @NameInMap("auto_scaling")
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling;

    @NameInMap("interconnect_config")
    public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig interconnectConfig;

    @NameInMap("interconnect_mode")
    public String interconnectMode;

    @NameInMap("kubernetes_config")
    public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig kubernetesConfig;

    @NameInMap("management")
    public DescribeClusterNodePoolDetailResponseBodyManagement management;

    @NameInMap("max_nodes")
    public Long maxNodes;

    @NameInMap("nodepool_info")
    public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo nodepoolInfo;

    @NameInMap("scaling_group")
    public DescribeClusterNodePoolDetailResponseBodyScalingGroup scalingGroup;

    @NameInMap("status")
    public DescribeClusterNodePoolDetailResponseBodyStatus status;

    @NameInMap("tee_config")
    public DescribeClusterNodePoolDetailResponseBodyTeeConfig teeConfig;

    public static DescribeClusterNodePoolDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolDetailResponseBody self = new DescribeClusterNodePoolDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolDetailResponseBody setAutoScaling(DescribeClusterNodePoolDetailResponseBodyAutoScaling autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyAutoScaling getAutoScaling() {
        return this.autoScaling;
    }

    public DescribeClusterNodePoolDetailResponseBody setInterconnectConfig(DescribeClusterNodePoolDetailResponseBodyInterconnectConfig interconnectConfig) {
        this.interconnectConfig = interconnectConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig getInterconnectConfig() {
        return this.interconnectConfig;
    }

    public DescribeClusterNodePoolDetailResponseBody setInterconnectMode(String interconnectMode) {
        this.interconnectMode = interconnectMode;
        return this;
    }
    public String getInterconnectMode() {
        return this.interconnectMode;
    }

    public DescribeClusterNodePoolDetailResponseBody setKubernetesConfig(DescribeClusterNodePoolDetailResponseBodyKubernetesConfig kubernetesConfig) {
        this.kubernetesConfig = kubernetesConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig getKubernetesConfig() {
        return this.kubernetesConfig;
    }

    public DescribeClusterNodePoolDetailResponseBody setManagement(DescribeClusterNodePoolDetailResponseBodyManagement management) {
        this.management = management;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyManagement getManagement() {
        return this.management;
    }

    public DescribeClusterNodePoolDetailResponseBody setMaxNodes(Long maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }
    public Long getMaxNodes() {
        return this.maxNodes;
    }

    public DescribeClusterNodePoolDetailResponseBody setNodepoolInfo(DescribeClusterNodePoolDetailResponseBodyNodepoolInfo nodepoolInfo) {
        this.nodepoolInfo = nodepoolInfo;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo getNodepoolInfo() {
        return this.nodepoolInfo;
    }

    public DescribeClusterNodePoolDetailResponseBody setScalingGroup(DescribeClusterNodePoolDetailResponseBodyScalingGroup scalingGroup) {
        this.scalingGroup = scalingGroup;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public DescribeClusterNodePoolDetailResponseBody setStatus(DescribeClusterNodePoolDetailResponseBodyStatus status) {
        this.status = status;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyStatus getStatus() {
        return this.status;
    }

    public DescribeClusterNodePoolDetailResponseBody setTeeConfig(DescribeClusterNodePoolDetailResponseBodyTeeConfig teeConfig) {
        this.teeConfig = teeConfig;
        return this;
    }
    public DescribeClusterNodePoolDetailResponseBodyTeeConfig getTeeConfig() {
        return this.teeConfig;
    }

    public static class DescribeClusterNodePoolDetailResponseBodyAutoScaling extends TeaModel {
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

        public static DescribeClusterNodePoolDetailResponseBodyAutoScaling build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyAutoScaling self = new DescribeClusterNodePoolDetailResponseBodyAutoScaling();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setEipBandwidth(Long eipBandwidth) {
            this.eipBandwidth = eipBandwidth;
            return this;
        }
        public Long getEipBandwidth() {
            return this.eipBandwidth;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setEipInternetChargeType(String eipInternetChargeType) {
            this.eipInternetChargeType = eipInternetChargeType;
            return this;
        }
        public String getEipInternetChargeType() {
            return this.eipInternetChargeType;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setMaxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Long getMaxInstances() {
            return this.maxInstances;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setMinInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Long getMinInstances() {
            return this.minInstances;
        }

        public DescribeClusterNodePoolDetailResponseBodyAutoScaling setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyInterconnectConfig extends TeaModel {
        @NameInMap("bandwidth")
        public Long bandwidth;

        @NameInMap("ccn_id")
        public String ccnId;

        @NameInMap("ccn_region_id")
        public String ccnRegionId;

        @NameInMap("cen_id")
        public String cenId;

        @NameInMap("improved_period")
        public String improvedPeriod;

        public static DescribeClusterNodePoolDetailResponseBodyInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyInterconnectConfig self = new DescribeClusterNodePoolDetailResponseBodyInterconnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeClusterNodePoolDetailResponseBodyInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyKubernetesConfig extends TeaModel {
        @NameInMap("cms_enabled")
        public Boolean cmsEnabled;

        @NameInMap("cpu_policy")
        public String cpuPolicy;

        @NameInMap("labels")
        public java.util.List<Tag> labels;

        @NameInMap("node_name_mode")
        public String nodeNameMode;

        @NameInMap("runtime")
        public String runtime;

        @NameInMap("runtime_version")
        public String runtimeVersion;

        @NameInMap("taints")
        public java.util.List<Taint> taints;

        @NameInMap("user_data")
        public String userData;

        public static DescribeClusterNodePoolDetailResponseBodyKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyKubernetesConfig self = new DescribeClusterNodePoolDetailResponseBodyKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setCmsEnabled(Boolean cmsEnabled) {
            this.cmsEnabled = cmsEnabled;
            return this;
        }
        public Boolean getCmsEnabled() {
            return this.cmsEnabled;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setCpuPolicy(String cpuPolicy) {
            this.cpuPolicy = cpuPolicy;
            return this;
        }
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
            return this.taints;
        }

        public DescribeClusterNodePoolDetailResponseBodyKubernetesConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig extends TeaModel {
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        @NameInMap("surge")
        public Long surge;

        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig self = new DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyManagement extends TeaModel {
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("upgrade_config")
        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig upgradeConfig;

        public static DescribeClusterNodePoolDetailResponseBodyManagement build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyManagement self = new DescribeClusterNodePoolDetailResponseBodyManagement();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolDetailResponseBodyManagement setUpgradeConfig(DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public DescribeClusterNodePoolDetailResponseBodyManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyNodepoolInfo extends TeaModel {
        @NameInMap("created")
        public String created;

        @NameInMap("is_default")
        public Boolean isDefault;

        @NameInMap("name")
        public String name;

        @NameInMap("nodepool_id")
        public String nodepoolId;

        @NameInMap("region_id")
        public String regionId;

        @NameInMap("resource_group_id")
        public String resourceGroupId;

        @NameInMap("type")
        public String type;

        @NameInMap("updated")
        public String updated;

        public static DescribeClusterNodePoolDetailResponseBodyNodepoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyNodepoolInfo self = new DescribeClusterNodePoolDetailResponseBodyNodepoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterNodePoolDetailResponseBodyNodepoolInfo setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit extends TeaModel {
        @NameInMap("instance_type")
        public String instanceType;

        @NameInMap("price_limit")
        public String priceLimit;

        public static DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit self = new DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyScalingGroup extends TeaModel {
        @NameInMap("auto_renew")
        public Boolean autoRenew;

        @NameInMap("auto_renew_period")
        public Long autoRenewPeriod;

        @NameInMap("compensate_with_on_demand")
        public Boolean compensateWithOnDemand;

        @NameInMap("data_disks")
        public java.util.List<DataDisk> dataDisks;

        @NameInMap("deploymentset_id")
        public String deploymentsetId;

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

        @NameInMap("ram_policy")
        public String ramPolicy;

        @NameInMap("rds_instances")
        public java.util.List<String> rdsInstances;

        @NameInMap("scaling_group_id")
        public String scalingGroupId;

        @NameInMap("scaling_policy")
        public String scalingPolicy;

        @NameInMap("security_group_id")
        public String securityGroupId;

        @NameInMap("security_group_ids")
        public java.util.List<String> securityGroupIds;

        @NameInMap("spot_instance_pools")
        public Long spotInstancePools;

        @NameInMap("spot_instance_remedy")
        public Boolean spotInstanceRemedy;

        @NameInMap("spot_price_limit")
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> spotPriceLimit;

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

        public static DescribeClusterNodePoolDetailResponseBodyScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyScalingGroup self = new DescribeClusterNodePoolDetailResponseBodyScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setAutoRenewPeriod(Long autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setRamPolicy(String ramPolicy) {
            this.ramPolicy = ramPolicy;
            return this;
        }
        public String getRamPolicy() {
            return this.ramPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setRdsInstances(java.util.List<String> rdsInstances) {
            this.rdsInstances = rdsInstances;
            return this;
        }
        public java.util.List<String> getRdsInstances() {
            return this.rdsInstances;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setScalingPolicy(String scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotPriceLimit(java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolDetailResponseBodyScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public DescribeClusterNodePoolDetailResponseBodyScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyStatus extends TeaModel {
        @NameInMap("failed_nodes")
        public Long failedNodes;

        @NameInMap("healthy_nodes")
        public Long healthyNodes;

        @NameInMap("initial_nodes")
        public Long initialNodes;

        @NameInMap("offline_nodes")
        public Long offlineNodes;

        @NameInMap("removing_nodes")
        public Long removingNodes;

        @NameInMap("serving_nodes")
        public Long servingNodes;

        @NameInMap("state")
        public String state;

        @NameInMap("total_nodes")
        public Long totalNodes;

        public static DescribeClusterNodePoolDetailResponseBodyStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyStatus self = new DescribeClusterNodePoolDetailResponseBodyStatus();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setFailedNodes(Long failedNodes) {
            this.failedNodes = failedNodes;
            return this;
        }
        public Long getFailedNodes() {
            return this.failedNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setHealthyNodes(Long healthyNodes) {
            this.healthyNodes = healthyNodes;
            return this;
        }
        public Long getHealthyNodes() {
            return this.healthyNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setInitialNodes(Long initialNodes) {
            this.initialNodes = initialNodes;
            return this;
        }
        public Long getInitialNodes() {
            return this.initialNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setOfflineNodes(Long offlineNodes) {
            this.offlineNodes = offlineNodes;
            return this;
        }
        public Long getOfflineNodes() {
            return this.offlineNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setRemovingNodes(Long removingNodes) {
            this.removingNodes = removingNodes;
            return this;
        }
        public Long getRemovingNodes() {
            return this.removingNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setServingNodes(Long servingNodes) {
            this.servingNodes = servingNodes;
            return this;
        }
        public Long getServingNodes() {
            return this.servingNodes;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterNodePoolDetailResponseBodyStatus setTotalNodes(Long totalNodes) {
            this.totalNodes = totalNodes;
            return this;
        }
        public Long getTotalNodes() {
            return this.totalNodes;
        }

    }

    public static class DescribeClusterNodePoolDetailResponseBodyTeeConfig extends TeaModel {
        @NameInMap("tee_enable")
        public Boolean teeEnable;

        public static DescribeClusterNodePoolDetailResponseBodyTeeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolDetailResponseBodyTeeConfig self = new DescribeClusterNodePoolDetailResponseBodyTeeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolDetailResponseBodyTeeConfig setTeeEnable(Boolean teeEnable) {
            this.teeEnable = teeEnable;
            return this;
        }
        public Boolean getTeeEnable() {
            return this.teeEnable;
        }

    }

}
