// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pipelines")
    public java.util.List<ListPipelinesResponseBodyPipelines> pipelines;

    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponseBody self = new ListPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPipelinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelinesResponseBody setPipelines(java.util.List<ListPipelinesResponseBodyPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
    public java.util.List<ListPipelinesResponseBodyPipelines> getPipelines() {
        return this.pipelines;
    }

    public ListPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <strong>example:</strong>
         * <p>1735747200000</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce self = new ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesExecutePolicyScheduled extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <strong>example:</strong>
         * <p>1h</p>
         */
        @NameInMap("interval")
        public String interval;

        public static ListPipelinesResponseBodyPipelinesExecutePolicyScheduled build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesExecutePolicyScheduled self = new ListPipelinesResponseBodyPipelinesExecutePolicyScheduled();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicyScheduled setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicyScheduled setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesExecutePolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        @NameInMap("runOnce")
        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce runOnce;

        @NameInMap("scheduled")
        public ListPipelinesResponseBodyPipelinesExecutePolicyScheduled scheduled;

        public static ListPipelinesResponseBodyPipelinesExecutePolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesExecutePolicy self = new ListPipelinesResponseBodyPipelinesExecutePolicy();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicy setRunOnce(ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce runOnce) {
            this.runOnce = runOnce;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce getRunOnce() {
            return this.runOnce;
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicy setScheduled(ListPipelinesResponseBodyPipelinesExecutePolicyScheduled scheduled) {
            this.scheduled = scheduled;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesExecutePolicyScheduled getScheduled() {
            return this.scheduled;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>other-result</p>
         */
        @NameInMap("dataset")
        public String dataset;

        public static ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset self = new ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink extends TeaModel {
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset dataset;

        /**
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink self = new ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink setDataset(ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset getDataset() {
            return this.dataset;
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>refund-result</p>
         */
        @NameInMap("dataset")
        public String dataset;

        public static ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset self = new ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink extends TeaModel {
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset dataset;

        /**
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink self = new ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink setDataset(ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset getDataset() {
            return this.dataset;
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkConditionRoutes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li>| where intent = \&quot;refund\&quot;</li>
         * </ul>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>refund</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("sink")
        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink sink;

        public static ListPipelinesResponseBodyPipelinesSinkConditionRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkConditionRoutes self = new ListPipelinesResponseBodyPipelinesSinkConditionRoutes();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutes setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPipelinesResponseBodyPipelinesSinkConditionRoutes setSink(ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink sink) {
            this.sink = sink;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSink getSink() {
            return this.sink;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkCondition extends TeaModel {
        @NameInMap("defaultSink")
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink defaultSink;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("matchMode")
        public String matchMode;

        @NameInMap("routes")
        public java.util.List<ListPipelinesResponseBodyPipelinesSinkConditionRoutes> routes;

        public static ListPipelinesResponseBodyPipelinesSinkCondition build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkCondition self = new ListPipelinesResponseBodyPipelinesSinkCondition();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkCondition setDefaultSink(ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink defaultSink) {
            this.defaultSink = defaultSink;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink getDefaultSink() {
            return this.defaultSink;
        }

        public ListPipelinesResponseBodyPipelinesSinkCondition setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListPipelinesResponseBodyPipelinesSinkCondition setRoutes(java.util.List<ListPipelinesResponseBodyPipelinesSinkConditionRoutes> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<ListPipelinesResponseBodyPipelinesSinkConditionRoutes> getRoutes() {
            return this.routes;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSinkDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <strong>example:</strong>
         * <p>my-dataset</p>
         */
        @NameInMap("dataset")
        public String dataset;

        public static ListPipelinesResponseBodyPipelinesSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSinkDataset self = new ListPipelinesResponseBodyPipelinesSinkDataset();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSinkDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public ListPipelinesResponseBodyPipelinesSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSink extends TeaModel {
        @NameInMap("condition")
        public ListPipelinesResponseBodyPipelinesSinkCondition condition;

        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkDataset dataset;

        /**
         * <strong>example:</strong>
         * <p>condition</p>
         */
        @NameInMap("type")
        public String type;

        public static ListPipelinesResponseBodyPipelinesSink build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSink self = new ListPipelinesResponseBodyPipelinesSink();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSink setCondition(ListPipelinesResponseBodyPipelinesSinkCondition condition) {
            this.condition = condition;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSinkCondition getCondition() {
            return this.condition;
        }

        public ListPipelinesResponseBodyPipelinesSink setDataset(ListPipelinesResponseBodyPipelinesSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSinkDataset getDataset() {
            return this.dataset;
        }

        public ListPipelinesResponseBodyPipelinesSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSourceDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-dataset</p>
         */
        @NameInMap("dataset")
        public String dataset;

        /**
         * <strong>example:</strong>
         * <p>status = \&quot;pending\&quot;</p>
         */
        @NameInMap("filter")
        public String filter;

        public static ListPipelinesResponseBodyPipelinesSourceDataset build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSourceDataset self = new ListPipelinesResponseBodyPipelinesSourceDataset();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSourceDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public ListPipelinesResponseBodyPipelinesSourceDataset setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSourceLogstore extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-sls-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>my-sls-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li>| SELECT *</li>
         * </ul>
         */
        @NameInMap("query")
        public String query;

        public static ListPipelinesResponseBodyPipelinesSourceLogstore build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSourceLogstore self = new ListPipelinesResponseBodyPipelinesSourceLogstore();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSourceLogstore setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListPipelinesResponseBodyPipelinesSourceLogstore setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListPipelinesResponseBodyPipelinesSourceLogstore setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSource extends TeaModel {
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSourceDataset dataset;

        @NameInMap("logstore")
        public ListPipelinesResponseBodyPipelinesSourceLogstore logstore;

        /**
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static ListPipelinesResponseBodyPipelinesSource build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSource self = new ListPipelinesResponseBodyPipelinesSource();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSource setDataset(ListPipelinesResponseBodyPipelinesSourceDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSourceDataset getDataset() {
            return this.dataset;
        }

        public ListPipelinesResponseBodyPipelinesSource setLogstore(ListPipelinesResponseBodyPipelinesSourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSourceLogstore getLogstore() {
            return this.logstore;
        }

        public ListPipelinesResponseBodyPipelinesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPipelinesResponseBodyPipelines extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>我的流水线</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("executePolicy")
        public ListPipelinesResponseBodyPipelinesExecutePolicy executePolicy;

        /**
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        @NameInMap("pipelineName")
        public String pipelineName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("scheduleStatus")
        public String scheduleStatus;

        /**
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        @NameInMap("sink")
        public ListPipelinesResponseBodyPipelinesSink sink;

        @NameInMap("source")
        public ListPipelinesResponseBodyPipelinesSource source;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>my-workspace</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListPipelinesResponseBodyPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelines self = new ListPipelinesResponseBodyPipelines();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPipelinesResponseBodyPipelines setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPipelinesResponseBodyPipelines setExecutePolicy(ListPipelinesResponseBodyPipelinesExecutePolicy executePolicy) {
            this.executePolicy = executePolicy;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesExecutePolicy getExecutePolicy() {
            return this.executePolicy;
        }

        public ListPipelinesResponseBodyPipelines setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public ListPipelinesResponseBodyPipelines setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPipelinesResponseBodyPipelines setScheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }
        public String getScheduleStatus() {
            return this.scheduleStatus;
        }

        public ListPipelinesResponseBodyPipelines setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListPipelinesResponseBodyPipelines setSink(ListPipelinesResponseBodyPipelinesSink sink) {
            this.sink = sink;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSink getSink() {
            return this.sink;
        }

        public ListPipelinesResponseBodyPipelines setSource(ListPipelinesResponseBodyPipelinesSource source) {
            this.source = source;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSource getSource() {
            return this.source;
        }

        public ListPipelinesResponseBodyPipelines setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListPipelinesResponseBodyPipelines setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
