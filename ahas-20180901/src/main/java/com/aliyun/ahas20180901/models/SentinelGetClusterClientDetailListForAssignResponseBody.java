// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetClusterClientDetailListForAssignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelGetClusterClientDetailListForAssignResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGetClusterClientDetailListForAssignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetClusterClientDetailListForAssignResponseBody self = new SentinelGetClusterClientDetailListForAssignResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGetClusterClientDetailListForAssignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGetClusterClientDetailListForAssignResponseBody setData(java.util.List<SentinelGetClusterClientDetailListForAssignResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelGetClusterClientDetailListForAssignResponseBodyData> getData() {
        return this.data;
    }

    public SentinelGetClusterClientDetailListForAssignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGetClusterClientDetailListForAssignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGetClusterClientDetailListForAssignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("health")
        public Boolean health;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("userId")
        public String userId;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine self = new SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelGetClusterClientDetailListForAssignResponseBodyDataState extends TeaModel {
        @NameInMap("clientState")
        public Integer clientState;

        @NameInMap("requestTimeout")
        public Integer requestTimeout;

        @NameInMap("targetIp")
        public String targetIp;

        @NameInMap("targetPort")
        public Integer targetPort;

        public static SentinelGetClusterClientDetailListForAssignResponseBodyDataState build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterClientDetailListForAssignResponseBodyDataState self = new SentinelGetClusterClientDetailListForAssignResponseBodyDataState();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataState setClientState(Integer clientState) {
            this.clientState = clientState;
            return this;
        }
        public Integer getClientState() {
            return this.clientState;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataState setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataState setTargetIp(String targetIp) {
            this.targetIp = targetIp;
            return this;
        }
        public String getTargetIp() {
            return this.targetIp;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyDataState setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class SentinelGetClusterClientDetailListForAssignResponseBodyData extends TeaModel {
        @NameInMap("machine")
        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine machine;

        @NameInMap("state")
        public SentinelGetClusterClientDetailListForAssignResponseBodyDataState state;

        public static SentinelGetClusterClientDetailListForAssignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterClientDetailListForAssignResponseBodyData self = new SentinelGetClusterClientDetailListForAssignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyData setMachine(SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine machine) {
            this.machine = machine;
            return this;
        }
        public SentinelGetClusterClientDetailListForAssignResponseBodyDataMachine getMachine() {
            return this.machine;
        }

        public SentinelGetClusterClientDetailListForAssignResponseBodyData setState(SentinelGetClusterClientDetailListForAssignResponseBodyDataState state) {
            this.state = state;
            return this;
        }
        public SentinelGetClusterClientDetailListForAssignResponseBodyDataState getState() {
            return this.state;
        }

    }

}
