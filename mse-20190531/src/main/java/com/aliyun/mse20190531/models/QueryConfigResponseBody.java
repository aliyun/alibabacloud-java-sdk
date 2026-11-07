// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigResponseBody extends TeaModel {
    /**
     * <p>The result code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data overview.</p>
     */
    @NameInMap("Data")
    public QueryConfigResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8BD1E58D-0755-42AC-A599-E6B55112EC53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigResponseBody self = new QueryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryConfigResponseBody setData(QueryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConfigResponseBodyDataNacosRunningEnvFencePolicy extends TeaModel {
        @NameInMap("enabledModules")
        public java.util.List<String> enabledModules;

        @NameInMap("interceptPolicy")
        public java.util.Map<String, String> interceptPolicy;

        /**
         * <strong>example:</strong>
         * <p>query_security_check</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        public static QueryConfigResponseBodyDataNacosRunningEnvFencePolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryConfigResponseBodyDataNacosRunningEnvFencePolicy self = new QueryConfigResponseBodyDataNacosRunningEnvFencePolicy();
            return TeaModel.build(map, self);
        }

        public QueryConfigResponseBodyDataNacosRunningEnvFencePolicy setEnabledModules(java.util.List<String> enabledModules) {
            this.enabledModules = enabledModules;
            return this;
        }
        public java.util.List<String> getEnabledModules() {
            return this.enabledModules;
        }

        public QueryConfigResponseBodyDataNacosRunningEnvFencePolicy setInterceptPolicy(java.util.Map<String, String> interceptPolicy) {
            this.interceptPolicy = interceptPolicy;
            return this;
        }
        public java.util.Map<String, String> getInterceptPolicy() {
            return this.interceptPolicy;
        }

        public QueryConfigResponseBodyDataNacosRunningEnvFencePolicy setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class QueryConfigResponseBodyDataNacosRunningEnv extends TeaModel {
        /**
         * <p>The switch for push-empty protection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("emptyProtect")
        public Boolean emptyProtect;

        @NameInMap("fenceEnabled")
        public Boolean fenceEnabled;

        @NameInMap("fencePolicy")
        public QueryConfigResponseBodyDataNacosRunningEnvFencePolicy fencePolicy;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("grayAuth")
        public String grayAuth;

        public static QueryConfigResponseBodyDataNacosRunningEnv build(java.util.Map<String, ?> map) throws Exception {
            QueryConfigResponseBodyDataNacosRunningEnv self = new QueryConfigResponseBodyDataNacosRunningEnv();
            return TeaModel.build(map, self);
        }

        public QueryConfigResponseBodyDataNacosRunningEnv setEmptyProtect(Boolean emptyProtect) {
            this.emptyProtect = emptyProtect;
            return this;
        }
        public Boolean getEmptyProtect() {
            return this.emptyProtect;
        }

        public QueryConfigResponseBodyDataNacosRunningEnv setFenceEnabled(Boolean fenceEnabled) {
            this.fenceEnabled = fenceEnabled;
            return this;
        }
        public Boolean getFenceEnabled() {
            return this.fenceEnabled;
        }

        public QueryConfigResponseBodyDataNacosRunningEnv setFencePolicy(QueryConfigResponseBodyDataNacosRunningEnvFencePolicy fencePolicy) {
            this.fencePolicy = fencePolicy;
            return this;
        }
        public QueryConfigResponseBodyDataNacosRunningEnvFencePolicy getFencePolicy() {
            return this.fencePolicy;
        }

        public QueryConfigResponseBodyDataNacosRunningEnv setGrayAuth(String grayAuth) {
            this.grayAuth = grayAuth;
            return this;
        }
        public String getGrayAuth() {
            return this.grayAuth;
        }

    }

    public static class QueryConfigResponseBodyData extends TeaModel {
        /**
         * <p>The switch for ZooKeeper SASL-based forced identity authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthEnabled")
        public Boolean authEnabled;

        /**
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AutopurgePurgeInterval")
        public String autopurgePurgeInterval;

        /**
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AutopurgeSnapRetainCount")
        public String autopurgeSnapRetainCount;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The Nacos configuration. This parameter indicates whether RAM authentication is enabled for the configuration center. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigAuthEnabled")
        public Boolean configAuthEnabled;

        /**
         * <p>The Nacos configuration. This parameter indicates whether the configuration center of the current cluster supports RAM authentication. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: supported</p>
         * </li>
         * <li><p><code>false</code>: not supported</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigAuthSupported")
        public Boolean configAuthSupported;

        /**
         * <p>The maximum size of the content of a single configuration. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConfigContentLimit")
        public Long configContentLimit;

        /**
         * <p>The Nacos configuration. This parameter indicates whether configuration encryption is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigSecretEnabled")
        public Boolean configSecretEnabled;

        /**
         * <p>The Nacos configuration. This parameter indicates whether the cluster supports configuration encryption. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: supported</p>
         * </li>
         * <li><p><code>false</code>: not supported</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigSecretSupported")
        public Boolean configSecretSupported;

        /**
         * <p>Specifies whether to enable the Nacos open source console.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConsoleUIEnabled")
        public Boolean consoleUIEnabled;

        /**
         * <p>Specifies whether to enable the four-letter words command.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable4lw")
        public Boolean enable4lw;

        /**
         * <p>Specifies whether to enable port 8761 for access to the Eureka protocol. If you disable this port, applications cannot use the Eureka protocol for service registration and discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EurekaSupported")
        public Boolean eurekaSupported;

        /**
         * <p>The ZooKeeper parameter that specifies whether to enable the TTL configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExtendedTypesEnable")
        public Boolean extendedTypesEnable;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the maximum connection duration of an instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InitLimit")
        public String initLimit;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the maximum data size of each node. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JuteMaxbuffer")
        public String juteMaxbuffer;

        /**
         * <p>A reserved field.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("JvmFlagsCustom")
        public String jvmFlagsCustom;

        /**
         * <p>The Nacos configuration. This parameter indicates whether Mesh Configuration Protocol (MCP) is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MCPEnabled")
        public Boolean MCPEnabled;

        /**
         * <p>The Nacos configuration. This parameter indicates whether MCP is supported. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: supported</p>
         * </li>
         * <li><p><code>false</code>: not supported</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MCPSupported")
        public Boolean MCPSupported;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the number of connections between a client and a server.<br>
         * If this parameter is set to 0, no limit is imposed.<br></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxClientCnxns")
        public String maxClientCnxns;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the maximum timeout duration.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MaxSessionTimeout")
        public String maxSessionTimeout;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the minimum timeout duration.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MinSessionTimeout")
        public String minSessionTimeout;

        /**
         * <p>The runtime configuration of Nacos.</p>
         */
        @NameInMap("NacosRunningEnv")
        public QueryConfigResponseBodyDataNacosRunningEnv nacosRunningEnv;

        /**
         * <p>The Nacos configuration. This parameter indicates whether RAM authentication is enabled for the service registry. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NamingAuthEnabled")
        public Boolean namingAuthEnabled;

        /**
         * <p>The Nacos configuration. This parameter indicates whether the cluster supports RAM authentication for services. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: supported</p>
         * </li>
         * <li><p><code>false</code>: not supported</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NamingAuthSupported")
        public Boolean namingAuthSupported;

        /**
         * <p>The Nacos configuration. This parameter indicates whether the cluster supports service creation. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: supported</p>
         * </li>
         * <li><p><code>false</code>: not supported</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NamingCreateServiceSupported")
        public Boolean namingCreateServiceSupported;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates whether the super permission is enabled. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenSuperAcl")
        public Boolean openSuperAcl;

        /**
         * <p>The password. This parameter is returned only when OpenSuperAcl is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("PassWord")
        public String passWord;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PrometheusSdProtocolEnabled")
        public String prometheusSdProtocolEnabled;

        /**
         * <p>Indicates whether the cluster is restarted and the new configuration is applied. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The cluster is restarted.</p>
         * </li>
         * <li><p><code>false</code>: The cluster fails to be restarted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RestartFlag")
        public Boolean restartFlag;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the frequency of generating snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("SnapshotCount")
        public String snapshotCount;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates the connection timeout duration of an instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SyncLimit")
        public String syncLimit;

        /**
         * <p>MSE Nacos instances of version 2.1.2.1 or later support Transport Layer Security (TLS) encryption. The version of the Nacos client must be 2.2.1 or later. After you enable TLS, the performance may decrease by about 10%. You must evaluate the system capacity. For more information about the operations, see Nacos TLS transport encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TLSEnabled")
        public Boolean TLSEnabled;

        /**
         * <p>The ZooKeeper configuration. This parameter indicates a unit of time in the engine. The default value is 2000. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("TickTime")
        public String tickTime;

        /**
         * <p>The username. This parameter is returned only when OpenSuperAcl is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static QueryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConfigResponseBodyData self = new QueryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConfigResponseBodyData setAuthEnabled(Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }
        public Boolean getAuthEnabled() {
            return this.authEnabled;
        }

        public QueryConfigResponseBodyData setAutopurgePurgeInterval(String autopurgePurgeInterval) {
            this.autopurgePurgeInterval = autopurgePurgeInterval;
            return this;
        }
        public String getAutopurgePurgeInterval() {
            return this.autopurgePurgeInterval;
        }

        public QueryConfigResponseBodyData setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
            this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
            return this;
        }
        public String getAutopurgeSnapRetainCount() {
            return this.autopurgeSnapRetainCount;
        }

        public QueryConfigResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryConfigResponseBodyData setConfigAuthEnabled(Boolean configAuthEnabled) {
            this.configAuthEnabled = configAuthEnabled;
            return this;
        }
        public Boolean getConfigAuthEnabled() {
            return this.configAuthEnabled;
        }

        public QueryConfigResponseBodyData setConfigAuthSupported(Boolean configAuthSupported) {
            this.configAuthSupported = configAuthSupported;
            return this;
        }
        public Boolean getConfigAuthSupported() {
            return this.configAuthSupported;
        }

        public QueryConfigResponseBodyData setConfigContentLimit(Long configContentLimit) {
            this.configContentLimit = configContentLimit;
            return this;
        }
        public Long getConfigContentLimit() {
            return this.configContentLimit;
        }

        public QueryConfigResponseBodyData setConfigSecretEnabled(Boolean configSecretEnabled) {
            this.configSecretEnabled = configSecretEnabled;
            return this;
        }
        public Boolean getConfigSecretEnabled() {
            return this.configSecretEnabled;
        }

        public QueryConfigResponseBodyData setConfigSecretSupported(Boolean configSecretSupported) {
            this.configSecretSupported = configSecretSupported;
            return this;
        }
        public Boolean getConfigSecretSupported() {
            return this.configSecretSupported;
        }

        public QueryConfigResponseBodyData setConsoleUIEnabled(Boolean consoleUIEnabled) {
            this.consoleUIEnabled = consoleUIEnabled;
            return this;
        }
        public Boolean getConsoleUIEnabled() {
            return this.consoleUIEnabled;
        }

        public QueryConfigResponseBodyData setEnable4lw(Boolean enable4lw) {
            this.enable4lw = enable4lw;
            return this;
        }
        public Boolean getEnable4lw() {
            return this.enable4lw;
        }

        public QueryConfigResponseBodyData setEurekaSupported(Boolean eurekaSupported) {
            this.eurekaSupported = eurekaSupported;
            return this;
        }
        public Boolean getEurekaSupported() {
            return this.eurekaSupported;
        }

        public QueryConfigResponseBodyData setExtendedTypesEnable(Boolean extendedTypesEnable) {
            this.extendedTypesEnable = extendedTypesEnable;
            return this;
        }
        public Boolean getExtendedTypesEnable() {
            return this.extendedTypesEnable;
        }

        public QueryConfigResponseBodyData setInitLimit(String initLimit) {
            this.initLimit = initLimit;
            return this;
        }
        public String getInitLimit() {
            return this.initLimit;
        }

        public QueryConfigResponseBodyData setJuteMaxbuffer(String juteMaxbuffer) {
            this.juteMaxbuffer = juteMaxbuffer;
            return this;
        }
        public String getJuteMaxbuffer() {
            return this.juteMaxbuffer;
        }

        public QueryConfigResponseBodyData setJvmFlagsCustom(String jvmFlagsCustom) {
            this.jvmFlagsCustom = jvmFlagsCustom;
            return this;
        }
        public String getJvmFlagsCustom() {
            return this.jvmFlagsCustom;
        }

        public QueryConfigResponseBodyData setMCPEnabled(Boolean MCPEnabled) {
            this.MCPEnabled = MCPEnabled;
            return this;
        }
        public Boolean getMCPEnabled() {
            return this.MCPEnabled;
        }

        public QueryConfigResponseBodyData setMCPSupported(Boolean MCPSupported) {
            this.MCPSupported = MCPSupported;
            return this;
        }
        public Boolean getMCPSupported() {
            return this.MCPSupported;
        }

        public QueryConfigResponseBodyData setMaxClientCnxns(String maxClientCnxns) {
            this.maxClientCnxns = maxClientCnxns;
            return this;
        }
        public String getMaxClientCnxns() {
            return this.maxClientCnxns;
        }

        public QueryConfigResponseBodyData setMaxSessionTimeout(String maxSessionTimeout) {
            this.maxSessionTimeout = maxSessionTimeout;
            return this;
        }
        public String getMaxSessionTimeout() {
            return this.maxSessionTimeout;
        }

        public QueryConfigResponseBodyData setMinSessionTimeout(String minSessionTimeout) {
            this.minSessionTimeout = minSessionTimeout;
            return this;
        }
        public String getMinSessionTimeout() {
            return this.minSessionTimeout;
        }

        public QueryConfigResponseBodyData setNacosRunningEnv(QueryConfigResponseBodyDataNacosRunningEnv nacosRunningEnv) {
            this.nacosRunningEnv = nacosRunningEnv;
            return this;
        }
        public QueryConfigResponseBodyDataNacosRunningEnv getNacosRunningEnv() {
            return this.nacosRunningEnv;
        }

        public QueryConfigResponseBodyData setNamingAuthEnabled(Boolean namingAuthEnabled) {
            this.namingAuthEnabled = namingAuthEnabled;
            return this;
        }
        public Boolean getNamingAuthEnabled() {
            return this.namingAuthEnabled;
        }

        public QueryConfigResponseBodyData setNamingAuthSupported(Boolean namingAuthSupported) {
            this.namingAuthSupported = namingAuthSupported;
            return this;
        }
        public Boolean getNamingAuthSupported() {
            return this.namingAuthSupported;
        }

        public QueryConfigResponseBodyData setNamingCreateServiceSupported(Boolean namingCreateServiceSupported) {
            this.namingCreateServiceSupported = namingCreateServiceSupported;
            return this;
        }
        public Boolean getNamingCreateServiceSupported() {
            return this.namingCreateServiceSupported;
        }

        public QueryConfigResponseBodyData setOpenSuperAcl(Boolean openSuperAcl) {
            this.openSuperAcl = openSuperAcl;
            return this;
        }
        public Boolean getOpenSuperAcl() {
            return this.openSuperAcl;
        }

        public QueryConfigResponseBodyData setPassWord(String passWord) {
            this.passWord = passWord;
            return this;
        }
        public String getPassWord() {
            return this.passWord;
        }

        public QueryConfigResponseBodyData setPrometheusSdProtocolEnabled(String prometheusSdProtocolEnabled) {
            this.prometheusSdProtocolEnabled = prometheusSdProtocolEnabled;
            return this;
        }
        public String getPrometheusSdProtocolEnabled() {
            return this.prometheusSdProtocolEnabled;
        }

        public QueryConfigResponseBodyData setRestartFlag(Boolean restartFlag) {
            this.restartFlag = restartFlag;
            return this;
        }
        public Boolean getRestartFlag() {
            return this.restartFlag;
        }

        public QueryConfigResponseBodyData setSnapshotCount(String snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public String getSnapshotCount() {
            return this.snapshotCount;
        }

        public QueryConfigResponseBodyData setSyncLimit(String syncLimit) {
            this.syncLimit = syncLimit;
            return this;
        }
        public String getSyncLimit() {
            return this.syncLimit;
        }

        public QueryConfigResponseBodyData setTLSEnabled(Boolean TLSEnabled) {
            this.TLSEnabled = TLSEnabled;
            return this;
        }
        public Boolean getTLSEnabled() {
            return this.TLSEnabled;
        }

        public QueryConfigResponseBodyData setTickTime(String tickTime) {
            this.tickTime = tickTime;
            return this;
        }
        public String getTickTime() {
            return this.tickTime;
        }

        public QueryConfigResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
