// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPluginStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPluginStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPluginStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPluginStatusResponseBody self = new QueryPluginStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPluginStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPluginStatusResponseBody setData(QueryPluginStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPluginStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryPluginStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPluginStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPluginStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPluginStatusResponseBodyData extends TeaModel {
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

        public static QueryPluginStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPluginStatusResponseBodyData self = new QueryPluginStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPluginStatusResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryPluginStatusResponseBodyData setCanAutoInstall(Boolean canAutoInstall) {
            this.canAutoInstall = canAutoInstall;
            return this;
        }
        public Boolean getCanAutoInstall() {
            return this.canAutoInstall;
        }

        public QueryPluginStatusResponseBodyData setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryPluginStatusResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPluginStatusResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryPluginStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryPluginStatusResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryPluginStatusResponseBodyData setPluginStatus(Integer pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public Integer getPluginStatus() {
            return this.pluginStatus;
        }

        public QueryPluginStatusResponseBodyData setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public QueryPluginStatusResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryPluginStatusResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

    }

}
