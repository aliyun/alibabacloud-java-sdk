// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryConfigResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    public static QueryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigResponseBody self = new QueryConfigResponseBody();
        return TeaModel.build(map, self);
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

    public QueryConfigResponseBody setData(QueryConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static class QueryConfigResponseBodyData extends TeaModel {
        @NameInMap("MaxClientCnxns")
        public String maxClientCnxns;

        @NameInMap("ConfigAuthSupported")
        public Boolean configAuthSupported;

        @NameInMap("InitLimit")
        public String initLimit;

        @NameInMap("MCPEnabled")
        public Boolean MCPEnabled;

        @NameInMap("OpenSuperAcl")
        public Boolean openSuperAcl;

        @NameInMap("RestartFlag")
        public Boolean restartFlag;

        @NameInMap("JvmFlagsCustom")
        public String jvmFlagsCustom;

        @NameInMap("AutopurgePurgeInterval")
        public String autopurgePurgeInterval;

        @NameInMap("AutopurgeSnapRetainCount")
        public String autopurgeSnapRetainCount;

        @NameInMap("SyncLimit")
        public String syncLimit;

        @NameInMap("ConfigAuthEnabled")
        public Boolean configAuthEnabled;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("MCPSupported")
        public Boolean MCPSupported;

        @NameInMap("JuteMaxbuffer")
        public String juteMaxbuffer;

        @NameInMap("TickTime")
        public String tickTime;

        @NameInMap("PassWord")
        public String passWord;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ConfigSecretSupported")
        public Boolean configSecretSupported;

        @NameInMap("ConfigSecretEnabled")
        public Boolean configSecretEnabled;

        public static QueryConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConfigResponseBodyData self = new QueryConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConfigResponseBodyData setMaxClientCnxns(String maxClientCnxns) {
            this.maxClientCnxns = maxClientCnxns;
            return this;
        }
        public String getMaxClientCnxns() {
            return this.maxClientCnxns;
        }

        public QueryConfigResponseBodyData setConfigAuthSupported(Boolean configAuthSupported) {
            this.configAuthSupported = configAuthSupported;
            return this;
        }
        public Boolean getConfigAuthSupported() {
            return this.configAuthSupported;
        }

        public QueryConfigResponseBodyData setInitLimit(String initLimit) {
            this.initLimit = initLimit;
            return this;
        }
        public String getInitLimit() {
            return this.initLimit;
        }

        public QueryConfigResponseBodyData setMCPEnabled(Boolean MCPEnabled) {
            this.MCPEnabled = MCPEnabled;
            return this;
        }
        public Boolean getMCPEnabled() {
            return this.MCPEnabled;
        }

        public QueryConfigResponseBodyData setOpenSuperAcl(Boolean openSuperAcl) {
            this.openSuperAcl = openSuperAcl;
            return this;
        }
        public Boolean getOpenSuperAcl() {
            return this.openSuperAcl;
        }

        public QueryConfigResponseBodyData setRestartFlag(Boolean restartFlag) {
            this.restartFlag = restartFlag;
            return this;
        }
        public Boolean getRestartFlag() {
            return this.restartFlag;
        }

        public QueryConfigResponseBodyData setJvmFlagsCustom(String jvmFlagsCustom) {
            this.jvmFlagsCustom = jvmFlagsCustom;
            return this;
        }
        public String getJvmFlagsCustom() {
            return this.jvmFlagsCustom;
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

        public QueryConfigResponseBodyData setSyncLimit(String syncLimit) {
            this.syncLimit = syncLimit;
            return this;
        }
        public String getSyncLimit() {
            return this.syncLimit;
        }

        public QueryConfigResponseBodyData setConfigAuthEnabled(Boolean configAuthEnabled) {
            this.configAuthEnabled = configAuthEnabled;
            return this;
        }
        public Boolean getConfigAuthEnabled() {
            return this.configAuthEnabled;
        }

        public QueryConfigResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryConfigResponseBodyData setMCPSupported(Boolean MCPSupported) {
            this.MCPSupported = MCPSupported;
            return this;
        }
        public Boolean getMCPSupported() {
            return this.MCPSupported;
        }

        public QueryConfigResponseBodyData setJuteMaxbuffer(String juteMaxbuffer) {
            this.juteMaxbuffer = juteMaxbuffer;
            return this;
        }
        public String getJuteMaxbuffer() {
            return this.juteMaxbuffer;
        }

        public QueryConfigResponseBodyData setTickTime(String tickTime) {
            this.tickTime = tickTime;
            return this;
        }
        public String getTickTime() {
            return this.tickTime;
        }

        public QueryConfigResponseBodyData setPassWord(String passWord) {
            this.passWord = passWord;
            return this;
        }
        public String getPassWord() {
            return this.passWord;
        }

        public QueryConfigResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryConfigResponseBodyData setConfigSecretSupported(Boolean configSecretSupported) {
            this.configSecretSupported = configSecretSupported;
            return this;
        }
        public Boolean getConfigSecretSupported() {
            return this.configSecretSupported;
        }

        public QueryConfigResponseBodyData setConfigSecretEnabled(Boolean configSecretEnabled) {
            this.configSecretEnabled = configSecretEnabled;
            return this;
        }
        public Boolean getConfigSecretEnabled() {
            return this.configSecretEnabled;
        }

    }

}
