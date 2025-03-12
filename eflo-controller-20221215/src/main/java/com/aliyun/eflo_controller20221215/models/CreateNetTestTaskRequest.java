// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNetTestTaskRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Cluster name</p>
     * 
     * <strong>example:</strong>
     * <p>Eflo-YJ-Test-Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Required when the test type is communication library testing</p>
     */
    @NameInMap("CommTest")
    public CreateNetTestTaskRequestCommTest commTest;

    /**
     * <p>Fill in this field when the network test type is delay testing.</p>
     */
    @NameInMap("DelayTest")
    public CreateNetTestTaskRequestDelayTest delayTest;

    /**
     * <p>Network test type.
     * For example: DelayTest for latency testing, TrafficTest for traffic testing, CommTest for communication library testing.</p>
     * 
     * <strong>example:</strong>
     * <p>DelayTest</p>
     */
    @NameInMap("NetTestType")
    public String netTestType;

    /**
     * <p>Network mode</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkMode")
    public String networkMode;

    /**
     * <p>Test port number.</p>
     * 
     * <strong>example:</strong>
     * <p>23604</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>This field is empty if the TrafficModel is Fullmesh.</p>
     */
    @NameInMap("TrafficTest")
    public CreateNetTestTaskRequestTrafficTest trafficTest;

    public static CreateNetTestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetTestTaskRequest self = new CreateNetTestTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetTestTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNetTestTaskRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateNetTestTaskRequest setCommTest(CreateNetTestTaskRequestCommTest commTest) {
        this.commTest = commTest;
        return this;
    }
    public CreateNetTestTaskRequestCommTest getCommTest() {
        return this.commTest;
    }

    public CreateNetTestTaskRequest setDelayTest(CreateNetTestTaskRequestDelayTest delayTest) {
        this.delayTest = delayTest;
        return this;
    }
    public CreateNetTestTaskRequestDelayTest getDelayTest() {
        return this.delayTest;
    }

    public CreateNetTestTaskRequest setNetTestType(String netTestType) {
        this.netTestType = netTestType;
        return this;
    }
    public String getNetTestType() {
        return this.netTestType;
    }

    public CreateNetTestTaskRequest setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public CreateNetTestTaskRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateNetTestTaskRequest setTrafficTest(CreateNetTestTaskRequestTrafficTest trafficTest) {
        this.trafficTest = trafficTest;
        return this;
    }
    public CreateNetTestTaskRequestTrafficTest getTrafficTest() {
        return this.trafficTest;
    }

    public static class CreateNetTestTaskRequestCommTestHosts extends TeaModel {
        /**
         * <p>IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>169.253.253.15</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-tw-bqisacl3z6l</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>i111670831721110797708</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>VBw</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static CreateNetTestTaskRequestCommTestHosts build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestCommTestHosts self = new CreateNetTestTaskRequestCommTestHosts();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestCommTestHosts setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public CreateNetTestTaskRequestCommTestHosts setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateNetTestTaskRequestCommTestHosts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateNetTestTaskRequestCommTestHosts setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class CreateNetTestTaskRequestCommTest extends TeaModel {
        /**
         * <p>Number of GPUs</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPUNum")
        public Long GPUNum;

        /**
         * <p>Resource ID</p>
         */
        @NameInMap("Hosts")
        public java.util.List<CreateNetTestTaskRequestCommTestHosts> hosts;

        /**
         * <p>Communication library model</p>
         * 
         * <strong>example:</strong>
         * <p>intention_v4</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Communication library test category: ACCL or NCCL</p>
         * 
         * <strong>example:</strong>
         * <p>ACCL</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateNetTestTaskRequestCommTest build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestCommTest self = new CreateNetTestTaskRequestCommTest();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestCommTest setGPUNum(Long GPUNum) {
            this.GPUNum = GPUNum;
            return this;
        }
        public Long getGPUNum() {
            return this.GPUNum;
        }

        public CreateNetTestTaskRequestCommTest setHosts(java.util.List<CreateNetTestTaskRequestCommTestHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<CreateNetTestTaskRequestCommTestHosts> getHosts() {
            return this.hosts;
        }

        public CreateNetTestTaskRequestCommTest setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateNetTestTaskRequestCommTest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateNetTestTaskRequestDelayTestHosts extends TeaModel {
        /**
         * <p>Network interface bond port</p>
         * 
         * <strong>example:</strong>
         * <p>bond1</p>
         */
        @NameInMap("Bond")
        public String bond;

        /**
         * <p>Node IP</p>
         * 
         * <strong>example:</strong>
         * <p>125.210.225.48</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-fou43an0a05</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-bcd3u1aee06</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>NQU</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static CreateNetTestTaskRequestDelayTestHosts build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestDelayTestHosts self = new CreateNetTestTaskRequestDelayTestHosts();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestDelayTestHosts setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public CreateNetTestTaskRequestDelayTestHosts setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public CreateNetTestTaskRequestDelayTestHosts setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateNetTestTaskRequestDelayTestHosts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateNetTestTaskRequestDelayTestHosts setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class CreateNetTestTaskRequestDelayTest extends TeaModel {
        /**
         * <p>输入测试节点的hosts</p>
         */
        @NameInMap("Hosts")
        public java.util.List<CreateNetTestTaskRequestDelayTestHosts> hosts;

        public static CreateNetTestTaskRequestDelayTest build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestDelayTest self = new CreateNetTestTaskRequestDelayTest();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestDelayTest setHosts(java.util.List<CreateNetTestTaskRequestDelayTestHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<CreateNetTestTaskRequestDelayTestHosts> getHosts() {
            return this.hosts;
        }

    }

    public static class CreateNetTestTaskRequestTrafficTestClients extends TeaModel {
        /**
         * <p>Network card bond interface</p>
         * 
         * <strong>example:</strong>
         * <p>bond1</p>
         */
        @NameInMap("Bond")
        public String bond;

        /**
         * <p>Node IP</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-tw-w5elqg7pw18</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-20s41p6cx01</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>xMv</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static CreateNetTestTaskRequestTrafficTestClients build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestTrafficTestClients self = new CreateNetTestTaskRequestTrafficTestClients();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestTrafficTestClients setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public CreateNetTestTaskRequestTrafficTestClients setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public CreateNetTestTaskRequestTrafficTestClients setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateNetTestTaskRequestTrafficTestClients setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateNetTestTaskRequestTrafficTestClients setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class CreateNetTestTaskRequestTrafficTestServers extends TeaModel {
        /**
         * <p>Network card bond interface</p>
         * 
         * <strong>example:</strong>
         * <p>bond1</p>
         */
        @NameInMap("Bond")
        public String bond;

        /**
         * <p>Node IP</p>
         * 
         * <strong>example:</strong>
         * <p>47.121.110.190</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-tw-bqisacl3z6l</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-wwo3etaqu0b</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>xMv</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static CreateNetTestTaskRequestTrafficTestServers build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestTrafficTestServers self = new CreateNetTestTaskRequestTrafficTestServers();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestTrafficTestServers setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public CreateNetTestTaskRequestTrafficTestServers setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public CreateNetTestTaskRequestTrafficTestServers setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateNetTestTaskRequestTrafficTestServers setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateNetTestTaskRequestTrafficTestServers setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class CreateNetTestTaskRequestTrafficTest extends TeaModel {
        /**
         * <p>Resource ID.</p>
         */
        @NameInMap("Clients")
        public java.util.List<CreateNetTestTaskRequestTrafficTestClients> clients;

        /**
         * <p>The duration of the workflow task in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Enter True/False when the protocol is RDMA, 
         * this field is empty when the protocol is TCP.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("GDR")
        public Boolean GDR;

        /**
         * <p>Network protocol, either RDMA or TCP.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Enter the number of concurrent connections when the protocol is TCP, or enter the configured QP value when the protocol is RDMA.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QP")
        public Long QP;

        /**
         * <p>Service list</p>
         */
        @NameInMap("Servers")
        public java.util.List<CreateNetTestTaskRequestTrafficTestServers> servers;

        /**
         * <p>Traffic model, either MTON or Fullmesh.</p>
         * 
         * <strong>example:</strong>
         * <p>Fullmesh</p>
         */
        @NameInMap("TrafficModel")
        public String trafficModel;

        public static CreateNetTestTaskRequestTrafficTest build(java.util.Map<String, ?> map) throws Exception {
            CreateNetTestTaskRequestTrafficTest self = new CreateNetTestTaskRequestTrafficTest();
            return TeaModel.build(map, self);
        }

        public CreateNetTestTaskRequestTrafficTest setClients(java.util.List<CreateNetTestTaskRequestTrafficTestClients> clients) {
            this.clients = clients;
            return this;
        }
        public java.util.List<CreateNetTestTaskRequestTrafficTestClients> getClients() {
            return this.clients;
        }

        public CreateNetTestTaskRequestTrafficTest setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public CreateNetTestTaskRequestTrafficTest setGDR(Boolean GDR) {
            this.GDR = GDR;
            return this;
        }
        public Boolean getGDR() {
            return this.GDR;
        }

        public CreateNetTestTaskRequestTrafficTest setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateNetTestTaskRequestTrafficTest setQP(Long QP) {
            this.QP = QP;
            return this;
        }
        public Long getQP() {
            return this.QP;
        }

        public CreateNetTestTaskRequestTrafficTest setServers(java.util.List<CreateNetTestTaskRequestTrafficTestServers> servers) {
            this.servers = servers;
            return this;
        }
        public java.util.List<CreateNetTestTaskRequestTrafficTestServers> getServers() {
            return this.servers;
        }

        public CreateNetTestTaskRequestTrafficTest setTrafficModel(String trafficModel) {
            this.trafficModel = trafficModel;
            return this;
        }
        public String getTrafficModel() {
            return this.trafficModel;
        }

    }

}
