// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page that was specified in the request. This value is echoed back.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. An empty string indicates that the current page is the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of pipelines.</p>
     */
    @NameInMap("pipelines")
    public java.util.List<ListPipelinesResponseBodyPipelines> pipelines;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of pipelines that match the filter conditions.</p>
     * 
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
         * <p>The start of the time slice, in UNIX millisecond timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The end of the time slice, in UNIX millisecond timestamp format.</p>
         * 
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
         * <p>The scheduling start time, in UNIX millisecond timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The scheduling interval, such as 1h or 30m.</p>
         * 
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
         * <p>The scheduling mode. Valid values:</p>
         * <ul>
         * <li>RunOnce: one-time execution.</li>
         * <li>Scheduled: periodic scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The parameters for one-time execution. This parameter has a value only when mode is set to RunOnce.</p>
         */
        @NameInMap("runOnce")
        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce runOnce;

        /**
         * <p>The parameters for periodic scheduling. This parameter has a value only when mode is set to Scheduled.</p>
         */
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
         * <p>The name of the AgentSpace to which the default destination dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The name of the default destination dataset.</p>
         * 
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
        /**
         * <p>The default destination dataset.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSinkDataset dataset;

        /**
         * <p>The type of the default destination. Currently, only dataset is supported.</p>
         * 
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
         * <p>The name of the AgentSpace to which the destination dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The name of the destination dataset.</p>
         * 
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
        /**
         * <p>The destination dataset of the route.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset dataset;

        /**
         * <p>The type of the route destination. Currently, only dataset is supported.</p>
         * 
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
         * <p>The route expression in SPL. Only where, project, and extend are supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| where intent = \&quot;refund\&quot;</li>
         * </ul>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>refund</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The write destination of the route.</p>
         */
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
        /**
         * <p>The default write destination that is used when no condition route is matched.</p>
         */
        @NameInMap("defaultSink")
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink defaultSink;

        /**
         * <p>The route matching mode. Currently, only all is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("matchMode")
        public String matchMode;

        /**
         * <p>The list of condition routes.</p>
         */
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
         * <p>The name of the AgentSpace to which the destination dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>The name of the destination dataset.</p>
         * 
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
        /**
         * <p>The conditional routing configuration. This parameter is used only when sink.type is set to condition.</p>
         */
        @NameInMap("condition")
        public ListPipelinesResponseBodyPipelinesSinkCondition condition;

        /**
         * <p>The destination dataset configuration for the dataset sink. This parameter is used only when sink.type is set to dataset.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkDataset dataset;

        /**
         * <p>The destination type. Valid values: dataset or condition.</p>
         * 
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
         * <p>The name of the source dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>my-dataset</p>
         */
        @NameInMap("dataset")
        public String dataset;

        /**
         * <p>The data filter condition for the dataset.</p>
         * 
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
         * <p>The name of the SLS Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The data filtered query statement in SLS query/analysis syntax.</p>
         * 
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
        /**
         * <p>The dataset datasource config in the current AgentSpace.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSourceDataset dataset;

        /**
         * <p>The Simple Log Service (SLS) Logstore datasource config.</p>
         */
        @NameInMap("logstore")
        public ListPipelinesResponseBodyPipelinesSourceLogstore logstore;

        /**
         * <p>The data source type. Valid values: logstore or dataset.</p>
         * 
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
         * <p>The time when the pipeline was created, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>My pipeline</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The execution policy.</p>
         */
        @NameInMap("executePolicy")
        public ListPipelinesResponseBodyPipelinesExecutePolicy executePolicy;

        /**
         * <p>The name of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        @NameInMap("pipelineName")
        public String pipelineName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The scheduling status. Valid values:</p>
         * <ul>
         * <li>None: no scheduling. This value is returned for RunOnce pipelines.</li>
         * <li>Active: active.</li>
         * <li>Paused: paused.</li>
         * <li>Terminated: terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("scheduleStatus")
        public String scheduleStatus;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>RunOnce: one-time execution.</li>
         * <li>Scheduled: periodic scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        /**
         * <p>The pipeline sink (data write destination).</p>
         */
        @NameInMap("sink")
        public ListPipelinesResponseBodyPipelinesSink sink;

        /**
         * <p>The pipeline data source.</p>
         */
        @NameInMap("source")
        public ListPipelinesResponseBodyPipelinesSource source;

        /**
         * <p>The time when the pipeline was last updated, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The workspace associated with the pipeline.</p>
         * 
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
