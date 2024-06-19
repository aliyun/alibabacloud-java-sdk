// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupRequest extends TeaModel {
    @NameInMap("DnsConfig")
    public UpdateContainerGroupRequestDnsConfig dnsConfig;

    /**
     * <p>Details of the Container Registry Enterprise Edition instance that hosts the image of the init container.</p>
     */
    @NameInMap("AcrRegistryInfo")
    public java.util.List<UpdateContainerGroupRequestAcrRegistryInfo> acrRegistryInfo;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new configurations of the container group.</p>
     */
    @NameInMap("Container")
    public java.util.List<UpdateContainerGroupRequestContainer> container;

    /**
     * <p>The ID of the elastic container instance that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-2zelg8vwnlzdhf8hv****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The number of vCPUs that are allocated to the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The information about the credentials of the image repository.</p>
     */
    @NameInMap("ImageRegistryCredential")
    public java.util.List<UpdateContainerGroupRequestImageRegistryCredential> imageRegistryCredential;

    /**
     * <p>The information about the new init container.</p>
     */
    @NameInMap("InitContainer")
    public java.util.List<UpdateContainerGroupRequestInitContainer> initContainer;

    /**
     * <p>The size of the memory that is allocated to the elastic container instance. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("Memory")
    public Float memory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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
     * <p>rg-2df3isufhi38****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The restart policy of the elastic container instance. Valid values:</p>
     * <ul>
     * <li>Always: Always restarts the instance if a container in the instance exits upon termination.</li>
     * <li>Never: Never restarts the instance if a container in the instance exits upon termination.</li>
     * <li>OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The tags that are bound to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateContainerGroupRequestTag> tag;

    /**
     * <p>The update type. Valid values:</p>
     * <ul>
     * <li>RenewUpdate: full updates. You must specify all relevant parameters to update the elastic container instance. For a parameter of the list type, you must specify all the items contained in the parameter even if you want to update only some of the items. For a parameter of the struct type, you must specify all the members even if you want to update only some of the members.</li>
     * <li>IncrementalUpdate: incremental updates. You may specify only the parameter that you want to update. Other related parameters remain unchanged.</li>
     * </ul>
     * <p>Default value: RenewUpdate.</p>
     * 
     * <strong>example:</strong>
     * <p>RenewUpdate</p>
     */
    @NameInMap("UpdateType")
    public String updateType;

    /**
     * <p>The volumes that are mounted to the instance.</p>
     */
    @NameInMap("Volume")
    public java.util.List<UpdateContainerGroupRequestVolume> volume;

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

    public UpdateContainerGroupRequest setAcrRegistryInfo(java.util.List<UpdateContainerGroupRequestAcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestAcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public UpdateContainerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContainerGroupRequest setContainer(java.util.List<UpdateContainerGroupRequestContainer> container) {
        this.container = container;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestContainer> getContainer() {
        return this.container;
    }

    public UpdateContainerGroupRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public UpdateContainerGroupRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateContainerGroupRequest setImageRegistryCredential(java.util.List<UpdateContainerGroupRequestImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public UpdateContainerGroupRequest setInitContainer(java.util.List<UpdateContainerGroupRequestInitContainer> initContainer) {
        this.initContainer = initContainer;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestInitContainer> getInitContainer() {
        return this.initContainer;
    }

    public UpdateContainerGroupRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public UpdateContainerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateContainerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateContainerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateContainerGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public UpdateContainerGroupRequest setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public UpdateContainerGroupRequest setTag(java.util.List<UpdateContainerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestTag> getTag() {
        return this.tag;
    }

    public UpdateContainerGroupRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public UpdateContainerGroupRequest setVolume(java.util.List<UpdateContainerGroupRequestVolume> volume) {
        this.volume = volume;
        return this;
    }
    public java.util.List<UpdateContainerGroupRequestVolume> getVolume() {
        return this.volume;
    }

    public static class UpdateContainerGroupRequestDnsConfigOption extends TeaModel {
        /**
         * <p>The option name of DNS configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>ndots</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The option value of DNS configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestDnsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestDnsConfigOption self = new UpdateContainerGroupRequestDnsConfigOption();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestDnsConfigOption setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContainerGroupRequestDnsConfigOption setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateContainerGroupRequestDnsConfig extends TeaModel {
        /**
         * <p>The IP addresses of DNS servers.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        /**
         * <p>The configurations of DNS.</p>
         */
        @NameInMap("Option")
        public java.util.List<UpdateContainerGroupRequestDnsConfigOption> option;

        /**
         * <p>The search domains of the Domain Name System (DNS) server.</p>
         * 
         * <strong>example:</strong>
         * <p>my.dns.search.suffix</p>
         */
        @NameInMap("Search")
        public java.util.List<String> search;

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

        public UpdateContainerGroupRequestDnsConfig setOption(java.util.List<UpdateContainerGroupRequestDnsConfigOption> option) {
            this.option = option;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestDnsConfigOption> getOption() {
            return this.option;
        }

        public UpdateContainerGroupRequestDnsConfig setSearch(java.util.List<String> search) {
            this.search = search;
            return this;
        }
        public java.util.List<String> getSearch() {
            return this.search;
        }

    }

    public static class UpdateContainerGroupRequestAcrRegistryInfo extends TeaModel {
        /**
         * <p>The domain names of the Container Registry Enterprise Edition instance. By default, all domain names of the instance are displayed. You can specify specific domain names. Separate multiple domain names with commas (,).</p>
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
         * <p>The ID of the region where the Container Registry Enterprise Edition instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static UpdateContainerGroupRequestAcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestAcrRegistryInfo self = new UpdateContainerGroupRequestAcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestAcrRegistryInfo setDomain(java.util.List<String> domain) {
            this.domain = domain;
            return this;
        }
        public java.util.List<String> getDomain() {
            return this.domain;
        }

        public UpdateContainerGroupRequestAcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateContainerGroupRequestAcrRegistryInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public UpdateContainerGroupRequestAcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static UpdateContainerGroupRequestContainerLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeHttpGet self = new UpdateContainerGroupRequestContainerLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
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

    public static class UpdateContainerGroupRequestContainerLivenessProbe extends TeaModel {
        @NameInMap("Exec")
        public UpdateContainerGroupRequestContainerLivenessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public UpdateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static UpdateContainerGroupRequestContainerLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbe self = new UpdateContainerGroupRequestContainerLivenessProbe();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setExec(UpdateContainerGroupRequestContainerLivenessProbeExec exec) {
            this.exec = exec;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbeExec getExec() {
            return this.exec;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setHttpGet(UpdateContainerGroupRequestContainerLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setTcpSocket(UpdateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public UpdateContainerGroupRequestContainerLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
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

    public static class UpdateContainerGroupRequestContainerReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static UpdateContainerGroupRequestContainerReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeHttpGet self = new UpdateContainerGroupRequestContainerReadinessProbeHttpGet();
            return TeaModel.build(map, self);
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

        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
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

    public static class UpdateContainerGroupRequestContainerReadinessProbe extends TeaModel {
        @NameInMap("Exec")
        public UpdateContainerGroupRequestContainerReadinessProbeExec exec;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("TcpSocket")
        public UpdateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static UpdateContainerGroupRequestContainerReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbe self = new UpdateContainerGroupRequestContainerReadinessProbe();
            return TeaModel.build(map, self);
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

        public UpdateContainerGroupRequestContainerReadinessProbe setHttpGet(UpdateContainerGroupRequestContainerReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public UpdateContainerGroupRequestContainerReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
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

        public UpdateContainerGroupRequestContainerReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
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
        public UpdateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef;

        /**
         * <p>The name of the environment variable for the container.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable for the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/local/</p>
         */
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

    public static class UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders extends TeaModel {
        /**
         * <p>The request parameter of the HTTP GET request when you use an HTTP request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The request parameter value of the HTTP GET request when you use an HTTP request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders self = new UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        /**
         * <p>The request parameter of the HTTP GET request when you use an HTTP request to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The request parameter value of the HTTP GET request when you use an HTTP request to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader self = new UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateContainerGroupRequestContainerPort extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol of the container. Valid values: TCP and UDP.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static UpdateContainerGroupRequestContainerPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerPort self = new UpdateContainerGroupRequestContainerPort();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateContainerGroupRequestContainerVolumeMount extends TeaModel {
        /**
         * <p>The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: This volume mount does not receive subsequent mounts that are performed on this volume or subdirectories of this volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.</li>
         * <li>Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or the subdirectories of the volume. In addition, all volume mounts that are mounted on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume that is mounted to the container. Valid values: the values of Volume.N.Name, which are the names of volumes that are mounted to the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
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
         * <p>The subdirectory of the volume that is mounted to the container. You can use this parameter to mount the same volume to different subdirectories of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/sub/</p>
         */
        @NameInMap("SubPath")
        public String subPath;

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

        public UpdateContainerGroupRequestContainerVolumeMount setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public UpdateContainerGroupRequestContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    }

    public static class UpdateContainerGroupRequestContainer extends TeaModel {
        @NameInMap("LivenessProbe")
        public UpdateContainerGroupRequestContainerLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public UpdateContainerGroupRequestContainerReadinessProbe readinessProbe;

        @NameInMap("SecurityContext")
        public UpdateContainerGroupRequestContainerSecurityContext securityContext;

        /**
         * <p>The arguments that you want to pass to the startup command of the container. You can specify up to 10 arguments.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The commands that you want to run to perform the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that you want to allocate to the container</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variables for the container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> environmentVar;

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
         * <p>jenkins</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: Each time the instance is updated, image pulling is performed.</li>
         * <li>IfNotPresent: On-premises images are used first. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Never</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The commands to be executed in the container when you use the CLI to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("LifecyclePostStartHandlerExec")
        public java.util.List<String> lifecyclePostStartHandlerExec;

        /**
         * <p>The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        /**
         * <p>The information about the valid HTTP request headers among the generated HTTP request headers.</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeaders")
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders;

        /**
         * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        /**
         * <p>The port to which the system sends the HTTP GET request when you use an HTTP request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        /**
         * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        /**
         * <p>The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        /**
         * <p>The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify the postStart callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        /**
         * <p>The commands to be executed in the container when you use the CLI to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("LifecyclePreStopHandlerExec")
        public java.util.List<String> lifecyclePreStopHandlerExec;

        /**
         * <p>The IP address of the host that receives the HTTP GET request when you use an HTTP request to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        /**
         * <p>The information about the generated HTTP request header.</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        /**
         * <p>The path to which the system sends an HTTP GET request for a health check when you use an HTTP request to specify the preSop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthyz</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        /**
         * <p>The port to which the system sends the HTTP GET request for a health check when you use an HTTP request to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        /**
         * <p>The protocol type of the HTTP GET request when you use an HTTP request to specify the preStop callback function. Valid values:</p>
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
         * <p>The IP address of the host that receives the TCP socket request when you use a TCP socket request to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        /**
         * <p>The port to which the system sends a TCP socket request for a health check when you use TCP sockets to specify the preStop callback function.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        /**
         * <p>The memory size of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>jenkins</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check.</p>
         */
        @NameInMap("Port")
        public java.util.List<UpdateContainerGroupRequestContainerPort> port;

        /**
         * <p>Specifies whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions. If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable interaction. Default value: false. If the command is a /bin/bash command, set the value to true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>Pod volumes that you want to mount into the filesystem of the container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<UpdateContainerGroupRequestContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static UpdateContainerGroupRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainer self = new UpdateContainerGroupRequestContainer();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestContainer setLivenessProbe(UpdateContainerGroupRequestContainerLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public UpdateContainerGroupRequestContainerLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
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

        public UpdateContainerGroupRequestContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public UpdateContainerGroupRequestContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateContainerGroupRequestContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public UpdateContainerGroupRequestContainer setEnvironmentVar(java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public UpdateContainerGroupRequestContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public UpdateContainerGroupRequestContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateContainerGroupRequestContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerExec(java.util.List<String> lifecyclePostStartHandlerExec) {
            this.lifecyclePostStartHandlerExec = lifecyclePostStartHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePostStartHandlerExec() {
            return this.lifecyclePostStartHandlerExec;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
            this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetHost() {
            return this.lifecyclePostStartHandlerHttpGetHost;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetHttpHeaders(java.util.List<UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders) {
            this.lifecyclePostStartHandlerHttpGetHttpHeaders = lifecyclePostStartHandlerHttpGetHttpHeaders;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeaders> getLifecyclePostStartHandlerHttpGetHttpHeaders() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeaders;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
            this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetPath() {
            return this.lifecyclePostStartHandlerHttpGetPath;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
            this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerHttpGetPort() {
            return this.lifecyclePostStartHandlerHttpGetPort;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
            this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePostStartHandlerHttpGetScheme() {
            return this.lifecyclePostStartHandlerHttpGetScheme;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
            this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePostStartHandlerTcpSocketHost() {
            return this.lifecyclePostStartHandlerTcpSocketHost;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
            this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePostStartHandlerTcpSocketPort() {
            return this.lifecyclePostStartHandlerTcpSocketPort;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerExec(java.util.List<String> lifecyclePreStopHandlerExec) {
            this.lifecyclePreStopHandlerExec = lifecyclePreStopHandlerExec;
            return this;
        }
        public java.util.List<String> getLifecyclePreStopHandlerExec() {
            return this.lifecyclePreStopHandlerExec;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
            this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetHost() {
            return this.lifecyclePreStopHandlerHttpGetHost;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetHttpHeader(java.util.List<UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader) {
            this.lifecyclePreStopHandlerHttpGetHttpHeader = lifecyclePreStopHandlerHttpGetHttpHeader;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> getLifecyclePreStopHandlerHttpGetHttpHeader() {
            return this.lifecyclePreStopHandlerHttpGetHttpHeader;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
            this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetPath() {
            return this.lifecyclePreStopHandlerHttpGetPath;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
            this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerHttpGetPort() {
            return this.lifecyclePreStopHandlerHttpGetPort;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
            this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
            return this;
        }
        public String getLifecyclePreStopHandlerHttpGetScheme() {
            return this.lifecyclePreStopHandlerHttpGetScheme;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
            this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
            return this;
        }
        public String getLifecyclePreStopHandlerTcpSocketHost() {
            return this.lifecyclePreStopHandlerTcpSocketHost;
        }

        public UpdateContainerGroupRequestContainer setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
            this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
            return this;
        }
        public Integer getLifecyclePreStopHandlerTcpSocketPort() {
            return this.lifecyclePreStopHandlerTcpSocketPort;
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

        public UpdateContainerGroupRequestContainer setPort(java.util.List<UpdateContainerGroupRequestContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerPort> getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public UpdateContainerGroupRequestContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public UpdateContainerGroupRequestContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public UpdateContainerGroupRequestContainer setVolumeMount(java.util.List<UpdateContainerGroupRequestContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public UpdateContainerGroupRequestContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class UpdateContainerGroupRequestImageRegistryCredential extends TeaModel {
        /**
         * <p>The password that you use to access the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourpassword</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The address of the image repository. This address does not contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/ecitest/nginx:alpine</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The username that you use to access the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>yourname</p>
         */
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
        public UpdateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef;

        /**
         * <p>The name of the environment variable for the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable for the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
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

    public static class UpdateContainerGroupRequestInitContainerPort extends TeaModel {
        /**
         * <p>The port number of the init container. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol of the init container. Valid values: TCP and UDP.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static UpdateContainerGroupRequestInitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerPort self = new UpdateContainerGroupRequestInitContainerPort();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestInitContainerPort setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestInitContainerPort setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateContainerGroupRequestInitContainerVolumeMount extends TeaModel {
        /**
         * <p>The mount directory of the init container. The data in this directory is overwritten by the data on the volume. Specify this parameter with caution.</p>
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
         * <li>HostToContainer: The volume mount receives all subsequent mounts that are performed on this volume or subdirectories of this volume.</li>
         * <li>Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or the subdirectories of the volume. In addition, all volume mounts that are mounted on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * <p>Default value: None.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume that is mounted to the init container. Valid values: the values of Volume.N.Name, which are the names of volumes that are mounted to the elastic container instance.</p>
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
         * <p>The subdirectory of the volume that is mounted to the init container. You can use this parameter to mount the same volume to different subdirectories of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>data2/</p>
         */
        @NameInMap("SubPath")
        public String subPath;

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

        public UpdateContainerGroupRequestInitContainerVolumeMount setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public UpdateContainerGroupRequestInitContainerVolumeMount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    }

    public static class UpdateContainerGroupRequestInitContainer extends TeaModel {
        @NameInMap("SecurityContext")
        public UpdateContainerGroupRequestInitContainerSecurityContext securityContext;

        /**
         * <p>The arguments that you want to pass to the startup command of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Arg")
        public java.util.List<String> arg;

        /**
         * <p>The commands that are used to start the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/sh sleep</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that you want to allocate to the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The environment variable of the init container.</p>
         */
        @NameInMap("EnvironmentVar")
        public java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> environmentVar;

        /**
         * <p>The number of GPUs you want to allocate to the init container.</p>
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
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: Each time the instance is updated, image pulling is performed.</li>
         * <li>IfNotPresent: On-premises images are used first. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Onfailure</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The memory size of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>init-nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public java.util.List<UpdateContainerGroupRequestInitContainerPort> port;

        /**
         * <p>Specifies whether the init container allocates buffer resources to standard input streams when the init container is running. If you do not specify this parameter, an EOF error may occur when standard input streams in the init container are read. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Specifies whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions. If StdinOnce is set to true, standard input streams are connected after the init container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the init container restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Specifies whether to enable interaction. Default value: false. If the command is a /bin/bash command, set the value to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>The information about the volume that you want to mount on the init container.</p>
         */
        @NameInMap("VolumeMount")
        public java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/local/</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

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

        public UpdateContainerGroupRequestInitContainer setArg(java.util.List<String> arg) {
            this.arg = arg;
            return this;
        }
        public java.util.List<String> getArg() {
            return this.arg;
        }

        public UpdateContainerGroupRequestInitContainer setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateContainerGroupRequestInitContainer setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public UpdateContainerGroupRequestInitContainer setEnvironmentVar(java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> environmentVar) {
            this.environmentVar = environmentVar;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        public UpdateContainerGroupRequestInitContainer setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public UpdateContainerGroupRequestInitContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateContainerGroupRequestInitContainer setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public UpdateContainerGroupRequestInitContainer setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public UpdateContainerGroupRequestInitContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContainerGroupRequestInitContainer setPort(java.util.List<UpdateContainerGroupRequestInitContainerPort> port) {
            this.port = port;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestInitContainerPort> getPort() {
            return this.port;
        }

        public UpdateContainerGroupRequestInitContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public UpdateContainerGroupRequestInitContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public UpdateContainerGroupRequestInitContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public UpdateContainerGroupRequestInitContainer setVolumeMount(java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public UpdateContainerGroupRequestInitContainer setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class UpdateContainerGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>hxh</p>
         */
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

    public static class UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        public static UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath self = new UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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

        @NameInMap("SizeLimit")
        public String sizeLimit;

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

        public UpdateContainerGroupRequestVolumeEmptyDirVolume setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class UpdateContainerGroupRequestVolumeFlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        public static UpdateContainerGroupRequestVolumeFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeFlexVolume self = new UpdateContainerGroupRequestVolumeFlexVolume();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeFlexVolume setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public UpdateContainerGroupRequestVolumeFlexVolume setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public UpdateContainerGroupRequestVolumeFlexVolume setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

    }

    public static class UpdateContainerGroupRequestVolumeHostPathVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        public static UpdateContainerGroupRequestVolumeHostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeHostPathVolume self = new UpdateContainerGroupRequestVolumeHostPathVolume();
            return TeaModel.build(map, self);
        }

        public UpdateContainerGroupRequestVolumeHostPathVolume setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateContainerGroupRequestVolumeHostPathVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateContainerGroupRequestVolumeNFSVolume extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Server")
        public String server;

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

        public UpdateContainerGroupRequestVolumeNFSVolume setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateContainerGroupRequestVolumeNFSVolume setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class UpdateContainerGroupRequestVolume extends TeaModel {
        @NameInMap("ConfigFileVolume")
        public UpdateContainerGroupRequestVolumeConfigFileVolume configFileVolume;

        @NameInMap("EmptyDirVolume")
        public UpdateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        public UpdateContainerGroupRequestVolumeFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        public UpdateContainerGroupRequestVolumeHostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        public UpdateContainerGroupRequestVolumeNFSVolume NFSVolume;

        /**
         * <p>The volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
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
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EmptyDirVolume</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateContainerGroupRequestVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolume self = new UpdateContainerGroupRequestVolume();
            return TeaModel.build(map, self);
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

        public UpdateContainerGroupRequestVolume setFlexVolume(UpdateContainerGroupRequestVolumeFlexVolume flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }
        public UpdateContainerGroupRequestVolumeFlexVolume getFlexVolume() {
            return this.flexVolume;
        }

        public UpdateContainerGroupRequestVolume setHostPathVolume(UpdateContainerGroupRequestVolumeHostPathVolume hostPathVolume) {
            this.hostPathVolume = hostPathVolume;
            return this;
        }
        public UpdateContainerGroupRequestVolumeHostPathVolume getHostPathVolume() {
            return this.hostPathVolume;
        }

        public UpdateContainerGroupRequestVolume setNFSVolume(UpdateContainerGroupRequestVolumeNFSVolume NFSVolume) {
            this.NFSVolume = NFSVolume;
            return this;
        }
        public UpdateContainerGroupRequestVolumeNFSVolume getNFSVolume() {
            return this.NFSVolume;
        }

        public UpdateContainerGroupRequestVolume setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateContainerGroupRequestVolume setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
