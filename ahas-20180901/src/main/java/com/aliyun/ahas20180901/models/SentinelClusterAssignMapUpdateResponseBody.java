// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapUpdateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelClusterAssignMapUpdateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterAssignMapUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapUpdateResponseBody self = new SentinelClusterAssignMapUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapUpdateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterAssignMapUpdateResponseBody setData(SentinelClusterAssignMapUpdateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelClusterAssignMapUpdateResponseBodyData getData() {
        return this.data;
    }

    public SentinelClusterAssignMapUpdateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterAssignMapUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterAssignMapUpdateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterAssignMapUpdateResponseBodyDataAppMachine extends TeaModel {
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

        public static SentinelClusterAssignMapUpdateResponseBodyDataAppMachine build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignMapUpdateResponseBodyDataAppMachine self = new SentinelClusterAssignMapUpdateResponseBodyDataAppMachine();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelClusterAssignMapUpdateResponseBodyData extends TeaModel {
        @NameInMap("appMachine")
        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine appMachine;

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

        public static SentinelClusterAssignMapUpdateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignMapUpdateResponseBodyData self = new SentinelClusterAssignMapUpdateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setAppMachine(SentinelClusterAssignMapUpdateResponseBodyDataAppMachine appMachine) {
            this.appMachine = appMachine;
            return this;
        }
        public SentinelClusterAssignMapUpdateResponseBodyDataAppMachine getAppMachine() {
            return this.appMachine;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setClientCount(Integer clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Integer getClientCount() {
            return this.clientCount;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setClientSet(java.util.List<String> clientSet) {
            this.clientSet = clientSet;
            return this;
        }
        public java.util.List<String> getClientSet() {
            return this.clientSet;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public SentinelClusterAssignMapUpdateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
