// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupRequest extends TeaModel {
    @NameInMap("DnsConfig")
    public DnsConfig dnsConfig;

    /**
     * <p>Details of the Container Registry Enterprise Edition instance that hosts the image of the init container.</p>
     */
    @NameInMap("AcrRegistryInfo")
    public java.util.List<AcrRegistryInfo> acrRegistryInfo;

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
    public java.util.List<Container> container;

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
    public java.util.List<ImageRegistryCredential> imageRegistryCredential;

    /**
     * <p>The information about the new init container.</p>
     */
    @NameInMap("InitContainer")
    public java.util.List<InitContainer> initContainer;

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
    public java.util.List<Tag> tag;

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
    public java.util.List<Volume> volume;

    public static UpdateContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerGroupRequest self = new UpdateContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerGroupRequest setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public UpdateContainerGroupRequest setAcrRegistryInfo(java.util.List<AcrRegistryInfo> acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public java.util.List<AcrRegistryInfo> getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public UpdateContainerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContainerGroupRequest setContainer(java.util.List<Container> container) {
        this.container = container;
        return this;
    }
    public java.util.List<Container> getContainer() {
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

    public UpdateContainerGroupRequest setImageRegistryCredential(java.util.List<ImageRegistryCredential> imageRegistryCredential) {
        this.imageRegistryCredential = imageRegistryCredential;
        return this;
    }
    public java.util.List<ImageRegistryCredential> getImageRegistryCredential() {
        return this.imageRegistryCredential;
    }

    public UpdateContainerGroupRequest setInitContainer(java.util.List<InitContainer> initContainer) {
        this.initContainer = initContainer;
        return this;
    }
    public java.util.List<InitContainer> getInitContainer() {
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

    public UpdateContainerGroupRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public UpdateContainerGroupRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public UpdateContainerGroupRequest setVolume(java.util.List<Volume> volume) {
        this.volume = volume;
        return this;
    }
    public java.util.List<Volume> getVolume() {
        return this.volume;
    }

    public static class Option extends TeaModel {
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
         * <p>1.2.3.4</p>
         */
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        /**
         * <p>The configurations of DNS.</p>
         */
        @NameInMap("Option")
        public java.util.List<Option> option;

        /**
         * <p>The search domains of the Domain Name System (DNS) server.</p>
         * 
         * <strong>example:</strong>
         * <p>my.dns.search.suffix</p>
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

    public static class AcrRegistryInfo extends TeaModel {
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

        public static AcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            AcrRegistryInfo self = new AcrRegistryInfo();
            return TeaModel.build(map, self);
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

    public static class SecurityContext extends TeaModel {
        @NameInMap("Capability")
        public Capability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static SecurityContext build(java.util.Map<String, ?> map) throws Exception {
            SecurityContext self = new SecurityContext();
            return TeaModel.build(map, self);
        }

        public SecurityContext setCapability(Capability capability) {
            this.capability = capability;
            return this;
        }
        public Capability getCapability() {
            return this.capability;
        }

        public SecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public SecurityContext setRunAsUser(Long runAsUser) {
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

    public static class LifecyclePostStartHandlerHttpGetHttpHeaders extends TeaModel {
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

        public static LifecyclePostStartHandlerHttpGetHttpHeaders build(java.util.Map<String, ?> map) throws Exception {
            LifecyclePostStartHandlerHttpGetHttpHeaders self = new LifecyclePostStartHandlerHttpGetHttpHeaders();
            return TeaModel.build(map, self);
        }

        public LifecyclePostStartHandlerHttpGetHttpHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LifecyclePostStartHandlerHttpGetHttpHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class LifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
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
        public SecurityContext securityContext;

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
        public java.util.List<EnvironmentVar> environmentVar;

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
        public java.util.List<LifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders;

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
        public java.util.List<LifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

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
        public java.util.List<Port> port;

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
        public java.util.List<VolumeMount> volumeMount;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
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

        public Container setSecurityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public SecurityContext getSecurityContext() {
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

        public Container setLifecyclePostStartHandlerHttpGetHttpHeaders(java.util.List<LifecyclePostStartHandlerHttpGetHttpHeaders> lifecyclePostStartHandlerHttpGetHttpHeaders) {
            this.lifecyclePostStartHandlerHttpGetHttpHeaders = lifecyclePostStartHandlerHttpGetHttpHeaders;
            return this;
        }
        public java.util.List<LifecyclePostStartHandlerHttpGetHttpHeaders> getLifecyclePostStartHandlerHttpGetHttpHeaders() {
            return this.lifecyclePostStartHandlerHttpGetHttpHeaders;
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
        public java.util.List<InitContainerEnvironmentVar> environmentVar;

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
        public java.util.List<InitContainerPort> port;

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
        public java.util.List<InitContainerVolumeMount> volumeMount;

        /**
         * <p>The working directory of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/local/</p>
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

        public InitContainer setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public InitContainer setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public InitContainer setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
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

        @NameInMap("EmptyDirVolume")
        public EmptyDirVolume emptyDirVolume;

        @NameInMap("FlexVolume")
        public FlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        public HostPathVolume hostPathVolume;

        @NameInMap("NFSVolume")
        public NFSVolume NFSVolume;

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
