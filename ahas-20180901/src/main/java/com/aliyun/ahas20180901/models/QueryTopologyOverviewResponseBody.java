// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyOverviewResponseBody self = new QueryTopologyOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyOverviewResponseBody setData(QueryTopologyOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyOverviewResponseBodyDataContainerContainers extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyOverviewResponseBodyDataContainerContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataContainerContainers self = new QueryTopologyOverviewResponseBodyDataContainerContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataContainerContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataContainerContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataContainerContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyOverviewResponseBodyDataContainerContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataContainer extends TeaModel {
        @NameInMap("containers")
        public java.util.List<QueryTopologyOverviewResponseBodyDataContainerContainers> containers;

        public static QueryTopologyOverviewResponseBodyDataContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataContainer self = new QueryTopologyOverviewResponseBodyDataContainer();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataContainer setContainers(java.util.List<QueryTopologyOverviewResponseBodyDataContainerContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataContainerContainers> getContainers() {
            return this.containers;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsContainerImages extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyOverviewResponseBodyDataHostHostsContainerImages build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsContainerImages self = new QueryTopologyOverviewResponseBodyDataHostHostsContainerImages();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainerImages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainerImages setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainerImages setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainerImages setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsContainers extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyOverviewResponseBodyDataHostHostsContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsContainers self = new QueryTopologyOverviewResponseBodyDataHostHostsContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsInbound extends TeaModel {
        @NameInMap("canView")
        public Boolean canView;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("port")
        public Integer port;

        @NameInMap("tierId")
        public Integer tierId;

        @NameInMap("value")
        public String value;

        public static QueryTopologyOverviewResponseBodyDataHostHostsInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsInbound self = new QueryTopologyOverviewResponseBodyDataHostHostsInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsInbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyOverviewResponseBodyDataHostHostsMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsMeta self = new QueryTopologyOverviewResponseBodyDataHostHostsMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyOverviewResponseBodyDataHostHostsMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsMetrics self = new QueryTopologyOverviewResponseBodyDataHostHostsMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsOutbound extends TeaModel {
        @NameInMap("canView")
        public Boolean canView;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("port")
        public Integer port;

        @NameInMap("tierId")
        public Integer tierId;

        @NameInMap("value")
        public String value;

        public static QueryTopologyOverviewResponseBodyDataHostHostsOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsOutbound self = new QueryTopologyOverviewResponseBodyDataHostHostsOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsOutbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHostsProcesses extends TeaModel {
        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("ppid")
        public Integer ppid;

        @NameInMap("tierId")
        public Integer tierId;

        @NameInMap("timeOfCreation")
        public Long timeOfCreation;

        public static QueryTopologyOverviewResponseBodyDataHostHostsProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHostsProcesses self = new QueryTopologyOverviewResponseBodyDataHostHostsProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyOverviewResponseBodyDataHostHostsProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHostHosts extends TeaModel {
        @NameInMap("containerImages")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsContainerImages> containerImages;

        @NameInMap("containers")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsContainers> containers;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("meta")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsOutbound> outbound;

        @NameInMap("processes")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsProcesses> processes;

        @NameInMap("tierId")
        public Integer tierId;

        public static QueryTopologyOverviewResponseBodyDataHostHosts build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHostHosts self = new QueryTopologyOverviewResponseBodyDataHostHosts();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setContainerImages(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsContainerImages> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsContainerImages> getContainerImages() {
            return this.containerImages;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setContainers(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setInbound(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setMeta(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setMetrics(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setOutbound(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setProcesses(java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHostsProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyOverviewResponseBodyDataHostHosts setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataHost extends TeaModel {
        @NameInMap("hosts")
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHosts> hosts;

        public static QueryTopologyOverviewResponseBodyDataHost build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataHost self = new QueryTopologyOverviewResponseBodyDataHost();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataHost setHosts(java.util.List<QueryTopologyOverviewResponseBodyDataHostHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataHostHosts> getHosts() {
            return this.hosts;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcessApplications extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockQps")
        public Long blockQps;

        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpu")
        public Float cpu;

        @NameInMap("exception")
        public Long exception;

        @NameInMap("flowLimitOpened")
        public Boolean flowLimitOpened;

        @NameInMap("id")
        public String id;

        @NameInMap("mem")
        public Float mem;

        @NameInMap("passQps")
        public Long passQps;

        @NameInMap("rt")
        public Float rt;

        public static QueryTopologyOverviewResponseBodyDataProcessApplications build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcessApplications self = new QueryTopologyOverviewResponseBodyDataProcessApplications();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setBlockQps(Long blockQps) {
            this.blockQps = blockQps;
            return this;
        }
        public Long getBlockQps() {
            return this.blockQps;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setException(Long exception) {
            this.exception = exception;
            return this;
        }
        public Long getException() {
            return this.exception;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setFlowLimitOpened(Boolean flowLimitOpened) {
            this.flowLimitOpened = flowLimitOpened;
            return this;
        }
        public Boolean getFlowLimitOpened() {
            return this.flowLimitOpened;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setMem(Float mem) {
            this.mem = mem;
            return this;
        }
        public Float getMem() {
            return this.mem;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setPassQps(Long passQps) {
            this.passQps = passQps;
            return this;
        }
        public Long getPassQps() {
            return this.passQps;
        }

        public QueryTopologyOverviewResponseBodyDataProcessApplications setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("label")
        public String label;

        public static QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances self = new QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests extends TeaModel {
        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        public static QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests self = new QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcessCloudComponents extends TeaModel {
        @NameInMap("instances")
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances> instances;

        @NameInMap("label")
        public String label;

        @NameInMap("requests")
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests> requests;

        @NameInMap("type")
        public String type;

        public static QueryTopologyOverviewResponseBodyDataProcessCloudComponents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcessCloudComponents self = new QueryTopologyOverviewResponseBodyDataProcessCloudComponents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponents setInstances(java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponentsInstances> getInstances() {
            return this.instances;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponents setRequests(java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests> requests) {
            this.requests = requests;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponentsRequests> getRequests() {
            return this.requests;
        }

        public QueryTopologyOverviewResponseBodyDataProcessCloudComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcessComponentTags extends TeaModel {
        @NameInMap("ids")
        public java.util.List<String> ids;

        @NameInMap("label")
        public String label;

        public static QueryTopologyOverviewResponseBodyDataProcessComponentTags build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcessComponentTags self = new QueryTopologyOverviewResponseBodyDataProcessComponentTags();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcessComponentTags setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public QueryTopologyOverviewResponseBodyDataProcessComponentTags setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcessThirdComponents extends TeaModel {
        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpu")
        public Float cpu;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("mem")
        public Float mem;

        @NameInMap("type")
        public String type;

        public static QueryTopologyOverviewResponseBodyDataProcessThirdComponents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcessThirdComponents self = new QueryTopologyOverviewResponseBodyDataProcessThirdComponents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcessThirdComponents setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyOverviewResponseBodyDataProcessThirdComponents setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public QueryTopologyOverviewResponseBodyDataProcessThirdComponents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyOverviewResponseBodyDataProcessThirdComponents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyOverviewResponseBodyDataProcessThirdComponents setMem(Float mem) {
            this.mem = mem;
            return this;
        }
        public Float getMem() {
            return this.mem;
        }

        public QueryTopologyOverviewResponseBodyDataProcessThirdComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTopologyOverviewResponseBodyDataProcess extends TeaModel {
        @NameInMap("applications")
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessApplications> applications;

        @NameInMap("cloudComponents")
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponents> cloudComponents;

        @NameInMap("componentTags")
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessComponentTags> componentTags;

        @NameInMap("thirdComponents")
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessThirdComponents> thirdComponents;

        public static QueryTopologyOverviewResponseBodyDataProcess build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyDataProcess self = new QueryTopologyOverviewResponseBodyDataProcess();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyDataProcess setApplications(java.util.List<QueryTopologyOverviewResponseBodyDataProcessApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessApplications> getApplications() {
            return this.applications;
        }

        public QueryTopologyOverviewResponseBodyDataProcess setCloudComponents(java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponents> cloudComponents) {
            this.cloudComponents = cloudComponents;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessCloudComponents> getCloudComponents() {
            return this.cloudComponents;
        }

        public QueryTopologyOverviewResponseBodyDataProcess setComponentTags(java.util.List<QueryTopologyOverviewResponseBodyDataProcessComponentTags> componentTags) {
            this.componentTags = componentTags;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessComponentTags> getComponentTags() {
            return this.componentTags;
        }

        public QueryTopologyOverviewResponseBodyDataProcess setThirdComponents(java.util.List<QueryTopologyOverviewResponseBodyDataProcessThirdComponents> thirdComponents) {
            this.thirdComponents = thirdComponents;
            return this;
        }
        public java.util.List<QueryTopologyOverviewResponseBodyDataProcessThirdComponents> getThirdComponents() {
            return this.thirdComponents;
        }

    }

    public static class QueryTopologyOverviewResponseBodyData extends TeaModel {
        @NameInMap("container")
        public QueryTopologyOverviewResponseBodyDataContainer container;

        @NameInMap("host")
        public QueryTopologyOverviewResponseBodyDataHost host;

        @NameInMap("process")
        public QueryTopologyOverviewResponseBodyDataProcess process;

        public static QueryTopologyOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewResponseBodyData self = new QueryTopologyOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewResponseBodyData setContainer(QueryTopologyOverviewResponseBodyDataContainer container) {
            this.container = container;
            return this;
        }
        public QueryTopologyOverviewResponseBodyDataContainer getContainer() {
            return this.container;
        }

        public QueryTopologyOverviewResponseBodyData setHost(QueryTopologyOverviewResponseBodyDataHost host) {
            this.host = host;
            return this;
        }
        public QueryTopologyOverviewResponseBodyDataHost getHost() {
            return this.host;
        }

        public QueryTopologyOverviewResponseBodyData setProcess(QueryTopologyOverviewResponseBodyDataProcess process) {
            this.process = process;
            return this;
        }
        public QueryTopologyOverviewResponseBodyDataProcess getProcess() {
            return this.process;
        }

    }

}
