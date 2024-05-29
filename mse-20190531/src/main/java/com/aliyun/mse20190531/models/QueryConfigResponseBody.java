// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public QueryConfigResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
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

    public static class QueryConfigResponseBodyDataNacosRunningEnv extends TeaModel {
        /**
         * <p>Indicates whether empty list protection is enabled.</p>
         */
        @NameInMap("emptyProtect")
        public Boolean emptyProtect;

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

    }

    public static class QueryConfigResponseBodyData extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("AutopurgePurgeInterval")
        public String autopurgePurgeInterval;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("AutopurgeSnapRetainCount")
        public String autopurgeSnapRetainCount;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>Indicates whether RAM authentication of a configuration center is enabled. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("ConfigAuthEnabled")
        public Boolean configAuthEnabled;

        /**
         * <p>Indicates whether RAM authentication is supported by a configuration center of the instance. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: supported.</p>
         * <p>*   `false`: not supported.</p>
         */
        @NameInMap("ConfigAuthSupported")
        public Boolean configAuthSupported;

        /**
         * <p>The maximum size of contents in a configuration. Unit: KB.</p>
         */
        @NameInMap("ConfigContentLimit")
        public Long configContentLimit;

        /**
         * <p>Indicates whether configuration encryption of a configuration center is enabled by the instance. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("ConfigSecretEnabled")
        public Boolean configSecretEnabled;

        /**
         * <p>Indicates whether configuration encryption of a configuration center is supported by the instance. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: supported.</p>
         * <p>*   `false`: not supported.</p>
         */
        @NameInMap("ConfigSecretSupported")
        public Boolean configSecretSupported;

        /**
         * <p>Indicates whether the Nacos open source console is enabled.</p>
         */
        @NameInMap("ConsoleUIEnabled")
        public Boolean consoleUIEnabled;

        /**
         * <p>Indicates whether access port 8761 was enabled for Eureka. If this port is disabled, applications cannot use the Eureka protocol for service registration and discovery.</p>
         */
        @NameInMap("EurekaSupported")
        public Boolean eurekaSupported;

        /**
         * <p>Indicates whether the time to live (TTL) configuration is enabled. This parameter is valid for ZooKeeper instances.</p>
         */
        @NameInMap("ExtendedTypesEnable")
        public Boolean extendedTypesEnable;

        /**
         * <p>The maximum connection duration of the instance. Unit: seconds. This parameter is valid for ZooKeeper instances.</p>
         */
        @NameInMap("InitLimit")
        public String initLimit;

        /**
         * <p>The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. Unit: bytes.</p>
         */
        @NameInMap("JuteMaxbuffer")
        public String juteMaxbuffer;

        /**
         * <p>A reserved parameter.</p>
         */
        @NameInMap("JvmFlagsCustom")
        public String jvmFlagsCustom;

        /**
         * <p>Indicates whether Mesh Configuration Protocol (MCP) is enabled. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("MCPEnabled")
        public Boolean MCPEnabled;

        /**
         * <p>Indicates whether MCP is supported. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: supported.</p>
         * <p>*   `false`: not supported.</p>
         */
        @NameInMap("MCPSupported")
        public Boolean MCPSupported;

        /**
         * <p>The number of connections between a client and a server. This parameter is valid for ZooKeeper instances.\\</p>
         * <p>If this parameter is set to 0, no limits are imposed on the number of connections.</p>
         */
        @NameInMap("MaxClientCnxns")
        public String maxClientCnxns;

        /**
         * <p>The maximum timeout period. This parameter is valid for ZooKeeper instances.</p>
         */
        @NameInMap("MaxSessionTimeout")
        public String maxSessionTimeout;

        /**
         * <p>The minimum timeout period. This parameter is valid for ZooKeeper instances.</p>
         */
        @NameInMap("MinSessionTimeout")
        public String minSessionTimeout;

        /**
         * <p>The runtime configuration of the Nacos instance.</p>
         */
        @NameInMap("NacosRunningEnv")
        public QueryConfigResponseBodyDataNacosRunningEnv nacosRunningEnv;

        /**
         * <p>Indicates whether RAM authentication of a registry is enabled. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("NamingAuthEnabled")
        public Boolean namingAuthEnabled;

        /**
         * <p>Indicates whether RAM authentication of services is supported by the instance. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: supported.</p>
         * <p>*   `false`: not supported.</p>
         */
        @NameInMap("NamingAuthSupported")
        public Boolean namingAuthSupported;

        /**
         * <p>Indicates whether service creation is supported for the instance. This parameter is valid for Nacos instances. Valid values:</p>
         * <br>
         * <p>*   `true`: supported.</p>
         * <p>*   `false`: not supported.</p>
         */
        @NameInMap("NamingCreateServiceSupported")
        public Boolean namingCreateServiceSupported;

        /**
         * <p>Indicates whether super permissions are enabled. This parameter is valid for ZooKeeper instances. Valid values:</p>
         * <br>
         * <p>*   `true`: enabled.</p>
         * <p>*   `false`: disabled.</p>
         */
        @NameInMap("OpenSuperAcl")
        public Boolean openSuperAcl;

        /**
         * <p>The password that corresponds to the username. This parameter is valid only if OpenSuperAcl is set to true.</p>
         */
        @NameInMap("PassWord")
        public String passWord;

        /**
         * <p>Indicates whether the instance was restarted and new configurations have taken effect. Valid values:</p>
         * <br>
         * <p>*   `true`: The restart was successful.</p>
         * <p>*   `false`: The restart failed.</p>
         */
        @NameInMap("RestartFlag")
        public Boolean restartFlag;

        /**
         * <p>The frequency for generating snapshots. This parameter is valid for ZooKeeper instances.</p>
         */
        @NameInMap("SnapshotCount")
        public String snapshotCount;

        /**
         * <p>The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
         */
        @NameInMap("SyncLimit")
        public String syncLimit;

        /**
         * <p>MSE Nacos supports TLS transmission link encryption since version 2.1.2.1. Nacos clients must be upgraded to version 2.2.1 or later. After TLS is enabled, the system performance will decrease by about 10%. You must evaluate the system capacity. For more information about the relevant operations, see Nacos TLS transmission encryption.</p>
         */
        @NameInMap("TLSEnabled")
        public Boolean TLSEnabled;

        /**
         * <p>The time unit of the engine. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.</p>
         */
        @NameInMap("TickTime")
        public String tickTime;

        /**
         * <p>The username of the user. This parameter is valid only if OpenSuperAcl is set to true.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static QueryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConfigResponseBodyData self = new QueryConfigResponseBodyData();
            return TeaModel.build(map, self);
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
