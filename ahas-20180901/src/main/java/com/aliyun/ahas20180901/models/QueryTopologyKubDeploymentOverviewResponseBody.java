// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyKubDeploymentOverviewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyKubDeploymentOverviewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyKubDeploymentOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyKubDeploymentOverviewResponseBody self = new QueryTopologyKubDeploymentOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyKubDeploymentOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyKubDeploymentOverviewResponseBody setData(QueryTopologyKubDeploymentOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyKubDeploymentOverviewResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyKubDeploymentOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyKubDeploymentOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyKubDeploymentOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound extends TeaModel {
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

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        @NameInMap("value")
        public String value;

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound extends TeaModel {
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

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound setCanView(Boolean canView) {
            this.canView = canView;
            return this;
        }
        public Boolean getCanView() {
            return this.canView;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents extends TeaModel {
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

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents setTierLabel(String tierLabel) {
            this.tierLabel = tierLabel;
            return this;
        }
        public String getTierLabel() {
            return this.tierLabel;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses extends TeaModel {
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

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setCpuUtil(Float cpuUtil) {
            this.cpuUtil = cpuUtil;
            return this;
        }
        public Float getCpuUtil() {
            return this.cpuUtil;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setMemUtil(Float memUtil) {
            this.memUtil = memUtil;
            return this;
        }
        public Float getMemUtil() {
            return this.memUtil;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setPpid(Integer ppid) {
            this.ppid = ppid;
            return this;
        }
        public Integer getPpid() {
            return this.ppid;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses setTimeOfCreation(Long timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            return this;
        }
        public Long getTimeOfCreation() {
            return this.timeOfCreation;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("image")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage> image;

        @NameInMap("inbound")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound> inbound;

        @NameInMap("label")
        public String label;

        @NameInMap("labelMinor")
        public String labelMinor;

        @NameInMap("labels")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels> labels;

        @NameInMap("meta")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta> meta;

        @NameInMap("metrics")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics> metrics;

        @NameInMap("outbound")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound> outbound;

        @NameInMap("parents")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents> parents;

        @NameInMap("processes")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses> processes;

        @NameInMap("tierId")
        public Integer tierId;

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setImage(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsImage> getImage() {
            return this.image;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setInbound(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound> inbound) {
            this.inbound = inbound;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsInbound> getInbound() {
            return this.inbound;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setLabelMinor(String labelMinor) {
            this.labelMinor = labelMinor;
            return this;
        }
        public String getLabelMinor() {
            return this.labelMinor;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setLabels(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsLabels> getLabels() {
            return this.labels;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setMeta(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMeta> getMeta() {
            return this.meta;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setMetrics(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsMetrics> getMetrics() {
            return this.metrics;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setOutbound(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound> outbound) {
            this.outbound = outbound;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsOutbound> getOutbound() {
            return this.outbound;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setParents(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsParents> getParents() {
            return this.parents;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setProcesses(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeploymentsProcesses> getProcesses() {
            return this.processes;
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments setTierId(Integer tierId) {
            this.tierId = tierId;
            return this;
        }
        public Integer getTierId() {
            return this.tierId;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment extends TeaModel {
        @NameInMap("deployments")
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments> deployments;

        public static QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment self = new QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment setDeployments(java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments> deployments) {
            this.deployments = deployments;
            return this;
        }
        public java.util.List<QueryTopologyKubDeploymentOverviewResponseBodyDataDeploymentDeployments> getDeployments() {
            return this.deployments;
        }

    }

    public static class QueryTopologyKubDeploymentOverviewResponseBodyData extends TeaModel {
        @NameInMap("deployment")
        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment deployment;

        public static QueryTopologyKubDeploymentOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyKubDeploymentOverviewResponseBodyData self = new QueryTopologyKubDeploymentOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyKubDeploymentOverviewResponseBodyData setDeployment(QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment deployment) {
            this.deployment = deployment;
            return this;
        }
        public QueryTopologyKubDeploymentOverviewResponseBodyDataDeployment getDeployment() {
            return this.deployment;
        }

    }

}
