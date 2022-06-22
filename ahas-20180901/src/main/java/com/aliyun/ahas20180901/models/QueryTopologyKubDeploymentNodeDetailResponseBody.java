// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubDeploymentNodeDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyKubDeploymentNodeDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubDeploymentNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubDeploymentNodeDetailResponseBody self = new QueryTopologyKubDeploymentNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubDeploymentNodeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubDeploymentNodeDetailResponseBody setData(QueryTopologyKubDeploymentNodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyKubDeploymentNodeDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyKubDeploymentNodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubDeploymentNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubDeploymentNodeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers extends TeaModel {
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

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound extends TeaModel {
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

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound extends TeaModel {
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

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("tierLabel")
        public String tierLabel;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents setTierLabel(String tierLabel) {
            this.tierLabel = tierLabel;
            return this;
        }
        public String getTierLabel() {
            return this.tierLabel;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods extends TeaModel {
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

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses extends TeaModel {
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

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks self = new QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubDeploymentNodeDetailResponseBodyData extends TeaModel {
        @NameInMap("alarms")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms> alarms;

        @NameInMap("containers")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers> containers;

        @NameInMap("events")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents> events;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents> parents;

        @NameInMap("pods")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods> pods;

        @NameInMap("processes")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses> processes;

        @NameInMap("risks")
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks> risks;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubDeploymentNodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentNodeDetailResponseBodyData self = new QueryTopologyKubDeploymentNodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setAlarms(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataAlarms> getAlarms() {
            return this.alarms;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setContainers(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setEvents(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setInbound(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setLabels(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setMeta(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setMetrics(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setOutbound(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setParents(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataParents> getParents() {
            return this.parents;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setPods(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods> pods) {
            this.pods = pods;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataPods> getPods() {
            return this.pods;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setProcesses(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setRisks(java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentNodeDetailResponseBodyDataRisks> getRisks() {
            return this.risks;
        }

        public QueryTopologyKubDeploymentNodeDetailResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

}
