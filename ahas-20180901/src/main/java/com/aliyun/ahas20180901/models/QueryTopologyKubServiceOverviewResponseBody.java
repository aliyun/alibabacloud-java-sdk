// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubServiceOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyKubServiceOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubServiceOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubServiceOverviewResponseBody self = new QueryTopologyKubServiceOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubServiceOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubServiceOverviewResponseBody setData(QueryTopologyKubServiceOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyKubServiceOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyKubServiceOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubServiceOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubServiceOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound extends TeaModel {
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

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound extends TeaModel {
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

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents extends TeaModel {
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

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents setTierLabel(String tierLabel) {
            this.tierLabel = tierLabel;
            return this;
        }
        public String getTierLabel() {
            return this.tierLabel;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses extends TeaModel {
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

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("image")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage> image;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents> parents;

        @NameInMap("processes")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses> processes;

        @NameInMap("tierId")
        public Integer tierId;

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices self = new QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setImage(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesImage> getImage() {
            return this.image;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setInbound(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setLabels(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setMeta(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setMetrics(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setOutbound(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setParents(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesParents> getParents() {
            return this.parents;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setProcesses(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServicesProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyDataKubService extends TeaModel {
        @NameInMap("services")
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices> services;

        public static QueryTopologyKubServiceOverviewResponseBodyDataKubService build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyDataKubService self = new QueryTopologyKubServiceOverviewResponseBodyDataKubService();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyDataKubService setServices(java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<QueryTopologyKubServiceOverviewResponseBodyDataKubServiceServices> getServices() {
            return this.services;
        }

    }

    public static class QueryTopologyKubServiceOverviewResponseBodyData extends TeaModel {
        @NameInMap("kubService")
        public QueryTopologyKubServiceOverviewResponseBodyDataKubService kubService;

        public static QueryTopologyKubServiceOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubServiceOverviewResponseBodyData self = new QueryTopologyKubServiceOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubServiceOverviewResponseBodyData setKubService(QueryTopologyKubServiceOverviewResponseBodyDataKubService kubService) {
            this.kubService = kubService;
            return this;
        }
        public QueryTopologyKubServiceOverviewResponseBodyDataKubService getKubService() {
            return this.kubService;
        }

    }

}
