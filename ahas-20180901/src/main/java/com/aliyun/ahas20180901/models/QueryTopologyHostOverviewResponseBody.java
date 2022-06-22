// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyHostOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyHostOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyHostOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyHostOverviewResponseBody self = new QueryTopologyHostOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyHostOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyHostOverviewResponseBody setData(QueryTopologyHostOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyHostOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyHostOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyHostOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyHostOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages self = new QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsContainers extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsContainers self = new QueryTopologyHostOverviewResponseBodyDataHostHostsContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsInbound extends TeaModel {
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

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsInbound self = new QueryTopologyHostOverviewResponseBodyDataHostHostsInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsInbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsMeta self = new QueryTopologyHostOverviewResponseBodyDataHostHostsMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics self = new QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound extends TeaModel {
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

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound self = new QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses extends TeaModel {
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

        public static QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses self = new QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHostHosts extends TeaModel {
        @NameInMap("containerImages")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages> containerImages;

        @NameInMap("containers")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsContainers> containers;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("meta")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound> outbound;

        @NameInMap("processes")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses> processes;

        @NameInMap("tierId")
        public Integer tierId;

        public static QueryTopologyHostOverviewResponseBodyDataHostHosts build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHostHosts self = new QueryTopologyHostOverviewResponseBodyDataHostHosts();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setContainerImages(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsContainerImages> getContainerImages() {
            return this.containerImages;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setContainers(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setInbound(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setMeta(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setMetrics(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setOutbound(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setProcesses(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHostsProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyHostOverviewResponseBodyDataHostHosts setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyDataHost extends TeaModel {
        @NameInMap("hosts")
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHosts> hosts;

        public static QueryTopologyHostOverviewResponseBodyDataHost build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyDataHost self = new QueryTopologyHostOverviewResponseBodyDataHost();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyDataHost setHosts(java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<QueryTopologyHostOverviewResponseBodyDataHostHosts> getHosts() {
            return this.hosts;
        }

    }

    public static class QueryTopologyHostOverviewResponseBodyData extends TeaModel {
        @NameInMap("host")
        public QueryTopologyHostOverviewResponseBodyDataHost host;

        public static QueryTopologyHostOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyHostOverviewResponseBodyData self = new QueryTopologyHostOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyHostOverviewResponseBodyData setHost(QueryTopologyHostOverviewResponseBodyDataHost host) {
            this.host = host;
            return this;
        }
        public QueryTopologyHostOverviewResponseBodyDataHost getHost() {
            return this.host;
        }

    }

}
