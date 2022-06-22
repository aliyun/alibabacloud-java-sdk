// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyNodeDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyNodeDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyNodeDetailResponseBody self = new QueryTopologyNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyNodeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyNodeDetailResponseBody setData(QueryTopologyNodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyNodeDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyNodeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyNodeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeImage extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeImage build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeImage self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeImage();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeImage setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeImage setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeImage setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeParents extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public Integer viewId;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeParents self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeParents setViewId(Integer viewId) {
            this.viewId = viewId;
            return this;
        }
        public Integer getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses self = new QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataContainerNode extends TeaModel {
        @NameInMap("containerLabels")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels> containerLabels;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("id")
        public String id;

        @NameInMap("image")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeImage> image;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("meta")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeParents> parents;

        @NameInMap("processes")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses> processes;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyNodeDetailResponseBodyDataContainerNode build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataContainerNode self = new QueryTopologyNodeDetailResponseBodyDataContainerNode();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setContainerLabels(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels> containerLabels) {
            this.containerLabels = containerLabels;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeContainerLabels> getContainerLabels() {
            return this.containerLabels;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setImage(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeImage> getImage() {
            return this.image;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setInbound(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setMeta(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setMetrics(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setOutbound(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setParents(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeParents> getParents() {
            return this.parents;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setProcesses(java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataContainerNodeProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyNodeDetailResponseBodyDataContainerNode setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms self = new QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages self = new QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeContainers extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeContainers self = new QueryTopologyNodeDetailResponseBodyDataHostNodeContainers();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainers setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeContainers setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeEvents extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeEvents self = new QueryTopologyNodeDetailResponseBodyDataHostNodeEvents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeEvents setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeInbound extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeInbound self = new QueryTopologyNodeDetailResponseBodyDataHostNodeInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeMeta self = new QueryTopologyNodeDetailResponseBodyDataHostNodeMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics self = new QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound self = new QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodePods extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodePods build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodePods self = new QueryTopologyNodeDetailResponseBodyDataHostNodePods();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodePods setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodePods setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodePods setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodePods setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses self = new QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNodeRisks extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryTopologyNodeDetailResponseBodyDataHostNodeRisks build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNodeRisks self = new QueryTopologyNodeDetailResponseBodyDataHostNodeRisks();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNodeRisks setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataHostNode extends TeaModel {
        @NameInMap("alarms")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms> alarms;

        @NameInMap("containerImages")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages> containerImages;

        @NameInMap("containers")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeContainers> containers;

        @NameInMap("events")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeEvents> events;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeInbound> inbound;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("instanceUrl")
        public String instanceUrl;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("meta")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound> outbound;

        @NameInMap("pods")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodePods> pods;

        @NameInMap("processes")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses> processes;

        @NameInMap("risks")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeRisks> risks;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyNodeDetailResponseBodyDataHostNode build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataHostNode self = new QueryTopologyNodeDetailResponseBodyDataHostNode();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setAlarms(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms> alarms) {
            this.alarms = alarms;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeAlarms> getAlarms() {
            return this.alarms;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setContainerImages(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeContainerImages> getContainerImages() {
            return this.containerImages;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setContainers(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeContainers> getContainers() {
            return this.containers;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setEvents(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeEvents> getEvents() {
            return this.events;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setInbound(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setInstanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setMeta(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setMetrics(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setOutbound(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setPods(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodePods> pods) {
            this.pods = pods;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodePods> getPods() {
            return this.pods;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setProcesses(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setRisks(java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeRisks> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataHostNodeRisks> getRisks() {
            return this.risks;
        }

        public QueryTopologyNodeDetailResponseBodyDataHostNode setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound self = new QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta self = new QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics self = new QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound extends TeaModel {
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

        public static QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound self = new QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataProcessNodeParents extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        @NameInMap("viewId")
        public Integer viewId;

        public static QueryTopologyNodeDetailResponseBodyDataProcessNodeParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataProcessNodeParents self = new QueryTopologyNodeDetailResponseBodyDataProcessNodeParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNodeParents setViewId(Integer viewId) {
            this.viewId = viewId;
            return this;
        }
        public Integer getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyDataProcessNode extends TeaModel {
        @NameInMap("commandLine")
        public String commandLine;

        @NameInMap("cpuUtil")
        public Float cpuUtil;

        @NameInMap("hostConfigurationId")
        public String hostConfigurationId;

        @NameInMap("id")
        public String id;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("memUtil")
        public Float memUtil;

        @NameInMap("meta")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeParents> parents;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("ppid")
        public Integer ppid;

        @NameInMap("timeOfCreation")
        public Long timeOfCreation;

        @NameInMap("viewId")
        public String viewId;

        public static QueryTopologyNodeDetailResponseBodyDataProcessNode build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyDataProcessNode self = new QueryTopologyNodeDetailResponseBodyDataProcessNode();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setHostConfigurationId(String hostConfigurationId) {
            this.hostConfigurationId = hostConfigurationId;
            return this;
        }
        public String getHostConfigurationId() {
            return this.hostConfigurationId;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setInbound(java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setMeta(java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setMetrics(java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setOutbound(java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setParents(java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyNodeDetailResponseBodyDataProcessNodeParents> getParents() {
            return this.parents;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

        public QueryTopologyNodeDetailResponseBodyDataProcessNode setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

    }

    public static class QueryTopologyNodeDetailResponseBodyData extends TeaModel {
        @NameInMap("containerNode")
        public QueryTopologyNodeDetailResponseBodyDataContainerNode containerNode;

        @NameInMap("hostNode")
        public QueryTopologyNodeDetailResponseBodyDataHostNode hostNode;

        @NameInMap("processNode")
        public QueryTopologyNodeDetailResponseBodyDataProcessNode processNode;

        public static QueryTopologyNodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeDetailResponseBodyData self = new QueryTopologyNodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeDetailResponseBodyData setContainerNode(QueryTopologyNodeDetailResponseBodyDataContainerNode containerNode) {
            this.containerNode = containerNode;
            return this;
        }
        public QueryTopologyNodeDetailResponseBodyDataContainerNode getContainerNode() {
            return this.containerNode;
        }

        public QueryTopologyNodeDetailResponseBodyData setHostNode(QueryTopologyNodeDetailResponseBodyDataHostNode hostNode) {
            this.hostNode = hostNode;
            return this;
        }
        public QueryTopologyNodeDetailResponseBodyDataHostNode getHostNode() {
            return this.hostNode;
        }

        public QueryTopologyNodeDetailResponseBodyData setProcessNode(QueryTopologyNodeDetailResponseBodyDataProcessNode processNode) {
            this.processNode = processNode;
            return this;
        }
        public QueryTopologyNodeDetailResponseBodyDataProcessNode getProcessNode() {
            return this.processNode;
        }

    }

}
