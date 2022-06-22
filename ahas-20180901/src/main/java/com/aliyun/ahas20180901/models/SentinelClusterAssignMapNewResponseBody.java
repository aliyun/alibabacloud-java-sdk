// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelClusterAssignMapNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterAssignMapNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapNewResponseBody self = new SentinelClusterAssignMapNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterAssignMapNewResponseBody setData(SentinelClusterAssignMapNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelClusterAssignMapNewResponseBodyData getData() {
        return this.data;
    }

    public SentinelClusterAssignMapNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterAssignMapNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterAssignMapNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterAssignMapNewResponseBodyDataAppMachine extends TeaModel {
        @NameInMap("health")
        public Boolean health;

        @NameInMap("id")
        public Long id;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelClusterAssignMapNewResponseBodyDataAppMachine build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignMapNewResponseBodyDataAppMachine self = new SentinelClusterAssignMapNewResponseBodyDataAppMachine();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignMapNewResponseBodyDataAppMachine setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelClusterAssignMapNewResponseBodyDataAppMachine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignMapNewResponseBodyDataAppMachine setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelClusterAssignMapNewResponseBodyDataAppMachine setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelClusterAssignMapNewResponseBodyDataAppMachine setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelClusterAssignMapNewResponseBodyDataAppMachine setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelClusterAssignMapNewResponseBodyData extends TeaModel {
        @NameInMap("appMachine")
        public SentinelClusterAssignMapNewResponseBodyDataAppMachine appMachine;

        @NameInMap("appName")
        public String appName;

        @NameInMap("clientCount")
        public Integer clientCount;

        @NameInMap("clientSet")
        public java.util.List<String> clientSet;

        @NameInMap("id")
        public Long id;

        @NameInMap("maxAllowedQps")
        public Float maxAllowedQps;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("serverPort")
        public Integer serverPort;

        @NameInMap("userId")
        public String userId;

        public static SentinelClusterAssignMapNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignMapNewResponseBodyData self = new SentinelClusterAssignMapNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignMapNewResponseBodyData setAppMachine(SentinelClusterAssignMapNewResponseBodyDataAppMachine appMachine) {
            this.appMachine = appMachine;
            return this;
        }
        public SentinelClusterAssignMapNewResponseBodyDataAppMachine getAppMachine() {
            return this.appMachine;
        }

        public SentinelClusterAssignMapNewResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelClusterAssignMapNewResponseBodyData setClientCount(Integer clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Integer getClientCount() {
            return this.clientCount;
        }

        public SentinelClusterAssignMapNewResponseBodyData setClientSet(java.util.List<String> clientSet) {
            this.clientSet = clientSet;
            return this;
        }
        public java.util.List<String> getClientSet() {
            return this.clientSet;
        }

        public SentinelClusterAssignMapNewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignMapNewResponseBodyData setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelClusterAssignMapNewResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelClusterAssignMapNewResponseBodyData setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public SentinelClusterAssignMapNewResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
