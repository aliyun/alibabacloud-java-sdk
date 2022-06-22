// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignGetNewAssignPageDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelClusterAssignGetNewAssignPageDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterAssignGetNewAssignPageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignGetNewAssignPageDataResponseBody self = new SentinelClusterAssignGetNewAssignPageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignGetNewAssignPageDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterAssignGetNewAssignPageDataResponseBody setData(SentinelClusterAssignGetNewAssignPageDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelClusterAssignGetNewAssignPageDataResponseBodyData getData() {
        return this.data;
    }

    public SentinelClusterAssignGetNewAssignPageDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterAssignGetNewAssignPageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterAssignGetNewAssignPageDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("deviceType")
        public Integer deviceType;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("health")
        public Boolean health;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastHealthPingTime")
        public Long lastHealthPingTime;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("parentIp")
        public String parentIp;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("pluginType")
        public String pluginType;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("userId")
        public String userId;

        @NameInMap("version")
        public String version;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet self = new SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setLastHealthPingTime(Long lastHealthPingTime) {
            this.lastHealthPingTime = lastHealthPingTime;
            return this;
        }
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setParentIp(String parentIp) {
            this.parentIp = parentIp;
            return this;
        }
        public String getParentIp() {
            return this.parentIp;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelClusterAssignGetNewAssignPageDataResponseBodyData extends TeaModel {
        @NameInMap("unassignedSet")
        public java.util.List<SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet> unassignedSet;

        public static SentinelClusterAssignGetNewAssignPageDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignGetNewAssignPageDataResponseBodyData self = new SentinelClusterAssignGetNewAssignPageDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignGetNewAssignPageDataResponseBodyData setUnassignedSet(java.util.List<SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet> unassignedSet) {
            this.unassignedSet = unassignedSet;
            return this;
        }
        public java.util.List<SentinelClusterAssignGetNewAssignPageDataResponseBodyDataUnassignedSet> getUnassignedSet() {
            return this.unassignedSet;
        }

    }

}
