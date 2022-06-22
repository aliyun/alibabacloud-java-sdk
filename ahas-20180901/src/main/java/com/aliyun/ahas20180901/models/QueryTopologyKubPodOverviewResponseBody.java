// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubPodOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyKubPodOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubPodOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubPodOverviewResponseBody self = new QueryTopologyKubPodOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubPodOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubPodOverviewResponseBody setData(QueryTopologyKubPodOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyKubPodOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyKubPodOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubPodOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubPodOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound extends TeaModel {
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

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound extends TeaModel {
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

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents extends TeaModel {
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

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents setTierLabel(String tierLabel) {
            this.tierLabel = tierLabel;
            return this;
        }
        public String getTierLabel() {
            return this.tierLabel;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses extends TeaModel {
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

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses self = new QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPodPods extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("image")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage> image;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents> parents;

        @NameInMap("processes")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses> processes;

        @NameInMap("tierId")
        public Integer tierId;

        public static QueryTopologyKubPodOverviewResponseBodyDataPodPods build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPodPods self = new QueryTopologyKubPodOverviewResponseBodyDataPodPods();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setImage(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsImage> getImage() {
            return this.image;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setInbound(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setLabels(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setMeta(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setMetrics(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setOutbound(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setParents(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsParents> getParents() {
            return this.parents;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setProcesses(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPodsProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPodPods setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyDataPod extends TeaModel {
        @NameInMap("pods")
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPods> pods;

        public static QueryTopologyKubPodOverviewResponseBodyDataPod build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyDataPod self = new QueryTopologyKubPodOverviewResponseBodyDataPod();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyDataPod setPods(java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPods> pods) {
            this.pods = pods;
            return this;
        }
        public java.util.List<QueryTopologyKubPodOverviewResponseBodyDataPodPods> getPods() {
            return this.pods;
        }

    }

    public static class QueryTopologyKubPodOverviewResponseBodyData extends TeaModel {
        @NameInMap("pod")
        public QueryTopologyKubPodOverviewResponseBodyDataPod pod;

        public static QueryTopologyKubPodOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubPodOverviewResponseBodyData self = new QueryTopologyKubPodOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubPodOverviewResponseBodyData setPod(QueryTopologyKubPodOverviewResponseBodyDataPod pod) {
            this.pod = pod;
            return this;
        }
        public QueryTopologyKubPodOverviewResponseBodyDataPod getPod() {
            return this.pod;
        }

    }

}
