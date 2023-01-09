// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public QueryConfigResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
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
        // A reserved parameter.
        @NameInMap("AutopurgePurgeInterval")
        public String autopurgePurgeInterval;

        // A reserved parameter.
        @NameInMap("AutopurgeSnapRetainCount")
        public String autopurgeSnapRetainCount;

        // The name of the instance.
        @NameInMap("ClusterName")
        public String clusterName;

        // Indicates whether RAM authorization of a configuration center is enabled. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: enabled
        // *   `false`: disabled
        @NameInMap("ConfigAuthEnabled")
        public Boolean configAuthEnabled;

        // Indicates whether RAM authorization is supported by a configuration center of the instance. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: supported
        // *   `false`: not supported
        @NameInMap("ConfigAuthSupported")
        public Boolean configAuthSupported;

        @NameInMap("ConfigContentLimit")
        public Long configContentLimit;

        // Indicates whether configuration encryption of a configuration center is enabled by the instance. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: enabled
        // *   `false`: disabled
        @NameInMap("ConfigSecretEnabled")
        public Boolean configSecretEnabled;

        // Indicates whether configuration encryption of a configuration center is supported by the instance. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: supported
        // *   `false`: not supported
        @NameInMap("ConfigSecretSupported")
        public Boolean configSecretSupported;

        @NameInMap("ExtendedTypesEnable")
        public Boolean extendedTypesEnable;

        // The maximum connection duration of the instance. Unit: seconds. This parameter is valid for ZooKeeper instances.
        @NameInMap("InitLimit")
        public String initLimit;

        // The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. Unit: bytes.
        @NameInMap("JuteMaxbuffer")
        public String juteMaxbuffer;

        // A reserved parameter.
        @NameInMap("JvmFlagsCustom")
        public String jvmFlagsCustom;

        // Indicates whether Mesh Configuration Protocol (MCP) is enabled. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: enabled
        // *   `false`: disabled
        @NameInMap("MCPEnabled")
        public Boolean MCPEnabled;

        // Indicates whether MCP is supported. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: supported
        // *   `false`: not supported
        @NameInMap("MCPSupported")
        public Boolean MCPSupported;

        // The number of connections between a client and a server. This parameter is valid for ZooKeeper instances.\
        // If this parameter is set to 0, no limits are imposed on the number of connections.
        @NameInMap("MaxClientCnxns")
        public String maxClientCnxns;

        // The maximum timeout period. This parameter is valid for ZooKeeper instances.
        @NameInMap("MaxSessionTimeout")
        public String maxSessionTimeout;

        // The minimum timeout period. This parameter is valid for ZooKeeper instances.
        @NameInMap("MinSessionTimeout")
        public String minSessionTimeout;

        @NameInMap("NacosRunningEnv")
        public QueryConfigResponseBodyDataNacosRunningEnv nacosRunningEnv;

        // Indicates whether RAM authorization of a registry is enabled. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: enabled
        // *   `false`: disabled
        @NameInMap("NamingAuthEnabled")
        public Boolean namingAuthEnabled;

        // Indicates whether RAM authorization of services is supported by the instance. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: supported
        // *   `false`: not supported
        @NameInMap("NamingAuthSupported")
        public Boolean namingAuthSupported;

        // Indicates whether service creation is supported for the instance. This parameter is valid for Nacos instances. Valid values:
        // 
        // *   `true`: supported
        // *   `false`: not supported
        @NameInMap("NamingCreateServiceSupported")
        public Boolean namingCreateServiceSupported;

        // Indicates whether super permissions are enabled. This parameter is valid for ZooKeeper instances. Valid values:
        // 
        // *   `true`: enabled
        // *   `false`: disabled
        @NameInMap("OpenSuperAcl")
        public Boolean openSuperAcl;

        // The user password. This parameter is valid only if OpenSuperAcl is set to true.
        @NameInMap("PassWord")
        public String passWord;

        // Indicates whether the instance was restarted and new configurations have taken effect. Valid values:
        // 
        // *   `true`: The restart was successful.
        // *   `false`: The restart failed.
        @NameInMap("RestartFlag")
        public Boolean restartFlag;

        // The frequency for generating snapshots. This parameter is valid for ZooKeeper instances.
        @NameInMap("SnapshotCount")
        public String snapshotCount;

        // The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.
        @NameInMap("SyncLimit")
        public String syncLimit;

        // The time unit of the engine. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.
        @NameInMap("TickTime")
        public String tickTime;

        // The username. This parameter is valid only if OpenSuperAcl is set to true.
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
