// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapListForAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelClusterAssignMapListForAppResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterAssignMapListForAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapListForAppResponseBody self = new SentinelClusterAssignMapListForAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapListForAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterAssignMapListForAppResponseBody setData(java.util.List<SentinelClusterAssignMapListForAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelClusterAssignMapListForAppResponseBodyData> getData() {
        return this.data;
    }

    public SentinelClusterAssignMapListForAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterAssignMapListForAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterAssignMapListForAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterAssignMapListForAppResponseBodyDataAppMachine extends TeaModel {
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

        public static SentinelClusterAssignMapListForAppResponseBodyDataAppMachine build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignMapListForAppResponseBodyDataAppMachine self = new SentinelClusterAssignMapListForAppResponseBodyDataAppMachine();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelClusterAssignMapListForAppResponseBodyData extends TeaModel {
        @NameInMap("appMachine")
        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine appMachine;

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

        public static SentinelClusterAssignMapListForAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterAssignMapListForAppResponseBodyData self = new SentinelClusterAssignMapListForAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setAppMachine(SentinelClusterAssignMapListForAppResponseBodyDataAppMachine appMachine) {
            this.appMachine = appMachine;
            return this;
        }
        public SentinelClusterAssignMapListForAppResponseBodyDataAppMachine getAppMachine() {
            return this.appMachine;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setClientCount(Integer clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Integer getClientCount() {
            return this.clientCount;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setClientSet(java.util.List<String> clientSet) {
            this.clientSet = clientSet;
            return this;
        }
        public java.util.List<String> getClientSet() {
            return this.clientSet;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public SentinelClusterAssignMapListForAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
