// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubPodNodeDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyKubPodNodeDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubPodNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubPodNodeDetailResponseBody self = new QueryTopologyKubPodNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubPodNodeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubPodNodeDetailResponseBody setData(QueryTopologyKubPodNodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyKubPodNodeDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyKubPodNodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubPodNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubPodNodeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataAlarms extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataAlarms build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataAlarms self = new QueryTopologyKubPodNodeDetailResponseBodyDataAlarms();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataAlarms setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages self = new QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataContainers extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataContainers self = new QueryTopologyKubPodNodeDetailResponseBodyDataContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataContainers setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataEvents extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataEvents self = new QueryTopologyKubPodNodeDetailResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataEvents setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataInbound extends TeaModel {
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

        public static QueryTopologyKubPodNodeDetailResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataInbound self = new QueryTopologyKubPodNodeDetailResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataLabels self = new QueryTopologyKubPodNodeDetailResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataMeta self = new QueryTopologyKubPodNodeDetailResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataMetrics self = new QueryTopologyKubPodNodeDetailResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataOutbound extends TeaModel {
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

        public static QueryTopologyKubPodNodeDetailResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataOutbound self = new QueryTopologyKubPodNodeDetailResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataParents extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataParents self = new QueryTopologyKubPodNodeDetailResponseBodyDataParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataParents setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataProcesses extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataProcesses self = new QueryTopologyKubPodNodeDetailResponseBodyDataProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataProcesses setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataProcesses setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataProcesses setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyDataRisks extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubPodNodeDetailResponseBodyDataRisks build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyDataRisks self = new QueryTopologyKubPodNodeDetailResponseBodyDataRisks();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyDataRisks setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubPodNodeDetailResponseBodyData extends TeaModel {
        @NameInMap("alarms")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataAlarms> alarms;

        @NameInMap("containerImages")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages> containerImages;

        @NameInMap("containers")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataContainers> containers;

        @NameInMap("events")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataEvents> events;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataParents> parents;

        @NameInMap("processes")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataProcesses> processes;

        @NameInMap("risks")
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataRisks> risks;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubPodNodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodNodeDetailResponseBodyData self = new QueryTopologyKubPodNodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setAlarms(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataAlarms> getAlarms() {
            return this.alarms;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setContainerImages(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataContainerImages> getContainerImages() {
            return this.containerImages;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setContainers(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setEvents(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setInbound(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setLabels(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setMeta(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setMetrics(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setOutbound(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setParents(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataParents> getParents() {
            return this.parents;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setProcesses(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setRisks(java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataRisks> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<QueryTopologyKubPodNodeDetailResponseBodyDataRisks> getRisks() {
            return this.risks;
        }

        public QueryTopologyKubPodNodeDetailResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

}
