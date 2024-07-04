// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateEciScalingConfigurationRequest extends TeaModel {
    /**
     * <p>Information about the Container Registry Enterprise Edition instance.</p>
     */
    @NameInMap("AcrRegistryInfos")
    public java.util.List<CreateEciScalingConfigurationRequestAcrRegistryInfos> acrRegistryInfos;

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
     * <p>Specifies whether to automatically match the image cache. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The name of the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx-test</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>The containers in the elastic container instance.</p>
     */
    @NameInMap("Containers")
    public java.util.List<CreateEciScalingConfigurationRequestContainers> containers;

    /**
     * <p>Specifies whether to enable the cost optimization feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
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
     * <p>Number of physical CPU cores This parameter is not available for all instance types. For more information, see <a href="https://help.aliyun.com/document_detail/197781.html">Specify custom CPU options</a>.</p>
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
     * <p>The bucket that caches data.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DataCacheBucket")
    public String dataCacheBucket;

    /**
     * <p>Specifies whether to enable the Performance Burst feature for the ESSD AutoPL disk that caches data. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DataCacheBurstingEnabled")
    public Boolean dataCacheBurstingEnabled;

    /**
     * <p>The performance level (PL) of the cloud disk that caches disk. We recommend that you use enhanced SSDs (ESSDs). Valid values:</p>
     * <ul>
     * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: An ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <blockquote>
     * <p> For more information about ESSDs, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("DataCachePL")
    public String dataCachePL;

    /**
     * <p>The provisioned read/write IOPS of the ESSD AutoPL disk that caches data. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline IOPS}. Baseline IOPS = min{1,800+50 x *Capacity, 50,000}.</p>
     * <blockquote>
     * <p> For more information about ESSD AutoPL disks, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * </blockquote>
     * 
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
     * <p>The options. Each option is in the name-value pair format. The value in the name-value pair is optional.</p>
     */
    @NameInMap("DnsConfigOptions")
    public java.util.List<CreateEciScalingConfigurationRequestDnsConfigOptions> dnsConfigOptions;

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
     * <p>The maximum outbound bandwidth. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    /**
     * <p>The bandwidth of the EIP. Default value: 5 Mbit/s.</p>
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
     * <p>The size of the temporary storage space. By default, an ESSD of the PL1 type is used. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>The hostnames and IP addresses of a container that you want to add to the hosts file of the elastic container instance.</p>
     */
    @NameInMap("HostAliases")
    public java.util.List<CreateEciScalingConfigurationRequestHostAliases> hostAliases;

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
    public java.util.List<CreateEciScalingConfigurationRequestImageRegistryCredentials> imageRegistryCredentials;

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
    public java.util.List<CreateEciScalingConfigurationRequestInitContainers> initContainers;

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
     * <p>Default value: 50.</p>
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
     * <p>The domain name of the Network Time Protocol (NTP) server.</p>
     */
    @NameInMap("NtpServers")
    public java.util.List<String> ntpServers;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the RAM role for the elastic container instance. You can use an instance RAM role to access both elastic container instances and Elastic Compute Service (ECS) instances. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
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
     * <p>The restart policy of the elastic container instance. Valid values:</p>
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
     * <p>The name of the scaling configuration. The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must start with a letter or a digit.</p>
     * <p>The name of the scaling configuration must be unique within a scaling group in a region. If you do not specify this parameter, the value of the ScalingConfigurationId parameter is used.</p>
     * 
     * <strong>example:</strong>
     * <p>scalingconfig****</p>
     */
    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    /**
     * <p>The ID of the scaling group in which you want to create the scaling configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp14wlu85wrpchm0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The system information of the security context in which the elastic container instance runs.</p>
     */
    @NameInMap("SecurityContextSysctls")
    public java.util.List<CreateEciScalingConfigurationRequestSecurityContextSysctls> securityContextSysctls;

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
     * <p>The tags of the elastic container instance. The tags must be specified in the key-value pair format. You can specify up to 20 tags. When you specify tag keys and tag values, take note of the following items:</p>
     * <ul>
     * <li>A tag key can be up to 64 characters in length. The key cannot start with acs: or aliyun and cannot contain <code>http://</code> or <code>https://</code>. You cannot specify an empty string as a tag key.</li>
     * <li>A tag value can be up to 128 characters in length. The value cannot start with acs: or aliyun and cannot contain <code>http://</code> or <code>https://</code>. You can specify an empty string as a tag value.</li>
     * </ul>
     */
    @NameInMap("Tags")
    public java.util.List<CreateEciScalingConfigurationRequestTags> tags;

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
    public java.util.List<CreateEciScalingConfigurationRequestVolumes> volumes;

    public static CreateEciScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEciScalingConfigurationRequest self = new CreateEciScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateEciScalingConfigurationRequest setAcrRegistryInfos(java.util.List<CreateEciScalingConfigurationRequestAcrRegistryInfos> acrRegistryInfos) {
        this.acrRegistryInfos = acrRegistryInfos;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestAcrRegistryInfos> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    public CreateEciScalingConfigurationRequest setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public CreateEciScalingConfigurationRequest setAutoCreateEip(Boolean autoCreateEip) {
        this.autoCreateEip = autoCreateEip;
        return this;
    }
    public Boolean getAutoCreateEip() {
        return this.autoCreateEip;
    }

    public CreateEciScalingConfigurationRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public CreateEciScalingConfigurationRequest setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        return this;
    }
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public CreateEciScalingConfigurationRequest setContainers(java.util.List<CreateEciScalingConfigurationRequestContainers> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestContainers> getContainers() {
        return this.containers;
    }

    public CreateEciScalingConfigurationRequest setCostOptimization(Boolean costOptimization) {
        this.costOptimization = costOptimization;
        return this;
    }
    public Boolean getCostOptimization() {
        return this.costOptimization;
    }

    public CreateEciScalingConfigurationRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateEciScalingConfigurationRequest setCpuOptionsCore(Integer cpuOptionsCore) {
        this.cpuOptionsCore = cpuOptionsCore;
        return this;
    }
    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    public CreateEciScalingConfigurationRequest setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
        this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
        return this;
    }
    public Integer getCpuOptionsThreadsPerCore() {
        return this.cpuOptionsThreadsPerCore;
    }

    public CreateEciScalingConfigurationRequest setDataCacheBucket(String dataCacheBucket) {
        this.dataCacheBucket = dataCacheBucket;
        return this;
    }
    public String getDataCacheBucket() {
        return this.dataCacheBucket;
    }

    public CreateEciScalingConfigurationRequest setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
        this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
        return this;
    }
    public Boolean getDataCacheBurstingEnabled() {
        return this.dataCacheBurstingEnabled;
    }

    public CreateEciScalingConfigurationRequest setDataCachePL(String dataCachePL) {
        this.dataCachePL = dataCachePL;
        return this;
    }
    public String getDataCachePL() {
        return this.dataCachePL;
    }

    public CreateEciScalingConfigurationRequest setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
        this.dataCacheProvisionedIops = dataCacheProvisionedIops;
        return this;
    }
    public Integer getDataCacheProvisionedIops() {
        return this.dataCacheProvisionedIops;
    }

    public CreateEciScalingConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEciScalingConfigurationRequest setDnsConfigNameServers(java.util.List<String> dnsConfigNameServers) {
        this.dnsConfigNameServers = dnsConfigNameServers;
        return this;
    }
    public java.util.List<String> getDnsConfigNameServers() {
        return this.dnsConfigNameServers;
    }

    public CreateEciScalingConfigurationRequest setDnsConfigOptions(java.util.List<CreateEciScalingConfigurationRequestDnsConfigOptions> dnsConfigOptions) {
        this.dnsConfigOptions = dnsConfigOptions;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestDnsConfigOptions> getDnsConfigOptions() {
        return this.dnsConfigOptions;
    }

    public CreateEciScalingConfigurationRequest setDnsConfigSearchs(java.util.List<String> dnsConfigSearchs) {
        this.dnsConfigSearchs = dnsConfigSearchs;
        return this;
    }
    public java.util.List<String> getDnsConfigSearchs() {
        return this.dnsConfigSearchs;
    }

    public CreateEciScalingConfigurationRequest setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public CreateEciScalingConfigurationRequest setEgressBandwidth(Long egressBandwidth) {
        this.egressBandwidth = egressBandwidth;
        return this;
    }
    public Long getEgressBandwidth() {
        return this.egressBandwidth;
    }

    public CreateEciScalingConfigurationRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public CreateEciScalingConfigurationRequest setEnableSls(Boolean enableSls) {
        this.enableSls = enableSls;
        return this;
    }
    public Boolean getEnableSls() {
        return this.enableSls;
    }

    public CreateEciScalingConfigurationRequest setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public CreateEciScalingConfigurationRequest setHostAliases(java.util.List<CreateEciScalingConfigurationRequestHostAliases> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestHostAliases> getHostAliases() {
        return this.hostAliases;
    }

    public CreateEciScalingConfigurationRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateEciScalingConfigurationRequest setImageRegistryCredentials(java.util.List<CreateEciScalingConfigurationRequestImageRegistryCredentials> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestImageRegistryCredentials> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    public CreateEciScalingConfigurationRequest setImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        return this;
    }
    public String getImageSnapshotId() {
        return this.imageSnapshotId;
    }

    public CreateEciScalingConfigurationRequest setIngressBandwidth(Long ingressBandwidth) {
        this.ingressBandwidth = ingressBandwidth;
        return this;
    }
    public Long getIngressBandwidth() {
        return this.ingressBandwidth;
    }

    public CreateEciScalingConfigurationRequest setInitContainers(java.util.List<CreateEciScalingConfigurationRequestInitContainers> initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestInitContainers> getInitContainers() {
        return this.initContainers;
    }

    public CreateEciScalingConfigurationRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public CreateEciScalingConfigurationRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public CreateEciScalingConfigurationRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateEciScalingConfigurationRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public CreateEciScalingConfigurationRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public CreateEciScalingConfigurationRequest setNtpServers(java.util.List<String> ntpServers) {
        this.ntpServers = ntpServers;
        return this;
    }
    public java.util.List<String> getNtpServers() {
        return this.ntpServers;
    }

    public CreateEciScalingConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateEciScalingConfigurationRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateEciScalingConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEciScalingConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateEciScalingConfigurationRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public CreateEciScalingConfigurationRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public CreateEciScalingConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateEciScalingConfigurationRequest setSecurityContextSysctls(java.util.List<CreateEciScalingConfigurationRequestSecurityContextSysctls> securityContextSysctls) {
        this.securityContextSysctls = securityContextSysctls;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestSecurityContextSysctls> getSecurityContextSysctls() {
        return this.securityContextSysctls;
    }

    public CreateEciScalingConfigurationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEciScalingConfigurationRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateEciScalingConfigurationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateEciScalingConfigurationRequest setTags(java.util.List<CreateEciScalingConfigurationRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestTags> getTags() {
        return this.tags;
    }

    public CreateEciScalingConfigurationRequest setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateEciScalingConfigurationRequest setVolumes(java.util.List<CreateEciScalingConfigurationRequestVolumes> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<CreateEciScalingConfigurationRequestVolumes> getVolumes() {
        return this.volumes;
    }

    public static class CreateEciScalingConfigurationRequestAcrRegistryInfos extends TeaModel {
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
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateEciScalingConfigurationRequestAcrRegistryInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestAcrRegistryInfos self = new CreateEciScalingConfigurationRequestAcrRegistryInfos();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestAcrRegistryInfos setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public CreateEciScalingConfigurationRequestAcrRegistryInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEciScalingConfigurationRequestAcrRegistryInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateEciScalingConfigurationRequestAcrRegistryInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersLivenessProbeExec extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static CreateEciScalingConfigurationRequestContainersLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersLivenessProbeExec self = new CreateEciScalingConfigurationRequestContainersLivenessProbeExec();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbeExec setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet self = new CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket self = new CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersLivenessProbe extends TeaModel {
        @NameInMap("Exec")
        public CreateEciScalingConfigurationRequestContainersLivenessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateEciScalingConfigurationRequestContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersLivenessProbe self = new CreateEciScalingConfigurationRequestContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setExec(CreateEciScalingConfigurationRequestContainersLivenessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersLivenessProbeExec getExec() {
            return this.exec;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setHttpGet(CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setTcpSocket(CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public CreateEciScalingConfigurationRequestContainersLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersReadinessProbeExec extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static CreateEciScalingConfigurationRequestContainersReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersReadinessProbeExec self = new CreateEciScalingConfigurationRequestContainersReadinessProbeExec();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbeExec setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet self = new CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket self = new CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        public CreateEciScalingConfigurationRequestContainersReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateEciScalingConfigurationRequestContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersReadinessProbe self = new CreateEciScalingConfigurationRequestContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setExec(CreateEciScalingConfigurationRequestContainersReadinessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersReadinessProbeExec getExec() {
            return this.exec;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setHttpGet(CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setTcpSocket(CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public CreateEciScalingConfigurationRequestContainersReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static CreateEciScalingConfigurationRequestContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersSecurityContextCapability self = new CreateEciScalingConfigurationRequestContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersSecurityContextCapability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public CreateEciScalingConfigurationRequestContainersSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static CreateEciScalingConfigurationRequestContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersSecurityContext self = new CreateEciScalingConfigurationRequestContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersSecurityContext setCapability(CreateEciScalingConfigurationRequestContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public CreateEciScalingConfigurationRequestContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public CreateEciScalingConfigurationRequestContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersEnvironmentVars extends TeaModel {
        /**
         * <blockquote>
         * <p> This parameter is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fieldPath</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>The name of the environment variable. The name can be 1 to 128 characters in length and can contain underscores (_) and digits. The name cannot start with a digit. Specify the value in the [0-9a-zA-Z] format.</p>
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

        public static CreateEciScalingConfigurationRequestContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersEnvironmentVars self = new CreateEciScalingConfigurationRequestContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public CreateEciScalingConfigurationRequestContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEciScalingConfigurationRequestContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersPorts extends TeaModel {
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

        public static CreateEciScalingConfigurationRequestContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersPorts self = new CreateEciScalingConfigurationRequestContainersPorts();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateEciScalingConfigurationRequestContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory to which the container mounts the volume.</p>
         * <blockquote>
         * <p> Data under this directory is overwritten by data on the volume. Specify this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on the volume or the subdirectories of the volume.</li>
         * <li>HostToContainer: The volume mount receives all subsequent mounts that are performed on the volume or the subdirectories of the volume.</li>
         * <li>Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or the subdirectories of the volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name. The value of this parameter is the same as the value of Volumes.Name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the volume is read-only. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
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

        public static CreateEciScalingConfigurationRequestContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainersVolumeMounts self = new CreateEciScalingConfigurationRequestContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateEciScalingConfigurationRequestContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public CreateEciScalingConfigurationRequestContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateEciScalingConfigurationRequestContainersVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class CreateEciScalingConfigurationRequestContainers extends TeaModel {
        @NameInMap("LivenessProbe")
        public CreateEciScalingConfigurationRequestContainersLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public CreateEciScalingConfigurationRequestContainersReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        public CreateEciScalingConfigurationRequestContainersSecurityContext securityContext;

        /**
         * <p>The container startup arguments. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The commands that you can run in the container when you use the CLI to perform liveness probes.</p>
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
        public java.util.List<CreateEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars;

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

        @NameInMap("LifecyclePostStartHandlerExecs")
        public java.util.List<String> lifecyclePostStartHandlerExecs;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <strong>example:</strong>
         * <p>5050</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePreStopHandlerExecs")
        public java.util.List<String> lifecyclePreStopHandlerExecs;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <strong>example:</strong>
         * <p>90</p>
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
        public java.util.List<CreateEciScalingConfigurationRequestContainersPorts> ports;

        /**
         * <p>Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether to remain standard input streams connected during multiple sessions if StdinOnce is set to true.</p>
         * <p>If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container is restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable interaction. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>If the command is a /bin/bash command, set the value to true.</p>
         * <p>Default value: false.</p>
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
        public java.util.List<CreateEciScalingConfigurationRequestContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static CreateEciScalingConfigurationRequestContainers build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestContainers self = new CreateEciScalingConfigurationRequestContainers();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestContainers setLivenessProbe(CreateEciScalingConfigurationRequestContainersLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public CreateEciScalingConfigurationRequestContainers setReadinessProbe(CreateEciScalingConfigurationRequestContainersReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public CreateEciScalingConfigurationRequestContainers setSecurityContext(CreateEciScalingConfigurationRequestContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public CreateEciScalingConfigurationRequestContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public CreateEciScalingConfigurationRequestContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public CreateEciScalingConfigurationRequestContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public CreateEciScalingConfigurationRequestContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public CreateEciScalingConfigurationRequestContainers setEnvironmentVars(java.util.List<CreateEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public CreateEciScalingConfigurationRequestContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateEciScalingConfigurationRequestContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateEciScalingConfigurationRequestContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerExecs(java.util.List<String> lifecyclePostStartHandlerExecs) {
            this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExecs() {
            return this.lifecyclePostStartHandlerExecs;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerExecs(java.util.List<String> lifecyclePreStopHandlerExecs) {
            this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExecs() {
            return this.lifecyclePreStopHandlerExecs;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public CreateEciScalingConfigurationRequestContainers setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public CreateEciScalingConfigurationRequestContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public CreateEciScalingConfigurationRequestContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestContainers setPorts(java.util.List<CreateEciScalingConfigurationRequestContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestContainersPorts> getPorts() {
            return this.ports;
        }

        public CreateEciScalingConfigurationRequestContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public CreateEciScalingConfigurationRequestContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public CreateEciScalingConfigurationRequestContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public CreateEciScalingConfigurationRequestContainers setVolumeMounts(java.util.List<CreateEciScalingConfigurationRequestContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public CreateEciScalingConfigurationRequestContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateEciScalingConfigurationRequestDnsConfigOptions extends TeaModel {
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

        public static CreateEciScalingConfigurationRequestDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestDnsConfigOptions self = new CreateEciScalingConfigurationRequestDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEciScalingConfigurationRequestHostAliases extends TeaModel {
        /**
         * <p>The hostname that you want to add.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address that you want to add.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static CreateEciScalingConfigurationRequestHostAliases build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestHostAliases self = new CreateEciScalingConfigurationRequestHostAliases();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public CreateEciScalingConfigurationRequestHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class CreateEciScalingConfigurationRequestImageRegistryCredentials extends TeaModel {
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

        public static CreateEciScalingConfigurationRequestImageRegistryCredentials build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestImageRegistryCredentials self = new CreateEciScalingConfigurationRequestImageRegistryCredentials();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestImageRegistryCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateEciScalingConfigurationRequestImageRegistryCredentials setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public CreateEciScalingConfigurationRequestImageRegistryCredentials setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability self = new CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class CreateEciScalingConfigurationRequestInitContainersSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static CreateEciScalingConfigurationRequestInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestInitContainersSecurityContext self = new CreateEciScalingConfigurationRequestInitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestInitContainersSecurityContext setCapability(CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public CreateEciScalingConfigurationRequestInitContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public CreateEciScalingConfigurationRequestInitContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public CreateEciScalingConfigurationRequestInitContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>path</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>The key of the environment variable. Specify the key in the <code>[0-9a-zA-Z]</code> format. The key must be 1 to 128 characters in length. The key can contain underscores (_) and cannot start with a digit.</p>
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

        public static CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars self = new CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEciScalingConfigurationRequestInitContainersInitContainerPorts extends TeaModel {
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

        public static CreateEciScalingConfigurationRequestInitContainersInitContainerPorts build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestInitContainersInitContainerPorts self = new CreateEciScalingConfigurationRequestInitContainersInitContainerPorts();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts extends TeaModel {
        /**
         * <p>The path to which the volume is mounted. Data under this path is overwritten by the data on the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume . Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are mounted to this volume or its subdirectories.</li>
         * <li>HostToContainer: The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories.</li>
         * <li>Bidirectional: This value is similar to HostToContainer. The volume mount receives all subsequent mounts that are mounted to this volume or its subdirectories. In addition, all volume mounts that are created by the container are propagated back to the instance and to all containers of all pods that use the same volume.</li>
         * </ul>
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
         * <p>/usr/sub/</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts self = new CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class CreateEciScalingConfigurationRequestInitContainers extends TeaModel {
        @NameInMap("SecurityContext")
        public CreateEciScalingConfigurationRequestInitContainersSecurityContext securityContext;

        /**
         * <p>The arguments that correspond to the startup commands of the container. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The list of commands that you want to run to start the container.</p>
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
         * <p>The image pulling policy.</p>
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
        public java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        /**
         * <p>The ports of the init container.</p>
         */
        @NameInMap("InitContainerPorts")
        public java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerPorts> initContainerPorts;

        /**
         * <p>Information about the volume mounts of the init container.</p>
         */
        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

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

        public static CreateEciScalingConfigurationRequestInitContainers build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestInitContainers self = new CreateEciScalingConfigurationRequestInitContainers();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestInitContainers setSecurityContext(CreateEciScalingConfigurationRequestInitContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public CreateEciScalingConfigurationRequestInitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public CreateEciScalingConfigurationRequestInitContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public CreateEciScalingConfigurationRequestInitContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public CreateEciScalingConfigurationRequestInitContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public CreateEciScalingConfigurationRequestInitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateEciScalingConfigurationRequestInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateEciScalingConfigurationRequestInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public CreateEciScalingConfigurationRequestInitContainers setInitContainerEnvironmentVars(java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars) {
            this.initContainerEnvironmentVars = initContainerEnvironmentVars;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> getInitContainerEnvironmentVars() {
            return this.initContainerEnvironmentVars;
        }

        public CreateEciScalingConfigurationRequestInitContainers setInitContainerPorts(java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerPorts> initContainerPorts) {
            this.initContainerPorts = initContainerPorts;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerPorts> getInitContainerPorts() {
            return this.initContainerPorts;
        }

        public CreateEciScalingConfigurationRequestInitContainers setInitContainerVolumeMounts(java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> initContainerVolumeMounts) {
            this.initContainerVolumeMounts = initContainerVolumeMounts;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> getInitContainerVolumeMounts() {
            return this.initContainerVolumeMounts;
        }

        public CreateEciScalingConfigurationRequestInitContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public CreateEciScalingConfigurationRequestInitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateEciScalingConfigurationRequestSecurityContextSysctls extends TeaModel {
        /**
         * <p>The variable name of the security context in which the elastic container instance runs.</p>
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

        public static CreateEciScalingConfigurationRequestSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestSecurityContextSysctls self = new CreateEciScalingConfigurationRequestSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestSecurityContextSysctls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestSecurityContextSysctls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEciScalingConfigurationRequestTags extends TeaModel {
        /**
         * <p>The tag key of the elastic container instance. You can specify 1 to 20 tags.</p>
         * <p>You cannot specify an empty string as a tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the elastic container instance. You can specify 1 to 20 tags.</p>
         * <p>You can specify an empty string as a tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEciScalingConfigurationRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestTags self = new CreateEciScalingConfigurationRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEciScalingConfigurationRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumesDiskVolume extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("FsType")
        public String fsType;

        public static CreateEciScalingConfigurationRequestVolumesDiskVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumesDiskVolume self = new CreateEciScalingConfigurationRequestVolumesDiskVolume();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumesDiskVolume setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public CreateEciScalingConfigurationRequestVolumesDiskVolume setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public CreateEciScalingConfigurationRequestVolumesDiskVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumesEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static CreateEciScalingConfigurationRequestVolumesEmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumesEmptyDirVolume self = new CreateEciScalingConfigurationRequestVolumesEmptyDirVolume();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumesEmptyDirVolume setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public CreateEciScalingConfigurationRequestVolumesEmptyDirVolume setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumesFlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        public static CreateEciScalingConfigurationRequestVolumesFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumesFlexVolume self = new CreateEciScalingConfigurationRequestVolumesFlexVolume();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumesFlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public CreateEciScalingConfigurationRequestVolumesFlexVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public CreateEciScalingConfigurationRequestVolumesFlexVolume setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumesHostPathVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static CreateEciScalingConfigurationRequestVolumesHostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumesHostPathVolume self = new CreateEciScalingConfigurationRequestVolumesHostPathVolume();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumesHostPathVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateEciScalingConfigurationRequestVolumesHostPathVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumesNFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Server")
        public String server;

        public static CreateEciScalingConfigurationRequestVolumesNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumesNFSVolume self = new CreateEciScalingConfigurationRequestVolumesNFSVolume();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumesNFSVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateEciScalingConfigurationRequestVolumesNFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateEciScalingConfigurationRequestVolumesNFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
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
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length. Specify the name in the <code>[0-9a-zA-Z]</code> format. The name can contain underscores and cannot start with a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Path")
        public String path;

        public static CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths self = new CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateEciScalingConfigurationRequestVolumes extends TeaModel {
        @NameInMap("DiskVolume")
        public CreateEciScalingConfigurationRequestVolumesDiskVolume diskVolume;

        @NameInMap("EmptyDirVolume")
        public CreateEciScalingConfigurationRequestVolumesEmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        public CreateEciScalingConfigurationRequestVolumesFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        public CreateEciScalingConfigurationRequestVolumesHostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        public CreateEciScalingConfigurationRequestVolumesNFSVolume NFSVolume;

        /**
         * <p>The paths to the configuration files.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The default permissions on the ConfigFile volume.</p>
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
         * <p>The type of the Host file or path. Examples: File, Directory, and Socket.</p>
         * 
         * <strong>example:</strong>
         * <p>ConfigFileVolume</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateEciScalingConfigurationRequestVolumes build(java.util.Map<String, ?> map) throws Exception {
            CreateEciScalingConfigurationRequestVolumes self = new CreateEciScalingConfigurationRequestVolumes();
            return TeaModel.build(map, self);
        }

        public CreateEciScalingConfigurationRequestVolumes setDiskVolume(CreateEciScalingConfigurationRequestVolumesDiskVolume diskVolume) {
            this.diskVolume = diskVolume;
            return this;
        }
        public CreateEciScalingConfigurationRequestVolumesDiskVolume getDiskVolume() {
            return this.diskVolume;
        }

        public CreateEciScalingConfigurationRequestVolumes setEmptyDirVolume(CreateEciScalingConfigurationRequestVolumesEmptyDirVolume emptyDirVolume) {
            this.emptyDirVolume = emptyDirVolume;
            return this;
        }
        public CreateEciScalingConfigurationRequestVolumesEmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        public CreateEciScalingConfigurationRequestVolumes setFlexVolume(CreateEciScalingConfigurationRequestVolumesFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }
        public CreateEciScalingConfigurationRequestVolumesFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        public CreateEciScalingConfigurationRequestVolumes setHostPathVolume(CreateEciScalingConfigurationRequestVolumesHostPathVolume hostPathVolume) {
            this.hostPathVolume = hostPathVolume;
            return this;
        }
        public CreateEciScalingConfigurationRequestVolumesHostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        public CreateEciScalingConfigurationRequestVolumes setNFSVolume(CreateEciScalingConfigurationRequestVolumesNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public CreateEciScalingConfigurationRequestVolumesNFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        public CreateEciScalingConfigurationRequestVolumes setConfigFileVolumeConfigFileToPaths(java.util.List<CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<CreateEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public CreateEciScalingConfigurationRequestVolumes setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
            this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
            return this;
        }
        public Integer getConfigFileVolumeDefaultMode() {
            return this.configFileVolumeDefaultMode;
        }

        public CreateEciScalingConfigurationRequestVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEciScalingConfigurationRequestVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
