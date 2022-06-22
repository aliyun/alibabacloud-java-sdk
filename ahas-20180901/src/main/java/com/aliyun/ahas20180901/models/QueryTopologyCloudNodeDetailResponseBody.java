// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyCloudNodeDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyCloudNodeDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyCloudNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyCloudNodeDetailResponseBody self = new QueryTopologyCloudNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyCloudNodeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyCloudNodeDetailResponseBody setData(QueryTopologyCloudNodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyCloudNodeDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyCloudNodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyCloudNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyCloudNodeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataAlarms extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyCloudNodeDetailResponseBodyDataAlarms build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataAlarms self = new QueryTopologyCloudNodeDetailResponseBodyDataAlarms();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataAlarms setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataContainerImages extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyCloudNodeDetailResponseBodyDataContainerImages build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataContainerImages self = new QueryTopologyCloudNodeDetailResponseBodyDataContainerImages();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainerImages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainerImages setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainerImages setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainerImages setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataContainers extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyCloudNodeDetailResponseBodyDataContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataContainers self = new QueryTopologyCloudNodeDetailResponseBodyDataContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataContainers setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataEvents extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyCloudNodeDetailResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataEvents self = new QueryTopologyCloudNodeDetailResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataEvents setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataInbound extends TeaModel {
        @NameInMap("canView")
        public Boolean canView;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("port")
        public Integer port;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyCloudNodeDetailResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataInbound self = new QueryTopologyCloudNodeDetailResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyCloudNodeDetailResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataLabels self = new QueryTopologyCloudNodeDetailResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyCloudNodeDetailResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataMeta self = new QueryTopologyCloudNodeDetailResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyCloudNodeDetailResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataMetrics self = new QueryTopologyCloudNodeDetailResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataOutbound extends TeaModel {
        @NameInMap("canView")
        public Boolean canView;

        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("port")
        public Integer port;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyCloudNodeDetailResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataOutbound self = new QueryTopologyCloudNodeDetailResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataPods extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyCloudNodeDetailResponseBodyDataPods build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataPods self = new QueryTopologyCloudNodeDetailResponseBodyDataPods();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataPods setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataPods setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataPods setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataPods setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataProcesses extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpuUtil")
        public Float cpuUtil;

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

        @NameInMap("timeOfCreation")
        public Long timeOfCreation;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyCloudNodeDetailResponseBodyDataProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataProcesses self = new QueryTopologyCloudNodeDetailResponseBodyDataProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataProcesses setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyDataRisks extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyCloudNodeDetailResponseBodyDataRisks build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyDataRisks self = new QueryTopologyCloudNodeDetailResponseBodyDataRisks();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyDataRisks setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyCloudNodeDetailResponseBodyData extends TeaModel {
        @NameInMap("alarms")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataAlarms> alarms;

        @NameInMap("containerImages")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataContainerImages> containerImages;

        @NameInMap("containers")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataContainers> containers;

        @NameInMap("events")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataEvents> events;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataInbound> inbound;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("instanceUrl")
        public String instanceUrl;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataOutbound> outbound;

        @NameInMap("pods")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataPods> pods;

        @NameInMap("processes")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataProcesses> processes;

        @NameInMap("risks")
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataRisks> risks;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyCloudNodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyCloudNodeDetailResponseBodyData self = new QueryTopologyCloudNodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setAlarms(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataAlarms> getAlarms() {
            return this.alarms;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setContainerImages(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataContainerImages> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataContainerImages> getContainerImages() {
            return this.containerImages;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setContainers(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setEvents(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setInbound(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setInstanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setLabels(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setMeta(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setMetrics(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setOutbound(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setPods(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataPods> pods) {
            this.pods = pods;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataPods> getPods() {
            return this.pods;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setProcesses(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setRisks(java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataRisks> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<QueryTopologyCloudNodeDetailResponseBodyDataRisks> getRisks() {
            return this.risks;
        }

        public QueryTopologyCloudNodeDetailResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

}
