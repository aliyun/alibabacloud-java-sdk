// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupRequest extends TeaModel {
    @NameInMap("DnsConfig")
    public UpdateContainerGroupRequestDnsConfig dnsConfig;

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

    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<UpdateContainerGroupRequestTag> tag;

    @NameInMap("Volume")
    public java.util.List<UpdateContainerGroupRequestVolume> volume;

    @NameInMap("Container")
    public java.util.List<UpdateContainerGroupRequestContainer> container;

    @NameInMap("InitContainer")
    public java.util.List<UpdateContainerGroupRequestInitContainer> initContainer;

    @NameInMap("ImageRegistryCredential")
    public java.util.List<UpdateContainerGroupRequestImageRegistryCredential> imageRegistryCredential;

    public static UpdateContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerGroupRequest self = new UpdateContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerGroupRequest setDnsConfig(UpdateContainerGroupRequestDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public UpdateContainerGroupRequestDnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public UpdateContainerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateContainerGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateContainerGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateContainerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateContainerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateContainerGroupRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public UpdateContainerGroupRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public UpdateContainerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContainerGroupRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateContainerGroupRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public UpdateContainerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateContainerGroupRequest setTag(java.util.List<UpdateContainerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestTag> getTag() {
        return this.tag;
    }

    public UpdateContainerGroupRequest setVolume(java.util.List<UpdateContainerGroupRequestVolume> volume) {
        this.volume = volume;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestVolume> getVolume() {
        return this.volume;
    }

    public UpdateContainerGroupRequest setContainer(java.util.List<UpdateContainerGroupRequestContainer> container) {
        this.container = container;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestContainer> getContainer() {
        return this.container;
    }

    public UpdateContainerGroupRequest setInitContainer(java.util.List<UpdateContainerGroupRequestInitContainer> initContainer) {
        this.initContainer = initContainer;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestInitContainer> getInitContainer() {
        return this.initContainer;
    }

    public UpdateContainerGroupRequest setImageRegistryCredential(java.util.List<UpdateContainerGroupRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public static class UpdateContainerGroupRequestDnsConfigOption extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestDnsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestDnsConfigOption self = new UpdateContainerGroupRequestDnsConfigOption();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestDnsConfigOption setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateContainerGroupRequestDnsConfigOption setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestDnsConfig extends TeaModel {
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        @NameInMap("Search")
        public java.util.List<String> search;

        @NameInMap("Option")
        public java.util.List<UpdateContainerGroupRequestDnsConfigOption> option;

        public static UpdateContainerGroupRequestDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestDnsConfig self = new UpdateContainerGroupRequestDnsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestDnsConfig setNameServer(java.util.List<String> nameServer) {
            this.nameServer = nameServer;
            return this;
        }
        public java.util.List<String> getNameServer() {
            return this.nameServer;
        }

        public UpdateContainerGroupRequestDnsConfig setSearch(java.util.List<String> search) {
            this.search = search;
            return this;
        }
        public java.util.List<String> getSearch() {
            return this.search;
        }

        public UpdateContainerGroupRequestDnsConfig setOption(java.util.List<UpdateContainerGroupRequestDnsConfigOption> option) {
            this.option = option;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestDnsConfigOption> getOption() {
            return this.option;
        }

    }

    public static class UpdateContainerGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestTag self = new UpdateContainerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateContainerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateContainerGroupRequestVolumeNFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Server")
        public String server;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static UpdateContainerGroupRequestVolumeNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeNFSVolume self = new UpdateContainerGroupRequestVolumeNFSVolume();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeNFSVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateContainerGroupRequestVolumeNFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public UpdateContainerGroupRequestVolumeNFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Content")
        public String content;

        public static UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath self = new UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateContainerGroupRequestVolumeConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        public java.util.List<UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath;

        public static UpdateContainerGroupRequestVolumeConfigFileVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeConfigFileVolume self = new UpdateContainerGroupRequestVolumeConfigFileVolume();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeConfigFileVolume setConfigFileToPath(java.util.List<UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath) {
            this.configFileToPath = configFileToPath;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> getConfigFileToPath() {
            return this.configFileToPath;
        }

    }

    public static class UpdateContainerGroupRequestVolumeEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        public static UpdateContainerGroupRequestVolumeEmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeEmptyDirVolume self = new UpdateContainerGroupRequestVolumeEmptyDirVolume();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeEmptyDirVolume setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

    }

    public static class UpdateContainerGroupRequestVolume extends TeaModel {
        @NameInMap("NFSVolume")
        @Validation(required = true)
        public UpdateContainerGroupRequestVolumeNFSVolume NFSVolume;

        @NameInMap("ConfigFileVolume")
        @Validation(required = true)
        public UpdateContainerGroupRequestVolumeConfigFileVolume configFileVolume;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        public UpdateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume;

        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolume self = new UpdateContainerGroupRequestVolume();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolume setNFSVolume(UpdateContainerGroupRequestVolumeNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public UpdateContainerGroupRequestVolumeNFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        public UpdateContainerGroupRequestVolume setConfigFileVolume(UpdateContainerGroupRequestVolumeConfigFileVolume configFileVolume) {
            this.configFileVolume = configFileVolume;
            return this;
        }
        public UpdateContainerGroupRequestVolumeConfigFileVolume getConfigFileVolume() {
            return this.configFileVolume;
        }

        public UpdateContainerGroupRequestVolume setEmptyDirVolume(UpdateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume) {
            this.emptyDirVolume = emptyDirVolume;
            return this;
        }
        public UpdateContainerGroupRequestVolumeEmptyDirVolume getEmptyDirVolume() {
            return this.emptyDirVolume;
        }

        public UpdateContainerGroupRequestVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateContainerGroupRequestVolume setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeTcpSocket self = new UpdateContainerGroupRequestContainerReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeHttpGet self = new UpdateContainerGroupRequestContainerReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static UpdateContainerGroupRequestContainerReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeExec self = new UpdateContainerGroupRequestContainerReadinessProbeExec();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerReadinessProbeExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbe extends TeaModel {
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet httpGet;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("Exec")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        public static UpdateContainerGroupRequestContainerReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbe self = new UpdateContainerGroupRequestContainerReadinessProbe();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setTcpSocket(UpdateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public UpdateContainerGroupRequestContainerReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setHttpGet(UpdateContainerGroupRequestContainerReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setExec(UpdateContainerGroupRequestContainerReadinessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public UpdateContainerGroupRequestContainerReadinessProbeExec getExec() {
            return this.exec;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

    }

    public static class UpdateContainerGroupRequestContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static UpdateContainerGroupRequestContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerSecurityContextCapability self = new UpdateContainerGroupRequestContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerSecurityContextCapability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class UpdateContainerGroupRequestContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static UpdateContainerGroupRequestContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerSecurityContext self = new UpdateContainerGroupRequestContainerSecurityContext();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerSecurityContext setCapability(UpdateContainerGroupRequestContainerSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public UpdateContainerGroupRequestContainerSecurityContextCapability getCapability() {
            return this.capability;
        }

        public UpdateContainerGroupRequestContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public UpdateContainerGroupRequestContainerSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeTcpSocket self = new UpdateContainerGroupRequestContainerLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLivenessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbeExec extends TeaModel {
        @NameInMap("Command")
        public java.util.List<String> command;

        public static UpdateContainerGroupRequestContainerLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeExec self = new UpdateContainerGroupRequestContainerLivenessProbeExec();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLivenessProbeExec setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Path")
        public String path;

        public static UpdateContainerGroupRequestContainerLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeHttpGet self = new UpdateContainerGroupRequestContainerLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbe extends TeaModel {
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("Exec")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbeExec exec;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet httpGet;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static UpdateContainerGroupRequestContainerLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbe self = new UpdateContainerGroupRequestContainerLivenessProbe();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setTcpSocket(UpdateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setExec(UpdateContainerGroupRequestContainerLivenessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbeExec getExec() {
            return this.exec;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setHttpGet(UpdateContainerGroupRequestContainerLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class UpdateContainerGroupRequestContainerEnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static UpdateContainerGroupRequestContainerEnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerEnvironmentVarFieldRef self = new UpdateContainerGroupRequestContainerEnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerEnvironmentVarFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class UpdateContainerGroupRequestContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerEnvironmentVar self = new UpdateContainerGroupRequestContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerEnvironmentVar setFieldRef(UpdateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public UpdateContainerGroupRequestContainerEnvironmentVarFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public UpdateContainerGroupRequestContainerEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateContainerGroupRequestContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateContainerGroupRequestContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerVolumeMount self = new UpdateContainerGroupRequestContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateContainerGroupRequestContainerVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateContainerGroupRequestContainerVolumeMount setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public UpdateContainerGroupRequestContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestContainerPort extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerPort self = new UpdateContainerGroupRequestContainerPort();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateContainerGroupRequestContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders self = new UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader self = new UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestContainer extends TeaModel {
        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerSecurityContext securityContext;

        @NameInMap("LivenessProbe")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbe livenessProbe;

        @NameInMap("EnvironmentVar")
        public java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> environmentVar;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("Arg")
        public java.util.List<String> arg;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("VolumeMount")
        public java.util.List<UpdateContainerGroupRequestContainerVolumeMount> volumeMount;

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

        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        @NameInMap("LifecyclePostStartHandlerExec")
        public java.util.List<String> lifecyclePostStartHandlerExec;

        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        @NameInMap("Port")
        public java.util.List<UpdateContainerGroupRequestContainerPort> port;

        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeaders")
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders;

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
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        public static UpdateContainerGroupRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainer self = new UpdateContainerGroupRequestContainer();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainer setReadinessProbe(UpdateContainerGroupRequestContainerReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public UpdateContainerGroupRequestContainerReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public UpdateContainerGroupRequestContainer setSecurityContext(UpdateContainerGroupRequestContainerSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public UpdateContainerGroupRequestContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public UpdateContainerGroupRequestContainer setLivenessProbe(UpdateContainerGroupRequestContainerLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public UpdateContainerGroupRequestContainer setEnvironmentVar(java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public UpdateContainerGroupRequestContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public UpdateContainerGroupRequestContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public UpdateContainerGroupRequestContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public UpdateContainerGroupRequestContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public UpdateContainerGroupRequestContainer setVolumeMount(java.util.List<UpdateContainerGroupRequestContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public UpdateContainerGroupRequestContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public UpdateContainerGroupRequestContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public UpdateContainerGroupRequestContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerExec(java.util.List<String> lifecyclePostStartHandlerExec) {
            this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public UpdateContainerGroupRequestContainer setPort(java.util.List<UpdateContainerGroupRequestContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerPort> getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHttpHeaders(java.util.List<UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders) {
            this.lifecyclePostStartHandlerHttpGetHttpHeaders = lifecyclePostStartHandlerHttpGetHttpHeaders;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders> getLifecyclePostStartHandlerHttpGetHttpHeaders() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeaders;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public UpdateContainerGroupRequestContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerExec(java.util.List<String> lifecyclePreStopHandlerExec) {
            this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
        }

        public UpdateContainerGroupRequestContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public UpdateContainerGroupRequestContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public UpdateContainerGroupRequestContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHttpHeader(java.util.List<UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
            this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
        }

        public UpdateContainerGroupRequestContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        public java.util.List<String> add;

        public static UpdateContainerGroupRequestInitContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerSecurityContextCapability self = new UpdateContainerGroupRequestInitContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerSecurityContextCapability setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }
        public java.util.List<String> getAdd() {
            return this.add;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        public UpdateContainerGroupRequestInitContainerSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static UpdateContainerGroupRequestInitContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerSecurityContext self = new UpdateContainerGroupRequestInitContainerSecurityContext();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerSecurityContext setCapability(UpdateContainerGroupRequestInitContainerSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public UpdateContainerGroupRequestInitContainerSecurityContextCapability getCapability() {
            return this.capability;
        }

        public UpdateContainerGroupRequestInitContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public UpdateContainerGroupRequestInitContainerSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestInitContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerVolumeMount self = new UpdateContainerGroupRequestInitContainerVolumeMount();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateContainerGroupRequestInitContainerVolumeMount setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateContainerGroupRequestInitContainerVolumeMount setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public UpdateContainerGroupRequestInitContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerPort extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestInitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerPort self = new UpdateContainerGroupRequestInitContainerPort();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateContainerGroupRequestInitContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef self = new UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerEnvironmentVar extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        public UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestInitContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerEnvironmentVar self = new UpdateContainerGroupRequestInitContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerEnvironmentVar setFieldRef(UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public UpdateContainerGroupRequestInitContainerEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateContainerGroupRequestInitContainerEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateContainerGroupRequestInitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        @Validation(required = true)
        public UpdateContainerGroupRequestInitContainerSecurityContext securityContext;

        @NameInMap("Image")
        public String image;

        @NameInMap("VolumeMount")
        public java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> volumeMount;

        @NameInMap("Port")
        public java.util.List<UpdateContainerGroupRequestInitContainerPort> port;

        @NameInMap("EnvironmentVar")
        public java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> environmentVar;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("Arg")
        public java.util.List<String> arg;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("Name")
        public String name;

        public static UpdateContainerGroupRequestInitContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainer self = new UpdateContainerGroupRequestInitContainer();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainer setSecurityContext(UpdateContainerGroupRequestInitContainerSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public UpdateContainerGroupRequestInitContainerSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public UpdateContainerGroupRequestInitContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateContainerGroupRequestInitContainer setVolumeMount(java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public UpdateContainerGroupRequestInitContainer setPort(java.util.List<UpdateContainerGroupRequestInitContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestInitContainerPort> getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestInitContainer setEnvironmentVar(java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public UpdateContainerGroupRequestInitContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public UpdateContainerGroupRequestInitContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public UpdateContainerGroupRequestInitContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public UpdateContainerGroupRequestInitContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public UpdateContainerGroupRequestInitContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public UpdateContainerGroupRequestInitContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateContainerGroupRequestInitContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public UpdateContainerGroupRequestInitContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public UpdateContainerGroupRequestInitContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public UpdateContainerGroupRequestInitContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public UpdateContainerGroupRequestInitContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateContainerGroupRequestImageRegistryCredential extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Server")
        public String server;

        @NameInMap("UserName")
        public String userName;

        public static UpdateContainerGroupRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestImageRegistryCredential self = new UpdateContainerGroupRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestImageRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateContainerGroupRequestImageRegistryCredential setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public UpdateContainerGroupRequestImageRegistryCredential setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
