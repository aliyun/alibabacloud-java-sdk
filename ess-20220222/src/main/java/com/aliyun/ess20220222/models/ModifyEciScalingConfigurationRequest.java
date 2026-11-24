// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyEciScalingConfigurationRequest extends TeaModel {
    /**
     * <p>The information about ACR Enterprise Edition instances.</p>
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
     * <p>Specifies whether automatic creation of an elastic IP address (EIP) is enabled and the EIP is attached to the ECI instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    /**
     * <p>Specifies whether to automatically match an image cache.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The name of the ECI, which is the name of the container group. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain lowercase letters, digits, and hyphens (-), and cannot start or end with a hyphen (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nginx-test</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>The list of containers.</p>
     */
    @NameInMap("Containers")
    public java.util.List<ModifyEciScalingConfigurationRequestContainers> containers;

    /**
     * <p>The control parameter for the update method of the Containers parameter. Valid values:</p>
     * <ul>
     * <li>RenewUpdate: full update. The Containers parameter in the update request prevails and overwrites the original Containers parameter configuration.</li>
     * <li>IncrementalUpdate: incremental update. Containers are matched based on Container.name, and only the parameters specified in the request are updated.</li>
     * </ul>
     * <p>Default value: RenewUpdate.</p>
     * 
     * <strong>example:</strong>
     * <p>RenewUpdate</p>
     */
    @NameInMap("ContainersUpdateType")
    public String containersUpdateType;

    /**
     * <p>Specifies whether to enable cost optimization. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CostOptimization")
    public Boolean costOptimization;

    /**
     * <p>The number of vCPUs for the instance. Unit: cores.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The number of physical CPU cores. Only specific instance types support custom settings. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Customize CPU options</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    /**
     * <p>The number of threads per core. Only specific instance types support custom settings. A value of 1 indicates that hyper-threading is disabled. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Customize CPU options</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    /**
     * <p>The data cache bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DataCacheBucket")
    public String dataCacheBucket;

    /**
     * <p>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk used for data caching. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DataCacheBurstingEnabled")
    public Boolean dataCacheBurstingEnabled;

    /**
     * <p>The performance level of the cloud disk used for data caching. Use ESSDs. Valid values for the performance level of an ESSD:</p>
     * <ul>
     * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <blockquote>
     * <p>For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("DataCachePL")
    public String dataCachePL;

    /**
     * <p>The provisioned read and write IOPS of the ESSD AutoPL cloud disk used for data caching. Valid values: 0 to min{50000, 1000 × capacity - baseline performance}, where baseline performance = min{1800 + 50 × capacity, 50000}.</p>
     * <blockquote>
     * <p>For more information about ESSD AutoPL cloud disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>40000</p>
     */
    @NameInMap("DataCacheProvisionedIops")
    public Integer dataCacheProvisionedIops;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of IP addresses of DNS servers.</p>
     */
    @NameInMap("DnsConfigNameServers")
    public java.util.List<String> dnsConfigNameServers;

    /**
     * <p>The list of object options. Each object consists of a Name and an optional Value.</p>
     */
    @NameInMap("DnsConfigOptions")
    public java.util.List<ModifyEciScalingConfigurationRequestDnsConfigOptions> dnsConfigOptions;

    /**
     * <p>The list of DNS search domains.</p>
     */
    @NameInMap("DnsConfigSearchs")
    public java.util.List<String> dnsConfigSearchs;

    /**
     * <p>The DNS policy. Valid values:</p>
     * <ul>
     * <li><p>None: uses the DNS settings specified in the DnsConfig field.</p>
     * </li>
     * <li><p>Default: inherits the DNS settings from the runtime environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    /**
     * <p>The outbound bandwidth limit. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    /**
     * <p>The bandwidth of the EIP.</p>
     * <p>Default value: 5 Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSls")
    public Boolean enableSls;

    /**
     * <p>The size of the temporary storage space. By default, PL1 ESSDs are used. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>The specified GPU driver version. Valid values:</p>
     * <ul>
     * <li>tesla=470.82.01 (default)</li>
     * <li>tesla=525.85.12</li>
     * </ul>
     * <blockquote>
     * <p>Only specific instance types support switching the GPU driver version. For more information, see <a href="https://help.aliyun.com/document_detail/2579486.html">Create an instance by specifying a GPU instance type</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tesla=525.85.12</p>
     */
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    /**
     * <p>The host-related information.</p>
     */
    @NameInMap("HostAliases")
    public java.util.List<ModifyEciScalingConfigurationRequestHostAliases> hostAliases;

    /**
     * <p>The hostname, which is the name of the container group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The details of the image registry.</p>
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
     * <p>The inbound bandwidth limit. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("IngressBandwidth")
    public Long ingressBandwidth;

    /**
     * <p>The list of init containers.</p>
     */
    @NameInMap("InitContainers")
    public java.util.List<ModifyEciScalingConfigurationRequestInitContainers> initContainers;

    /**
     * <p>The level of the instance family. This parameter is used to filter instance types that meet your requirements and takes effect only when CostOptimization is set to true. Valid values:</p>
     * <ul>
     * <li>EntryLevel: shared instance types. Shared instance types are more cost-effective but cannot guarantee stable computing performance. They are suitable for business scenarios with low CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
     * <li>EnterpriseLevel: enterprise-level instance types. Enterprise-level instance types provide stable performance and dedicated resources. They are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
     * <li>CreditEntryLevel: burstable instance types. Burstable instance types use CPU credits to ensure computing performance. They are suitable for business scenarios with low CPU utilization but occasional CPU usage spikes. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The specified ECS instance types. You can specify up to five instance types.</p>
     */
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
     * <p>The weight of the backend server. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    /**
     * <p>The memory size for the instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The NTP server.</p>
     */
    @NameInMap("NtpServers")
    public java.util.List<String> ntpServers;

    /**
     * <p>Specifies whether to overwrite. Valid values:</p>
     * <ul>
     * <li>true: Overwrite.</li>
     * <li>false: Do not overwrite.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Override")
    public Boolean override;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the RAM role for the instance. ECIs and ECS instances share the same instance RAM roles. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
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
     * <p>The restart policy of the instance. Valid values:</p>
     * <ul>
     * <li>Always: always restarts the instance.</li>
     * <li>Never: never restarts the instance.</li>
     * <li>OnFailure: restarts the instance when it fails.</li>
     * </ul>
     * <p>Default value: Always.</p>
     * 
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The ID of the scaling configuration to be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp16har3jpj6fjbx****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain digits, letters, and Chinese characters. It must start with a digit, a letter, or a Chinese character, and can contain digits, underscores (_), hyphens (-), and periods (.).</p>
     * <p>The name of a scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the ID of the scaling configuration is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test-modify</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The system information of the contextual security context in which the instance runs.</p>
     */
    @NameInMap("SecurityContextSysCtls")
    public java.util.List<ModifyEciScalingConfigurationRequestSecurityContextSysCtls> securityContextSysCtls;

    /**
     * <p>The ID of the security group to which the ECI instance belongs. ECI instances in the same security group can access each other.</p>
     * <p>If you do not specify a security group, the system automatically uses the default security group in the selected region. You must ensure that the inbound rules of the security group include the protocols and ports that the containers need to expose. If no default security group exists in the region, the system performs automatic creation of a default security group and adds the declared container protocols and ports to the inbound rules of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The maximum hourly price for the spot instance. The value can be accurate to three decimal places.</p>
     * <p>This parameter is required when SpotStrategy is set to SpotWithPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.025</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The preemption policy for the instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: applies to regular pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: applies to spot instances that have maximum hourly prices.</li>
     * <li>SpotAsPriceGo: applies to spot instances whose prices are automatically set by the system based on the current market price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotPriceLimit</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ModifyEciScalingConfigurationRequestTags> tags;

    /**
     * <p>The buffer time for the program to handle operations before shutdown. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

    /**
     * <p>The volume information.</p>
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

    public ModifyEciScalingConfigurationRequest setGpuDriverVersion(String gpuDriverVersion) {
        this.gpuDriverVersion = gpuDriverVersion;
        return this;
    }
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
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

    public ModifyEciScalingConfigurationRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
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
         * <p>The domain names of the ACR Enterprise Edition instance. By default, all domain names of the instance are used. You can specify individual domain names and separate multiple domain names with commas (,).</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the ACR Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ACR Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the ACR Enterprise Edition instance.</p>
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
        /**
         * <p>The command executed in the container when the exec action is used for health checks.</p>
         */
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
        /**
         * <p>The path to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port number to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type of the HTTP GET request when HTTP GET is used for health checks. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
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
        /**
         * <p>The port number on which the TCP socket check is performed when TCP socket is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        /**
         * <p>The minimum consecutive failures for the liveness check to be considered failed after having succeeded.</p>
         * <p>Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds after the container has started before the readiness check is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The period for executing the liveness check, in seconds. Default value: 10. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The minimum consecutive successes for the liveness check to be considered successful after having failed. Default value: 1. The value must be 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period for the readiness check, in seconds. Default value: 1. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The command executed in the container when the exec action is used for health checks.</p>
         */
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
        /**
         * <p>The path to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port number to which the HTTP GET request is sent when HTTP GET is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type of the HTTP GET request when HTTP GET is used for health checks. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
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
        /**
         * <p>The port number on which the TCP socket check is performed when TCP socket is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
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

        /**
         * <p>The minimum consecutive failures for the liveness check to be considered failed after having succeeded.</p>
         * <p>Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds after the container has started before the readiness check is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The period for executing the liveness check, in seconds. Default value: 10. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The minimum consecutive successes for the readiness check to be considered successful after having failed. Default value: 1. The value must be 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period for the readiness check, in seconds. Default value: 1. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Grants specific privileges to processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <blockquote>
         * <p>NET_RAW is not supported by default. To use NET_RAW, submit a ticket.</p>
         * </blockquote>
         */
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

        /**
         * <p>Specifies whether the root file system of the container is read-only. Only true is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The user ID to run the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>path</p>
         */
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
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length, match the <code>[0-9a-zA-Z]</code> format, and can contain underscores (_). It cannot start with a digit.</p>
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
         * <p>The directory where the volume is mounted in the container.</p>
         * <blockquote>
         * <p>The contents of the mount path in the container are directly overwritten by the contents of the volume. Use this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings for the volume. Mount propagation allows volumes mounted by a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume does not receive any subsequent mounts that are performed on the volume or its subdirectories.</li>
         * <li>HostToCotainer: The volume receives all subsequent mounts that are performed on the volume or its subdirectories.</li>
         * <li>Bidirectional: Similar to HostToContainer, the volume receives all subsequent mounts. In addition, all mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. The value must be the same as the Name parameter in Volume.</p>
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
         * <p>The subpath of the volume.</p>
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
         * <p>The arguments for the container startup command. A maximum of 10 arguments are supported.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands for the container. A maximum of 20 commands are supported. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs allocated to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variable information.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs allocated to the container.</p>
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
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pull policy for the container. Valid values:</p>
         * <ul>
         * <li>Always: Always pulls the image.</li>
         * <li>IfNotPresent: Pulls the image only if it is not present locally.</li>
         * <li>Never: Never pulls the image. Only local images are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The command executed in the container when the command line is used for the postStart callback function Settings.</p>
         */
        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        /**
         * <p>The host address that accepts the HTTP GET request when the HTTP request method is used for the postStart callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The path to which the HTTP GET request is sent when the HTTP request method is used for the postStart callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port number to which the HTTP GET request is sent when the HTTP request method is used for the postStart callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>5050</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET request when the HTTP request method is used for the postStart callback function Settings. Valid values:</p>
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
         * <p>The host address on which the TCP socket check is performed when the TCP socket method is used for the postStart callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port number on which the TCP socket check is performed when the TCP socket method is used for the postStart callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The command executed in the container when the command line is used for the preStop callback function Settings.</p>
         */
        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        /**
         * <p>The host address that accepts the HTTP GET request when the HTTP request method is used for the preStop callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The path to which the HTTP GET request is sent when the HTTP request method is used for the preStop callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port number to which the HTTP GET request is sent when the HTTP request method is used for the preStop callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET request when the HTTP request method is used for the preStop callback function Settings. Valid values:</p>
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
         * <p>The host address on which the TCP socket check is performed when the TCP socket method is used for the preStop callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port number on which the TCP socket check is performed when the TCP socket method is used for the preStop callback function Settings.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The memory size of the container, in GiB.</p>
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
         * <p>The port information.</p>
         */
        @NameInMap("Ports")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersPorts> ports;

        /**
         * <p>Specifies whether to allocate a buffer for standard input while the container is running. If this parameter is not set, a read from standard input results in an EOF.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether the standard input stream maintains the enabling status across multiple attached sessions when standard input is true.</p>
         * <p>If StdinOnce is set to true, standard input is opened when the container starts, remains empty until the first client attaches to it, and then maintains the enabling status to accept data until the client disconnects. After the client disconnects, standard input enters shutdown and remains in shutdown until the container is restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to allocate a TTY for the container. Default value: false.</p>
         * <p>Set this parameter to true when the Command parameter is set to /bin/bash.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The volume mount information for the container.</p>
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
         * <p>The name of the object variable.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the object variable.</p>
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
         * <p>The hostname to be added.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address to be added.</p>
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
         * <p>The password for the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>yourpaasword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The address of the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username for the image registry.</p>
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
        /**
         * <p>Grants specific privileges to processes in the container. Valid values: NET_ADMIN and NET_RAW.</p>
         * <blockquote>
         * <p>NET_RAW is not supported by default. To use NET_RAW, submit a ticket.</p>
         * </blockquote>
         */
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

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The user ID to run the container.</p>
         * 
         * <strong>example:</strong>
         * <p>587</p>
         */
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
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>path</p>
         */
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
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length. It can contain letters, digits, and underscores (_), and cannot start with a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>Path</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
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
         * <p>The directory where the volume is mounted in the container.</p>
         * <blockquote>
         * <p>The contents of the mount path in the container are directly overwritten by the contents of the volume. Use this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings for the volume. Mount propagation allows a volume mounted to a container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume is not aware of any subsequent mount operations performed on the volume or its subdirectories.</li>
         * <li>HostToCotainer: The volume is aware of subsequent mount operations performed on the volume or its subdirectories.</li>
         * <li>Bidirectional: Similar to HostToCotainer, the volume is aware of mount operations. In addition, the volume is propagated back to the host and to all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the mounted volume.</p>
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
         * <p>The subdirectory under the volume. This allows a pod to mount different directories under the same volume to different directories in the container.</p>
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
         * <p>The startup arguments for the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands for the container.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs allocated to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The number of GPUs allocated to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image used by the container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pull policy for the container. Valid values:</p>
         * <ul>
         * <li>Always: Always pulls the image.</li>
         * <li>IfNotPresent: Pulls the image only if it is not present locally.</li>
         * <li>Never: Never pulls the image. Only local images are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The environment variable information of the init container.</p>
         */
        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The port information of the init container.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>The array of mount point information for the init container.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

        /**
         * <p>The memory size. Unit: GiB.</p>
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
         * <p>The system name of the security context in which the instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the contextual security context in which the instance runs.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
        /**
         * <p>The ID of the disk volume.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xx</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The size of the disk volume. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>This file system type is deprecated. Use the FlexVolume.FsType parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>xfs</p>
         */
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
        /**
         * <p>The storage medium of the EmptyDirVolume. The default value is empty, which indicates that the node file system is used. If this parameter is set to memory, the memory is used.</p>
         * 
         * <strong>example:</strong>
         * <p>memory</p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>The size of the EmptyDir volume. Specify a unit for the value, such as Gi or Mi.</p>
         * 
         * <strong>example:</strong>
         * <p>256Mi</p>
         */
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
        /**
         * <p>The name of the driver used for the FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>flexvolume</p>
         */
        @NameInMap("Driver")
        public String driver;

        /**
         * <p>The type of the file system to be mounted. The default value depends on the script of the FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>ext4</p>
         */
        @NameInMap("FsType")
        public String fsType;

        /**
         * <p>The list of options for the FlexVolume object. The options are passed as key-value pairs in JSON format.</p>
         * <p>Example: When you mount a cloud disk by using FlexVolume, the format of Options is <code>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;volumeId&quot;:&quot;d-2zehdahrwoa7srg****&quot;,&quot;performanceLevel&quot;: &quot;PL2&quot;}</p>
         */
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
        /**
         * <p>The absolute path on the host.</p>
         * 
         * <strong>example:</strong>
         * <p>/xx/xx/name</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The type of the host directory, such as File, Directory, or Socket.</p>
         * 
         * <strong>example:</strong>
         * <p>Directory</p>
         */
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
        /**
         * <p>The path of the NFS volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/share</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Specifies whether the NFS volume is read-only.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The address of the NFS server.</p>
         * 
         * <strong>example:</strong>
         * <p>3f9cd4a596-n****.cn-shanghai.nas.aliyuncs.com</p>
         */
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
         * <p>The content of the configuration file (32 KB).</p>
         * 
         * <strong>example:</strong>
         * <p>bGl1bWk=</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The directory permissions for the ConfigFileVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The relative file path.</p>
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
         * <p>The list of configuration file paths.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPath")
        public java.util.List<ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath;

        /**
         * <p>The default permissions for the ConfigFileVolume.</p>
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
         * <p>The volume type. Valid values:</p>
         * <ul>
         * <li>EmptyDirVolume</li>
         * <li>NFSVolume</li>
         * <li>ConfigFileVolume</li>
         * <li>FlexVolume</li>
         * </ul>
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
