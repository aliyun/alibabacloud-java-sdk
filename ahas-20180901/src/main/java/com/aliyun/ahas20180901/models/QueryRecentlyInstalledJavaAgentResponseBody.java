// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRecentlyInstalledJavaAgentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryRecentlyInstalledJavaAgentResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecentlyInstalledJavaAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecentlyInstalledJavaAgentResponseBody self = new QueryRecentlyInstalledJavaAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecentlyInstalledJavaAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecentlyInstalledJavaAgentResponseBody setData(java.util.List<QueryRecentlyInstalledJavaAgentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRecentlyInstalledJavaAgentResponseBodyData> getData() {
        return this.data;
    }

    public QueryRecentlyInstalledJavaAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRecentlyInstalledJavaAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecentlyInstalledJavaAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecentlyInstalledJavaAgentResponseBodyData extends TeaModel {
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

        public static QueryRecentlyInstalledJavaAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecentlyInstalledJavaAgentResponseBodyData self = new QueryRecentlyInstalledJavaAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setCanAutoInstall(Boolean canAutoInstall) {
            this.canAutoInstall = canAutoInstall;
            return this;
        }
        public Boolean getCanAutoInstall() {
            return this.canAutoInstall;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setPluginStatus(Integer pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public Integer getPluginStatus() {
            return this.pluginStatus;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryRecentlyInstalledJavaAgentResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

    }

}
