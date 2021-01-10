// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupRequest extends TeaModel {
    @NameInMap("DnsConfig")
    public CreateContainerGroupRequestDnsConfig dnsConfig;

    @NameInMap("SecurityContext")
    public CreateContainerGroupRequestSecurityContext securityContext;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SlsEnable")
    public Boolean slsEnable;

    @NameInMap("ImageSnapshotId")
    public String imageSnapshotId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    @NameInMap("VkClientVersion")
    public String vkClientVersion;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    @NameInMap("TenantVSwitchId")
    public String tenantVSwitchId;

    @NameInMap("TenantSecurityGroupId")
    public String tenantSecurityGroupId;

    @NameInMap("CorePattern")
    public String corePattern;

    @NameInMap("ShareProcessNamespace")
    public Boolean shareProcessNamespace;

    @NameInMap("ProductOnEciMode")
    public String productOnEciMode;

    @NameInMap("SecondaryENIPolicy")
    public String secondaryENIPolicy;

    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    @NameInMap("EipISP")
    public String eipISP;

    @NameInMap("EipCommonBandwidthPackage")
    public String eipCommonBandwidthPackage;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("IngressBandwidth")
    public Long ingressBandwidth;

    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    @NameInMap("CpuOptionsNuma")
    public String cpuOptionsNuma;

    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    @NameInMap("Tag")
    public java.util.List<CreateContainerGroupRequestTag> tag;

    @NameInMap("ImageRegistryCredential")
    public java.util.List<CreateContainerGroupRequestImageRegistryCredential> imageRegistryCredential;

    @NameInMap("Container")
    public java.util.List<CreateContainerGroupRequestContainer> container;

    @NameInMap("Volume")
    public java.util.List<CreateContainerGroupRequestVolume> volume;

    @NameInMap("InitContainer")
    public java.util.List<CreateContainerGroupRequestInitContainer> initContainer;

    @NameInMap("HostAliase")
    public java.util.List<CreateContainerGroupRequestHostAliase> hostAliase;

    @NameInMap("Arn")
    public java.util.List<CreateContainerGroupRequestArn> arn;

    @NameInMap("NtpServer")
    public java.util.List<String> ntpServer;

    @NameInMap("AcrRegistryInfo")
    public java.util.List<CreateContainerGroupRequestAcrRegistryInfo> acrRegistryInfo;

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

    public CreateContainerGroupRequest setSecurityContext(CreateContainerGroupRequestSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }
    public CreateContainerGroupRequestSecurityContext getSecurityContext() {
        return this.securityContext;
    }

    public CreateContainerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreateContainerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateContainerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateContainerGroupRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateContainerGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateContainerGroupRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateContainerGroupRequest setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        return this;
    }
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public CreateContainerGroupRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public CreateContainerGroupRequest setEipInstanceId(String eipInstanceId) {
        this.eipInstanceId = eipInstanceId;
        return this;
    }
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    public CreateContainerGroupRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateContainerGroupRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public CreateContainerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateContainerGroupRequest setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public CreateContainerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContainerGroupRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateContainerGroupRequest setSlsEnable(Boolean slsEnable) {
        this.slsEnable = slsEnable;
        return this;
    }
    public Boolean getSlsEnable() {
        return this.slsEnable;
    }

    public CreateContainerGroupRequest setImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        return this;
    }
    public String getImageSnapshotId() {
        return this.imageSnapshotId;
    }

    public CreateContainerGroupRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateContainerGroupRequest setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateContainerGroupRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }
    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public CreateContainerGroupRequest setVkClientVersion(String vkClientVersion) {
        this.vkClientVersion = vkClientVersion;
        return this;
    }
    public String getVkClientVersion() {
        return this.vkClientVersion;
    }

    public CreateContainerGroupRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateContainerGroupRequest setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public CreateContainerGroupRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateContainerGroupRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateContainerGroupRequest setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }
    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

    public CreateContainerGroupRequest setTenantVSwitchId(String tenantVSwitchId) {
        this.tenantVSwitchId = tenantVSwitchId;
        return this;
    }
    public String getTenantVSwitchId() {
        return this.tenantVSwitchId;
    }

    public CreateContainerGroupRequest setTenantSecurityGroupId(String tenantSecurityGroupId) {
        this.tenantSecurityGroupId = tenantSecurityGroupId;
        return this;
    }
    public String getTenantSecurityGroupId() {
        return this.tenantSecurityGroupId;
    }

    public CreateContainerGroupRequest setCorePattern(String corePattern) {
        this.corePattern = corePattern;
        return this;
    }
    public String getCorePattern() {
        return this.corePattern;
    }

    public CreateContainerGroupRequest setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
        return this;
    }
    public Boolean getShareProcessNamespace() {
        return this.shareProcessNamespace;
    }

    public CreateContainerGroupRequest setProductOnEciMode(String productOnEciMode) {
        this.productOnEciMode = productOnEciMode;
        return this;
    }
    public String getProductOnEciMode() {
        return this.productOnEciMode;
    }

    public CreateContainerGroupRequest setSecondaryENIPolicy(String secondaryENIPolicy) {
        this.secondaryENIPolicy = secondaryENIPolicy;
        return this;
    }
    public String getSecondaryENIPolicy() {
        return this.secondaryENIPolicy;
    }

    public CreateContainerGroupRequest setAutoCreateEip(Boolean autoCreateEip) {
        this.autoCreateEip = autoCreateEip;
        return this;
    }
    public Boolean getAutoCreateEip() {
        return this.autoCreateEip;
    }

    public CreateContainerGroupRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public CreateContainerGroupRequest setEipISP(String eipISP) {
        this.eipISP = eipISP;
        return this;
    }
    public String getEipISP() {
        return this.eipISP;
    }

    public CreateContainerGroupRequest setEipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
        this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
        return this;
    }
    public String getEipCommonBandwidthPackage() {
        return this.eipCommonBandwidthPackage;
    }

    public CreateContainerGroupRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateContainerGroupRequest setIngressBandwidth(Long ingressBandwidth) {
        this.ingressBandwidth = ingressBandwidth;
        return this;
    }
    public Long getIngressBandwidth() {
        return this.ingressBandwidth;
    }

    public CreateContainerGroupRequest setEgressBandwidth(Long egressBandwidth) {
        this.egressBandwidth = egressBandwidth;
        return this;
    }
    public Long getEgressBandwidth() {
        return this.egressBandwidth;
    }

    public CreateContainerGroupRequest setCpuOptionsCore(Integer cpuOptionsCore) {
        this.cpuOptionsCore = cpuOptionsCore;
        return this;
    }
    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    public CreateContainerGroupRequest setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
        this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
        return this;
    }
    public Integer getCpuOptionsThreadsPerCore() {
        return this.cpuOptionsThreadsPerCore;
    }

    public CreateContainerGroupRequest setCpuOptionsNuma(String cpuOptionsNuma) {
        this.cpuOptionsNuma = cpuOptionsNuma;
        return this;
    }
    public String getCpuOptionsNuma() {
        return this.cpuOptionsNuma;
    }

    public CreateContainerGroupRequest setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public CreateContainerGroupRequest setTag(java.util.List<CreateContainerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateContainerGroupRequest setImageRegistryCredential(java.util.List<CreateContainerGroupRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public CreateContainerGroupRequest setContainer(java.util.List<CreateContainerGroupRequestContainer> container) {
        this.container = container;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestContainer> getContainer() {
        return this.container;
    }

    public CreateContainerGroupRequest setVolume(java.util.List<CreateContainerGroupRequestVolume> volume) {
        this.volume = volume;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestVolume> getVolume() {
        return this.volume;
    }

    public CreateContainerGroupRequest setInitContainer(java.util.List<CreateContainerGroupRequestInitContainer> initContainer) {
        this.initContainer = initContainer;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestInitContainer> getInitContainer() {
        return this.initContainer;
    }

    public CreateContainerGroupRequest setHostAliase(java.util.List<CreateContainerGroupRequestHostAliase> hostAliase) {
        this.hostAliase = hostAliase;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestHostAliase> getHostAliase() {
        return this.hostAliase;
    }

    public CreateContainerGroupRequest setArn(java.util.List<CreateContainerGroupRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestArn> getArn() {
        return this.arn;
    }

    public CreateContainerGroupRequest setNtpServer(java.util.List<String> ntpServer) {
        this.ntpServer = ntpServer;
        return this;
    }
    public java.util.List<String> getNtpServer() {
        return this.ntpServer;
    }

    public CreateContainerGroupRequest setAcrRegistryInfo(java.util.List<CreateContainerGroupRequestAcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<CreateContainerGroupRequestAcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public static class CreateContainerGroupRequestDnsConfigOption extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static CreateContainerGroupRequestDnsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestDnsConfigOption self = new CreateContainerGroupRequestDnsConfigOption();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestDnsConfigOption setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateContainerGroupRequestDnsConfigOption setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestDnsConfig extends TeaModel {
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        @NameInMap("Search")
        public java.util.List<String> search;

        @NameInMap("Option")
        public java.util.List<CreateContainerGroupRequestDnsConfigOption> option;

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

        public CreateContainerGroupRequestDnsConfig setSearch(java.util.List<String> search) {
            this.search = search;
            return this;
        }
        public java.util.List<String> getSearch() {
            return this.search;
        }

        public CreateContainerGroupRequestDnsConfig setOption(java.util.List<CreateContainerGroupRequestDnsConfigOption> option) {
            this.option = option;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestDnsConfigOption> getOption() {
            return this.option;
        }

    }

    public static class CreateContainerGroupRequestSecurityContextSysctl extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static CreateContainerGroupRequestSecurityContextSysctl build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestSecurityContextSysctl self = new CreateContainerGroupRequestSecurityContextSysctl();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestSecurityContextSysctl setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateContainerGroupRequestSecurityContextSysctl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestSecurityContext extends TeaModel {
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

    public static class CreateContainerGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class CreateContainerGroupRequestImageRegistryCredential extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Server")
        public String server;

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

    public static class CreateContainerGroupRequestContainerReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestContainerReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeHttpGet self = new CreateContainerGroupRequestContainerReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
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

    public static class CreateContainerGroupRequestContainerReadinessProbe extends TeaModel {
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbeHttpGet httpGet;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("Exec")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        public static CreateContainerGroupRequestContainerReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbe self = new CreateContainerGroupRequestContainerReadinessProbe();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
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

        public CreateContainerGroupRequestContainerReadinessProbe setHttpGet(CreateContainerGroupRequestContainerReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public CreateContainerGroupRequestContainerReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateContainerGroupRequestContainerReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
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
        @Validation(required = true)
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
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Path")
        public String path;

        public static CreateContainerGroupRequestContainerLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeHttpGet self = new CreateContainerGroupRequestContainerLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public CreateContainerGroupRequestContainerLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestContainerLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbe extends TeaModel {
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("Exec")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbeExec exec;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbeHttpGet httpGet;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateContainerGroupRequestContainerLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbe self = new CreateContainerGroupRequestContainerLivenessProbe();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setTcpSocket(CreateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setExec(CreateContainerGroupRequestContainerLivenessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbeExec getExec() {
            return this.exec;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setHttpGet(CreateContainerGroupRequestContainerLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public CreateContainerGroupRequestContainerLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
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
        @Validation(required = true)
        public CreateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef;

        @NameInMap("Key")
        public String key;

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

    public static class CreateContainerGroupRequestContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("Name")
        public String name;

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

        public CreateContainerGroupRequestContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestContainerPort extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestContainerPort build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerPort self = new CreateContainerGroupRequestContainerPort();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateContainerGroupRequestContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader self = new CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader self = new CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestContainer extends TeaModel {
        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerSecurityContext securityContext;

        @NameInMap("LivenessProbe")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbe livenessProbe;

        @NameInMap("EnvironmentVar")
        public java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> environmentVar;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("Arg")
        public java.util.List<String> arg;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("VolumeMount")
        public java.util.List<CreateContainerGroupRequestContainerVolumeMount> volumeMount;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        @NameInMap("LifecyclePostStartHandlerExec")
        public java.util.List<String> lifecyclePostStartHandlerExec;

        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        @NameInMap("Port")
        public java.util.List<CreateContainerGroupRequestContainerPort> port;

        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("LifecyclePreStopHandlerExec")
        public java.util.List<String> lifecyclePreStopHandlerExec;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        @NameInMap("Image")
        public String image;

        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeader")
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader;

        public static CreateContainerGroupRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainer self = new CreateContainerGroupRequestContainer();
            return TeaModel.build(map, self);
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

        public CreateContainerGroupRequestContainer setLivenessProbe(CreateContainerGroupRequestContainerLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public CreateContainerGroupRequestContainerLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public CreateContainerGroupRequestContainer setEnvironmentVar(java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public CreateContainerGroupRequestContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public CreateContainerGroupRequestContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public CreateContainerGroupRequestContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public CreateContainerGroupRequestContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public CreateContainerGroupRequestContainer setVolumeMount(java.util.List<CreateContainerGroupRequestContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public CreateContainerGroupRequestContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public CreateContainerGroupRequestContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public CreateContainerGroupRequestContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public CreateContainerGroupRequestContainer setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerExec(java.util.List<String> lifecyclePostStartHandlerExec) {
            this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public CreateContainerGroupRequestContainer setPort(java.util.List<CreateContainerGroupRequestContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerPort> getPort() {
            return this.port;
        }

        public CreateContainerGroupRequestContainer setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }
        public String getTerminationMessagePath() {
            return this.terminationMessagePath;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public CreateContainerGroupRequestContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerExec(java.util.List<String> lifecyclePreStopHandlerExec) {
            this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
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

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public CreateContainerGroupRequestContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHttpHeader(java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
            this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
        }

        public CreateContainerGroupRequestContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public CreateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHttpHeader(java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader) {
            this.lifecyclePostStartHandlerHttpGetHttpHeader = lifecyclePostStartHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> getLifecyclePostStartHandlerHttpGetHttpHeader() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeader;
        }

    }

    public static class CreateContainerGroupRequestVolumeDiskVolume extends TeaModel {
        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("DiskId")
        public String diskId;

        public static CreateContainerGroupRequestVolumeDiskVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeDiskVolume self = new CreateContainerGroupRequestVolumeDiskVolume();
            return TeaModel.build(map, self);
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

        public CreateContainerGroupRequestVolumeDiskVolume setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
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

    public static class CreateContainerGroupRequestVolumeFlexVolume extends TeaModel {
        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        @NameInMap("Driver")
        public String driver;

        public static CreateContainerGroupRequestVolumeFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeFlexVolume self = new CreateContainerGroupRequestVolumeFlexVolume();
            return TeaModel.build(map, self);
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

        public CreateContainerGroupRequestVolumeFlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

    }

    public static class CreateContainerGroupRequestVolumeHostPathVolume extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Path")
        public String path;

        public static CreateContainerGroupRequestVolumeHostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeHostPathVolume self = new CreateContainerGroupRequestVolumeHostPathVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeHostPathVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateContainerGroupRequestVolumeHostPathVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("Content")
        public String content;

        public static CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath self = new CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateContainerGroupRequestVolumeConfigFileVolume extends TeaModel {
        @NameInMap("DefaultMode")
        public Integer defaultMode;

        @NameInMap("ConfigFileToPath")
        public java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath;

        public static CreateContainerGroupRequestVolumeConfigFileVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeConfigFileVolume self = new CreateContainerGroupRequestVolumeConfigFileVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolumeConfigFileVolume setDefaultMode(Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Integer getDefaultMode() {
            return this.defaultMode;
        }

        public CreateContainerGroupRequestVolumeConfigFileVolume setConfigFileToPath(java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath) {
            this.configFileToPath = configFileToPath;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> getConfigFileToPath() {
            return this.configFileToPath;
        }

    }

    public static class CreateContainerGroupRequestVolumeEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

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

    }

    public static class CreateContainerGroupRequestVolume extends TeaModel {
        @NameInMap("DiskVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeDiskVolume diskVolume;

        @NameInMap("NFSVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeNFSVolume NFSVolume;

        @NameInMap("FlexVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeHostPathVolume hostPathVolume;

        @NameInMap("ConfigFileVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeConfigFileVolume configFileVolume;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume;

        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        public static CreateContainerGroupRequestVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolume self = new CreateContainerGroupRequestVolume();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestVolume setDiskVolume(CreateContainerGroupRequestVolumeDiskVolume diskVolume) {
            this.diskVolume = diskVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeDiskVolume getDiskVolume() {
            return this.diskVolume;
        }

        public CreateContainerGroupRequestVolume setNFSVolume(CreateContainerGroupRequestVolumeNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeNFSVolume getNFSVolume() {
            return this.NFSVolume;
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

        public CreateContainerGroupRequestVolume setConfigFileVolume(CreateContainerGroupRequestVolumeConfigFileVolume configFileVolume) {
            this.configFileVolume = configFileVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeConfigFileVolume getConfigFileVolume() {
            return this.configFileVolume;
        }

        public CreateContainerGroupRequestVolume setEmptyDirVolume(CreateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume) {
            this.emptyDirVolume = emptyDirVolume;
            return this;
        }
        public CreateContainerGroupRequestVolumeEmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        public CreateContainerGroupRequestVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateContainerGroupRequestVolume setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
        @Validation(required = true)
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

    public static class CreateContainerGroupRequestInitContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("Name")
        public String name;

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

        public CreateContainerGroupRequestInitContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestInitContainerPort extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestInitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerPort self = new CreateContainerGroupRequestInitContainerPort();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestInitContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateContainerGroupRequestInitContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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
        @Validation(required = true)
        public CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef;

        @NameInMap("Key")
        public String key;

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

    public static class CreateContainerGroupRequestInitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        @Validation(required = true)
        public CreateContainerGroupRequestInitContainerSecurityContext securityContext;

        @NameInMap("Image")
        public String image;

        @NameInMap("VolumeMount")
        public java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> volumeMount;

        @NameInMap("Port")
        public java.util.List<CreateContainerGroupRequestInitContainerPort> port;

        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        @NameInMap("EnvironmentVar")
        public java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> environmentVar;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("Arg")
        public java.util.List<String> arg;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        @NameInMap("Name")
        public String name;

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

        public CreateContainerGroupRequestInitContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateContainerGroupRequestInitContainer setVolumeMount(java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
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

        public CreateContainerGroupRequestInitContainer setEnvironmentVar(java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public CreateContainerGroupRequestInitContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public CreateContainerGroupRequestInitContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public CreateContainerGroupRequestInitContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
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

        public CreateContainerGroupRequestInitContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateContainerGroupRequestInitContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public CreateContainerGroupRequestInitContainer setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }
        public String getTerminationMessagePolicy() {
            return this.terminationMessagePolicy;
        }

        public CreateContainerGroupRequestInitContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateContainerGroupRequestHostAliase extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Hostname")
        public java.util.List<String> hostname;

        public static CreateContainerGroupRequestHostAliase build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestHostAliase self = new CreateContainerGroupRequestHostAliase();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestHostAliase setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateContainerGroupRequestHostAliase setHostname(java.util.List<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public java.util.List<String> getHostname() {
            return this.hostname;
        }

    }

    public static class CreateContainerGroupRequestArn extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        public static CreateContainerGroupRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestArn self = new CreateContainerGroupRequestArn();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestArn setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateContainerGroupRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateContainerGroupRequestArn setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

    }

    public static class CreateContainerGroupRequestAcrRegistryInfo extends TeaModel {
        @NameInMap("Domain")
        public java.util.List<String> domain;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateContainerGroupRequestAcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestAcrRegistryInfo self = new CreateContainerGroupRequestAcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public CreateContainerGroupRequestAcrRegistryInfo setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateContainerGroupRequestAcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
