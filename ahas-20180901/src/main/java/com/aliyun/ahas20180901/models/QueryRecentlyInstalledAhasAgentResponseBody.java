// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRecentlyInstalledAhasAgentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryRecentlyInstalledAhasAgentResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecentlyInstalledAhasAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecentlyInstalledAhasAgentResponseBody self = new QueryRecentlyInstalledAhasAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecentlyInstalledAhasAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecentlyInstalledAhasAgentResponseBody setData(java.util.List<QueryRecentlyInstalledAhasAgentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRecentlyInstalledAhasAgentResponseBodyData> getData() {
        return this.data;
    }

    public QueryRecentlyInstalledAhasAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRecentlyInstalledAhasAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecentlyInstalledAhasAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecentlyInstalledAhasAgentResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("canAutoInstall")
        public Boolean canAutoInstall;

        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("pluginStatus")
        public Integer pluginStatus;

        @NameInMap("pluginType")
        public String pluginType;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("publicIp")
        public String publicIp;

        public static QueryRecentlyInstalledAhasAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecentlyInstalledAhasAgentResponseBodyData self = new QueryRecentlyInstalledAhasAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setCanAutoInstall(Boolean canAutoInstall) {
            this.canAutoInstall = canAutoInstall;
            return this;
        }
        public Boolean getCanAutoInstall() {
            return this.canAutoInstall;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setPluginStatus(Integer pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public Integer getPluginStatus() {
            return this.pluginStatus;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryRecentlyInstalledAhasAgentResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

    }

}
