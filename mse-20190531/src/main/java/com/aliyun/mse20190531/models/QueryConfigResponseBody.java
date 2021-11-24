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

        @NameInMap("OpenSuperAcl")
        public Boolean openSuperAcl;

        @NameInMap("PassWord")
        public String passWord;

        @NameInMap("RestartFlag")
        public Boolean restartFlag;

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
