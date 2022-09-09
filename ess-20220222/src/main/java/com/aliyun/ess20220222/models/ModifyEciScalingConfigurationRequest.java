// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyEciScalingConfigurationRequest extends TeaModel {
    @NameInMap("AcrRegistryInfos")
    public java.util.List<ModifyEciScalingConfigurationRequestAcrRegistryInfos> acrRegistryInfos;

    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    @NameInMap("AutoCreateEip")
    public Boolean autoCreateEip;

    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    @NameInMap("Containers")
    public java.util.List<ModifyEciScalingConfigurationRequestContainers> containers;

    @NameInMap("CostOptimization")
    public Boolean costOptimization;

    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("CpuOptionsCore")
    public Integer cpuOptionsCore;

    @NameInMap("CpuOptionsThreadsPerCore")
    public Integer cpuOptionsThreadsPerCore;

    @NameInMap("Description")
    public String description;

    @NameInMap("DnsConfigNameServers")
    public java.util.List<String> dnsConfigNameServers;

    @NameInMap("DnsConfigOptions")
    public java.util.List<ModifyEciScalingConfigurationRequestDnsConfigOptions> dnsConfigOptions;

    @NameInMap("DnsConfigSearchs")
    public java.util.List<String> dnsConfigSearchs;

    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    @NameInMap("EgressBandwidth")
    public Long egressBandwidth;

    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    @NameInMap("EnableSls")
    public Boolean enableSls;

    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    @NameInMap("HostAliases")
    public java.util.List<ModifyEciScalingConfigurationRequestHostAliases> hostAliases;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ImageRegistryCredentials")
    public java.util.List<ModifyEciScalingConfigurationRequestImageRegistryCredentials> imageRegistryCredentials;

    @NameInMap("ImageSnapshotId")
    public String imageSnapshotId;

    @NameInMap("IngressBandwidth")
    public Long ingressBandwidth;

    @NameInMap("InitContainers")
    public java.util.List<ModifyEciScalingConfigurationRequestInitContainers> initContainers;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("NtpServers")
    public java.util.List<String> ntpServers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    @NameInMap("SecurityContextSysCtls")
    public java.util.List<ModifyEciScalingConfigurationRequestSecurityContextSysCtls> securityContextSysCtls;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("Tags")
    public java.util.List<ModifyEciScalingConfigurationRequestTags> tags;

    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

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
        @NameInMap("Domains")
        public java.util.List<String> domains;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
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
        @Validation(required = true)
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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersEnvironmentVarsFieldRef fieldRef;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("Port")
        public Integer port;

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
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("MountPropagation")
        public String mountPropagation;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestContainersSecurityContext securityContext;

        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Commands")
        public java.util.List<String> commands;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("EnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersEnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Ports")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersPorts> ports;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("VolumeMounts")
        public java.util.List<ModifyEciScalingConfigurationRequestContainersVolumeMounts> volumeMounts;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

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
        @NameInMap("Password")
        public String password;

        @NameInMap("Server")
        public String server;

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
        @Validation(required = true)
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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVarsFieldRef fieldRef;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("Port")
        public Integer port;

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
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("MountPropagation")
        public String mountPropagation;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestInitContainersSecurityContext securityContext;

        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Commands")
        public java.util.List<String> commands;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("InitContainerEnvironmentVars")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerEnvironmentVars> initContainerEnvironmentVars;

        @NameInMap("InitContainerPorts")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerPorts> initContainerPorts;

        @NameInMap("InitContainerVolumeMounts")
        public java.util.List<ModifyEciScalingConfigurationRequestInitContainersInitContainerVolumeMounts> initContainerVolumeMounts;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("Mode")
        public Integer mode;

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
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestVolumesDiskVolume diskVolume;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestVolumesEmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestVolumesFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestVolumesHostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        @Validation(required = true)
        public ModifyEciScalingConfigurationRequestVolumesNFSVolume NFSVolume;

        @NameInMap("ConfigFileVolumeConfigFileToPath")
        public java.util.List<ModifyEciScalingConfigurationRequestVolumesConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPath;

        @NameInMap("ConfigFileVolumeDefaultMode")
        public Integer configFileVolumeDefaultMode;

        @NameInMap("Name")
        public String name;

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
