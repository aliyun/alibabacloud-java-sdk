// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page specified in the request.</p>
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
     * <p>The request ID, which is used to locate the request during troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of pipelines that meet the filter conditions.</p>
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

    public static class ListPipelinesResponseBodyPipelinesExecutePolicyContinuous extends TeaModel {
        /**
         * <p>The bootstrap history start time as a UNIX timestamp in seconds. It has the same precision as runOnce or scheduled fromTime. Millisecond values greater than or equal to 1e12 are automatically converted. The cursor starts from the grid-aligned time and catches up window by window. After catching up, it switches to minute intervals. By default, it starts from the current time and only processes incremental data.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        public static ListPipelinesResponseBodyPipelinesExecutePolicyContinuous build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesExecutePolicyContinuous self = new ListPipelinesResponseBodyPipelinesExecutePolicyContinuous();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicyContinuous setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce extends TeaModel {
        /**
         * <p>The start time of the time slice as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The end time of the time slice as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735747200</p>
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
         * <p>The scheduling start time as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The scheduling interval. Valid values: 1h, 6h, 12h, and 1d.</p>
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
         * <p>The continuous execution configuration. This is used when the type is trace. The processing frequency is a fixed value managed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fromTime&quot;:1735660800}</p>
         */
        @NameInMap("continuous")
        public ListPipelinesResponseBodyPipelinesExecutePolicyContinuous continuous;

        /**
         * <p>The scheduling mode. Valid values: RunOnce for single execution, Scheduled for periodic execution, and Continuous for continuous execution. Continuous mode is only for trace data sources. The processing frequency is a fixed value managed by the server, and data is automatically processed at minute intervals after the trace is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The parameters for single execution. This field has a value only when the mode is RunOnce.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}</p>
         */
        @NameInMap("runOnce")
        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce runOnce;

        /**
         * <p>The parameters for periodic scheduling. This field has a value only when the mode is Scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;interval&quot;:&quot;1h&quot;,&quot;fromTime&quot;:1735660800}</p>
         */
        @NameInMap("scheduled")
        public ListPipelinesResponseBodyPipelinesExecutePolicyScheduled scheduled;

        public static ListPipelinesResponseBodyPipelinesExecutePolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesExecutePolicy self = new ListPipelinesResponseBodyPipelinesExecutePolicy();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesExecutePolicy setContinuous(ListPipelinesResponseBodyPipelinesExecutePolicyContinuous continuous) {
            this.continuous = continuous;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesExecutePolicyContinuous getContinuous() {
            return this.continuous;
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
         * <p>The default destination type. Currently, only dataset is supported.</p>
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
         * <p>The destination type of the route. Currently, only dataset is supported.</p>
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
         * <p>The route expression in Search Processing Language (SPL). Only where, project, and extend are supported.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| where intent = \&quot;refund\&quot;</li>
         * </ul>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The ID of the route.</p>
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
         * <p>The default write destination used when no conditional route is matched.</p>
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
         * <p>The list of conditional routes.</p>
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
         * <p>The conditional routing configuration. This is used only when the sink type is condition.</p>
         */
        @NameInMap("condition")
        public ListPipelinesResponseBodyPipelinesSinkCondition condition;

        /**
         * <p>The destination dataset configuration for the dataset sink. This is used only when the sink type is dataset.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkDataset dataset;

        /**
         * <p>The destination type. Valid values: dataset, condition.</p>
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

    public static class ListPipelinesResponseBodyPipelinesSourceInputFields extends TeaModel {
        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>question</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the field. Valid values: text, long, double, and json.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static ListPipelinesResponseBodyPipelinesSourceInputFields build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSourceInputFields self = new ListPipelinesResponseBodyPipelinesSourceInputFields();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSourceInputFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelinesResponseBodyPipelinesSourceInputFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
         * <p>The data filtered query statement, which uses the SLS query and analysis syntax.</p>
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

    public static class ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich extends TeaModel {
        /**
         * <p>The list of enrichment columns. This parameter is retained for compatibility. The current implementation outputs only the fixed column agent_trajectory, and this parameter no longer affects the output.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;input&quot;,&quot;output&quot;,&quot;session_id&quot;]</p>
         */
        @NameInMap("columns")
        public java.util.List<String> columns;

        /**
         * <p>Specifies whether to enable trajectory enrichment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich self = new ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSourceTrajectory extends TeaModel {
        /**
         * <p>The trajectory enrichment configuration. It mounts trajectory data into the scrubbing result based on the trace_id. When writing to the dataset, the data is stored in the fixed column agent_trajectory, and the column value is the trajectory JSON content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}</p>
         */
        @NameInMap("enrich")
        public ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich enrich;

        public static ListPipelinesResponseBodyPipelinesSourceTrajectory build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesSourceTrajectory self = new ListPipelinesResponseBodyPipelinesSourceTrajectory();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesSourceTrajectory setEnrich(ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich enrich) {
            this.enrich = enrich;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSourceTrajectoryEnrich getEnrich() {
            return this.enrich;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesSource extends TeaModel {
        /**
         * <p>The dataset datasource config in the current AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataset&quot;:&quot;my-dataset&quot;,&quot;filter&quot;:&quot;status = \&quot;pending\&quot;&quot;}</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSourceDataset dataset;

        /**
         * <p>The input fields and their types, applicable to all data source types.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]</p>
         */
        @NameInMap("inputFields")
        public java.util.List<ListPipelinesResponseBodyPipelinesSourceInputFields> inputFields;

        /**
         * <p>The Simple Log Service (SLS) Logstore datasource config.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;}</p>
         */
        @NameInMap("logstore")
        public ListPipelinesResponseBodyPipelinesSourceLogstore logstore;

        /**
         * <p>The trajectory data configuration. This parameter is optional and takes effect only when the type is trace. It obtains ATIF standard trajectory data from the trajectory scrubbing service and extends it by feature.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enrich&quot;:{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}}</p>
         */
        @NameInMap("trajectory")
        public ListPipelinesResponseBodyPipelinesSourceTrajectory trajectory;

        /**
         * <p>The data source type. Valid values: logstore, dataset, and trace. The trace value indicates a trajectory signal-driven processing mode. The validity of the enumerated values is verified by the server.</p>
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

        public ListPipelinesResponseBodyPipelinesSource setInputFields(java.util.List<ListPipelinesResponseBodyPipelinesSourceInputFields> inputFields) {
            this.inputFields = inputFields;
            return this;
        }
        public java.util.List<ListPipelinesResponseBodyPipelinesSourceInputFields> getInputFields() {
            return this.inputFields;
        }

        public ListPipelinesResponseBodyPipelinesSource setLogstore(ListPipelinesResponseBodyPipelinesSourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSourceLogstore getLogstore() {
            return this.logstore;
        }

        public ListPipelinesResponseBodyPipelinesSource setTrajectory(ListPipelinesResponseBodyPipelinesSourceTrajectory trajectory) {
            this.trajectory = trajectory;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesSourceTrajectory getTrajectory() {
            return this.trajectory;
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
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:&quot;RunOnce&quot;,&quot;runOnce&quot;:{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}}</p>
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
         * <p>The scheduling status. Valid values: None for no scheduling in RunOnce pipelines, Active, Paused, and Terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("scheduleStatus")
        public String scheduleStatus;

        /**
         * <p>The scheduling type. Valid values: RunOnce for single execution, Scheduled for periodic scheduling, and Continuous for continuous execution driven by trace source signals.</p>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        /**
         * <p>The pipeline sink, which is the destination for data writing.</p>
         */
        @NameInMap("sink")
        public ListPipelinesResponseBodyPipelinesSink sink;

        /**
         * <p>The data source of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;logstore&quot;,&quot;logstore&quot;:{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;},&quot;inputFields&quot;:[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]}</p>
         */
        @NameInMap("source")
        public ListPipelinesResponseBodyPipelinesSource source;

        /**
         * <p>The time when the pipeline was last updated. The time is in the ISO 8601 UTC format.</p>
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
