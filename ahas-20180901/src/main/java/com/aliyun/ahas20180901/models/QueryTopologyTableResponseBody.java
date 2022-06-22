// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyTableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyTableResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyTableResponseBody self = new QueryTopologyTableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyTableResponseBody setData(QueryTopologyTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyTableResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyTableResponseBodyDataContainerRows extends TeaModel {
        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("hostDeviceName")
        public String hostDeviceName;

        @NameInMap("hostId")
        public String hostId;

        @NameInMap("id")
        public String id;

        @NameInMap("image")
        public String image;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("name")
        public String name;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("status")
        public String status;

        @NameInMap("tag")
        public String tag;

        @NameInMap("upTime")
        public String upTime;

        public static QueryTopologyTableResponseBodyDataContainerRows build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataContainerRows self = new QueryTopologyTableResponseBodyDataContainerRows();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataContainerRows setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setHostDeviceName(String hostDeviceName) {
            this.hostDeviceName = hostDeviceName;
            return this;
        }
        public String getHostDeviceName() {
            return this.hostDeviceName;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryTopologyTableResponseBodyDataContainerRows setUpTime(String upTime) {
            this.upTime = upTime;
            return this;
        }
        public String getUpTime() {
            return this.upTime;
        }

    }

    public static class QueryTopologyTableResponseBodyDataDeploymentRows extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("kubNamespace")
        public String kubNamespace;

        @NameInMap("name")
        public String name;

        @NameInMap("observedGeneration")
        public String observedGeneration;

        @NameInMap("readyReplicas")
        public Integer readyReplicas;

        @NameInMap("replicas")
        public Integer replicas;

        @NameInMap("strategy")
        public String strategy;

        @NameInMap("type")
        public String type;

        @NameInMap("updatedReplicas")
        public Integer updatedReplicas;

        public static QueryTopologyTableResponseBodyDataDeploymentRows build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataDeploymentRows self = new QueryTopologyTableResponseBodyDataDeploymentRows();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setKubNamespace(String kubNamespace) {
            this.kubNamespace = kubNamespace;
            return this;
        }
        public String getKubNamespace() {
            return this.kubNamespace;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setObservedGeneration(String observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public String getObservedGeneration() {
            return this.observedGeneration;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setReadyReplicas(Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Integer getReadyReplicas() {
            return this.readyReplicas;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTopologyTableResponseBodyDataDeploymentRows setUpdatedReplicas(Integer updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public Integer getUpdatedReplicas() {
            return this.updatedReplicas;
        }

    }

    public static class QueryTopologyTableResponseBodyDataHostRows extends TeaModel {
        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("hostName")
        public String hostName;

        @NameInMap("id")
        public String id;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("name")
        public String name;

        @NameInMap("osVersion")
        public String osVersion;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("upTime")
        public String upTime;

        public static QueryTopologyTableResponseBodyDataHostRows build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataHostRows self = new QueryTopologyTableResponseBodyDataHostRows();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataHostRows setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyTableResponseBodyDataHostRows setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryTopologyTableResponseBodyDataHostRows setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public QueryTopologyTableResponseBodyDataHostRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyTableResponseBodyDataHostRows setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyTableResponseBodyDataHostRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyTableResponseBodyDataHostRows setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public QueryTopologyTableResponseBodyDataHostRows setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryTopologyTableResponseBodyDataHostRows setUpTime(String upTime) {
            this.upTime = upTime;
            return this;
        }
        public String getUpTime() {
            return this.upTime;
        }

    }

    public static class QueryTopologyTableResponseBodyDataHosts extends TeaModel {
        @NameInMap("configurationId")
        public String configurationId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("deviceIp")
        public String deviceIp;

        @NameInMap("deviceName")
        public String deviceName;

        public static QueryTopologyTableResponseBodyDataHosts build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataHosts self = new QueryTopologyTableResponseBodyDataHosts();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataHosts setConfigurationId(String configurationId) {
            this.configurationId = configurationId;
            return this;
        }
        public String getConfigurationId() {
            return this.configurationId;
        }

        public QueryTopologyTableResponseBodyDataHosts setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryTopologyTableResponseBodyDataHosts setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public QueryTopologyTableResponseBodyDataHosts setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

    public static class QueryTopologyTableResponseBodyDataKubServiceRows extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("ip")
        public String ip;

        @NameInMap("kubNamespace")
        public String kubNamespace;

        @NameInMap("name")
        public String name;

        @NameInMap("selector")
        public String selector;

        @NameInMap("type")
        public String type;

        @NameInMap("upTime")
        public String upTime;

        public static QueryTopologyTableResponseBodyDataKubServiceRows build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataKubServiceRows self = new QueryTopologyTableResponseBodyDataKubServiceRows();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setKubNamespace(String kubNamespace) {
            this.kubNamespace = kubNamespace;
            return this;
        }
        public String getKubNamespace() {
            return this.kubNamespace;
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setSelector(String selector) {
            this.selector = selector;
            return this;
        }
        public String getSelector() {
            return this.selector;
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryTopologyTableResponseBodyDataKubServiceRows setUpTime(String upTime) {
            this.upTime = upTime;
            return this;
        }
        public String getUpTime() {
            return this.upTime;
        }

    }

    public static class QueryTopologyTableResponseBodyDataPodRows extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("ip")
        public String ip;

        @NameInMap("kubNamespace")
        public String kubNamespace;

        @NameInMap("name")
        public String name;

        @NameInMap("restartCount")
        public Integer restartCount;

        @NameInMap("state")
        public String state;

        @NameInMap("upTime")
        public String upTime;

        public static QueryTopologyTableResponseBodyDataPodRows build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataPodRows self = new QueryTopologyTableResponseBodyDataPodRows();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataPodRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyTableResponseBodyDataPodRows setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryTopologyTableResponseBodyDataPodRows setKubNamespace(String kubNamespace) {
            this.kubNamespace = kubNamespace;
            return this;
        }
        public String getKubNamespace() {
            return this.kubNamespace;
        }

        public QueryTopologyTableResponseBodyDataPodRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyTableResponseBodyDataPodRows setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public QueryTopologyTableResponseBodyDataPodRows setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTopologyTableResponseBodyDataPodRows setUpTime(String upTime) {
            this.upTime = upTime;
            return this;
        }
        public String getUpTime() {
            return this.upTime;
        }

    }

    public static class QueryTopologyTableResponseBodyDataProcessRows extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("cmdLine")
        public String cmdLine;

        @NameInMap("connected")
        public Boolean connected;

        @NameInMap("containerId")
        public String containerId;

        @NameInMap("containerName")
        public String containerName;

        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("hostDeviceName")
        public String hostDeviceName;

        @NameInMap("hostId")
        public String hostId;

        @NameInMap("icon")
        public String icon;

        @NameInMap("id")
        public String id;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("name")
        public String name;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("ppid")
        public Integer ppid;

        @NameInMap("qps")
        public Float qps;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("state")
        public String state;

        @NameInMap("upTime")
        public String upTime;

        @NameInMap("usr")
        public String usr;

        public static QueryTopologyTableResponseBodyDataProcessRows build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyDataProcessRows self = new QueryTopologyTableResponseBodyDataProcessRows();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyDataProcessRows setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setCmdLine(String cmdLine) {
            this.cmdLine = cmdLine;
            return this;
        }
        public String getCmdLine() {
            return this.cmdLine;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setHostDeviceName(String hostDeviceName) {
            this.hostDeviceName = hostDeviceName;
            return this;
        }
        public String getHostDeviceName() {
            return this.hostDeviceName;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setUpTime(String upTime) {
            this.upTime = upTime;
            return this;
        }
        public String getUpTime() {
            return this.upTime;
        }

        public QueryTopologyTableResponseBodyDataProcessRows setUsr(String usr) {
            this.usr = usr;
            return this;
        }
        public String getUsr() {
            return this.usr;
        }

    }

    public static class QueryTopologyTableResponseBodyData extends TeaModel {
        @NameInMap("containerRows")
        public java.util.List<QueryTopologyTableResponseBodyDataContainerRows> containerRows;

        @NameInMap("deploymentRows")
        public java.util.List<QueryTopologyTableResponseBodyDataDeploymentRows> deploymentRows;

        @NameInMap("headers")
        public java.util.List<String> headers;

        @NameInMap("hostRows")
        public java.util.List<QueryTopologyTableResponseBodyDataHostRows> hostRows;

        @NameInMap("hosts")
        public java.util.List<QueryTopologyTableResponseBodyDataHosts> hosts;

        @NameInMap("kubServiceRows")
        public java.util.List<QueryTopologyTableResponseBodyDataKubServiceRows> kubServiceRows;

        @NameInMap("podRows")
        public java.util.List<QueryTopologyTableResponseBodyDataPodRows> podRows;

        @NameInMap("processRows")
        public java.util.List<QueryTopologyTableResponseBodyDataProcessRows> processRows;

        @NameInMap("rowCategories")
        public java.util.List<String> rowCategories;

        public static QueryTopologyTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyTableResponseBodyData self = new QueryTopologyTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyTableResponseBodyData setContainerRows(java.util.List<QueryTopologyTableResponseBodyDataContainerRows> containerRows) {
            this.containerRows = containerRows;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataContainerRows> getContainerRows() {
            return this.containerRows;
        }

        public QueryTopologyTableResponseBodyData setDeploymentRows(java.util.List<QueryTopologyTableResponseBodyDataDeploymentRows> deploymentRows) {
            this.deploymentRows = deploymentRows;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataDeploymentRows> getDeploymentRows() {
            return this.deploymentRows;
        }

        public QueryTopologyTableResponseBodyData setHeaders(java.util.List<String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        public QueryTopologyTableResponseBodyData setHostRows(java.util.List<QueryTopologyTableResponseBodyDataHostRows> hostRows) {
            this.hostRows = hostRows;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataHostRows> getHostRows() {
            return this.hostRows;
        }

        public QueryTopologyTableResponseBodyData setHosts(java.util.List<QueryTopologyTableResponseBodyDataHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataHosts> getHosts() {
            return this.hosts;
        }

        public QueryTopologyTableResponseBodyData setKubServiceRows(java.util.List<QueryTopologyTableResponseBodyDataKubServiceRows> kubServiceRows) {
            this.kubServiceRows = kubServiceRows;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataKubServiceRows> getKubServiceRows() {
            return this.kubServiceRows;
        }

        public QueryTopologyTableResponseBodyData setPodRows(java.util.List<QueryTopologyTableResponseBodyDataPodRows> podRows) {
            this.podRows = podRows;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataPodRows> getPodRows() {
            return this.podRows;
        }

        public QueryTopologyTableResponseBodyData setProcessRows(java.util.List<QueryTopologyTableResponseBodyDataProcessRows> processRows) {
            this.processRows = processRows;
            return this;
        }
        public java.util.List<QueryTopologyTableResponseBodyDataProcessRows> getProcessRows() {
            return this.processRows;
        }

        public QueryTopologyTableResponseBodyData setRowCategories(java.util.List<String> rowCategories) {
            this.rowCategories = rowCategories;
            return this;
        }
        public java.util.List<String> getRowCategories() {
            return this.rowCategories;
        }

    }

}
