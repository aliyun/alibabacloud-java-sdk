// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupRequest extends TeaModel {
    @NameInMap("DnsConfig")
    public DnsConfig dnsConfig;

    @NameInMap("HostSecurityContext")
    public HostSecurityContext hostSecurityContext;

    @NameInMap("SecurityContext")
    public SecurityContext securityContext;

    /**
     * <p>The information about the Container Registry Enterprise Edition instance that provides the image for the creation of the elastic container instance. For more information, see <a href="https://help.aliyun.com/document_detail/194250.html">Pull images from a Container Registry Enterprise Edition instance without using a secret</a>.</p>
     */
    @NameInMap("AcrRegistryInfo")
    public java.util.List<AcrRegistryInfo> acrRegistryInfo;

    /**
     * <p>The active period of the elastic container instance. After this period expires, the instance is forced to exit. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    /**
     * <p>Specifies whether to automatically create an EIP and associate it with the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    /**
     * <p>Specifies whether to automatically match image caches. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-xxxx-12d3-xxxx-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The compute category of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/2638061.html">Specify a compute category to create an elastic container instance</a>.</p>
     */
    @NameInMap("ComputeCategory")
    public java.util.List<String> computeCategory;

    /**
     * <p>The information about the container.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Container")
    public java.util.List<Container> container;

    /**
     * <p>The name of the elastic container instance (container group). The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx-test</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>Specifies whether to enable container resource view. Container resource view displays the actual container resource data instead of data of the host. If the specifications of the generated elastic container instance are larger than the specifications that you request for when you create the instance, you can enable the ContainerResourceView feature to ensure that the resources that you view in the container are the same as the resources that you request for.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ContainerResourceView")
    public Boolean containerResourceView;

    /**
     * <p>The path to core dump files. For more information, see <a href="https://help.aliyun.com/document_detail/167801.html">Save core files to volumes</a>.</p>
     * <blockquote>
     * <p> The path cannot start with |. You cannot use core dump files to configure executable programs.``</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/xx/xx/core</p>
     */
    @NameInMap("CorePattern")
    public String corePattern;

    /**
     * <p>The number of vCPUs that you want to allocate to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The CPU architecture of the instance. Default value: AMD64. Valid values:</p>
     * <ul>
     * <li>AMD64</li>
     * <li>ARM64</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ARM64</p>
     */
    @NameInMap("CpuArchitecture")
    public String cpuArchitecture;

    /**
     * <p>The number of physical CPU cores. You can specify this parameter for only specific ECS instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CpuOptionsNuma")
    public String cpuOptionsNuma;

    /**
     * <p>The number of threads per core. You can specify this parameter for only specific ECS instance types. A value of 1 specifies that Hyper-Threading is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    /**
     * <p>The bucket that stores the data cache.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DataCacheBucket")
    public String dataCacheBucket;

    /**
     * <p>Specifies whether to enable the performance burst feature when ESSDs AutoPL are used to store data caches. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSDs AutoPL</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DataCacheBurstingEnabled")
    public Boolean dataCacheBurstingEnabled;

    /**
     * <p>The performance level (PL) of the disk that you want to use to store data caches.\
     * Enhanced SSDs (ESSDs) are preferentially used to store data caches. The default performance level is PL1.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("DataCachePL")
    public String dataCachePL;

    /**
     * <p>The input/output operations per second (IOPS) provisioned for ESSDs AutoPL when ESSDs AutoPL are used to store data caches.\
     * Valid values: 0 to min{50000, 1000 × Storage capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Storage capacity, 50,000}.\
     * For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSDs AutoPL</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>40000</p>
     */
    @NameInMap("DataCacheProvisionedIops")
    public Long dataCacheProvisionedIops;

    /**
     * <p>The Domain Name System (DNS) policy. Valid values:</p>
     * <ul>
     * <li>None: uses the DNS that is specified by DnsConfig.</li>
     * <li>Default: uses the DNS that is specified for the runtime environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and available resources. If the request passes the dry run, the DryRunOperation error code is returned. Otherwise, an error message is returned.</li>
     * <li>false (default): performs a dry run and performs the actual request. If the request passes the dry run, the elastic container instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The maximum outbound bandwidth. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    /**
     * <p>The maximum bandwidth value for the EIP. Unit: Mbit/s. Default value: 5.\
     * This parameter is valid only when AutoCreateEip is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    /**
     * <p>The EIP bandwidth plan that you want to associate with the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-2zeukbj916scmj51m****</p>
     */
    @NameInMap("EipCommonBandwidthPackage")
    public String eipCommonBandwidthPackage;

    /**
     * <p>The line type of the EIP. Default value: BGP. Valid values:</p>
     * <ul>
     * <li>BGP: BGP (Multi-ISP) line</li>
     * <li>BGP_PRO: BGP (Multi-ISP) Pro line</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BPG</p>
     */
    @NameInMap("EipISP")
    public String eipISP;

    /**
     * <p>The ID of the elastic IP address (EIP).</p>
     * 
     * <strong>example:</strong>
     * <p>eip-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    /**
     * <p>The increased capacity of the temporary storage space. Unit: GiB.\
     * For more information, see <a href="https://help.aliyun.com/document_detail/204066.html">Increase the size of the temporary storage space</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>Specifies whether to configure the instance to use a fixed IP address. For more information, see <a href="https://help.aliyun.com/document_detail/2381086.html">Configure an elastic container instance to use a fixed IP address</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FixedIp")
    public String fixedIp;

    /**
     * <p>The retention period of the fixed IP address after the original instance is released and the fixed IP address becomes idle. Unit: hours. Default value: 48.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("FixedIpRetainHour")
    public Integer fixedIpRetainHour;

    /**
     * <p>The version of the GPU driver. Default value: tesla=470.82.01. Valid values:</p>
     * <ul>
     * <li>tesla=470.82.01</li>
     * <li>tesla=525.85.12</li>
     * </ul>
     * <blockquote>
     * <p> You can switch the GPU driver version only for a few Elastic Compute Service (ECS) instance types. For more information, see <a href="https://help.aliyun.com/document_detail/2579486.html">Specify GPU-accelerated ECS instance types to create an elastic container instance</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tesla=525.85.12</p>
     */
    @NameInMap("GpuDriverVersion")
    public String gpuDriverVersion;

    /**
     * <p>The alias of the elastic container instance.</p>
     */
    @NameInMap("HostAliase")
    public java.util.List<HostAliase> hostAliase;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The image acceleration mode. Valid values:</p>
     * <ul>
     * <li>nydus: uses Nydus to accelerate image pulling. The images must support Nydus.</li>
     * <li>dadi: uses DADI to accelerate image pulling. The images must support DADI.</li>
     * <li>p2p: uses P2P to accelerate image pulling. The images must support p2p.</li>
     * <li>imc: uses image caches to accelerate image pulling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>imc</p>
     */
    @NameInMap("ImageAccelerateMode")
    public String imageAccelerateMode;

    /**
     * <p>The information about the logon credentials.</p>
     */
    @NameInMap("ImageRegistryCredential")
    public java.util.List<ImageRegistryCredential> imageRegistryCredential;

    /**
     * <p>The ID of the image cache. For more information, see <a href="https://help.aliyun.com/document_detail/141281.html">Use image caches to accelerate the creation of instances</a>.</p>
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
     * <p>The information about the init containers.</p>
     */
    @NameInMap("InitContainer")
    public java.util.List<InitContainer> initContainer;

    /**
     * <p>The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses a self-signed certificate, you must specify this parameter to skip the certificate authentication. This prevents image pull failures caused by certificate authentication failures.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;harbor***.pre.com,192.168.XX.XX:5000,reg***.test.com:80&quot;</p>
     */
    @NameInMap("InsecureRegistry")
    public String insecureRegistry;

    /**
     * <p>The ECS instance types that you specify to create the elastic container instance. Multiple instance types are supported. For more information, see <a href="https://help.aliyun.com/document_detail/114664.html">Specify ECS instance types to create an elastic container instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c5.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of IPv6 addresses that are assigned to the instance. Set the value to 1. You can assign only one IPv6 address to an elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The maximum IPv6 Internet bandwidth when you set Ipv6GatewayBandwidthEnable to true. Valid values:</p>
     * <ul>
     * <li><p>If the billing method for IPv6 network usage is pay-by-bandwidth, the maximum IPv6 Internet bandwidth ranges from 1 to 2,000 Mbit/s.</p>
     * </li>
     * <li><p>If the billing method for IPv6 network usage is pay-by-traffic, the maximum IPv6 Internet bandwidth varies based on the edition of the IPv6 gateway.</p>
     * <ul>
     * <li>If the IPv6 gateway is of Free Edition, the maximum IPv6 Internet bandwidth ranges from 1 to 200 Mbit/s.</li>
     * <li>If the IPv6 gateway is of Enterprise Edition, the maximum IPv6 Internet bandwidth ranges from 1 to 500 Mbit/s.</li>
     * <li>If the IPv6 gateway is of Enhanced Enterprise Edition, the maximum IPv6 Internet bandwidth ranges from 1 to 1000 Mbit/s.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>The default value is the maximum value in the Internet bandwidth range of the IPv6 gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Ipv6GatewayBandwidth")
    public String ipv6GatewayBandwidth;

    /**
     * <p>Specifies whether to enable Internet access to the elastic container instance over IPv6 addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ipv6GatewayBandwidthEnable")
    public Boolean ipv6GatewayBandwidthEnable;

    @NameInMap("MaxPendingMinute")
    public Integer maxPendingMinute;

    /**
     * <p>The memory size that you want to allocate to the instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The endpoints of the Network Time Protocol (NTP) servers.</p>
     * 
     * <strong>example:</strong>
     * <p>ntp.cloud.aliyuncs.com</p>
     */
    @NameInMap("NtpServer")
    public java.util.List<String> ntpServer;

    /**
     * <p>The operating system of the elastic container instance. Default value: Linux. Valid values:</p>
     * <ul>
     * <li>Linux</li>
     * <li>Windows</li>
     * </ul>
     * <blockquote>
     * <p> Windows instances are in invitational preview. To use the operating system, submit a ticket.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The address of the self-managed image repository. When you create an elastic container instance by using an image in a self-managed image repository that uses the HTTP protocol, you must specify this parameter. This way, Elastic Container Instance pulls the image over the HTTP protocol instead of the default HTTPS protocol. This prevents image pull failures caused by different protocols.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;harbor***.pre.com,192.168.XX.XX:5000,reg***.test.com:80&quot;</p>
     */
    @NameInMap("PlainHttpRegistry")
    public String plainHttpRegistry;

    /**
     * <p>The private IP address of the elastic container instance. Only IPv4 addresses are supported. Make sure that the IP address is idle.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.1</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance Resource Access Management (RAM) role. You can use the same RAM role to access elastic container instances and ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>RamTestRole</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The restart policy of the instance. Valid values:</p>
     * <ul>
     * <li>Always: Always restarts the instance if a container in the instance exits upon termination.</li>
     * <li>Never: Never restarts the instance if a container in the instance exits upon termination.</li>
     * <li>OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.</li>
     * </ul>
     * <p>Default value: Always.</p>
     * 
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The resource scheduling policy when you specify multiple zones to create an elastic container instance. To specify multiple zones, you can use the VSwitchId to specify multiple vSwitches. Valid values:</p>
     * <ul>
     * <li>VSwitchOrdered: The system schedules resources in the sequence of the vSwitches.</li>
     * <li>VSwitchRandom: The system schedules resources at random.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/157290.html">Specify multiple zones to create an elastic container instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>VSwitchOrdered</p>
     */
    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    /**
     * <p>The ID of the security group to which the instance belongs. Instances in the same security group can access each other.</p>
     * <p>If you do not specify a security group, the system automatically uses the default security group in the region that you selected. Make sure that the inbound rules of the security group contain the container protocols and port numbers that you want to expose. If you do not have a default security group in the region, the system creates a default security group, and then adds the container protocols and port numbers that you specified to the inbound rules of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Specifies whether to use a shared namespace. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShareProcessNamespace")
    public Boolean shareProcessNamespace;

    /**
     * <p>The protection period of the preemptible elastic container instance. Unit: hours. Default value: 1. A value of 0 indicates no protection period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Long spotDuration;

    /**
     * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
     * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0.025</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bid policy for the instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>Specifies whether to enable periodical execution.</p>
     * <ul>
     * <li>true: enables periodical execution.</li>
     * <li>false: disables periodical execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StrictSpot")
    public Boolean strictSpot;

    /**
     * <p>The tags that you want to add to the instance. You can bind a maximum of 20 tags. For more information, see <a href="https://help.aliyun.com/document_detail/146608.html">Use tags to manage elastic container instances</a>.</p>
     */
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    /**
     * <p>The buffer period of time during which the program handles operations before the program is stopped. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

    /**
     * <p>The IDs of the vSwitches that connect to the instance. You can specify up to 10 vSwitch IDs at a time. Separate multiple vSwitch IDs with commas (,). Example: <code>vsw-***,vsw-***</code>.</p>
     * <p>If you do not specify a vSwitch, the system automatically uses the default vSwitch in the default VPC in the region that you selected. If you do not have a default VPC or a default vSwitch in the region, the system automatically creates a default VPC and a default vSwitch.</p>
     * <blockquote>
     * <p> The number of IP addresses in the vSwitch CIDR block determines the maximum number of elastic container instances that you can create for the vSwitch. Before you create elastic container instances, you must plan the CIDR block of the vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1xpiowfm5vo8o3c****,vsw-bp1rkyjgr1xwoho6k****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The information about the volume that you want to mount to the container.</p>
     */
    @NameInMap("Volume")
    public java.util.List<Volume> volume;

    /**
     * <p>The zone ID of the instance. If you do not specify this parameter, the system selects a zone.</p>
     * <p>This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupRequest self = new CreateContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerGroupRequest setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public CreateContainerGroupRequest setHostSecurityContext(HostSecurityContext hostSecurityContext) {
        this.hostSecurityContext = hostSecurityContext;
        return this;
    }
    public HostSecurityContext getHostSecurityContext() {
        return this.hostSecurityContext;
    }

    public CreateContainerGroupRequest setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }
    public SecurityContext getSecurityContext() {
        return this.securityContext;
    }

    public CreateContainerGroupRequest setAcrRegistryInfo(java.util.List<AcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<AcrRegistryInfo> getAcrRegistryInfo() {
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

    public CreateContainerGroupRequest setContainer(java.util.List<Container> container) {
        this.container = container;
        return this;
    }
    public java.util.List<Container> getContainer() {
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

    public CreateContainerGroupRequest setGpuDriverVersion(String gpuDriverVersion) {
        this.gpuDriverVersion = gpuDriverVersion;
        return this;
    }
    public String getGpuDriverVersion() {
        return this.gpuDriverVersion;
    }

    public CreateContainerGroupRequest setHostAliase(java.util.List<HostAliase> hostAliase) {
        this.hostAliase = hostAliase;
        return this;
    }
    public java.util.List<HostAliase> getHostAliase() {
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

    public CreateContainerGroupRequest setImageRegistryCredential(java.util.List<ImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<ImageRegistryCredential> getImageRegistryCredential() {
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

    public CreateContainerGroupRequest setInitContainer(java.util.List<InitContainer> initContainer) {
        this.initContainer = initContainer;
        return this;
    }
    public java.util.List<InitContainer> getInitContainer() {
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

    public CreateContainerGroupRequest setMaxPendingMinute(Integer maxPendingMinute) {
        this.maxPendingMinute = maxPendingMinute;
        return this;
    }
    public Integer getMaxPendingMinute() {
        return this.maxPendingMinute;
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

    public CreateContainerGroupRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
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

    public CreateContainerGroupRequest setVolume(java.util.List<Volume> volume) {
        this.volume = volume;
        return this;
    }
    public java.util.List<Volume> getVolume() {
        return this.volume;
    }

    public CreateContainerGroupRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class Option extends TeaModel {
        /**
         * <p>The name of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static Option build(java.util.Map<String, ?> map) throws Exception {
            Option self = new Option();
            return TeaModel.build(map, self);
        }

        public Option setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Option setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DnsConfig extends TeaModel {
        /**
         * <p>The IP addresses of DNS servers.</p>
         * 
         * <strong>example:</strong>
         * <p>172.10.<em>.</em>*</p>
         */
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        /**
         * <p>Configuration options of the DNS server.</p>
         */
        @NameInMap("Option")
        public java.util.List<Option> option;

        /**
         * <p>The search domains of DNS servers.</p>
         * 
         * <strong>example:</strong>
         * <p>svc.local.kubenetes</p>
         */
        @NameInMap("Search")
        public java.util.List<String> search;

        public static DnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DnsConfig self = new DnsConfig();
            return TeaModel.build(map, self);
        }

        public DnsConfig setNameServer(java.util.List<String> nameServer) {
            this.nameServer = nameServer;
            return this;
        }
        public java.util.List<String> getNameServer() {
            return this.nameServer;
        }

        public DnsConfig setOption(java.util.List<Option> option) {
            this.option = option;
            return this;
        }
        public java.util.List<Option> getOption() {
            return this.option;
        }

        public DnsConfig setSearch(java.util.List<String> search) {
            this.search = search;
            return this;
        }
        public java.util.List<String> getSearch() {
            return this.search;
        }

    }

    public static class Sysctl extends TeaModel {
        /**
         * <p>The name of the unsafe sysctl when you modify sysctls by configuring a security context. Valid values:</p>
         * <ul>
         * <li>kernel.shm \* (except kernel.shm_rmid_forced)</li>
         * <li>kernel.msg\*</li>
         * <li>kernel.sem</li>
         * <li>fs.mqueue.\*</li>
         * <li>net.\*(except net.ipv4.tcp_syncookies, net.ipv4.ping_group_range, and net.ipv4.ip_unprivileged_port_start)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the unsafe sysctl when you modify sysctls by configuring a security context.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("Value")
        public String value;

        public static Sysctl build(java.util.Map<String, ?> map) throws Exception {
            Sysctl self = new Sysctl();
            return TeaModel.build(map, self);
        }

        public Sysctl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Sysctl setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HostSecurityContext extends TeaModel {
        /**
         * <p>Configure a security context to modify unsafe sysctls. For more information, see <a href="https://help.aliyun.com/document_detail/462313.html">Configure a security context</a>.</p>
         */
        @NameInMap("Sysctl")
        public java.util.List<Sysctl> sysctl;

        public static HostSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            HostSecurityContext self = new HostSecurityContext();
            return TeaModel.build(map, self);
        }

        public HostSecurityContext setSysctl(java.util.List<Sysctl> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.List<Sysctl> getSysctl() {
            return this.sysctl;
        }

    }

    public static class SecurityContextSysctl extends TeaModel {
        /**
         * <p>The name of the safe sysctl when you modify sysctls by configuring a security context. Valid values:</p>
         * <ul>
         * <li>net.ipv4.ping_group_range</li>
         * <li>net.ipv4.ip_unprivileged_port_start</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the safe sysctl when you modify sysctls by configuring a security context.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("Value")
        public String value;

        public static SecurityContextSysctl build(java.util.Map<String, ?> map) throws Exception {
            SecurityContextSysctl self = new SecurityContextSysctl();
            return TeaModel.build(map, self);
        }

        public SecurityContextSysctl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SecurityContextSysctl setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SecurityContext extends TeaModel {
        /**
         * <p>Configure a security context to modify safe sysctls. For more information, see <a href="https://help.aliyun.com/document_detail/462313.html">Configure a security context</a>.</p>
         */
        @NameInMap("Sysctl")
        public java.util.List<SecurityContextSysctl> sysctl;

        public static SecurityContext build(java.util.Map<String, ?> map) throws Exception {
            SecurityContext self = new SecurityContext();
            return TeaModel.build(map, self);
        }

        public SecurityContext setSysctl(java.util.List<SecurityContextSysctl> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.List<SecurityContextSysctl> getSysctl() {
            return this.sysctl;
        }

    }

    public static class AcrRegistryInfo extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role in the Alibaba Cloud account to which the elastic container instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1609982529******:role/role-assume</p>
         */
        @NameInMap("ArnService")
        public String arnService;

        /**
         * <p>The ARN of the RAM role in the Alibaba Cloud account to which the Container Registry Enterprise Edition instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1298452580******:role/role-acr</p>
         */
        @NameInMap("ArnUser")
        public String arnUser;

        /**
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify multiple domain names. Separate multiple domain names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>*****-****-registry.cn-beijing.cr.aliyuncs.com</p>
         */
        @NameInMap("Domain")
        public java.util.List<String> domain;

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

        public static AcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            AcrRegistryInfo self = new AcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public AcrRegistryInfo setArnService(String arnService) {
            this.arnService = arnService;
            return this;
        }
        public String getArnService() {
            return this.arnService;
        }

        public AcrRegistryInfo setArnUser(String arnUser) {
            this.arnUser = arnUser;
            return this;
        }
        public String getArnUser() {
            return this.arnUser;
        }

        public AcrRegistryInfo setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        public AcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AcrRegistryInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public AcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class Exec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static Exec build(java.util.Map<String, ?> map) throws Exception {
            Exec self = new Exec();
            return TeaModel.build(map, self);
        }

        public Exec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class HttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static HttpGet build(java.util.Map<String, ?> map) throws Exception {
            HttpGet self = new HttpGet();
            return TeaModel.build(map, self);
        }

        public HttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public HttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class TcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static TcpSocket build(java.util.Map<String, ?> map) throws Exception {
            TcpSocket self = new TcpSocket();
            return TeaModel.build(map, self);
        }

        public TcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class LivenessProbe extends TeaModel {
        @NameInMap("Exec")
        public Exec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public HttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public TcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static LivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            LivenessProbe self = new LivenessProbe();
            return TeaModel.build(map, self);
        }

        public LivenessProbe setExec(Exec exec) {
            this.exec = exec;
            return this;
        }
        public Exec getExec() {
            return this.exec;
        }

        public LivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public LivenessProbe setHttpGet(HttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        public LivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public LivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public LivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public LivenessProbe setTcpSocket(TcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public LivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class ReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static ReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbeExec self = new ReadinessProbeExec();
            return TeaModel.build(map, self);
        }

        public ReadinessProbeExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class ReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static ReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbeHttpGet self = new ReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public ReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static ReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbeTcpSocket self = new ReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public ReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        public ReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public ReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public ReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static ReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbe self = new ReadinessProbe();
            return TeaModel.build(map, self);
        }

        public ReadinessProbe setExec(ReadinessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public ReadinessProbeExec getExec() {
            return this.exec;
        }

        public ReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public ReadinessProbe setHttpGet(ReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public ReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public ReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public ReadinessProbe setTcpSocket(ReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public ReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public ReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class Capability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static Capability build(java.util.Map<String, ?> map) throws Exception {
            Capability self = new Capability();
            return TeaModel.build(map, self);
        }

        public Capability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class ContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public Capability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static ContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            ContainerSecurityContext self = new ContainerSecurityContext();
            return TeaModel.build(map, self);
        }

        public ContainerSecurityContext setCapability(Capability capability) {
            this.capability = capability;
            return this;
        }
        public Capability getCapability() {
            return this.capability;
        }

        public ContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public ContainerSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class FieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static FieldRef build(java.util.Map<String, ?> map) throws Exception {
            FieldRef self = new FieldRef();
            return TeaModel.build(map, self);
        }

        public FieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class EnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        public FieldRef fieldRef;

        /**
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length and can contain letters, digits, and underscores (_). It cannot start with a digit.``</p>
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

        public static EnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentVar self = new EnvironmentVar();
            return TeaModel.build(map, self);
        }

        public EnvironmentVar setFieldRef(FieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public FieldRef getFieldRef() {
            return this.fieldRef;
        }

        public EnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public EnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class LifecyclePostStartHandlerHttpGetHttpHeader extends TeaModel {
        /**
         * <p>The name of the custom field in the HTTP GET request header when you use HTTP requests to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiao-Custom-Header</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the custom field in the HTTP GET request header when you use HTTP requests to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>test-postStart</p>
         */
        @NameInMap("Value")
        public String value;

        public static LifecyclePostStartHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePostStartHandlerHttpGetHttpHeader self = new LifecyclePostStartHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public LifecyclePostStartHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LifecyclePostStartHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class LifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        /**
         * <p>The name of the custom field in the HTTP GET request header when you use HTTP requests to specify a presto hook.</p>
         * 
         * <strong>example:</strong>
         * <p>Xiao-Custom-Header</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the custom field in the HTTP GET request header when you use HTTP requests to specify a preStop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>test-preStop</p>
         */
        @NameInMap("Value")
        public String value;

        public static LifecyclePreStopHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePreStopHandlerHttpGetHttpHeader self = new LifecyclePreStopHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public LifecyclePreStopHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LifecyclePreStopHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Port extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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

        public static Port build(java.util.Map<String, ?> map) throws Exception {
            Port self = new Port();
            return TeaModel.build(map, self);
        }

        public Port setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public Port setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class VolumeMount extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted.</p>
         * <blockquote>
         * <p> The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/pod/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.</li>
         * <li>Bidirectional: This value is similar to HostToContainer. The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume. In addition, all volume mounts that are mounted on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. The value of this parameter is the same as the name of the volume that is mounted to containers.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the volume is read-only. Default value: false.</p>
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

        public static VolumeMount build(java.util.Map<String, ?> map) throws Exception {
            VolumeMount self = new VolumeMount();
            return TeaModel.build(map, self);
        }

        public VolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public VolumeMount setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public VolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public VolumeMount setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class Container extends TeaModel {
        @NameInMap("LivenessProbe")
        public LivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public ReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        public ContainerSecurityContext securityContext;

        /**
         * <p>The arguments that are passed to the startup command of the container. You can specify up to 10 arguments.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The commands to be executed in the container when you use a CLI to perform health checks.</p>
         * <blockquote>
         * <p> When you configure ReadinessProbe-related parameters, you can select only one of the HttpGet, Exec, and TcpSocket check methods.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sleep</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that you want to allocate to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variables of the container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<EnvironmentVar> environmentVar;

        /**
         * <p>Specifies whether to hide the information about environment variables when you query the details of an elastic container instance. Default value: false. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true If environment variables contain sensitive information, you can set this parameter to true to improve security of the information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnvironmentVarHide")
        public Boolean environmentVarHide;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The policy that you want to use to pull images. Valid values:</p>
         * <ul>
         * <li>Always: Each time instances are created, image pulling is performed.</li>
         * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The commands to be executed in containers when you use a CLI to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/bin/sh&quot;, &quot;-c&quot;, &quot;echo Hello from the postStart handler &gt; /usr/share/message&quot;]</p>
         */
        @NameInMap("LifecyclePostStartHandlerExec")
        public java.util.List<String> lifecyclePostStartHandlerExec;

        /**
         * <p>The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The HTTP GET request header.</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeader")
        public java.util.List<LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader;

        /**
         * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port to which the system sends an HTTP GET request when you use an HTTP request to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>5050</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The protocol type of HTTP GET requests when you use HTTP requests to specify a postStart hook. Valid values:</p>
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
         * <p>The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify a postStart hook.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The commands to be executed in containers when you use a CLI to specify a preStop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/bin/sh&quot;, &quot;-c&quot;,&quot;echo Hello from the preStop handler &gt; /usr/share/message&quot;]</p>
         */
        @NameInMap("LifecyclePreStopHandlerExec")
        public java.util.List<String> lifecyclePreStopHandlerExec;

        /**
         * <p>The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify a preStop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The HTTP GET request header.</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        public java.util.List<LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        /**
         * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify a preSop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check when you use HTTP requests to specify a preStop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET request when you use an HTTP request to specify a preStop hook. Valid values:</p>
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
         * <p>The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify a preStop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify a preStop hook.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The memory size of the container. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check when you use HTTP requests to perform health checks.</p>
         * <blockquote>
         * <p> When you configure LivenessProbe-related parameters, you can select only one of the HttpGet, Exec, and TcpSocket check methods.</p>
         * </blockquote>
         */
        @NameInMap("Port")
        public java.util.List<Port> port;

        /**
         * <p>Specifies whether to enable privileged mode for the container. That is, whether to run the container in privileged mode. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityContextPrivileged")
        public Boolean securityContextPrivileged;

        /**
         * <p>The user group that runs the container.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("SecurityContextRunAsGroup")
        public Long securityContextRunAsGroup;

        /**
         * <p>Specifies whether to run the container as a non-root user. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityContextRunAsNonRoot")
        public Boolean securityContextRunAsNonRoot;

        /**
         * <p>Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether standard input streams are disconnected from multiple sessions after a client is disconnected.\
         * If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, standard input streams are also disconnected, and remain disconnected until the container restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>The path of the file from which the system retrieves termination messages of the container when the container exits.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/termination-log</p>
         */
        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        /**
         * <p>The message notification policy. This parameter is empty by default. Only Message Service (MNS) queue message notifications can be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>FallbackToLogsOnError</p>
         */
        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        /**
         * <p>Specifies whether to enable interaction. Default value: false.</p>
         * <p>If the command is a /bin/bash command, set the value to true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The information about the volume that you want to mount on the container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<VolumeMount> volumeMount;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static Container build(java.util.Map<String, ?> map) throws Exception {
            Container self = new Container();
            return TeaModel.build(map, self);
        }

        public Container setLivenessProbe(LivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public LivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public Container setReadinessProbe(ReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public ReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public Container setSecurityContext(ContainerSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public ContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public Container setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public Container setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public Container setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public Container setEnvironmentVar(java.util.List<EnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<EnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public Container setEnvironmentVarHide(Boolean environmentVarHide) {
            this.environmentVarHide = environmentVarHide;
            return this;
        }
        public Boolean getEnvironmentVarHide() {
            return this.environmentVarHide;
        }

        public Container setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public Container setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public Container setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public Container setLifecyclePostStartHandlerExec(java.util.List<String> lifecyclePostStartHandlerExec) {
            this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        public Container setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public Container setLifecyclePostStartHandlerHttpGetHttpHeader(java.util.List<LifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader) {
            this.lifecyclePostStartHandlerHttpGetHttpHeader = lifecyclePostStartHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<LifecyclePostStartHandlerHttpGetHttpHeader> getLifecyclePostStartHandlerHttpGetHttpHeader() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeader;
        }

        public Container setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public Container setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public Container setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public Container setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public Container setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public Container setLifecyclePreStopHandlerExec(java.util.List<String> lifecyclePreStopHandlerExec) {
            this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
        }

        public Container setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public Container setLifecyclePreStopHandlerHttpGetHttpHeader(java.util.List<LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
            this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<LifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
        }

        public Container setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public Container setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public Container setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public Container setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public Container setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public Container setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public Container setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Container setPort(java.util.List<Port> port) {
            this.port = port;
            return this;
        }
        public java.util.List<Port> getPort() {
            return this.port;
        }

        public Container setSecurityContextPrivileged(Boolean securityContextPrivileged) {
            this.securityContextPrivileged = securityContextPrivileged;
            return this;
        }
        public Boolean getSecurityContextPrivileged() {
            return this.securityContextPrivileged;
        }

        public Container setSecurityContextRunAsGroup(Long securityContextRunAsGroup) {
            this.securityContextRunAsGroup = securityContextRunAsGroup;
            return this;
        }
        public Long getSecurityContextRunAsGroup() {
            return this.securityContextRunAsGroup;
        }

        public Container setSecurityContextRunAsNonRoot(Boolean securityContextRunAsNonRoot) {
            this.securityContextRunAsNonRoot = securityContextRunAsNonRoot;
            return this;
        }
        public Boolean getSecurityContextRunAsNonRoot() {
            return this.securityContextRunAsNonRoot;
        }

        public Container setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public Container setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public Container setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        public Container setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        public Container setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public Container setVolumeMount(java.util.List<VolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<VolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public Container setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class HostAliase extends TeaModel {
        /**
         * <p>The hostnames of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hehe.com</p>
         */
        @NameInMap("Hostname")
        public java.util.List<String> hostname;

        /**
         * <p>The IP address of the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static HostAliase build(java.util.Map<String, ?> map) throws Exception {
            HostAliase self = new HostAliase();
            return TeaModel.build(map, self);
        }

        public HostAliase setHostname(java.util.List<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public java.util.List<String> getHostname() {
            return this.hostname;
        }

        public HostAliase setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class ImageRegistryCredential extends TeaModel {
        /**
         * <p>The password that you use to access the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourpassword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The address of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that you use to access the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourusername</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            ImageRegistryCredential self = new ImageRegistryCredential();
            return TeaModel.build(map, self);
        }

        public ImageRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ImageRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public ImageRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class SecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static SecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            SecurityContextCapability self = new SecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public SecurityContextCapability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class InitContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        public SecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static InitContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            InitContainerSecurityContext self = new InitContainerSecurityContext();
            return TeaModel.build(map, self);
        }

        public InitContainerSecurityContext setCapability(SecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public SecurityContextCapability getCapability() {
            return this.capability;
        }

        public InitContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public InitContainerSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class EnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static EnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentVarFieldRef self = new EnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

        public EnvironmentVarFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class InitContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        public EnvironmentVarFieldRef fieldRef;

        /**
         * <p>The name of the environment variable. The name must be 1 to 128 bits in length and can contain letters, digits, and underscores (_). It cannot start with a digit.``</p>
         * 
         * <strong>example:</strong>
         * <p>Path</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value must be 0 to 256 bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
         */
        @NameInMap("Value")
        public String value;

        public static InitContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            InitContainerEnvironmentVar self = new InitContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public InitContainerEnvironmentVar setFieldRef(EnvironmentVarFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public EnvironmentVarFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public InitContainerEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InitContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InitContainerPort extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
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

        public static InitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            InitContainerPort self = new InitContainerPort();
            return TeaModel.build(map, self);
        }

        public InitContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public InitContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class InitContainerVolumeMount extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted. The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one init container to be shared with other init containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.</li>
         * <li>Bidirectional: This value is similar to HostToContainer. The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume. In addition, all volume mounts that are mounted on the init container are propagated back to the host and all init containers of all pods that use the same volume.</li>
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
         * <p>Specifies whether the mount path is read-only. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. The pod can mount different directories of the same volume to different subdirectories of init containers.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sub/</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static InitContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            InitContainerVolumeMount self = new InitContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public InitContainerVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public InitContainerVolumeMount setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public InitContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitContainerVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public InitContainerVolumeMount setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class InitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        public InitContainerSecurityContext securityContext;

        /**
         * <p>The arguments that are passed to the startup command of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The startup commands of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>sleep</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that you want to allocate to the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variable of the init container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<InitContainerEnvironmentVar> environmentVar;

        /**
         * <p>The number of GPUs that you want to allocate to the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The policy that you want to use to pull images. Valid values:</p>
         * <ul>
         * <li>Always: Each time instances are created, image pulling is performed.</li>
         * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The memory size that you want to allocate to the init container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>test-init</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The information about the port.</p>
         */
        @NameInMap("Port")
        public java.util.List<InitContainerPort> port;

        /**
         * <p>The path of the file from which the system retrieves termination messages of the init container when the init container exits.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/termination-log</p>
         */
        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        /**
         * <p>The message notification policy. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        /**
         * <p>The information about the volumes that you want to mount to the init containers.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<InitContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static InitContainer build(java.util.Map<String, ?> map) throws Exception {
            InitContainer self = new InitContainer();
            return TeaModel.build(map, self);
        }

        public InitContainer setSecurityContext(InitContainerSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public InitContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public InitContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public InitContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public InitContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public InitContainer setEnvironmentVar(java.util.List<InitContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<InitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public InitContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public InitContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public InitContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public InitContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public InitContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitContainer setPort(java.util.List<InitContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<InitContainerPort> getPort() {
            return this.port;
        }

        public InitContainer setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        public InitContainer setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        public InitContainer setVolumeMount(java.util.List<InitContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<InitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public InitContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class Tag extends TeaModel {
        /**
         * <p>The tag key. The tag key cannot be an empty string and must be unique. The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("Path")
        public String path;

        public static ConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            ConfigFileToPath self = new ConfigFileToPath();
            return TeaModel.build(map, self);
        }

        public ConfigFileToPath setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ConfigFileToPath setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public ConfigFileToPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        public java.util.List<ConfigFileToPath> configFileToPath;

        @NameInMap("DefaultMode")
        public Integer defaultMode;

        public static ConfigFileVolume build(java.util.Map<String, ?> map) throws Exception {
            ConfigFileVolume self = new ConfigFileVolume();
            return TeaModel.build(map, self);
        }

        public ConfigFileVolume setConfigFileToPath(java.util.List<ConfigFileToPath> configFileToPath) {
            this.configFileToPath = configFileToPath;
            return this;
        }
        public java.util.List<ConfigFileToPath> getConfigFileToPath() {
            return this.configFileToPath;
        }

        public ConfigFileVolume setDefaultMode(Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Integer getDefaultMode() {
            return this.defaultMode;
        }

    }

    public static class DiskVolume extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("FsType")
        public String fsType;

        public static DiskVolume build(java.util.Map<String, ?> map) throws Exception {
            DiskVolume self = new DiskVolume();
            return TeaModel.build(map, self);
        }

        public DiskVolume setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DiskVolume setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DiskVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

    }

    public static class EmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static EmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            EmptyDirVolume self = new EmptyDirVolume();
            return TeaModel.build(map, self);
        }

        public EmptyDirVolume setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public EmptyDirVolume setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class FlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        public static FlexVolume build(java.util.Map<String, ?> map) throws Exception {
            FlexVolume self = new FlexVolume();
            return TeaModel.build(map, self);
        }

        public FlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public FlexVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public FlexVolume setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

    public static class HostPathVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static HostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            HostPathVolume self = new HostPathVolume();
            return TeaModel.build(map, self);
        }

        public HostPathVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public HostPathVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class NFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Server")
        public String server;

        public static NFSVolume build(java.util.Map<String, ?> map) throws Exception {
            NFSVolume self = new NFSVolume();
            return TeaModel.build(map, self);
        }

        public NFSVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public NFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public NFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class Volume extends TeaModel {
        @NameInMap("ConfigFileVolume")
        public ConfigFileVolume configFileVolume;

        @NameInMap("DiskVolume")
        public DiskVolume diskVolume;

        @NameInMap("EmptyDirVolume")
        public EmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        public FlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        public HostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        public NFSVolume NFSVolume;

        /**
         * <p>The name of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>default-volume1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the HostPath volume. Valid values:</p>
         * <ul>
         * <li>Directory</li>
         * <li>File</li>
         * </ul>
         * <blockquote>
         * <p> Only users in the whitelist can mount HostPath volumes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConfigFileVolume</p>
         */
        @NameInMap("Type")
        public String type;

        public static Volume build(java.util.Map<String, ?> map) throws Exception {
            Volume self = new Volume();
            return TeaModel.build(map, self);
        }

        public Volume setConfigFileVolume(ConfigFileVolume configFileVolume) {
            this.configFileVolume = configFileVolume;
            return this;
        }
        public ConfigFileVolume getConfigFileVolume() {
            return this.configFileVolume;
        }

        public Volume setDiskVolume(DiskVolume diskVolume) {
            this.diskVolume = diskVolume;
            return this;
        }
        public DiskVolume getDiskVolume() {
            return this.diskVolume;
        }

        public Volume setEmptyDirVolume(EmptyDirVolume emptyDirVolume) {
            this.emptyDirVolume = emptyDirVolume;
            return this;
        }
        public EmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        public Volume setFlexVolume(FlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }
        public FlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        public Volume setHostPathVolume(HostPathVolume hostPathVolume) {
            this.hostPathVolume = hostPathVolume;
            return this;
        }
        public HostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        public Volume setNFSVolume(NFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public NFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        public Volume setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Volume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
