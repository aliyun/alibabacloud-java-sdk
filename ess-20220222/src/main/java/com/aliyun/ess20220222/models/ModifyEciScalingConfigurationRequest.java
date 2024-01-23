// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyEciScalingConfigurationRequest extends TeaModel {
    /**
     * <p>Information about the Container Registry Enterprise Edition instance.</p>
     */
    @NameInMap("AcrRegistryInfos")
    public java.util.List<ModifyEciScalingConfigurationRequestAcrRegistryInfos> acrRegistryInfos;

    /**
     * <p>The validity period. Unit: seconds.</p>
     */
    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    /**
     * <p>Specifies whether to automatically create an elastic IP address (EIP) and bind the EIP to the elastic container instance.</p>
     */
    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    /**
     * <p>Specifies whether to automatically match the image cache.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The name of the elastic container instance. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length</p>
     * <p>*   The name can contain only lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-).</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>The containers.</p>
     */
    @NameInMap("Containers")
    public java.util.List<ModifyEciScalingConfigurationRequestContainers> containers;

    @NameInMap("ContainersUpdateType")
    public String containersUpdateType;

    /**
     * <p>Specifies whether to enable the cost optimization feature. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("CostOptimization")
    public Boolean costOptimization;

    /**
     * <p>The number of vCPUs of the elastic container instance.</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The number of physical CPU cores. This parameter is not available for all instance types. For more information, see [Specify custom CPU options](~~197781~~).</p>
     */
    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    /**
     * <p>The number of threads per core. This parameter is not available for all instance types. A value of 1 indicates that Hyper-Threading is disabled. For more information, see [Specify custom CPU options](~~197781~~).</p>
     */
    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    @NameInMap("DataCacheBucket")
    public String dataCacheBucket;

    @NameInMap("DataCacheBurstingEnabled")
    public Boolean dataCacheBurstingEnabled;

    @NameInMap("DataCachePL")
    public String dataCachePL;

    @NameInMap("DataCacheProvisionedIops")
    public Integer dataCacheProvisionedIops;

    /**
     * <p>> This parameter is unavailable.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The IP addresses of the DNS servers.</p>
     */
    @NameInMap("DnsConfigNameServers")
    public java.util.List<String> dnsConfigNameServers;

    /**
     * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
     */
    @NameInMap("DnsConfigOptions")
    public java.util.List<ModifyEciScalingConfigurationRequestDnsConfigOptions> dnsConfigOptions;

    /**
     * <p>The DNS lookup domains.</p>
     */
    @NameInMap("DnsConfigSearchs")
    public java.util.List<String> dnsConfigSearchs;

    /**
     * <p>The Domain Name System (DNS) policy. Valid values:</p>
     * <br>
     * <p>*   None: uses the DNS that is set for the DnsConfig field.</p>
     * <p>*   Default: use the DNS that is set for the runtime environment.</p>
     */
    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    /**
     * <p>The maximum outbound bandwidth. Unit: bit/s.</p>
     */
    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    /**
     * <p>The bandwidth of the EIP.</p>
     * <br>
     * <p>Default value: 5. Unit: Mbit/s.</p>
     */
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    /**
     * <p>> This parameter is unavailable.</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>The size of the temporary storage space. By default, an enhanced SSD (ESSD) of the PL1 level is used. Unit: GiB.</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>Information about the hosts.</p>
     */
    @NameInMap("HostAliases")
    public java.util.List<ModifyEciScalingConfigurationRequestHostAliases> hostAliases;

    /**
     * <p>The name of the elastic container instance.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>Information about the image repository.</p>
     */
    @NameInMap("ImageRegistryCredentials")
    public java.util.List<ModifyEciScalingConfigurationRequestImageRegistryCredentials> imageRegistryCredentials;

    /**
     * <p>The ID of the image cache.</p>
     */
    @NameInMap("ImageSnapshotId")
    public String imageSnapshotId;

    /**
     * <p>The maximum inbound bandwidth. Unit: bit/s.</p>
     */
    @NameInMap("IngressBandwidth")
    public Long ingressBandwidth;

    /**
     * <p>The init containers.</p>
     */
    @NameInMap("InitContainers")
    public java.util.List<ModifyEciScalingConfigurationRequestInitContainers> initContainers;

    /**
     * <p>The level of the instance type, which is used to filter the instance types that meet the specified criteria. This parameter takes effect only if you set the `CostOptimization` parameter to true. Valid values:</p>
     * <br>
     * <p>*   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).</p>
     * <p>*   EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see [Instance family](~~25378~~).</p>
     * <p>*   CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see the [Overview](~~59977~~) topic of burstable instances.</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The number of IPv6 addresses.</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The weight of the elastic container instance as a backend server. Valid values: 1 to 100.</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size of the elastic container instance. Unit: GiB.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The domain names of the NTP server.</p>
     */
    @NameInMap("NtpServers")
    public java.util.List<String> ntpServers;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the RAM role for the instance. You can use an instance RAM role to access both elastic container instances and Elastic Compute Service (ECS) instances. For more information, see [Use an instance RAM role by calling API operations](~~61178~~).</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The instance restart policy. Valid values:</p>
     * <br>
     * <p>*   Always: always restarts the elastic container instance.</p>
     * <p>*   Never: never restarts the elastic container instance.</p>
     * <p>*   OnFailure: restarts the elastic container instance upon failures.</p>
     * <br>
     * <p>Default value: Always.</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The ID of the scaling configuration that you want to modify.</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (\_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <br>
     * <p>The name of the scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the value of the ScalingConfigurationId parameter is used.</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The system information of the security context in which the elastic container instance runs.</p>
     */
    @NameInMap("SecurityContextSysCtls")
    public java.util.List<ModifyEciScalingConfigurationRequestSecurityContextSysCtls> securityContextSysCtls;

    /**
     * <p>The ID of the security group with which you want to associate the elastic container instance. Elastic container instances that are associated with the same security group can access each other.</p>
     * <br>
     * <p>If you do not specify a security group, the system uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the protocols and the port numbers of the containers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the declared container protocols and port numbers to the inbound rules of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
     * <br>
     * <p>If you set the SpotStrategy parameter to SpotWithPriceLimit, you must also specify the SpotPriceLimit parameter.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the elastic container instance. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>Information about the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ModifyEciScalingConfigurationRequestTags> tags;

    /**
     * <p>The buffer time in which the program handles operations before the program is stopped. Unit: seconds.</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

    /**
     * <p>Information about the volumes.</p>
     */
    @NameInMap("Volumes")
    public java.util.List<ModifyEciScalingConfigurationRequestVolumes> volumes;

    public static ModifyEciScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEciScalingConfigurationRequest self = new ModifyEciScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEciScalingConfigurationRequest setAcrRegistryInfos(java.util.List<ModifyEciScalingConfigurationRequestAcrRegistryInfos> acrRegistryInfos) {
        this.acrRegistryInfos = acrRegistryInfos;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestAcrRegistryInfos> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    public ModifyEciScalingConfigurationRequest setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public ModifyEciScalingConfigurationRequest setAutoCreateEip(Boolean autoCreateEip) {
        this.autoCreateEip = autoCreateEip;
        return this;
    }
    public Boolean getAutoCreateEip() {
        return this.autoCreateEip;
    }

    public ModifyEciScalingConfigurationRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public ModifyEciScalingConfigurationRequest setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        return this;
    }
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public ModifyEciScalingConfigurationRequest setContainers(java.util.List<ModifyEciScalingConfigurationRequestContainers> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestContainers> getContainers() {
        return this.containers;
    }

    public ModifyEciScalingConfigurationRequest setContainersUpdateType(String containersUpdateType) {
        this.containersUpdateType = containersUpdateType;
        return this;
    }
    public String getContainersUpdateType() {
        return this.containersUpdateType;
    }

    public ModifyEciScalingConfigurationRequest setCostOptimization(Boolean costOptimization) {
        this.costOptimization = costOptimization;
        return this;
    }
    public Boolean getCostOptimization() {
        return this.costOptimization;
    }

    public ModifyEciScalingConfigurationRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public ModifyEciScalingConfigurationRequest setCpuOptionsCore(Integer cpuOptionsCore) {
        this.cpuOptionsCore = cpuOptionsCore;
        return this;
    }
    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    public ModifyEciScalingConfigurationRequest setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
        this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
        return this;
    }
    public Integer getCpuOptionsThreadsPerCore() {
        return this.cpuOptionsThreadsPerCore;
    }

    public ModifyEciScalingConfigurationRequest setDataCacheBucket(String dataCacheBucket) {
        this.dataCacheBucket = dataCacheBucket;
        return this;
    }
    public String getDataCacheBucket() {
        return this.dataCacheBucket;
    }

    public ModifyEciScalingConfigurationRequest setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
        this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
        return this;
    }
    public Boolean getDataCacheBurstingEnabled() {
        return this.dataCacheBurstingEnabled;
    }

    public ModifyEciScalingConfigurationRequest setDataCachePL(String dataCachePL) {
        this.dataCachePL = dataCachePL;
        return this;
    }
    public String getDataCachePL() {
        return this.dataCachePL;
    }

    public ModifyEciScalingConfigurationRequest setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
        this.dataCacheProvisionedIops = dataCacheProvisionedIops;
        return this;
    }
    public Integer getDataCacheProvisionedIops() {
        return this.dataCacheProvisionedIops;
    }

    public ModifyEciScalingConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyEciScalingConfigurationRequest setDnsConfigNameServers(java.util.List<String> dnsConfigNameServers) {
        this.dnsConfigNameServers = dnsConfigNameServers;
        return this;
    }
    public java.util.List<String> getDnsConfigNameServers() {
        return this.dnsConfigNameServers;
    }

    public ModifyEciScalingConfigurationRequest setDnsConfigOptions(java.util.List<ModifyEciScalingConfigurationRequestDnsConfigOptions> dnsConfigOptions) {
        this.dnsConfigOptions = dnsConfigOptions;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestDnsConfigOptions> getDnsConfigOptions() {
        return this.dnsConfigOptions;
    }

    public ModifyEciScalingConfigurationRequest setDnsConfigSearchs(java.util.List<String> dnsConfigSearchs) {
        this.dnsConfigSearchs = dnsConfigSearchs;
        return this;
    }
    public java.util.List<String> getDnsConfigSearchs() {
        return this.dnsConfigSearchs;
    }

    public ModifyEciScalingConfigurationRequest setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public ModifyEciScalingConfigurationRequest setEgressBandwidth(Long egressBandwidth) {
        this.egressBandwidth = egressBandwidth;
        return this;
    }
    public Long getEgressBandwidth() {
        return this.egressBandwidth;
    }

    public ModifyEciScalingConfigurationRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public ModifyEciScalingConfigurationRequest setEnableSls(Boolean enableSls) {
        this.enableSls = enableSls;
        return this;
    }
    public Boolean getEnableSls() {
        return this.enableSls;
    }

    public ModifyEciScalingConfigurationRequest setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public ModifyEciScalingConfigurationRequest setHostAliases(java.util.List<ModifyEciScalingConfigurationRequestHostAliases> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestHostAliases> getHostAliases() {
        return this.hostAliases;
    }

    public ModifyEciScalingConfigurationRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyEciScalingConfigurationRequest setImageRegistryCredentials(java.util.List<ModifyEciScalingConfigurationRequestImageRegistryCredentials> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestImageRegistryCredentials> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    public ModifyEciScalingConfigurationRequest setImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        return this;
    }
    public String getImageSnapshotId() {
        return this.imageSnapshotId;
    }

    public ModifyEciScalingConfigurationRequest setIngressBandwidth(Long ingressBandwidth) {
        this.ingressBandwidth = ingressBandwidth;
        return this;
    }
    public Long getIngressBandwidth() {
        return this.ingressBandwidth;
    }

    public ModifyEciScalingConfigurationRequest setInitContainers(java.util.List<ModifyEciScalingConfigurationRequestInitContainers> initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestInitContainers> getInitContainers() {
        return this.initContainers;
    }

    public ModifyEciScalingConfigurationRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public ModifyEciScalingConfigurationRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ModifyEciScalingConfigurationRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public ModifyEciScalingConfigurationRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public ModifyEciScalingConfigurationRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public ModifyEciScalingConfigurationRequest setNtpServers(java.util.List<String> ntpServers) {
        this.ntpServers = ntpServers;
        return this;
    }
    public java.util.List<String> getNtpServers() {
        return this.ntpServers;
    }

    public ModifyEciScalingConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyEciScalingConfigurationRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ModifyEciScalingConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyEciScalingConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyEciScalingConfigurationRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public ModifyEciScalingConfigurationRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ModifyEciScalingConfigurationRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public ModifyEciScalingConfigurationRequest setSecurityContextSysCtls(java.util.List<ModifyEciScalingConfigurationRequestSecurityContextSysCtls> securityContextSysCtls) {
        this.securityContextSysCtls = securityContextSysCtls;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestSecurityContextSysCtls> getSecurityContextSysCtls() {
        return this.securityContextSysCtls;
    }

    public ModifyEciScalingConfigurationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyEciScalingConfigurationRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public ModifyEciScalingConfigurationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ModifyEciScalingConfigurationRequest setTags(java.util.List<ModifyEciScalingConfigurationRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestTags> getTags() {
        return this.tags;
    }

    public ModifyEciScalingConfigurationRequest setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public ModifyEciScalingConfigurationRequest setVolumes(java.util.List<ModifyEciScalingConfigurationRequestVolumes> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<ModifyEciScalingConfigurationRequestVolumes> getVolumes() {
        return this.volumes;
    }

    public static class ModifyEciScalingConfigurationRequestAcrRegistryInfos extends TeaModel {
        /**
         * <p>The domain names of the Container Registry Enterprise Edition instances. By default, all domain names of the Container Registry Enterprise Edition instances are displayed. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifyEciScalingConfigurationRequestAcrRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestAcrRegistryInfos self = new ModifyEciScalingConfigurationRequestAcrRegistryInfos();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestAcrRegistryInfos setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public ModifyEciScalingConfigurationRequestAcrRegistryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyEciScalingConfigurationRequestAcrRegistryInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyEciScalingConfigurationRequestAcrRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersLivenessProbeExec extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static ModifyEciScalingConfigurationRequestContainersLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersLivenessProbeExec self = new ModifyEciScalingConfigurationRequestContainersLivenessProbeExec();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbeExec setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet self = new ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket self = new ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersLivenessProbe extends TeaModel {
        @NameInMap("Exec")
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static ModifyEciScalingConfigurationRequestContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersLivenessProbe self = new ModifyEciScalingConfigurationRequestContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setExec(ModifyEciScalingConfigurationRequestContainersLivenessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeExec getExec() {
            return this.exec;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setHttpGet(ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setTcpSocket(ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public ModifyEciScalingConfigurationRequestContainersLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersReadinessProbeExec extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static ModifyEciScalingConfigurationRequestContainersReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersReadinessProbeExec self = new ModifyEciScalingConfigurationRequestContainersReadinessProbeExec();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbeExec setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet self = new ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket self = new ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static ModifyEciScalingConfigurationRequestContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersReadinessProbe self = new ModifyEciScalingConfigurationRequestContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setExec(ModifyEciScalingConfigurationRequestContainersReadinessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeExec getExec() {
            return this.exec;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setHttpGet(ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setTcpSocket(ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public ModifyEciScalingConfigurationRequestContainersReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersSecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static ModifyEciScalingConfigurationRequestContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersSecurityContextCapability self = new ModifyEciScalingConfigurationRequestContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public ModifyEciScalingConfigurationRequestContainersSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static ModifyEciScalingConfigurationRequestContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersSecurityContext self = new ModifyEciScalingConfigurationRequestContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersSecurityContext setCapability(ModifyEciScalingConfigurationRequestContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public ModifyEciScalingConfigurationRequestContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public ModifyEciScalingConfigurationRequestContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef self = new ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersEnvironmentVars extends TeaModel {
        @NameInMap("FieldRef")
        public ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef fieldRef;

        /**
         * <p>The key of the environment variable. Specify the name in the `[0-9a-zA-Z]` format. The name must be 1 to 128 characters in length, and can contain underscores (\_). It cannot start with a digit.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value must be 0 to 256 characters in length.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyEciScalingConfigurationRequestContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersEnvironmentVars self = new ModifyEciScalingConfigurationRequestContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersEnvironmentVars setFieldRef(ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public ModifyEciScalingConfigurationRequestContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyEciScalingConfigurationRequestContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static ModifyEciScalingConfigurationRequestContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersPorts self = new ModifyEciScalingConfigurationRequestContainersPorts();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyEciScalingConfigurationRequestContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainersVolumeMounts extends TeaModel {
        /**
         * <p>The path where the container mounts the volume.</p>
         * <br>
         * <p>>  Data stored in the path of the container is directly overwritten by the content of the volume.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. The value of this parameter is the same as the value of the Volumes.Name parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the volume is read-only.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static ModifyEciScalingConfigurationRequestContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainersVolumeMounts self = new ModifyEciScalingConfigurationRequestContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ModifyEciScalingConfigurationRequestContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public ModifyEciScalingConfigurationRequestContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ModifyEciScalingConfigurationRequestContainersVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class ModifyEciScalingConfigurationRequestContainers extends TeaModel {
        @NameInMap("LivenessProbe")
        public ModifyEciScalingConfigurationRequestContainersLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public ModifyEciScalingConfigurationRequestContainersReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        public ModifyEciScalingConfigurationRequestContainersSecurityContext securityContext;

        /**
         * <p>The arguments that correspond to the startup commands of the container. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The commands that you want to execute in the container when you use the command line interface (CLI) to perform probes.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that you want to allocate to the container.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>Information about the environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs that you want to allocate to the container.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <br>
         * <p>*   Always: pulls images each time.</p>
         * <p>*   IfNotPresent: pulls images only if no on-premises images are available. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: never pulls images. On-premises images are always used.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The memory size of the container. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container image.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Information about the ports.</p>
         */
        @NameInMap("Ports")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersPorts> ports;

        /**
         * <p>Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether standard input streams are disconnected after a client is disconnected.</p>
         * <br>
         * <p>If you set the StdinOnce parameter to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container is started again.</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable interaction. Default value: false.</p>
         * <br>
         * <p>If the command is a /bin/bash command, set the value to true.</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>Information about the volume mount of the container.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static ModifyEciScalingConfigurationRequestContainers build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestContainers self = new ModifyEciScalingConfigurationRequestContainers();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestContainers setLivenessProbe(ModifyEciScalingConfigurationRequestContainersLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public ModifyEciScalingConfigurationRequestContainers setReadinessProbe(ModifyEciScalingConfigurationRequestContainersReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public ModifyEciScalingConfigurationRequestContainers setSecurityContext(ModifyEciScalingConfigurationRequestContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public ModifyEciScalingConfigurationRequestContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public ModifyEciScalingConfigurationRequestContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public ModifyEciScalingConfigurationRequestContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public ModifyEciScalingConfigurationRequestContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public ModifyEciScalingConfigurationRequestContainers setEnvironmentVars(java.util.List<ModifyEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public ModifyEciScalingConfigurationRequestContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ModifyEciScalingConfigurationRequestContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ModifyEciScalingConfigurationRequestContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerExecs(java.util.List<String> lifecyclePostStartHandlerExecs) {
            this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExecs() {
            return this.lifecyclePostStartHandlerExecs;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerExecs(java.util.List<String> lifecyclePreStopHandlerExecs) {
            this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExecs() {
            return this.lifecyclePreStopHandlerExecs;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public ModifyEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public ModifyEciScalingConfigurationRequestContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ModifyEciScalingConfigurationRequestContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestContainers setPorts(java.util.List<ModifyEciScalingConfigurationRequestContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestContainersPorts> getPorts() {
            return this.ports;
        }

        public ModifyEciScalingConfigurationRequestContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public ModifyEciScalingConfigurationRequestContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public ModifyEciScalingConfigurationRequestContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public ModifyEciScalingConfigurationRequestContainers setVolumeMounts(java.util.List<ModifyEciScalingConfigurationRequestContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public ModifyEciScalingConfigurationRequestContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class ModifyEciScalingConfigurationRequestDnsConfigOptions extends TeaModel {
        /**
         * <p>The variable name of the option.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the option.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyEciScalingConfigurationRequestDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestDnsConfigOptions self = new ModifyEciScalingConfigurationRequestDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyEciScalingConfigurationRequestHostAliases extends TeaModel {
        /**
         * <p>The hostnames that you want to add.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address that you want to add.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static ModifyEciScalingConfigurationRequestHostAliases build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestHostAliases self = new ModifyEciScalingConfigurationRequestHostAliases();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public ModifyEciScalingConfigurationRequestHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class ModifyEciScalingConfigurationRequestImageRegistryCredentials extends TeaModel {
        /**
         * <p>The password that is used to access the image repository.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The domain name of the image repository.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that is used to access the image repository.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ModifyEciScalingConfigurationRequestImageRegistryCredentials build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestImageRegistryCredentials self = new ModifyEciScalingConfigurationRequestImageRegistryCredentials();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestImageRegistryCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyEciScalingConfigurationRequestImageRegistryCredentials setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public ModifyEciScalingConfigurationRequestImageRegistryCredentials setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability self = new ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainersSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static ModifyEciScalingConfigurationRequestInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainersSecurityContext self = new ModifyEciScalingConfigurationRequestInitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainersSecurityContext setCapability(ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public ModifyEciScalingConfigurationRequestInitContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public ModifyEciScalingConfigurationRequestInitContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public ModifyEciScalingConfigurationRequestInitContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef self = new ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars extends TeaModel {
        @NameInMap("FieldRef")
        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef fieldRef;

        /**
         * <p>The key of the environment variable. The key must be 1 to 128 characters in length. Specify the name in the `[0-9a-zA-Z]` format. The name can contain underscores and cannot start with a digit.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value must be 0 to 256 characters in length.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars self = new ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars setFieldRef(ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts self = new ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts extends TeaModel {
        /**
         * <p>The path where the container mounts the volume.</p>
         * <br>
         * <p>>  Data stored in the path of the container is overwritten by the content of the volume.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.</p>
         * <p>*   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.</p>
         * <br>
         * <p>Default value: None.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the mount path is read-only.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. The elastic container instance can mount different directories of the same volume to different subdirectories of containers.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts self = new ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class ModifyEciScalingConfigurationRequestInitContainers extends TeaModel {
        @NameInMap("SecurityContext")
        public ModifyEciScalingConfigurationRequestInitContainersSecurityContext securityContext;

        /**
         * <p>The startup parameter of the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The commands that you want to run to start the container.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that you want to allocate to the container.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The number of GPUs that you want to allocate to the container.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The container image.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <br>
         * <p>*   Always: pulls images each time.</p>
         * <p>*   IfNotPresent: pulls images only if no on-premises images are available. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: never pulls images. On-premises images are always used. Image pulling is not performed.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The environment variables of the init container.</p>
         */
        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The ports of the init container.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>Information about the volume mounts of the init container.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

        /**
         * <p>The size of the memory. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The working directory.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static ModifyEciScalingConfigurationRequestInitContainers build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestInitContainers self = new ModifyEciScalingConfigurationRequestInitContainers();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestInitContainers setSecurityContext(ModifyEciScalingConfigurationRequestInitContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public ModifyEciScalingConfigurationRequestInitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setInitContainerEnvironmentVars(java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars) {
            this.initContainerEnvironmentVars = initContainerEnvironmentVars;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setInitContainerPorts(java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts> initContainerPorts) {
            this.initContainerPorts = initContainerPorts;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setInitContainerVolumeMounts(java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> initContainerVolumeMounts) {
            this.initContainerVolumeMounts = initContainerVolumeMounts;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> getInitContainerVolumeMounts() {
            return this.initContainerVolumeMounts;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class ModifyEciScalingConfigurationRequestSecurityContextSysCtls extends TeaModel {
        /**
         * <p>The name of the security context in which the elastic container instance runs.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the security context in which the elastic container instance runs.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyEciScalingConfigurationRequestSecurityContextSysCtls build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestSecurityContextSysCtls self = new ModifyEciScalingConfigurationRequestSecurityContextSysCtls();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestSecurityContextSysCtls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestSecurityContextSysCtls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyEciScalingConfigurationRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyEciScalingConfigurationRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestTags self = new ModifyEciScalingConfigurationRequestTags();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyEciScalingConfigurationRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumesDiskVolume extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("FsType")
        public String fsType;

        public static ModifyEciScalingConfigurationRequestVolumesDiskVolume build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumesDiskVolume self = new ModifyEciScalingConfigurationRequestVolumesDiskVolume();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumesDiskVolume setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ModifyEciScalingConfigurationRequestVolumesDiskVolume setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ModifyEciScalingConfigurationRequestVolumesDiskVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume self = new ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumesFlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        public static ModifyEciScalingConfigurationRequestVolumesFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumesFlexVolume self = new ModifyEciScalingConfigurationRequestVolumesFlexVolume();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumesFlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public ModifyEciScalingConfigurationRequestVolumesFlexVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public ModifyEciScalingConfigurationRequestVolumesFlexVolume setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumesHostPathVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static ModifyEciScalingConfigurationRequestVolumesHostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumesHostPathVolume self = new ModifyEciScalingConfigurationRequestVolumesHostPathVolume();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumesHostPathVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyEciScalingConfigurationRequestVolumesHostPathVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumesNFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Server")
        public String server;

        public static ModifyEciScalingConfigurationRequestVolumesNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumesNFSVolume self = new ModifyEciScalingConfigurationRequestVolumesNFSVolume();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumesNFSVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyEciScalingConfigurationRequestVolumesNFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ModifyEciScalingConfigurationRequestVolumesNFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath extends TeaModel {
        /**
         * <p>The content of the configuration file, which can be up to 32 KB in size.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The permissions on ConfigFileVolume.</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The relative path to the configuration file.</p>
         */
        @NameInMap("Path")
        public String path;

        public static ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath self = new ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ModifyEciScalingConfigurationRequestVolumes extends TeaModel {
        @NameInMap("DiskVolume")
        public ModifyEciScalingConfigurationRequestVolumesDiskVolume diskVolume;

        @NameInMap("EmptyDirVolume")
        public ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        public ModifyEciScalingConfigurationRequestVolumesFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        public ModifyEciScalingConfigurationRequestVolumesHostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        public ModifyEciScalingConfigurationRequestVolumesNFSVolume NFSVolume;

        /**
         * <p>The paths to the configuration files.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPath")
        public java.util.List<ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath;

        /**
         * <p>The default permissions on ConfigFileVolume.</p>
         */
        @NameInMap("ConfigFileVolumeDefaultMode")
        public Integer configFileVolumeDefaultMode;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of HostPathVolume. Examples: File, Directory, and Socket.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyEciScalingConfigurationRequestVolumes build(java.util.Map<String, ?> map) throws Exception {
            ModifyEciScalingConfigurationRequestVolumes self = new ModifyEciScalingConfigurationRequestVolumes();
            return TeaModel.build(map, self);
        }

        public ModifyEciScalingConfigurationRequestVolumes setDiskVolume(ModifyEciScalingConfigurationRequestVolumesDiskVolume diskVolume) {
            this.diskVolume = diskVolume;
            return this;
        }
        public ModifyEciScalingConfigurationRequestVolumesDiskVolume getDiskVolume() {
            return this.diskVolume;
        }

        public ModifyEciScalingConfigurationRequestVolumes setEmptyDirVolume(ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume emptyDirVolume) {
            this.emptyDirVolume = emptyDirVolume;
            return this;
        }
        public ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        public ModifyEciScalingConfigurationRequestVolumes setFlexVolume(ModifyEciScalingConfigurationRequestVolumesFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }
        public ModifyEciScalingConfigurationRequestVolumesFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        public ModifyEciScalingConfigurationRequestVolumes setHostPathVolume(ModifyEciScalingConfigurationRequestVolumesHostPathVolume hostPathVolume) {
            this.hostPathVolume = hostPathVolume;
            return this;
        }
        public ModifyEciScalingConfigurationRequestVolumesHostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        public ModifyEciScalingConfigurationRequestVolumes setNFSVolume(ModifyEciScalingConfigurationRequestVolumesNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public ModifyEciScalingConfigurationRequestVolumesNFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        public ModifyEciScalingConfigurationRequestVolumes setConfigFileVolumeConfigFileToPath(java.util.List<ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath) {
            this.configFileVolumeConfigFileToPath = configFileVolumeConfigFileToPath;
            return this;
        }
        public java.util.List<ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPath() {
            return this.configFileVolumeConfigFileToPath;
        }

        public ModifyEciScalingConfigurationRequestVolumes setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
            this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
            return this;
        }
        public Integer getConfigFileVolumeDefaultMode() {
            return this.configFileVolumeDefaultMode;
        }

        public ModifyEciScalingConfigurationRequestVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyEciScalingConfigurationRequestVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
