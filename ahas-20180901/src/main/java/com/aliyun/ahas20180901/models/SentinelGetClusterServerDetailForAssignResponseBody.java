// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetClusterServerDetailForAssignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGetClusterServerDetailForAssignResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGetClusterServerDetailForAssignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetClusterServerDetailForAssignResponseBody self = new SentinelGetClusterServerDetailForAssignResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGetClusterServerDetailForAssignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGetClusterServerDetailForAssignResponseBody setData(SentinelGetClusterServerDetailForAssignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGetClusterServerDetailForAssignResponseBodyData getData() {
        return this.data;
    }

    public SentinelGetClusterServerDetailForAssignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGetClusterServerDetailForAssignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGetClusterServerDetailForAssignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine extends TeaModel {
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

        @NameInMap("userId")
        public String userId;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine self = new SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup extends TeaModel {
        @NameInMap("appMachine")
        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine appMachine;

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

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup self = new SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setAppMachine(SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine appMachine) {
            this.appMachine = appMachine;
            return this;
        }
        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroupAppMachine getAppMachine() {
            return this.appMachine;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setClientCount(Integer clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Integer getClientCount() {
            return this.clientCount;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setClientSet(java.util.List<String> clientSet) {
            this.clientSet = clientSet;
            return this;
        }
        public java.util.List<String> getClientSet() {
            return this.clientSet;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("host")
        public String host;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet self = new SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection extends TeaModel {
        @NameInMap("connectedCount")
        public Integer connectedCount;

        @NameInMap("connectionSet")
        public java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet> connectionSet;

        @NameInMap("namespace")
        public String namespace;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection self = new SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection setConnectedCount(Integer connectedCount) {
            this.connectedCount = connectedCount;
            return this;
        }
        public Integer getConnectedCount() {
            return this.connectedCount;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection setConnectionSet(java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet> connectionSet) {
            this.connectionSet = connectionSet;
            return this;
        }
        public java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnectionConnectionSet> getConnectionSet() {
            return this.connectionSet;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow extends TeaModel {
        @NameInMap("exceedCount")
        public Float exceedCount;

        @NameInMap("intervalMs")
        public Integer intervalMs;

        @NameInMap("maxAllowedQps")
        public Float maxAllowedQps;

        @NameInMap("maxOccupyRatio")
        public Float maxOccupyRatio;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("sampleCount")
        public Integer sampleCount;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow self = new SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow setExceedCount(Float exceedCount) {
            this.exceedCount = exceedCount;
            return this;
        }
        public Float getExceedCount() {
            return this.exceedCount;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow setIntervalMs(Integer intervalMs) {
            this.intervalMs = intervalMs;
            return this;
        }
        public Integer getIntervalMs() {
            return this.intervalMs;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow setMaxOccupyRatio(Float maxOccupyRatio) {
            this.maxOccupyRatio = maxOccupyRatio;
            return this;
        }
        public Float getMaxOccupyRatio() {
            return this.maxOccupyRatio;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow setSampleCount(Integer sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Integer getSampleCount() {
            return this.sampleCount;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData extends TeaModel {
        @NameInMap("currentQps")
        public Float currentQps;

        @NameInMap("maxAllowedQps")
        public Float maxAllowedQps;

        @NameInMap("namespace")
        public String namespace;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData self = new SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData setCurrentQps(Float currentQps) {
            this.currentQps = currentQps;
            return this;
        }
        public Float getCurrentQps() {
            return this.currentQps;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport extends TeaModel {
        @NameInMap("idleSeconds")
        public Integer idleSeconds;

        @NameInMap("port")
        public Integer port;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport self = new SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport setIdleSeconds(Integer idleSeconds) {
            this.idleSeconds = idleSeconds;
            return this;
        }
        public Integer getIdleSeconds() {
            return this.idleSeconds;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyDataState extends TeaModel {
        @NameInMap("connection")
        public java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection> connection;

        @NameInMap("embedded")
        public Boolean embedded;

        @NameInMap("flow")
        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow flow;

        @NameInMap("namespaceSet")
        public java.util.List<String> namespaceSet;

        @NameInMap("port")
        public Integer port;

        @NameInMap("requestLimitData")
        public java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData> requestLimitData;

        @NameInMap("transport")
        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport transport;

        public static SentinelGetClusterServerDetailForAssignResponseBodyDataState build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyDataState self = new SentinelGetClusterServerDetailForAssignResponseBodyDataState();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setConnection(java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection> connection) {
            this.connection = connection;
            return this;
        }
        public java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateConnection> getConnection() {
            return this.connection;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setEmbedded(Boolean embedded) {
            this.embedded = embedded;
            return this;
        }
        public Boolean getEmbedded() {
            return this.embedded;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setFlow(SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow flow) {
            this.flow = flow;
            return this;
        }
        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateFlow getFlow() {
            return this.flow;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setNamespaceSet(java.util.List<String> namespaceSet) {
            this.namespaceSet = namespaceSet;
            return this;
        }
        public java.util.List<String> getNamespaceSet() {
            return this.namespaceSet;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setRequestLimitData(java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData> requestLimitData) {
            this.requestLimitData = requestLimitData;
            return this;
        }
        public java.util.List<SentinelGetClusterServerDetailForAssignResponseBodyDataStateRequestLimitData> getRequestLimitData() {
            return this.requestLimitData;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyDataState setTransport(SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport transport) {
            this.transport = transport;
            return this;
        }
        public SentinelGetClusterServerDetailForAssignResponseBodyDataStateTransport getTransport() {
            return this.transport;
        }

    }

    public static class SentinelGetClusterServerDetailForAssignResponseBodyData extends TeaModel {
        @NameInMap("assignGroup")
        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup assignGroup;

        @NameInMap("state")
        public SentinelGetClusterServerDetailForAssignResponseBodyDataState state;

        public static SentinelGetClusterServerDetailForAssignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetClusterServerDetailForAssignResponseBodyData self = new SentinelGetClusterServerDetailForAssignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyData setAssignGroup(SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup assignGroup) {
            this.assignGroup = assignGroup;
            return this;
        }
        public SentinelGetClusterServerDetailForAssignResponseBodyDataAssignGroup getAssignGroup() {
            return this.assignGroup;
        }

        public SentinelGetClusterServerDetailForAssignResponseBodyData setState(SentinelGetClusterServerDetailForAssignResponseBodyDataState state) {
            this.state = state;
            return this;
        }
        public SentinelGetClusterServerDetailForAssignResponseBodyDataState getState() {
            return this.state;
        }

    }

}
