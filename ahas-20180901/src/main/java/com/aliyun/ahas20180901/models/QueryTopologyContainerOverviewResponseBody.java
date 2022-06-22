// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyContainerOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyContainerOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyContainerOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyContainerOverviewResponseBody self = new QueryTopologyContainerOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyContainerOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyContainerOverviewResponseBody setData(QueryTopologyContainerOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyContainerOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyContainerOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyContainerOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyContainerOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound extends TeaModel {
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

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound extends TeaModel {
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

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("tierId")
        public Integer tierId;

        @NameInMap("tierLabel")
        public String tierLabel;

        @NameInMap("value")
        public String value;

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents setTierLabel(String tierLabel) {
            this.tierLabel = tierLabel;
            return this;
        }
        public String getTierLabel() {
            return this.tierLabel;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses extends TeaModel {
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

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainerContainers extends TeaModel {
        @NameInMap("containerLabels")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels> containerLabels;

        @NameInMap("id")
        public String id;

        @NameInMap("image")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage> image;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("meta")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents> parents;

        @NameInMap("processes")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses> processes;

        @NameInMap("tierId")
        public Integer tierId;

        public static QueryTopologyContainerOverviewResponseBodyDataContainerContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainerContainers self = new QueryTopologyContainerOverviewResponseBodyDataContainerContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setContainerLabels(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels> containerLabels) {
            this.containerLabels = containerLabels;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersContainerLabels> getContainerLabels() {
            return this.containerLabels;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setImage(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersImage> getImage() {
            return this.image;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setInbound(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setMeta(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setMetrics(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setOutbound(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setParents(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersParents> getParents() {
            return this.parents;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setProcesses(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainersProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainerContainers setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyDataContainer extends TeaModel {
        @NameInMap("containers")
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainers> containers;

        public static QueryTopologyContainerOverviewResponseBodyDataContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyDataContainer self = new QueryTopologyContainerOverviewResponseBodyDataContainer();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyDataContainer setContainers(java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyContainerOverviewResponseBodyDataContainerContainers> getContainers() {
            return this.containers;
        }

    }

    public static class QueryTopologyContainerOverviewResponseBodyData extends TeaModel {
        @NameInMap("container")
        public QueryTopologyContainerOverviewResponseBodyDataContainer container;

        public static QueryTopologyContainerOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyContainerOverviewResponseBodyData self = new QueryTopologyContainerOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyContainerOverviewResponseBodyData setContainer(QueryTopologyContainerOverviewResponseBodyDataContainer container) {
            this.container = container;
            return this;
        }
        public QueryTopologyContainerOverviewResponseBodyDataContainer getContainer() {
            return this.container;
        }

    }

}
