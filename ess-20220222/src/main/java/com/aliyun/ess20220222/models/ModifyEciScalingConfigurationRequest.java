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
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    /**
     * <p>Specifies whether to automatically create an elastic IP address (EIP) and bind the EIP to the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    /**
     * <p>Specifies whether to automatically match the image cache.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The name of the elastic container instance. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length</li>
     * <li>The name can contain only lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nginx-test</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>The containers.</p>
     */
    @NameInMap("Containers")
    public java.util.List<ModifyEciScalingConfigurationRequestContainers> containers;

    /**
     * <strong>example:</strong>
     * <p>RenewUpdate</p>
     */
    @NameInMap("ContainersUpdateType")
    public String containersUpdateType;

    /**
     * <p>Specifies whether to enable the cost optimization feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CostOptimization")
    public Boolean costOptimization;

    /**
     * <p>The number of vCPUs of the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The number of physical CPU cores. This parameter is not available for all instance types. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify custom CPU options</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    /**
     * <p>The number of threads per core. This parameter is not available for all instance types. A value of 1 indicates that Hyper-Threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify custom CPU options</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DataCacheBucket")
    public String dataCacheBucket;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DataCacheBurstingEnabled")
    public Boolean dataCacheBurstingEnabled;

    /**
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("DataCachePL")
    public String dataCachePL;

    /**
     * <strong>example:</strong>
     * <p>40000</p>
     */
    @NameInMap("DataCacheProvisionedIops")
    public Integer dataCacheProvisionedIops;

    /**
     * <blockquote>
     * <p>This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
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
     * <ul>
     * <li>None: uses the DNS that is set for the DnsConfig field.</li>
     * <li>Default: use the DNS that is set for the runtime environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    /**
     * <p>The maximum outbound bandwidth. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    /**
     * <p>The bandwidth of the EIP.</p>
     * <p>Default value: 5. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    /**
     * <blockquote>
     * <p>This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>The size of the temporary storage space. By default, an enhanced SSD (ESSD) of the PL1 level is used. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
     * 
     * <strong>example:</strong>
     * <p>imc-2zebxkiifuyzzlhl****</p>
     */
    @NameInMap("ImageSnapshotId")
    public String imageSnapshotId;

    /**
     * <p>The maximum inbound bandwidth. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("IngressBandwidth")
    public Long ingressBandwidth;

    /**
     * <p>The init containers.</p>
     */
    @NameInMap("InitContainers")
    public java.util.List<ModifyEciScalingConfigurationRequestInitContainers> initContainers;

    /**
     * <p>The level of the instance type, which is used to filter the instance types that meet the specified criteria. This parameter takes effect only if you set the <code>CostOptimization</code> parameter to true. Valid values:</p>
     * <ul>
     * <li>EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance in a consistent manner. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
     * <li>EnterpriseLevel: Instances of this level provide stable performance and dedicated resources, and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>.</li>
     * <li>CreditEntryLevel: This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see the <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a> topic of burstable instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The number of IPv6 addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The weight of the elastic container instance as a backend server. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size of the elastic container instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
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
     * <p>The name of the RAM role for the instance. You can use an instance RAM role to access both elastic container instances and Elastic Compute Service (ECS) instances. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>RamTestRole</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The instance restart policy. Valid values:</p>
     * <ul>
     * <li>Always: always restarts the elastic container instance.</li>
     * <li>Never: never restarts the elastic container instance.</li>
     * <li>OnFailure: restarts the elastic container instance upon failures.</li>
     * </ul>
     * <p>Default value: Always.</p>
     * 
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The ID of the scaling configuration that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp16har3jpj6fjbx****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <p>The name of the scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the value of the ScalingConfigurationId parameter is used.</p>
     * 
     * <strong>example:</strong>
     * <p>test-modify</p>
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
     * <p>If you do not specify a security group, the system uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the protocols and the port numbers of the containers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the declared container protocols and port numbers to the inbound rules of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
     * <p>If you set the SpotStrategy parameter to SpotWithPriceLimit, you must also specify the SpotPriceLimit parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0.025</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the elastic container instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is a preemptible instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotPriceLimit</p>
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
     * 
     * <strong>example:</strong>
     * <p>60</p>
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
         * 
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The name of the environment variable. The name can be 1 to 128 characters in length and can contain letters, underscores (_), and digits. It cannot start with a digit. Specify the value in the <code>[0-9a-zA-Z]</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
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
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
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
         * <p>The directory within the container onto which you want to mount the volume.</p>
         * <blockquote>
         * <p> The information stored within this directory will be overridden by the data present on the mounted volume. Specify this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation enables volumes mounted on one container to be shared among other containers within the same pod or across distinct pods residing on the same node. Valid values:</p>
         * <ul>
         * <li>None: Subsequent mounts executed either on the volume itself or its subdirectories do not propagate to the already established volume mount.</li>
         * <li>HostToCotainer: Subsequent mounts executed either on the volume itself or its subdirectories propagate to the already established volume mount.</li>
         * <li>Bidirectional: This value is similar to HostToCotainer. Subsequent mounts executed either on the volume itself or its subdirectories propagate to the already established volume mount. In addition, any volume mounts executed on the container not only propagate back to the underlying host but also to all containers across every pod that uses the same volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name. The value of this parameter is the same as the value of Volume.N.Name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the volume is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>data2/</p>
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
         * <p>The container startup arguments. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The command that you want to run by using the CLI for liveness probing within the container.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that you want to allocate to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs that you want to allocate to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: Each time instances are created, image pulling is performed.</li>
         * <li>IfNotPresent: Image pulling is performed as needed. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The commands that you want to run by using the CLI for configuring the postStart callback function within the container.</p>
         */
        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        /**
         * <p>The IP address of the host to which you want to send the HTTP GET requests for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The path to which you want to send the HTTP GET requests for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port over which you want to send the HTTP GET requests for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>5050</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET requests that you want to send for configuring the postStart callback function. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <p>The IP address of the host detected by the TCP sockets that you want to use for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port detected by the TCP sockets that you want to use for configuring the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The commands that you want to run by using the CLI for configuring the preStop callback function within the container.</p>
         */
        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        /**
         * <p>The IP address of the host to which you want to send the HTTP GET requests for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The path to which you want to send the HTTP GET requests for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port over which you want to send the HTTP GET requests for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET requests that you want to send for configuring the preStop callback function. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        /**
         * <p>The IP address of the host detected by the TCP sockets that you want to use for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port detected by the TCP sockets that you want to use for configuring the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The memory size that you want to allocate to the container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ports.</p>
         */
        @NameInMap("Ports")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersPorts> ports;

        /**
         * <p>Specifies whether the container allocates buffer resources to standard input streams during its active runtime. If you do not specify this parameter, an end-of-file (EOF) error occurs when standard input streams in the container are read.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether standard input streams remain connected during multiple sessions when StdinOnce is set to true.</p>
         * <p>If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container is restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable the Interaction feature. Default value: false.</p>
         * <p>If the command is a /bin/bash command, set this parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The volume mounts of the container.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/</p>
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
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
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
         * 
         * <strong>example:</strong>
         * <p>yourpaasword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The domain name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that is used to access the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourusername</p>
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
         * <p>The key of the environment variable. The key must be 1 to 128 characters in length. Specify the name in the <code>[0-9a-zA-Z]</code> format. The name can contain underscores and cannot start with a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>Path</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value must be 0 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
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
         * <blockquote>
         * <p> Data stored in the path of the container is overwritten by the content of the volume.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows the sharing of volumes that are mounted on one container with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.</li>
         * <li>HostToCotainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.</li>
         * <li>Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the mount path is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. The elastic container instance can mount different directories of the same volume to different subdirectories of containers.</p>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
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
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The number of GPUs that you want to allocate to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: pulls images each time.</li>
         * <li>IfNotPresent: pulls images only if no on-premises images are available. On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: never pulls images. On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
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
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>test-init</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local</p>
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
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the security context in which the elastic container instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
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
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * 
         * <strong>example:</strong>
         * <p>bGl1bWk=</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The permissions on ConfigFileVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The relative path to the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
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
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("ConfigFileVolumeDefaultMode")
        public Integer configFileVolumeDefaultMode;

        /**
         * <p>The name of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of HostPathVolume. Examples: File, Directory, and Socket.</p>
         * 
         * <strong>example:</strong>
         * <p>EmptyDirVolume</p>
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
