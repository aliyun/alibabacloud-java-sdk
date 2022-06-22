// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubServiceNodeDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyKubServiceNodeDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubServiceNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubServiceNodeDetailResponseBody self = new QueryTopologyKubServiceNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubServiceNodeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubServiceNodeDetailResponseBody setData(QueryTopologyKubServiceNodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyKubServiceNodeDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyKubServiceNodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubServiceNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubServiceNodeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms self = new QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataContainers extends TeaModel {
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

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataContainers self = new QueryTopologyKubServiceNodeDetailResponseBodyDataContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataContainers setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataEvents extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataEvents self = new QueryTopologyKubServiceNodeDetailResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataEvents setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataInbound extends TeaModel {
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

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataInbound self = new QueryTopologyKubServiceNodeDetailResponseBodyDataInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataLabels self = new QueryTopologyKubServiceNodeDetailResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataMeta self = new QueryTopologyKubServiceNodeDetailResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics self = new QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound extends TeaModel {
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

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound self = new QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataParents extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataParents self = new QueryTopologyKubServiceNodeDetailResponseBodyDataParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataParents setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataPods extends TeaModel {
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

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataPods build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataPods self = new QueryTopologyKubServiceNodeDetailResponseBodyDataPods();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataPods setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataPods setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataPods setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataPods setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataPods setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses extends TeaModel {
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

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses self = new QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataRisks extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataRisks build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataRisks self = new QueryTopologyKubServiceNodeDetailResponseBodyDataRisks();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataRisks setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyDataRules extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubServiceNodeDetailResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyDataRules self = new QueryTopologyKubServiceNodeDetailResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataRules setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyDataRules setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyKubServiceNodeDetailResponseBodyData extends TeaModel {
        @NameInMap("alarms")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms> alarms;

        @NameInMap("containers")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataContainers> containers;

        @NameInMap("events")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataEvents> events;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataParents> parents;

        @NameInMap("pods")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataPods> pods;

        @NameInMap("processes")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses> processes;

        @NameInMap("risks")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataRisks> risks;

        @NameInMap("rules")
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataRules> rules;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyKubServiceNodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceNodeDetailResponseBodyData self = new QueryTopologyKubServiceNodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setAlarms(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataAlarms> getAlarms() {
            return this.alarms;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setContainers(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setEvents(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataEvents> getEvents() {
            return this.events;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setInbound(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setLabels(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setMeta(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setMetrics(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setOutbound(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setParents(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataParents> getParents() {
            return this.parents;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setPods(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataPods> pods) {
            this.pods = pods;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataPods> getPods() {
            return this.pods;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setProcesses(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setRisks(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataRisks> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataRisks> getRisks() {
            return this.risks;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setRules(java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceNodeDetailResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public QueryTopologyKubServiceNodeDetailResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

}
