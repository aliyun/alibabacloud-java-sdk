// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNetTestResultsResponseBody extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not configure this parameter or if you set this parameter to a value less than 20, the default value is 20.</li>
     * <li>If you set this parameter to a value that is greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The results.</p>
     */
    @NameInMap("NetTestResults")
    public java.util.List<ListNetTestResultsResponseBodyNetTestResults> netTestResults;

    /**
     * <p>The token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C683243-7915-57FB-9570-A2932C1C0F78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNetTestResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetTestResultsResponseBody self = new ListNetTestResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetTestResultsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListNetTestResultsResponseBody setNetTestResults(java.util.List<ListNetTestResultsResponseBodyNetTestResults> netTestResults) {
        this.netTestResults = netTestResults;
        return this;
    }
    public java.util.List<ListNetTestResultsResponseBodyNetTestResults> getNetTestResults() {
        return this.netTestResults;
    }

    public ListNetTestResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetTestResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNetTestResultsResponseBodyNetTestResultsCommTestHosts extends TeaModel {
        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10.51.16.21</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-wwo3eteze19</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xinjiaoyu.com">www.xinjiaoyu.com</a></p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static ListNetTestResultsResponseBodyNetTestResultsCommTestHosts build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsCommTestHosts self = new ListNetTestResultsResponseBodyNetTestResultsCommTestHosts();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTestHosts setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTestHosts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTestHosts setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResultsCommTest extends TeaModel {
        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPUNum")
        public String GPUNum;

        /**
         * <p>The hosts of the test node.</p>
         */
        @NameInMap("Hosts")
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsCommTestHosts> hosts;

        /**
         * <p>The communication library model.</p>
         * 
         * <strong>example:</strong>
         * <p>AllToAll</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The CommTest type, which can be ACCL or NCCL.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListNetTestResultsResponseBodyNetTestResultsCommTest build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsCommTest self = new ListNetTestResultsResponseBodyNetTestResultsCommTest();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTest setGPUNum(String GPUNum) {
            this.GPUNum = GPUNum;
            return this;
        }
        public String getGPUNum() {
            return this.GPUNum;
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTest setHosts(java.util.List<ListNetTestResultsResponseBodyNetTestResultsCommTestHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsCommTestHosts> getHosts() {
            return this.hosts;
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTest setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListNetTestResultsResponseBodyNetTestResultsCommTest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts extends TeaModel {
        /**
         * <p>The bonding of network interface card.</p>
         * 
         * <strong>example:</strong>
         * <p>bond1</p>
         */
        @NameInMap("Bond")
        public String bond;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp174z988a27wre71o.pg.rds.aliyuncs.com</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-wwo3eteze19</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>WrF</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts self = new ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResultsDelayTest extends TeaModel {
        /**
         * <p>The hosts.</p>
         */
        @NameInMap("Hosts")
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts> hosts;

        public static ListNetTestResultsResponseBodyNetTestResultsDelayTest build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsDelayTest self = new ListNetTestResultsResponseBodyNetTestResultsDelayTest();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsDelayTest setHosts(java.util.List<ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsDelayTestHosts> getHosts() {
            return this.hosts;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients extends TeaModel {
        /**
         * <p>The bonding of network interface card.</p>
         * 
         * <strong>example:</strong>
         * <p>bond1</p>
         */
        @NameInMap("Bond")
        public String bond;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>74.73.100.1</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-20p36bqet39</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-gf-cn.juequling.com</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients self = new ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers extends TeaModel {
        /**
         * <p>The bonding of network interface card.</p>
         * 
         * <strong>example:</strong>
         * <p>bond1</p>
         */
        @NameInMap("Bond")
        public String bond;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.168.183</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-wwo3eteze19</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-gf-cn.juequling.com</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        public static ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers self = new ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers setBond(String bond) {
            this.bond = bond;
            return this;
        }
        public String getBond() {
            return this.bond;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResultsTrafficTest extends TeaModel {
        /**
         * <p>The clients.</p>
         */
        @NameInMap("Clients")
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients> clients;

        /**
         * <p>The running duration of the pipeline job. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>If the protocol is RDMA, can be True or False. If the protocol is TCP, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("GDR")
        public String GDR;

        /**
         * <p>The network protocol, which can be RDMA or TCP.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>If the protocol is TCP, the number of concurrent connections. If the protocol is RDMA, the configured QP value.</p>
         * 
         * <strong>example:</strong>
         * <p>RDMA</p>
         */
        @NameInMap("QP")
        public Long QP;

        /**
         * <p>If the TrafficModel is Fullmesh, this parameter is empty.</p>
         */
        @NameInMap("Servers")
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers> servers;

        /**
         * <p>The traffic model, which can be MTON or Fullmesh.</p>
         * 
         * <strong>example:</strong>
         * <p>Fullmesh</p>
         */
        @NameInMap("TrafficModel")
        public String trafficModel;

        public static ListNetTestResultsResponseBodyNetTestResultsTrafficTest build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResultsTrafficTest self = new ListNetTestResultsResponseBodyNetTestResultsTrafficTest();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setClients(java.util.List<ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients> clients) {
            this.clients = clients;
            return this;
        }
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsTrafficTestClients> getClients() {
            return this.clients;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setGDR(String GDR) {
            this.GDR = GDR;
            return this;
        }
        public String getGDR() {
            return this.GDR;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setQP(Long QP) {
            this.QP = QP;
            return this;
        }
        public Long getQP() {
            return this.QP;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setServers(java.util.List<ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers> servers) {
            this.servers = servers;
            return this;
        }
        public java.util.List<ListNetTestResultsResponseBodyNetTestResultsTrafficTestServers> getServers() {
            return this.servers;
        }

        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest setTrafficModel(String trafficModel) {
            this.trafficModel = trafficModel;
            return this;
        }
        public String getTrafficModel() {
            return this.trafficModel;
        }

    }

    public static class ListNetTestResultsResponseBodyNetTestResults extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i110667211718265012218</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>Returned when NetTestType is CommTest.</p>
         */
        @NameInMap("CommTest")
        public ListNetTestResultsResponseBodyNetTestResultsCommTest commTest;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-19T02:18:12Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Returned when NetTestType is DelayTest.</p>
         */
        @NameInMap("DelayTest")
        public ListNetTestResultsResponseBodyNetTestResultsDelayTest delayTest;

        /**
         * <p>The finish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-30T02:07Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The type of the network test.</p>
         * 
         * <strong>example:</strong>
         * <p>NetDiag</p>
         */
        @NameInMap("NetTestType")
        public String netTestType;

        /**
         * <p>The network mode.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("NetworkMode")
        public String networkMode;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The status of the network test task. Valid values:\
         * ● InProgress\
         * ● Finished\
         * ● Failed</p>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The test ID. The unique identifier of the resource test task.</p>
         * 
         * <strong>example:</strong>
         * <p>String	i-uf6i0tv2refv8wz*****</p>
         */
        @NameInMap("TestId")
        public String testId;

        /**
         * <p>Returned when NetTestType is TrafficTest.</p>
         */
        @NameInMap("TrafficTest")
        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest trafficTest;

        public static ListNetTestResultsResponseBodyNetTestResults build(java.util.Map<String, ?> map) throws Exception {
            ListNetTestResultsResponseBodyNetTestResults self = new ListNetTestResultsResponseBodyNetTestResults();
            return TeaModel.build(map, self);
        }

        public ListNetTestResultsResponseBodyNetTestResults setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListNetTestResultsResponseBodyNetTestResults setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListNetTestResultsResponseBodyNetTestResults setCommTest(ListNetTestResultsResponseBodyNetTestResultsCommTest commTest) {
            this.commTest = commTest;
            return this;
        }
        public ListNetTestResultsResponseBodyNetTestResultsCommTest getCommTest() {
            return this.commTest;
        }

        public ListNetTestResultsResponseBodyNetTestResults setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListNetTestResultsResponseBodyNetTestResults setDelayTest(ListNetTestResultsResponseBodyNetTestResultsDelayTest delayTest) {
            this.delayTest = delayTest;
            return this;
        }
        public ListNetTestResultsResponseBodyNetTestResultsDelayTest getDelayTest() {
            return this.delayTest;
        }

        public ListNetTestResultsResponseBodyNetTestResults setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ListNetTestResultsResponseBodyNetTestResults setNetTestType(String netTestType) {
            this.netTestType = netTestType;
            return this;
        }
        public String getNetTestType() {
            return this.netTestType;
        }

        public ListNetTestResultsResponseBodyNetTestResults setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public ListNetTestResultsResponseBodyNetTestResults setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListNetTestResultsResponseBodyNetTestResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetTestResultsResponseBodyNetTestResults setTestId(String testId) {
            this.testId = testId;
            return this;
        }
        public String getTestId() {
            return this.testId;
        }

        public ListNetTestResultsResponseBodyNetTestResults setTrafficTest(ListNetTestResultsResponseBodyNetTestResultsTrafficTest trafficTest) {
            this.trafficTest = trafficTest;
            return this;
        }
        public ListNetTestResultsResponseBodyNetTestResultsTrafficTest getTrafficTest() {
            return this.trafficTest;
        }

    }

}
