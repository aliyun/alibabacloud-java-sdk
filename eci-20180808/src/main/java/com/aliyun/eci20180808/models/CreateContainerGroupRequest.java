// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupRequest extends TeaModel {
    @NameInMap("DnsConfig")
    public CreateContainerGroupRequestDnsConfig dnsConfig;

    @NameInMap("HostSecurityContext")
    public CreateContainerGroupRequestHostSecurityContext hostSecurityContext;

    @NameInMap("SecurityContext")
    public CreateContainerGroupRequestSecurityContext securityContext;

    /**
     * <p>The information about the Container Registry Enterprise Edition instance. For more information, see [Pull images from a Container Registry Enterprise Edition instance without using secrets](~~194250~~).</p>
     */
    @NameInMap("AcrRegistryInfo")
    public java.util.List<CreateContainerGroupRequestAcrRegistryInfo> acrRegistryInfo;

    /**
     * <p>The validity period of the elastic container instance. When this period expires, the instance is forced to exit. Unit: seconds.</p>
     */
    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    /**
     * <p>Specifies whether to automatically create an EIP and associate it with the elastic container instance.</p>
     */
    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    /**
     * <p>Specifies whether to automatically match image caches. Default value: false.</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotency of requests?](~~25693~~)</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ComputeCategory")
    public java.util.List<String> computeCategory;

    /**
     * <p>The information about the containers.</p>
     */
    @NameInMap("Container")
    public java.util.List<CreateContainerGroupRequestContainer> container;

    /**
     * <p>The name of the elastic container instance. Format requirements:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length</p>
     * <p>*   The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-).</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>Specifies whether to enable container resource view. Container resource view displays the actual container resource data instead of data of the host. If the specifications of the generated elastic container instance are larger than the specifications that you request for when you create the instance, you can enable the ContainerResourceView feature to ensure that the resources that you view in the container are the same as the resources that you request for.</p>
     */
    @NameInMap("ContainerResourceView")
    public Boolean containerResourceView;

    /**
     * <p>The path to store core dump files. For more information, see [Save core files to volumes](~~167801~~).</p>
     * <br>
     * <p>> The path cannot start with a vertical bar (`|`). You cannot use core dump files to configure executable programs.</p>
     */
    @NameInMap("CorePattern")
    public String corePattern;

    /**
     * <p>The number of vCPUs that you want to allocate to the elastic container instance.</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    /**
     * <p>The number of physical CPU cores. You can specify this parameter only for specific instance types. For more information, see [Specify custom CPU options](~~197781~~).</p>
     */
    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    /**
     * <p>This parameter is not available.</p>
     */
    @NameInMap("CpuOptionsNuma")
    public String cpuOptionsNuma;

    /**
     * <p>The number of threads per core. You can specify this parameter only for specific instance types. If you set this parameter to 1, Hyper-Threading is disabled. For more information, see [Specify custom CPU options](~~197781~~).</p>
     */
    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    /**
     * <p>The bucket to store data caches.</p>
     */
    @NameInMap("DataCacheBucket")
    public String dataCacheBucket;

    /**
     * <p>Specifies whether to enable the performance burst feature when ESSDs AutoPL are used for data caching. For more information, see [ESSDs AutoPL](~~368372~~).</p>
     */
    @NameInMap("DataCacheBurstingEnabled")
    public Boolean dataCacheBurstingEnabled;

    /**
     * <p>The performance level of the disk used by data caches.\</p>
     * <p>Enhanced SSDs (ESSDs) are preferentially used. The default performance level is PL1.</p>
     */
    @NameInMap("DataCachePL")
    public String dataCachePL;

    /**
     * <p>The input/output operations per second (IOPS) provisioned for ESSDs AutoPL when ESSDs AutoPL are used for data caching.\</p>
     * <p>Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.\</p>
     * <p>For more information, see [ESSDs AutoPL](~~368372~~).</p>
     */
    @NameInMap("DataCacheProvisionedIops")
    public Long dataCacheProvisionedIops;

    /**
     * <p>The Domain Name System (DNS) policy. Valid values:</p>
     * <br>
     * <p>*   None: uses the DNS that is specified for DnsConfig-related parameters.</p>
     * <p>*   Default: uses the DNS that is specified for the runtime environment.</p>
     */
    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    /**
     * <p>Specifies whether to perform only a dry run without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run without creating an elastic container instance. The check items include the request format, service limits, resource inventory, and whether the required parameters are specified. If the request fails the dry run, an error is returned. If the request passes the dry run, the DryRun.Success error code is returned.</p>
     * <p>*   false (default): performs a dry run, and creates an elastic container instance after the request passes the dry run.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The maximum outbound bandwidth. Unit: bytes.</p>
     */
    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    /**
     * <p>The bandwidth of the EIP. Unit: Mbit/s. Default value: 5.\</p>
     * <p>You can specify this parameter when you set AutoCreateEip to true.</p>
     */
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    /**
     * <p>Specifies the EIP bandwidth plan that you want to use.</p>
     */
    @NameInMap("EipCommonBandwidthPackage")
    public String eipCommonBandwidthPackage;

    /**
     * <p>The line type of the elastic IP address (EIP). Valid values:</p>
     * <br>
     * <p>*   BGP: BGP (Multi-ISP) lines</p>
     * <p>*   BGP_PRO: BGP (Multi-ISP) Pro lines</p>
     */
    @NameInMap("EipISP")
    public String eipISP;

    /**
     * <p>The ID of the elastic IP address (EIP).</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>The increased storage capacity of the temporary storage space. Unit: GiB.\</p>
     * <p>For more information, see [Increase the storage capacity of the temporary storage space](~~204066~~).</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>Specifies whether to configure the instance to use a fixed IP address. For more information, see [Configure an elastic container instance to use a fixed IP address](~~2381086~~).</p>
     */
    @NameInMap("FixedIp")
    public String fixedIp;

    /**
     * <p>The retention period of the fixed IP address after the original instance is released and the fixed IP address becomes idle. Unit: hours. Default value: 48.</p>
     */
    @NameInMap("FixedIpRetainHour")
    public Integer fixedIpRetainHour;

    /**
     * <p>The alias of the elastic container instance.</p>
     */
    @NameInMap("HostAliase")
    public java.util.List<CreateContainerGroupRequestHostAliase> hostAliase;

    /**
     * <p>The hostname of the instance.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The image acceleration mode. Valid values:</p>
     * <br>
     * <p>*   nydus: Nydus is used to accelerate image pulling. The images must support Nydus.</p>
     * <p>*   dadi: DADI is used to accelerate image pulling. The images must support DADI.</p>
     * <p>*   p2p: P2P is used to accelerate image pulling. The images must support P2P.</p>
     * <p>*   imc: Image caches are used to accelerate image pulling.</p>
     */
    @NameInMap("ImageAccelerateMode")
    public String imageAccelerateMode;

    /**
     * <p>The information about the image repository.</p>
     */
    @NameInMap("ImageRegistryCredential")
    public java.util.List<CreateContainerGroupRequestImageRegistryCredential> imageRegistryCredential;

    /**
     * <p>The ID of the image cache. For more information, see [Use image caches to accelerate the creation of instances](~~141281~~).</p>
     */
    @NameInMap("ImageSnapshotId")
    public String imageSnapshotId;

    /**
     * <p>The maximum inbound bandwidth. Unit: bytes.</p>
     */
    @NameInMap("IngressBandwidth")
    public Long ingressBandwidth;

    /**
     * <p>The information about the init containers.</p>
     */
    @NameInMap("InitContainer")
    public java.util.List<CreateContainerGroupRequestInitContainer> initContainer;

    /**
     * <p>The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses a self-signed certificate, you must specify this parameter to skip the certificate authentication. This prevents image pull failures caused by certificate authentication failures.</p>
     */
    @NameInMap("InsecureRegistry")
    public String insecureRegistry;

    /**
     * <p>The ECS instance type. Different instance types are supported. For more information, see [Specify an ECS instance type to create an elastic container instance](~~114664~~).</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of IPv6 addresses. Set the value to 1. You can assign only one IPv6 address to an elastic container instance.</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The peak Internet bandwidth of the IPv6 address when the Ipv6GatewayBandwidthEnable parameter is set to true. Valid values:</p>
     * <br>
     * <p>*   If the billing method for the Internet bandwidth of the IPv6 gateway is pay-by-bandwidth, the Internet bandwidth of the IPv6 address ranges from 1 to 2,000 Mbit/s.</p>
     * <br>
     * <p>*   If the billing method for the Internet bandwidth of the IPv6 gateway is pay-by-traffic, the Internet bandwidth range of the IPv6 address is based on the edition of the IPv6 gateway.</p>
     * <br>
     * <p>    *   If the IPv6 gateway is of Free Edition, the Internet bandwidth of the IPv6 address ranges from 1 to 200 Mbit/s.</p>
     * <p>    *   If the IPv6 gateway is of Enterprise Edition, the Internet bandwidth of the IPv6 address ranges from 1 to 500 Mbit/s.</p>
     * <p>    *   If the IPv6 gateway is of Enhanced Enterprise Edition, the Internet bandwidth of the IPv6 address ranges from 1 to 1,000 Mbit/s.</p>
     * <br>
     * <p>The default value is the maximum value in the Internet bandwidth range of the IPv6 gateway.</p>
     */
    @NameInMap("Ipv6GatewayBandwidth")
    public String ipv6GatewayBandwidth;

    /**
     * <p>Specifies whether to enable IPv6 Internet access for the elastic container instance.</p>
     */
    @NameInMap("Ipv6GatewayBandwidthEnable")
    public Boolean ipv6GatewayBandwidthEnable;

    /**
     * <p>The memory size that you want to allocate to the elastic container instance. Unit: GiB.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The domain names of the NTP server.</p>
     */
    @NameInMap("NtpServer")
    public java.util.List<String> ntpServer;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("OverheadReservationOption")
    public CreateContainerGroupRequestOverheadReservationOption overheadReservationOption;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses the HTTP protocol, you must specify this parameter. This allows Elastic Container Instance to pull the image over the HTTP protocol instead over the default HTTPS protocol. This prevents image pull failures caused by different protocols.</p>
     */
    @NameInMap("PlainHttpRegistry")
    public String plainHttpRegistry;

    /**
     * <p>The private IP address of the elastic container instance. Only IPv4 addresses are supported. Make sure that the IP address is idle.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the RAM role that you want to associate with the elastic container instance. You can use the RAM role to access elastic container instances and ECS instances. For more information, see [Use an instance RAM role by calling API operations](~~61178~~).</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The restart policy of the elastic container instance. Valid values:</p>
     * <br>
     * <p>*   Always: Always restarts the instance.</p>
     * <p>*   Never: Never restarts the instance.</p>
     * <p>*   OnFailure: Restarts the instance when the last start failed.</p>
     * <br>
     * <p>Default value: Always.</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The resource scheduling policy when you specify multiple zones to create an elastic container instance. To specify multiple zones, you can use the VSwitchId to specify multiple vSwitches. Valid values:</p>
     * <br>
     * <p>*   VSwitchOrdered: The system schedules resources in the sequence of the vSwitches.</p>
     * <p>*   VSwitchRandom: The system schedules resources at random.</p>
     * <br>
     * <p>For more information, see [Specify multiple zones to create an elastic container instance](~~157290~~).</p>
     */
    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    /**
     * <p>The ID of the security group to which the instance is assigned. Instances within the same security group can access each other.</p>
     * <br>
     * <p>If you do not specify a security group, the system automatically uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the container protocols and port numbers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the container protocols and port numbers that you specified to the inbound rules of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Specifies whether to use a shared namespace. Default value: false.</p>
     */
    @NameInMap("ShareProcessNamespace")
    public Boolean shareProcessNamespace;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. A value of 0 indicates no protection period.</p>
     */
    @NameInMap("SpotDuration")
    public Long spotDuration;

    /**
     * <p>The maximum hourly price of the preemptible elastic container instance. The value can contain up to three decimal places.</p>
     * <br>
     * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify SpotPriceLimit.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the instance. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a regular pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance whose bidding price is based on the market price at the time of purchase.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>Specifies whether to enable periodical execution.</p>
     * <br>
     * <p>*   true: enables periodical execution.</p>
     * <p>*   false: disables periodical execution.</p>
     */
    @NameInMap("StrictSpot")
    public Boolean strictSpot;

    /**
     * <p>The tags that you want to bind with the instance. You can bind a maximum of 20 tags. For more information, see [Use tags to manage elastic container instances](~~146608~~).</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateContainerGroupRequestTag> tag;

    /**
     * <p>The buffer time during which the program handles operations before the program stops. Unit: seconds.</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

    /**
     * <p>The ID of the vSwitch to which the instance is connected. You can specify up to 10 vSwitch IDs. Separate multiple vSwitch IDs with commas (,). Example: `vsw-***,vsw-***`.</p>
     * <br>
     * <p>If no vSwitch is specified, the system automatically uses the default vSwitch in the default VPC in the region that you selected. If you do not have a default VPC or a default vSwitch in the region, the system automatically creates a default VPC and a default vSwitch.</p>
     * <br>
     * <p>> The number of IP addresses in the vSwitch CIDR block determines the maximum number of elastic container instances that can be created for the vSwitch. Before you create elastic container instances, plan the CIDR block of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Information about volumes.</p>
     */
    @NameInMap("Volume")
    public java.util.List<CreateContainerGroupRequestVolume> volume;

    /**
     * <p>The ID of the zone in which the elastic container instance is deployed. If you do not specify this parameter, the system selects a zone.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupRequest self = new CreateContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerGroupRequest setDnsConfig(CreateContainerGroupRequestDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public CreateContainerGroupRequestDnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public CreateContainerGroupRequest setHostSecurityContext(CreateContainerGroupRequestHostSecurityContext hostSecurityContext) {
        this.hostSecurityContext = hostSecurityContext;
        return this;
    }
    public CreateContainerGroupRequestHostSecurityContext getHostSecurityContext() {
        return this.hostSecurityContext;
    }

    public CreateContainerGroupRequest setSecurityContext(CreateContainerGroupRequestSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }
    public CreateContainerGroupRequestSecurityContext getSecurityContext() {
        return this.securityContext;
    }

    public CreateContainerGroupRequest setAcrRegistryInfo(java.util.List<CreateContainerGroupRequestAcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestAcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public CreateContainerGroupRequest setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public CreateContainerGroupRequest setAutoCreateEip(Boolean autoCreateEip) {
        this.autoCreateEip = autoCreateEip;
        return this;
    }
    public Boolean getAutoCreateEip() {
        return this.autoCreateEip;
    }

    public CreateContainerGroupRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public CreateContainerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContainerGroupRequest setComputeCategory(java.util.List<String> computeCategory) {
        this.computeCategory = computeCategory;
        return this;
    }
    public java.util.List<String> getComputeCategory() {
        return this.computeCategory;
    }

    public CreateContainerGroupRequest setContainer(java.util.List<CreateContainerGroupRequestContainer> container) {
        this.container = container;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestContainer> getContainer() {
        return this.container;
    }

    public CreateContainerGroupRequest setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        return this;
    }
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public CreateContainerGroupRequest setContainerResourceView(Boolean containerResourceView) {
        this.containerResourceView = containerResourceView;
        return this;
    }
    public Boolean getContainerResourceView() {
        return this.containerResourceView;
    }

    public CreateContainerGroupRequest setCorePattern(String corePattern) {
        this.corePattern = corePattern;
        return this;
    }
    public String getCorePattern() {
        return this.corePattern;
    }

    public CreateContainerGroupRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateContainerGroupRequest setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    public CreateContainerGroupRequest setCpuOptionsCore(Integer cpuOptionsCore) {
        this.cpuOptionsCore = cpuOptionsCore;
        return this;
    }
    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    public CreateContainerGroupRequest setCpuOptionsNuma(String cpuOptionsNuma) {
        this.cpuOptionsNuma = cpuOptionsNuma;
        return this;
    }
    public String getCpuOptionsNuma() {
        return this.cpuOptionsNuma;
    }

    public CreateContainerGroupRequest setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
        this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
        return this;
    }
    public Integer getCpuOptionsThreadsPerCore() {
        return this.cpuOptionsThreadsPerCore;
    }

    public CreateContainerGroupRequest setDataCacheBucket(String dataCacheBucket) {
        this.dataCacheBucket = dataCacheBucket;
        return this;
    }
    public String getDataCacheBucket() {
        return this.dataCacheBucket;
    }

    public CreateContainerGroupRequest setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
        this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
        return this;
    }
    public Boolean getDataCacheBurstingEnabled() {
        return this.dataCacheBurstingEnabled;
    }

    public CreateContainerGroupRequest setDataCachePL(String dataCachePL) {
        this.dataCachePL = dataCachePL;
        return this;
    }
    public String getDataCachePL() {
        return this.dataCachePL;
    }

    public CreateContainerGroupRequest setDataCacheProvisionedIops(Long dataCacheProvisionedIops) {
        this.dataCacheProvisionedIops = dataCacheProvisionedIops;
        return this;
    }
    public Long getDataCacheProvisionedIops() {
        return this.dataCacheProvisionedIops;
    }

    public CreateContainerGroupRequest setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public CreateContainerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateContainerGroupRequest setEgressBandwidth(Long egressBandwidth) {
        this.egressBandwidth = egressBandwidth;
        return this;
    }
    public Long getEgressBandwidth() {
        return this.egressBandwidth;
    }

    public CreateContainerGroupRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public CreateContainerGroupRequest setEipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
        this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
        return this;
    }
    public String getEipCommonBandwidthPackage() {
        return this.eipCommonBandwidthPackage;
    }

    public CreateContainerGroupRequest setEipISP(String eipISP) {
        this.eipISP = eipISP;
        return this;
    }
    public String getEipISP() {
        return this.eipISP;
    }

    public CreateContainerGroupRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public CreateContainerGroupRequest setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public CreateContainerGroupRequest setFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
        return this;
    }
    public String getFixedIp() {
        return this.fixedIp;
    }

    public CreateContainerGroupRequest setFixedIpRetainHour(Integer fixedIpRetainHour) {
        this.fixedIpRetainHour = fixedIpRetainHour;
        return this;
    }
    public Integer getFixedIpRetainHour() {
        return this.fixedIpRetainHour;
    }

    public CreateContainerGroupRequest setHostAliase(java.util.List<CreateContainerGroupRequestHostAliase> hostAliase) {
        this.hostAliase = hostAliase;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestHostAliase> getHostAliase() {
        return this.hostAliase;
    }

    public CreateContainerGroupRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateContainerGroupRequest setImageAccelerateMode(String imageAccelerateMode) {
        this.imageAccelerateMode = imageAccelerateMode;
        return this;
    }
    public String getImageAccelerateMode() {
        return this.imageAccelerateMode;
    }

    public CreateContainerGroupRequest setImageRegistryCredential(java.util.List<CreateContainerGroupRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public CreateContainerGroupRequest setImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        return this;
    }
    public String getImageSnapshotId() {
        return this.imageSnapshotId;
    }

    public CreateContainerGroupRequest setIngressBandwidth(Long ingressBandwidth) {
        this.ingressBandwidth = ingressBandwidth;
        return this;
    }
    public Long getIngressBandwidth() {
        return this.ingressBandwidth;
    }

    public CreateContainerGroupRequest setInitContainer(java.util.List<CreateContainerGroupRequestInitContainer> initContainer) {
        this.initContainer = initContainer;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestInitContainer> getInitContainer() {
        return this.initContainer;
    }

    public CreateContainerGroupRequest setInsecureRegistry(String insecureRegistry) {
        this.insecureRegistry = insecureRegistry;
        return this;
    }
    public String getInsecureRegistry() {
        return this.insecureRegistry;
    }

    public CreateContainerGroupRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateContainerGroupRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateContainerGroupRequest setIpv6GatewayBandwidth(String ipv6GatewayBandwidth) {
        this.ipv6GatewayBandwidth = ipv6GatewayBandwidth;
        return this;
    }
    public String getIpv6GatewayBandwidth() {
        return this.ipv6GatewayBandwidth;
    }

    public CreateContainerGroupRequest setIpv6GatewayBandwidthEnable(Boolean ipv6GatewayBandwidthEnable) {
        this.ipv6GatewayBandwidthEnable = ipv6GatewayBandwidthEnable;
        return this;
    }
    public Boolean getIpv6GatewayBandwidthEnable() {
        return this.ipv6GatewayBandwidthEnable;
    }

    public CreateContainerGroupRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public CreateContainerGroupRequest setNtpServer(java.util.List<String> ntpServer) {
        this.ntpServer = ntpServer;
        return this;
    }
    public java.util.List<String> getNtpServer() {
        return this.ntpServer;
    }

    public CreateContainerGroupRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateContainerGroupRequest setOverheadReservationOption(CreateContainerGroupRequestOverheadReservationOption overheadReservationOption) {
        this.overheadReservationOption = overheadReservationOption;
        return this;
    }
    public CreateContainerGroupRequestOverheadReservationOption getOverheadReservationOption() {
        return this.overheadReservationOption;
    }

    public CreateContainerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateContainerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateContainerGroupRequest setPlainHttpRegistry(String plainHttpRegistry) {
        this.plainHttpRegistry = plainHttpRegistry;
        return this;
    }
    public String getPlainHttpRegistry() {
        return this.plainHttpRegistry;
    }

    public CreateContainerGroupRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateContainerGroupRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateContainerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateContainerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateContainerGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateContainerGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateContainerGroupRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public CreateContainerGroupRequest setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }
    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

    public CreateContainerGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateContainerGroupRequest setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
        return this;
    }
    public Boolean getShareProcessNamespace() {
        return this.shareProcessNamespace;
    }

    public CreateContainerGroupRequest setSpotDuration(Long spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Long getSpotDuration() {
        return this.spotDuration;
    }

    public CreateContainerGroupRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateContainerGroupRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateContainerGroupRequest setStrictSpot(Boolean strictSpot) {
        this.strictSpot = strictSpot;
        return this;
    }
    public Boolean getStrictSpot() {
        return this.strictSpot;
    }

    public CreateContainerGroupRequest setTag(java.util.List<CreateContainerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateContainerGroupRequest setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateContainerGroupRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateContainerGroupRequest setVolume(java.util.List<CreateContainerGroupRequestVolume> volume) {
        this.volume = volume;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestVolume> getVolume() {
        return this.volume;
    }

    public CreateContainerGroupRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateContainerGroupRequestDnsConfigOption extends TeaModel {
        /**
         * <p>The name of the option.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the option.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestDnsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestDnsConfigOption self = new CreateContainerGroupRequestDnsConfigOption();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestDnsConfigOption setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestDnsConfigOption setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestDnsConfig extends TeaModel {
        /**
         * <p>The IP addresses of the DNS servers.</p>
         */
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        /**
         * <p>Configuration options of the DNS server.</p>
         */
        @NameInMap("Option")
        public java.util.List<CreateContainerGroupRequestDnsConfigOption> option;

        /**
         * <p>The search domains of the DNS server.</p>
         */
        @NameInMap("Search")
        public java.util.List<String> search;

        public static CreateContainerGroupRequestDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestDnsConfig self = new CreateContainerGroupRequestDnsConfig();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestDnsConfig setNameServer(java.util.List<String> nameServer) {
            this.nameServer = nameServer;
            return this;
        }
        public java.util.List<String> getNameServer() {
            return this.nameServer;
        }

        public CreateContainerGroupRequestDnsConfig setOption(java.util.List<CreateContainerGroupRequestDnsConfigOption> option) {
            this.option = option;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestDnsConfigOption> getOption() {
            return this.option;
        }

        public CreateContainerGroupRequestDnsConfig setSearch(java.util.List<String> search) {
            this.search = search;
            return this;
        }
        public java.util.List<String> getSearch() {
            return this.search;
        }

    }

    public static class CreateContainerGroupRequestHostSecurityContextSysctl extends TeaModel {
        /**
         * <p>The key of the unsafe sysctl when you modify sysctls by configuring a security context. Valid values:</p>
         * <br>
         * <p>*   kernel.shm \* (except kernel.shm_rmid_forced)</p>
         * <p>*   kernel.msg\*kernel.sem</p>
         * <p>*   fs.mqueue.\*</p>
         * <p>*   net.\*(except net.ipv4.tcp_syncookies, net.ipv4.ping_group_range, and net.ipv4.ip_unprivileged_port_start)</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the unsafe sysctl when you modify sysctls by configuring a security context.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestHostSecurityContextSysctl build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestHostSecurityContextSysctl self = new CreateContainerGroupRequestHostSecurityContextSysctl();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestHostSecurityContextSysctl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestHostSecurityContextSysctl setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestHostSecurityContext extends TeaModel {
        /**
         * <p>Configure a security context to modify unsafe sysctls. For more information, see [Configure a security context](~~462313~~).</p>
         */
        @NameInMap("Sysctl")
        public java.util.List<CreateContainerGroupRequestHostSecurityContextSysctl> sysctl;

        public static CreateContainerGroupRequestHostSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestHostSecurityContext self = new CreateContainerGroupRequestHostSecurityContext();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestHostSecurityContext setSysctl(java.util.List<CreateContainerGroupRequestHostSecurityContextSysctl> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestHostSecurityContextSysctl> getSysctl() {
            return this.sysctl;
        }

    }

    public static class CreateContainerGroupRequestSecurityContextSysctl extends TeaModel {
        /**
         * <p>The name of the safe sysctl when you configure a security context to modify sysctls. Valid values:</p>
         * <br>
         * <p>*   net.ipv4.ping_group_range</p>
         * <p>*   net.ipv4.ip_unprivileged_port_start</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the safe sysctl when you configure a security context to modify sysctls.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestSecurityContextSysctl build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestSecurityContextSysctl self = new CreateContainerGroupRequestSecurityContextSysctl();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestSecurityContextSysctl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestSecurityContextSysctl setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestSecurityContext extends TeaModel {
        /**
         * <p>Configure a security context to modify sysctls. For more information, see [Configure a security context](~~462313~~)</p>
         */
        @NameInMap("Sysctl")
        public java.util.List<CreateContainerGroupRequestSecurityContextSysctl> sysctl;

        public static CreateContainerGroupRequestSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestSecurityContext self = new CreateContainerGroupRequestSecurityContext();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestSecurityContext setSysctl(java.util.List<CreateContainerGroupRequestSecurityContextSysctl> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestSecurityContextSysctl> getSysctl() {
            return this.sysctl;
        }

    }

    public static class CreateContainerGroupRequestAcrRegistryInfo extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM roles in the Alibaba Cloud account to which the elastic container instance belongs.</p>
         */
        @NameInMap("ArnService")
        public String arnService;

        /**
         * <p>The ARN of the RAM roles in the Alibaba Cloud account to which the Container Registry instance belongs.</p>
         */
        @NameInMap("ArnUser")
        public String arnUser;

        /**
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("Domain")
        public java.util.List<String> domain;

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

        public static CreateContainerGroupRequestAcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestAcrRegistryInfo self = new CreateContainerGroupRequestAcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestAcrRegistryInfo setArnService(String arnService) {
            this.arnService = arnService;
            return this;
        }
        public String getArnService() {
            return this.arnService;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setArnUser(String arnUser) {
            this.arnUser = arnUser;
            return this;
        }
        public String getArnUser() {
            return this.arnUser;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbeExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static CreateContainerGroupRequestContainerLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeExec self = new CreateContainerGroupRequestContainerLivenessProbeExec();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLivenessProbeExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static CreateContainerGroupRequestContainerLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeHttpGet self = new CreateContainerGroupRequestContainerLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateContainerGroupRequestContainerLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestContainerLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestContainerLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeTcpSocket self = new CreateContainerGroupRequestContainerLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLivenessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbe extends TeaModel {
        @NameInMap("Exec")
        public CreateContainerGroupRequestContainerLivenessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public CreateContainerGroupRequestContainerLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public CreateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateContainerGroupRequestContainerLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbe self = new CreateContainerGroupRequestContainerLivenessProbe();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLivenessProbe setExec(CreateContainerGroupRequestContainerLivenessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbeExec getExec() {
            return this.exec;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setHttpGet(CreateContainerGroupRequestContainerLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setTcpSocket(CreateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static CreateContainerGroupRequestContainerReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeExec self = new CreateContainerGroupRequestContainerReadinessProbeExec();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerReadinessProbeExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static CreateContainerGroupRequestContainerReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeHttpGet self = new CreateContainerGroupRequestContainerReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateContainerGroupRequestContainerReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestContainerReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestContainerReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeTcpSocket self = new CreateContainerGroupRequestContainerReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        public CreateContainerGroupRequestContainerReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public CreateContainerGroupRequestContainerReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public CreateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateContainerGroupRequestContainerReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbe self = new CreateContainerGroupRequestContainerReadinessProbe();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerReadinessProbe setExec(CreateContainerGroupRequestContainerReadinessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public CreateContainerGroupRequestContainerReadinessProbeExec getExec() {
            return this.exec;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setHttpGet(CreateContainerGroupRequestContainerReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public CreateContainerGroupRequestContainerReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setTcpSocket(CreateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public CreateContainerGroupRequestContainerReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class CreateContainerGroupRequestContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static CreateContainerGroupRequestContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerSecurityContextCapability self = new CreateContainerGroupRequestContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerSecurityContextCapability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class CreateContainerGroupRequestContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public CreateContainerGroupRequestContainerSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static CreateContainerGroupRequestContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerSecurityContext self = new CreateContainerGroupRequestContainerSecurityContext();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerSecurityContext setCapability(CreateContainerGroupRequestContainerSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public CreateContainerGroupRequestContainerSecurityContextCapability getCapability() {
            return this.capability;
        }

        public CreateContainerGroupRequestContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public CreateContainerGroupRequestContainerSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class CreateContainerGroupRequestContainerEnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static CreateContainerGroupRequestContainerEnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerEnvironmentVarFieldRef self = new CreateContainerGroupRequestContainerEnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerEnvironmentVarFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class CreateContainerGroupRequestContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        public CreateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef;

        /**
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length, and can contain letters, digits, and underscores (\_). It cannot start with a digit.``</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerEnvironmentVar self = new CreateContainerGroupRequestContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerEnvironmentVar setFieldRef(CreateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public CreateContainerGroupRequestContainerEnvironmentVarFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public CreateContainerGroupRequestContainerEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateContainerGroupRequestContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader extends TeaModel {
        /**
         * <p>The key of the custom field in the HTTP GET request header when you use HTTP requests to specify the postStart callback function.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the custom field in the HTTP GET request header when you use HTTP requests to specify the postStart callback function.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader self = new CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        /**
         * <p>The key of the custom field in the HTTP GET request header when you use HTTP requests to specify the preStop callback function.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the custom field in the HTTP GET request header when you use HTTP requests to specify the preStop callback function.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader self = new CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestContainerPort extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static CreateContainerGroupRequestContainerPort build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerPort self = new CreateContainerGroupRequestContainerPort();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateContainerGroupRequestContainerVolumeMount extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted.</p>
         * <br>
         * <p>>  The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: This volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.</p>
         * <p>*   HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.</p>
         * <p>*   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives subsequent mounts that are performed on the volume or the subdirectories of the volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.</p>
         * <br>
         * <p>Default value: None.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. This parameter is the same as Name in the Volume object.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the volume is read-only. Default value: false.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static CreateContainerGroupRequestContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerVolumeMount self = new CreateContainerGroupRequestContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateContainerGroupRequestContainerVolumeMount setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public CreateContainerGroupRequestContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestContainerVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateContainerGroupRequestContainerVolumeMount setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class CreateContainerGroupRequestContainer extends TeaModel {
        @NameInMap("LivenessProbe")
        public CreateContainerGroupRequestContainerLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public CreateContainerGroupRequestContainerReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        public CreateContainerGroupRequestContainerSecurityContext securityContext;

        /**
         * <p>The arguments that are passed to the startup command of the container. You can specify a maximum of 10 arguments.</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The commands that you want to run to perform checks in containers.</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that you want to allocate to the container. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variable of the container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> environmentVar;

        /**
         * <p>Specifies whether to hide the information about the environment variable when you query the details of an elastic container instance (ECI). Valid values:</p>
         * <br>
         * <p>*   false (default): does not hide the information about the environment variable.</p>
         * <p>*   true: does not return the information about the environment variable. If the environment variable contains sensitive information, you can set this parameter to true to improve the security of the information.</p>
         */
        @NameInMap("EnvironmentVarHide")
        public Boolean environmentVarHide;

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
         * <p>The policy that you want to use to pull an image. Valid values:</p>
         * <br>
         * <p>*   Always: Image pulling is always performed.</p>
         * <p>*   IfNotPresent: On-premises images are used first. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: Image pulling is not performed. On-premises images are always used.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The commands to be executed in containers when you use the CLI to specify the postStart callback function.</p>
         */
        @NameInMap("LifecyclePostStartHandlerExec")
        public java.util.List<String> lifecyclePostStartHandlerExec;

        /**
         * <p>The IP address of the host that receives HTTP GET requests when you use HTTP requests to specify the postStart callback function.</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The HTTP GET request header.</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeader")
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader;

        /**
         * <p>The path to which HTTP GET requests are sent when you use HTTP requests to specify the postStart callback function.</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port to which HTTP GET requests are sent when you use HTTP requests to specify the postStart callback function.</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The protocol type of HTTP GET requests when you use HTTP requests to specify the postStart callback function. Valid values:</p>
         * <br>
         * <p>*   HTTP</p>
         * <p>*   HTTPS</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <p>The port that is detected by TCP sockets when you use TCP sockets to specify the postStart callback function.</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port that is detected by TCP sockets when you use TCP sockets to specify the postStart callback function.</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The commands to be executed in containers when you use the CLI to specify the preStop callback function.</p>
         */
        @NameInMap("LifecyclePreStopHandlerExec")
        public java.util.List<String> lifecyclePreStopHandlerExec;

        /**
         * <p>The IP address of the host that receives HTTP GET requests when you use HTTP requests to specify the preStop callback function.</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The HTTP GET request header.</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        /**
         * <p>The path to which HTTP GET requests are sent when you use HTTP requests to specify the preStop callback function.</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port to which HTTP GET requests are sent when you use HTTP requests to specify the preStop callback function.</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type of HTTP GET requests when you use HTTP requests to specify the preStop callback function. Valid values:</p>
         * <br>
         * <p>*   HTTP</p>
         * <p>*   HTTPS</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        /**
         * <p>The host IP address that is detected by TCP sockets when you use TCP sockets to specify the preStop callback function.</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port that is detected by TCP sockets when you use TCP sockets to specify the preStop callback function.</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The memory size of the container. Unit: GiB</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port to which HTTP GET requests are sent when you use HTTP requests to perform health checks.</p>
         */
        @NameInMap("Port")
        public java.util.List<CreateContainerGroupRequestContainerPort> port;

        @NameInMap("SecurityContextRunAsGroup")
        public Long securityContextRunAsGroup;

        @NameInMap("SecurityContextRunAsNonRoot")
        public Boolean securityContextRunAsNonRoot;

        /**
         * <p>Specifies whether the container allocates a buffer for standard input in the container runtime. If you do not specify this parameter, an end-of-file (EOF) error occurs when standard input in the container is read. Default value: false.</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether to keep the standard input stream open in the container runtime across multiple attach sessions if Stdin is set to true.\</p>
         * <p>If StdinOnce is set to true, the standard input stream is opened when the container is started, remains empty until the first client is attached to standard input, and then remains open and receives data until the client is disconnected. When the client is disconnected, the standard input stream is closed and remains closed until the container is restarted.</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>The path of the file from which the system retrieves termination messages of the container when the container exits.</p>
         */
        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        /**
         * <p>The message notification policy. This parameter is empty by default. You can use only Message Service (MNS) queues to configure notifications.</p>
         */
        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        /**
         * <p>Specifies whether to enable interaction. Default value: false.</p>
         * <br>
         * <p>If you set Command to /bin/bash, you must set this parameter to true.</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The information about the volume that you want to mount on the container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<CreateContainerGroupRequestContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the container.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static CreateContainerGroupRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainer self = new CreateContainerGroupRequestContainer();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainer setLivenessProbe(CreateContainerGroupRequestContainerLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public CreateContainerGroupRequestContainer setReadinessProbe(CreateContainerGroupRequestContainerReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public CreateContainerGroupRequestContainerReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public CreateContainerGroupRequestContainer setSecurityContext(CreateContainerGroupRequestContainerSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public CreateContainerGroupRequestContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public CreateContainerGroupRequestContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public CreateContainerGroupRequestContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateContainerGroupRequestContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public CreateContainerGroupRequestContainer setEnvironmentVar(java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public CreateContainerGroupRequestContainer setEnvironmentVarHide(Boolean environmentVarHide) {
            this.environmentVarHide = environmentVarHide;
            return this;
        }
        public Boolean getEnvironmentVarHide() {
            return this.environmentVarHide;
        }

        public CreateContainerGroupRequestContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateContainerGroupRequestContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateContainerGroupRequestContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerExec(java.util.List<String> lifecyclePostStartHandlerExec) {
            this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHttpHeader(java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader) {
            this.lifecyclePostStartHandlerHttpGetHttpHeader = lifecyclePostStartHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> getLifecyclePostStartHandlerHttpGetHttpHeader() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeader;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerExec(java.util.List<String> lifecyclePreStopHandlerExec) {
            this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHttpHeader(java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
            this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public CreateContainerGroupRequestContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public CreateContainerGroupRequestContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestContainer setPort(java.util.List<CreateContainerGroupRequestContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerPort> getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestContainer setSecurityContextRunAsGroup(Long securityContextRunAsGroup) {
            this.securityContextRunAsGroup = securityContextRunAsGroup;
            return this;
        }
        public Long getSecurityContextRunAsGroup() {
            return this.securityContextRunAsGroup;
        }

        public CreateContainerGroupRequestContainer setSecurityContextRunAsNonRoot(Boolean securityContextRunAsNonRoot) {
            this.securityContextRunAsNonRoot = securityContextRunAsNonRoot;
            return this;
        }
        public Boolean getSecurityContextRunAsNonRoot() {
            return this.securityContextRunAsNonRoot;
        }

        public CreateContainerGroupRequestContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public CreateContainerGroupRequestContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public CreateContainerGroupRequestContainer setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        public CreateContainerGroupRequestContainer setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        public CreateContainerGroupRequestContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public CreateContainerGroupRequestContainer setVolumeMount(java.util.List<CreateContainerGroupRequestContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public CreateContainerGroupRequestContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateContainerGroupRequestHostAliase extends TeaModel {
        /**
         * <p>The hostname of the elastic container instance.</p>
         */
        @NameInMap("Hostname")
        public java.util.List<String> hostname;

        /**
         * <p>The IP address of the host.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static CreateContainerGroupRequestHostAliase build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestHostAliase self = new CreateContainerGroupRequestHostAliase();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestHostAliase setHostname(java.util.List<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public java.util.List<String> getHostname() {
            return this.hostname;
        }

        public CreateContainerGroupRequestHostAliase setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class CreateContainerGroupRequestImageRegistryCredential extends TeaModel {
        /**
         * <p>The password that you use to access the image repository.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The address of the image repository.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that you use to access the image repository.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateContainerGroupRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestImageRegistryCredential self = new CreateContainerGroupRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestImageRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateContainerGroupRequestImageRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public CreateContainerGroupRequestImageRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateContainerGroupRequestInitContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static CreateContainerGroupRequestInitContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerSecurityContextCapability self = new CreateContainerGroupRequestInitContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerSecurityContextCapability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class CreateContainerGroupRequestInitContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public CreateContainerGroupRequestInitContainerSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static CreateContainerGroupRequestInitContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerSecurityContext self = new CreateContainerGroupRequestInitContainerSecurityContext();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerSecurityContext setCapability(CreateContainerGroupRequestInitContainerSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public CreateContainerGroupRequestInitContainerSecurityContextCapability getCapability() {
            return this.capability;
        }

        public CreateContainerGroupRequestInitContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public CreateContainerGroupRequestInitContainerSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef self = new CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class CreateContainerGroupRequestInitContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        public CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef;

        /**
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length, and can contain letters, digits, and underscores (\_). It cannot start with a digit.``</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestInitContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerEnvironmentVar self = new CreateContainerGroupRequestInitContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerEnvironmentVar setFieldRef(CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public CreateContainerGroupRequestInitContainerEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateContainerGroupRequestInitContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestInitContainerPort extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <br>
         * <p>*   TCP</p>
         * <p>*   UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static CreateContainerGroupRequestInitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerPort self = new CreateContainerGroupRequestInitContainerPort();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestInitContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class CreateContainerGroupRequestInitContainerVolumeMount extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted. The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to the volume or to the subdirectories of the volume.</p>
         * <p>*   HostToCotainer: The volume mount receives subsequent mounts that are mounted to the volume or to the subdirectories of the volume.</p>
         * <p>*   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives subsequent mounts that are mounted to the volume or to the subdirectories of the volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.</p>
         * <br>
         * <p>Default value: None.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the mount path is read-only. Default value: false.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. The pod can mount different directories of the same volume to different directories of the init container.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static CreateContainerGroupRequestInitContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerVolumeMount self = new CreateContainerGroupRequestInitContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateContainerGroupRequestInitContainerVolumeMount setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public CreateContainerGroupRequestInitContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestInitContainerVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateContainerGroupRequestInitContainerVolumeMount setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class CreateContainerGroupRequestInitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        public CreateContainerGroupRequestInitContainerSecurityContext securityContext;

        /**
         * <p>The arguments that are passed to the startup command of the init container.</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The startup commands of the init container.</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that you want to allocate to the init container. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variable of the init container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> environmentVar;

        /**
         * <p>The number of GPUs that you want to allocate to the init container.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the init container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The policy for image pulling. Valid values:</p>
         * <br>
         * <p>*   Always: Each time instances are created, image pulling is performed.</p>
         * <p>*   IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: On-premises images are always used. Image pulling is not performed.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The memory size of the init container. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port number of the init container.</p>
         */
        @NameInMap("Port")
        public java.util.List<CreateContainerGroupRequestInitContainerPort> port;

        /**
         * <p>The path of the file from which the system retrieves termination messages of the init container when the init container exits.</p>
         */
        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        /**
         * <p>The message notification policy. This parameter is empty by default.</p>
         */
        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        /**
         * <p>The information about the volume that you want to mount on the init container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the init container.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static CreateContainerGroupRequestInitContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainer self = new CreateContainerGroupRequestInitContainer();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainer setSecurityContext(CreateContainerGroupRequestInitContainerSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public CreateContainerGroupRequestInitContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public CreateContainerGroupRequestInitContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public CreateContainerGroupRequestInitContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateContainerGroupRequestInitContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public CreateContainerGroupRequestInitContainer setEnvironmentVar(java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public CreateContainerGroupRequestInitContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateContainerGroupRequestInitContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateContainerGroupRequestInitContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public CreateContainerGroupRequestInitContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public CreateContainerGroupRequestInitContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestInitContainer setPort(java.util.List<CreateContainerGroupRequestInitContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestInitContainerPort> getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestInitContainer setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        public CreateContainerGroupRequestInitContainer setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        public CreateContainerGroupRequestInitContainer setVolumeMount(java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public CreateContainerGroupRequestInitContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class CreateContainerGroupRequestOverheadReservationOption extends TeaModel {
        @NameInMap("EnableOverheadReservation")
        public Boolean enableOverheadReservation;

        public static CreateContainerGroupRequestOverheadReservationOption build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestOverheadReservationOption self = new CreateContainerGroupRequestOverheadReservationOption();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestOverheadReservationOption setEnableOverheadReservation(Boolean enableOverheadReservation) {
            this.enableOverheadReservation = enableOverheadReservation;
            return this;
        }
        public Boolean getEnableOverheadReservation() {
            return this.enableOverheadReservation;
        }

    }

    public static class CreateContainerGroupRequestTag extends TeaModel {
        /**
         * <p>The key of a tag. The tag key cannot be an empty string and must be unique. The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestTag self = new CreateContainerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateContainerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("Path")
        public String path;

        public static CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath self = new CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateContainerGroupRequestVolumeConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        public java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath;

        @NameInMap("DefaultMode")
        public Integer defaultMode;

        public static CreateContainerGroupRequestVolumeConfigFileVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeConfigFileVolume self = new CreateContainerGroupRequestVolumeConfigFileVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeConfigFileVolume setConfigFileToPath(java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath) {
            this.configFileToPath = configFileToPath;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> getConfigFileToPath() {
            return this.configFileToPath;
        }

        public CreateContainerGroupRequestVolumeConfigFileVolume setDefaultMode(Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Integer getDefaultMode() {
            return this.defaultMode;
        }

    }

    public static class CreateContainerGroupRequestVolumeDiskVolume extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("FsType")
        public String fsType;

        public static CreateContainerGroupRequestVolumeDiskVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeDiskVolume self = new CreateContainerGroupRequestVolumeDiskVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeDiskVolume setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public CreateContainerGroupRequestVolumeDiskVolume setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public CreateContainerGroupRequestVolumeDiskVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

    }

    public static class CreateContainerGroupRequestVolumeEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static CreateContainerGroupRequestVolumeEmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeEmptyDirVolume self = new CreateContainerGroupRequestVolumeEmptyDirVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeEmptyDirVolume setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public CreateContainerGroupRequestVolumeEmptyDirVolume setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class CreateContainerGroupRequestVolumeFlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        public static CreateContainerGroupRequestVolumeFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeFlexVolume self = new CreateContainerGroupRequestVolumeFlexVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeFlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public CreateContainerGroupRequestVolumeFlexVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public CreateContainerGroupRequestVolumeFlexVolume setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

    public static class CreateContainerGroupRequestVolumeHostPathVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static CreateContainerGroupRequestVolumeHostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeHostPathVolume self = new CreateContainerGroupRequestVolumeHostPathVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeHostPathVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateContainerGroupRequestVolumeHostPathVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateContainerGroupRequestVolumeNFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Server")
        public String server;

        public static CreateContainerGroupRequestVolumeNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeNFSVolume self = new CreateContainerGroupRequestVolumeNFSVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeNFSVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateContainerGroupRequestVolumeNFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateContainerGroupRequestVolumeNFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class CreateContainerGroupRequestVolume extends TeaModel {
        @NameInMap("ConfigFileVolume")
        public CreateContainerGroupRequestVolumeConfigFileVolume configFileVolume;

        @NameInMap("DiskVolume")
        public CreateContainerGroupRequestVolumeDiskVolume diskVolume;

        @NameInMap("EmptyDirVolume")
        public CreateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        public CreateContainerGroupRequestVolumeFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        public CreateContainerGroupRequestVolumeHostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        public CreateContainerGroupRequestVolumeNFSVolume NFSVolume;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the volume when you set the Type parameter to HostPathVolume. Valid values:</p>
         * <br>
         * <p>*   Directory</p>
         * <p>*   File</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateContainerGroupRequestVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolume self = new CreateContainerGroupRequestVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolume setConfigFileVolume(CreateContainerGroupRequestVolumeConfigFileVolume configFileVolume) {
            this.configFileVolume = configFileVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeConfigFileVolume getConfigFileVolume() {
            return this.configFileVolume;
        }

        public CreateContainerGroupRequestVolume setDiskVolume(CreateContainerGroupRequestVolumeDiskVolume diskVolume) {
            this.diskVolume = diskVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeDiskVolume getDiskVolume() {
            return this.diskVolume;
        }

        public CreateContainerGroupRequestVolume setEmptyDirVolume(CreateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume) {
            this.emptyDirVolume = emptyDirVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeEmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        public CreateContainerGroupRequestVolume setFlexVolume(CreateContainerGroupRequestVolumeFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        public CreateContainerGroupRequestVolume setHostPathVolume(CreateContainerGroupRequestVolumeHostPathVolume hostPathVolume) {
            this.hostPathVolume = hostPathVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeHostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        public CreateContainerGroupRequestVolume setNFSVolume(CreateContainerGroupRequestVolumeNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeNFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        public CreateContainerGroupRequestVolume setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateContainerGroupRequestVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
