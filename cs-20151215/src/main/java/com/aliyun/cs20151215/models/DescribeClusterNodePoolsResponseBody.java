// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsResponseBody extends TeaModel {
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling setIsBondEip(Boolean isBondEip) {
            this.isBondEip = isBondEip;
            return this;
        }
        public Boolean getIsBondEip() {
            return this.isBondEip;
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig extends TeaModel {
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

        public static DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setCcnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }
        public String getCcnId() {
            return this.ccnId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setCcnRegionId(String ccnRegionId) {
            this.ccnRegionId = ccnRegionId;
            return this;
        }
        public String getCcnRegionId() {
            return this.ccnRegionId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig setImprovedPeriod(String improvedPeriod) {
            this.improvedPeriod = improvedPeriod;
            return this;
        }
        public String getImprovedPeriod() {
            return this.improvedPeriod;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig extends TeaModel {
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setLabels(java.util.List<Tag> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<Tag> getLabels() {
            return this.labels;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setNodeNameMode(String nodeNameMode) {
            this.nodeNameMode = nodeNameMode;
            return this;
        }
        public String getNodeNameMode() {
            return this.nodeNameMode;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig setTaints(java.util.List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<Taint> getTaints() {
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig extends TeaModel {
        @NameInMap("auto_upgrade")
        public Boolean autoUpgrade;

        @NameInMap("max_unavailable")
        public Long maxUnavailable;

        @NameInMap("surge")
        public Long surge;

        @NameInMap("surge_percentage")
        public Long surgePercentage;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = autoUpgrade;
            return this;
        }
        public Boolean getAutoUpgrade() {
            return this.autoUpgrade;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setMaxUnavailable(Long maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Long getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setSurge(Long surge) {
            this.surge = surge;
            return this;
        }
        public Long getSurge() {
            return this.surge;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig setSurgePercentage(Long surgePercentage) {
            this.surgePercentage = surgePercentage;
            return this;
        }
        public Long getSurgePercentage() {
            return this.surgePercentage;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsManagement extends TeaModel {
        @NameInMap("auto_repair")
        public Boolean autoRepair;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("upgrade_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig upgradeConfig;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsManagement build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsManagement self = new DescribeClusterNodePoolsResponseBodyNodepoolsManagement();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setAutoRepair(Boolean autoRepair) {
            this.autoRepair = autoRepair;
            return this;
        }
        public Boolean getAutoRepair() {
            return this.autoRepair;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement setUpgradeConfig(DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig upgradeConfig) {
            this.upgradeConfig = upgradeConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagementUpgradeConfig getUpgradeConfig() {
            return this.upgradeConfig;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo extends TeaModel {
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

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("match_criteria")
        public String matchCriteria;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit extends TeaModel {
        @NameInMap("instance_type")
        public String instanceType;

        @NameInMap("price_limit")
        public String priceLimit;

        public static DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit self = new DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit setPriceLimit(String priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public String getPriceLimit() {
            return this.priceLimit;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup extends TeaModel {
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

        @NameInMap("private_pool_options")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions privatePoolOptions;

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
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> spotPriceLimit;

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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
            this.compensateWithOnDemand = compensateWithOnDemand;
            return this;
        }
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDataDisks(java.util.List<DataDisk> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public java.util.List<DataDisk> getDataDisks() {
            return this.dataDisks;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDeploymentsetId(String deploymentsetId) {
            this.deploymentsetId = deploymentsetId;
            return this;
        }
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setDesiredSize(Long desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Long getDesiredSize() {
            return this.desiredSize;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Long getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setKeyPair(String keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public String getKeyPair() {
            return this.keyPair;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setMultiAzPolicy(String multiAzPolicy) {
            this.multiAzPolicy = multiAzPolicy;
            return this;
        }
        public String getMultiAzPolicy() {
            return this.multiAzPolicy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setOnDemandBaseCapacity(Long onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Long getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setOnDemandPercentageAboveBaseCapacity(Long onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Long getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setPrivatePoolOptions(DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
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

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotInstancePools(Long spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Long getSpotInstancePools() {
            return this.spotInstancePools;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotPriceLimit(java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public java.util.List<DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroupSpotPriceLimit> getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class DescribeClusterNodePoolsResponseBodyNodepoolsStatus extends TeaModel {
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
        @NameInMap("auto_scaling")
        public DescribeClusterNodePoolsResponseBodyNodepoolsAutoScaling autoScaling;

        @NameInMap("interconnect_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig interconnectConfig;

        @NameInMap("interconnect_mode")
        public String interconnectMode;

        @NameInMap("kubernetes_config")
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig;

        @NameInMap("management")
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement management;

        @NameInMap("max_nodes")
        public Long maxNodes;

        @NameInMap("nodepool_info")
        public DescribeClusterNodePoolsResponseBodyNodepoolsNodepoolInfo nodepoolInfo;

        @NameInMap("scaling_group")
        public DescribeClusterNodePoolsResponseBodyNodepoolsScalingGroup scalingGroup;

        @NameInMap("status")
        public DescribeClusterNodePoolsResponseBodyNodepoolsStatus status;

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

        public DescribeClusterNodePoolsResponseBodyNodepools setInterconnectConfig(DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig interconnectConfig) {
            this.interconnectConfig = interconnectConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsInterconnectConfig getInterconnectConfig() {
            return this.interconnectConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setInterconnectMode(String interconnectMode) {
            this.interconnectMode = interconnectMode;
            return this;
        }
        public String getInterconnectMode() {
            return this.interconnectMode;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setKubernetesConfig(DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setManagement(DescribeClusterNodePoolsResponseBodyNodepoolsManagement management) {
            this.management = management;
            return this;
        }
        public DescribeClusterNodePoolsResponseBodyNodepoolsManagement getManagement() {
            return this.management;
        }

        public DescribeClusterNodePoolsResponseBodyNodepools setMaxNodes(Long maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }
        public Long getMaxNodes() {
            return this.maxNodes;
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
