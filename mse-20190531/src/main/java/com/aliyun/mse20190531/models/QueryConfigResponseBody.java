// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AutopurgePurgeInterval")
        public String autopurgePurgeInterval;

        @NameInMap("AutopurgeSnapRetainCount")
        public String autopurgeSnapRetainCount;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ConfigAuthEnabled")
        public Boolean configAuthEnabled;

        @NameInMap("ConfigAuthSupported")
        public Boolean configAuthSupported;

        @NameInMap("ConfigContentLimit")
        public Long configContentLimit;

        @NameInMap("ConfigSecretEnabled")
        public Boolean configSecretEnabled;

        @NameInMap("ConfigSecretSupported")
        public Boolean configSecretSupported;

        @NameInMap("InitLimit")
        public String initLimit;

        @NameInMap("JuteMaxbuffer")
        public String juteMaxbuffer;

        @NameInMap("JvmFlagsCustom")
        public String jvmFlagsCustom;

        @NameInMap("MCPEnabled")
        public Boolean MCPEnabled;

        @NameInMap("MCPSupported")
        public Boolean MCPSupported;

        @NameInMap("MaxClientCnxns")
        public String maxClientCnxns;

        @NameInMap("MaxSessionTimeout")
        public String maxSessionTimeout;

        @NameInMap("MinSessionTimeout")
        public String minSessionTimeout;

        @NameInMap("NacosRunningEnv")
        public QueryConfigResponseBodyDataNacosRunningEnv nacosRunningEnv;

        @NameInMap("NamingAuthEnabled")
        public Boolean namingAuthEnabled;

        @NameInMap("NamingAuthSupported")
        public Boolean namingAuthSupported;

        @NameInMap("NamingCreateServiceSupported")
        public Boolean namingCreateServiceSupported;

        @NameInMap("OpenSuperAcl")
        public Boolean openSuperAcl;

        @NameInMap("PassWord")
        public String passWord;

        @NameInMap("RestartFlag")
        public Boolean restartFlag;

        @NameInMap("SnapshotCount")
        public String snapshotCount;

        @NameInMap("SyncLimit")
        public String syncLimit;

        @NameInMap("TickTime")
        public String tickTime;

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
