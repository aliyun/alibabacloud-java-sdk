// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNetTestResultResponseBody extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Fill in when the traffic test type is communication library test</p>
     */
    @NameInMap("CommTest")
    public DescribeNetTestResultResponseBodyCommTest commTest;

    /**
     * <p>Diagnosis task creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-15T10:25:42+08:00</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>Fill in when the network test type is latency test</p>
     */
    @NameInMap("DelayTest")
    public DescribeNetTestResultResponseBodyDelayTest delayTest;

    /**
     * <p>Diagnosis task completion time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16T02:04Z</p>
     */
    @NameInMap("FinishedTime")
    public String finishedTime;

    /**
     * <p>Network test type.</p>
     * 
     * <strong>example:</strong>
     * <p>DelayTest</p>
     */
    @NameInMap("NetTestType")
    public String netTestType;

    /**
     * <p>Test port number.</p>
     * 
     * <strong>example:</strong>
     * <p>23604</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8F065DDD-6996-5973-9691-9EC57BD0072E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the diagnosis result. Returned as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ResultDetial")
    public String resultDetial;

    /**
     * <p>Diagnosis task status. Possible values:</p>
     * <ul>
     * <li>InProgress: Diagnosis in progress.</li>
     * <li>Finished: Diagnosis completed.</li>
     * <li>Failed: Diagnosis failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Failed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Initiated test task ID, which is the unique identifier for the network test task.</p>
     * 
     * <strong>example:</strong>
     * <p>af35ce53-7c35-4277-834a-fbf49c316a96</p>
     */
    @NameInMap("TestId")
    public String testId;

    /**
     * <p>This field is empty if the traffic model (TrafficModel) is Fullmesh.</p>
     */
    @NameInMap("TrafficTest")
    public DescribeNetTestResultResponseBodyTrafficTest trafficTest;

    public static DescribeNetTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetTestResultResponseBody self = new DescribeNetTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetTestResultResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeNetTestResultResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeNetTestResultResponseBody setCommTest(DescribeNetTestResultResponseBodyCommTest commTest) {
        this.commTest = commTest;
        return this;
    }
    public DescribeNetTestResultResponseBodyCommTest getCommTest() {
        return this.commTest;
    }

    public DescribeNetTestResultResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeNetTestResultResponseBody setDelayTest(DescribeNetTestResultResponseBodyDelayTest delayTest) {
        this.delayTest = delayTest;
        return this;
    }
    public DescribeNetTestResultResponseBodyDelayTest getDelayTest() {
        return this.delayTest;
    }

    public DescribeNetTestResultResponseBody setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public DescribeNetTestResultResponseBody setNetTestType(String netTestType) {
        this.netTestType = netTestType;
        return this;
    }
    public String getNetTestType() {
        return this.netTestType;
    }

    public DescribeNetTestResultResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeNetTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetTestResultResponseBody setResultDetial(String resultDetial) {
        this.resultDetial = resultDetial;
        return this;
    }
    public String getResultDetial() {
        return this.resultDetial;
    }

    public DescribeNetTestResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetTestResultResponseBody setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

    public DescribeNetTestResultResponseBody setTrafficTest(DescribeNetTestResultResponseBodyTrafficTest trafficTest) {
        this.trafficTest = trafficTest;
        return this;
    }
    public DescribeNetTestResultResponseBodyTrafficTest getTrafficTest() {
        return this.trafficTest;
    }

    public static class DescribeNetTestResultResponseBodyCommTestHosts extends TeaModel {
        /**
         * <p>IP address</p>
         * 
         * <strong>example:</strong>
         * <p>169.253.253.15</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>i111670831721110797708</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>服务名称。</p>
         * 
         * <strong>example:</strong>
         * <p>VBw</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static DescribeNetTestResultResponseBodyCommTestHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyCommTestHosts self = new DescribeNetTestResultResponseBodyCommTestHosts();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyCommTestHosts setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeNetTestResultResponseBodyCommTestHosts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetTestResultResponseBodyCommTestHosts setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class DescribeNetTestResultResponseBodyCommTest extends TeaModel {
        /**
         * <p>Number of GPUs</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPUNum")
        public String GPUNum;

        /**
         * <p>Resource ID</p>
         */
        @NameInMap("Hosts")
        public java.util.List<DescribeNetTestResultResponseBodyCommTestHosts> hosts;

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

        public static DescribeNetTestResultResponseBodyCommTest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyCommTest self = new DescribeNetTestResultResponseBodyCommTest();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyCommTest setGPUNum(String GPUNum) {
            this.GPUNum = GPUNum;
            return this;
        }
        public String getGPUNum() {
            return this.GPUNum;
        }

        public DescribeNetTestResultResponseBodyCommTest setHosts(java.util.List<DescribeNetTestResultResponseBodyCommTestHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<DescribeNetTestResultResponseBodyCommTestHosts> getHosts() {
            return this.hosts;
        }

        public DescribeNetTestResultResponseBodyCommTest setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeNetTestResultResponseBodyCommTest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeNetTestResultResponseBodyDelayTestHosts extends TeaModel {
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
         * <p>125.210.225.48</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-bcd3u1aee06</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Service name</p>
         * 
         * <strong>example:</strong>
         * <p>NQU</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static DescribeNetTestResultResponseBodyDelayTestHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyDelayTestHosts self = new DescribeNetTestResultResponseBodyDelayTestHosts();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyDelayTestHosts setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public DescribeNetTestResultResponseBodyDelayTestHosts setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeNetTestResultResponseBodyDelayTestHosts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetTestResultResponseBodyDelayTestHosts setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class DescribeNetTestResultResponseBodyDelayTest extends TeaModel {
        /**
         * <p>Input the hosts of the test nodes</p>
         */
        @NameInMap("Hosts")
        public java.util.List<DescribeNetTestResultResponseBodyDelayTestHosts> hosts;

        public static DescribeNetTestResultResponseBodyDelayTest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyDelayTest self = new DescribeNetTestResultResponseBodyDelayTest();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyDelayTest setHosts(java.util.List<DescribeNetTestResultResponseBodyDelayTestHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<DescribeNetTestResultResponseBodyDelayTestHosts> getHosts() {
            return this.hosts;
        }

    }

    public static class DescribeNetTestResultResponseBodyTrafficTestClients extends TeaModel {
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
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-20s41p6cx01</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>服务名称。</p>
         * 
         * <strong>example:</strong>
         * <p>xMv</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static DescribeNetTestResultResponseBodyTrafficTestClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyTrafficTestClients self = new DescribeNetTestResultResponseBodyTrafficTestClients();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyTrafficTestClients setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public DescribeNetTestResultResponseBodyTrafficTestClients setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeNetTestResultResponseBodyTrafficTestClients setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetTestResultResponseBodyTrafficTestClients setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class DescribeNetTestResultResponseBodyTrafficTestServers extends TeaModel {
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
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-wwo3etaqu0b</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Service name</p>
         * 
         * <strong>example:</strong>
         * <p>xMv</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static DescribeNetTestResultResponseBodyTrafficTestServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyTrafficTestServers self = new DescribeNetTestResultResponseBodyTrafficTestServers();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyTrafficTestServers setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public DescribeNetTestResultResponseBodyTrafficTestServers setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeNetTestResultResponseBodyTrafficTestServers setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetTestResultResponseBodyTrafficTestServers setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class DescribeNetTestResultResponseBodyTrafficTest extends TeaModel {
        /**
         * <p>Resource ID.</p>
         */
        @NameInMap("Clients")
        public java.util.List<DescribeNetTestResultResponseBodyTrafficTestClients> clients;

        /**
         * <p>Duration of the workflow task in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>For RDMA, enter True/False; for TCP, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("GDR")
        public String GDR;

        /**
         * <p>Network protocol, either RDMA or TCP.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>For TCP, enter the number of concurrent test connections; for RDMA, enter the configured QP value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QP")
        public Long QP;

        /**
         * <p>List of servers</p>
         */
        @NameInMap("Servers")
        public java.util.List<DescribeNetTestResultResponseBodyTrafficTestServers> servers;

        /**
         * <p>Traffic model, either MTON or Fullmesh.</p>
         * 
         * <strong>example:</strong>
         * <p>Fullmesh</p>
         */
        @NameInMap("TrafficModel")
        public String trafficModel;

        public static DescribeNetTestResultResponseBodyTrafficTest build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetTestResultResponseBodyTrafficTest self = new DescribeNetTestResultResponseBodyTrafficTest();
            return TeaModel.build(map, self);
        }

        public DescribeNetTestResultResponseBodyTrafficTest setClients(java.util.List<DescribeNetTestResultResponseBodyTrafficTestClients> clients) {
            this.clients = clients;
            return this;
        }
        public java.util.List<DescribeNetTestResultResponseBodyTrafficTestClients> getClients() {
            return this.clients;
        }

        public DescribeNetTestResultResponseBodyTrafficTest setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeNetTestResultResponseBodyTrafficTest setGDR(String GDR) {
            this.GDR = GDR;
            return this;
        }
        public String getGDR() {
            return this.GDR;
        }

        public DescribeNetTestResultResponseBodyTrafficTest setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetTestResultResponseBodyTrafficTest setQP(Long QP) {
            this.QP = QP;
            return this;
        }
        public Long getQP() {
            return this.QP;
        }

        public DescribeNetTestResultResponseBodyTrafficTest setServers(java.util.List<DescribeNetTestResultResponseBodyTrafficTestServers> servers) {
            this.servers = servers;
            return this;
        }
        public java.util.List<DescribeNetTestResultResponseBodyTrafficTestServers> getServers() {
            return this.servers;
        }

        public DescribeNetTestResultResponseBodyTrafficTest setTrafficModel(String trafficModel) {
            this.trafficModel = trafficModel;
            return this;
        }
        public String getTrafficModel() {
            return this.trafficModel;
        }

    }

}
