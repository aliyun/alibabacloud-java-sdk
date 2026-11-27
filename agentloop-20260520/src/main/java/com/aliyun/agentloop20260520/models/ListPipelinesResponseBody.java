// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page that is specified in the request. This value is echoed in the response.</p>
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
     * <p>The request ID, which is used to locate the request when you troubleshoot issues.</p>
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
         * <p>The historical start time for bootstrap. The value is a UNIX timestamp in seconds, which has the same precision as runOnce/scheduled.fromTime. Millisecond values greater than or equal to 1e12 are automatically converted. The cursor starts from this time aligned to the grid and catches up window by window. After catching up, it switches to minute intervals. By default, it starts from the current time and processes only incremental data.</p>
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
         * <p>The start time of the time slice. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The end time of the time slice. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The start time of the scheduling. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The continuous execution configuration. This configuration is used when type is set to trace. The processing frequency is a fixed value managed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fromTime&quot;:1735660800}</p>
         */
        @NameInMap("continuous")
        public ListPipelinesResponseBodyPipelinesExecutePolicyContinuous continuous;

        /**
         * <p>The scheduling mode. Valid values: RunOnce (single execution), Scheduled (periodic execution), and Continuous (continuous execution, applicable only to trace data sources; the processing frequency is a fixed value managed by the server, and automatic processing occurs at the minute level after trace completion).</p>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The parameters for single execution. This field has a value only when mode is set to RunOnce.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}</p>
         */
        @NameInMap("runOnce")
        public ListPipelinesResponseBodyPipelinesExecutePolicyRunOnce runOnce;

        /**
         * <p>The parameters for periodic scheduling. This field has a value only when mode is set to Scheduled.</p>
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

    public static class ListPipelinesResponseBodyPipelinesPipelineNodes extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>stage_1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The node parameters. This is a key-value structure that varies based on the node type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;stageId&quot;:&quot;stage_1&quot;}</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>annotation-stage</p>
         */
        @NameInMap("type")
        public String type;

        public static ListPipelinesResponseBodyPipelinesPipelineNodes build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesPipelineNodes self = new ListPipelinesResponseBodyPipelinesPipelineNodes();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesPipelineNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPipelinesResponseBodyPipelinesPipelineNodes setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ListPipelinesResponseBodyPipelinesPipelineNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPipelinesResponseBodyPipelinesPipeline extends TeaModel {
        /**
         * <p>The list of orchestration nodes.</p>
         */
        @NameInMap("nodes")
        public java.util.List<ListPipelinesResponseBodyPipelinesPipelineNodes> nodes;

        public static ListPipelinesResponseBodyPipelinesPipeline build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelinesPipeline self = new ListPipelinesResponseBodyPipelinesPipeline();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelinesPipeline setNodes(java.util.List<ListPipelinesResponseBodyPipelinesPipelineNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListPipelinesResponseBodyPipelinesPipelineNodes> getNodes() {
            return this.nodes;
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
         * <p>The default sink type. Only dataset is supported.</p>
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
         * <p>The destination dataset for the route.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkConditionRoutesSinkDataset dataset;

        /**
         * <p>The sink type for the route. Only dataset is supported.</p>
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
         * <li>| where intent = &quot;refund&quot;</li>
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
         * <p>The sink for the route.</p>
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
         * <p>The default sink used when no conditional route is matched.</p>
         */
        @NameInMap("defaultSink")
        public ListPipelinesResponseBodyPipelinesSinkConditionDefaultSink defaultSink;

        /**
         * <p>The route matching mode. Only all is supported.</p>
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
         * <p>The conditional routing configuration. This parameter is used only when the sink type is condition.</p>
         */
        @NameInMap("condition")
        public ListPipelinesResponseBodyPipelinesSinkCondition condition;

        /**
         * <p>The destination dataset configuration for the dataset sink. This parameter is used only when the sink type is dataset.</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSinkDataset dataset;

        /**
         * <p>The sink type. Valid values: dataset and condition.</p>
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
         * <p>The filter conditions for the dataset data.</p>
         * 
         * <strong>example:</strong>
         * <p>status = &quot;pending&quot;</p>
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
         * <p>The data type of the field. Valid values: text, long, double, and json.</p>
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
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The filtered query statement (Simple Log Service query and analysis syntax).</p>
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
         * <p>The list of enrichment columns. This parameter is retained for compatibility. The current implementation outputs a single fixed column named agent_trajectory, and this parameter no longer affects the output.</p>
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
         * <p>The trajectory enrichment configuration. It mounts trajectory data into the scrubbing results based on the trace_id. When writing to a dataset, the data is stored in a fixed column named agent_trajectory, and the column value contains the trajectory JSON content.</p>
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
         * <p>The dataset datasource config under the current AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataset&quot;:&quot;my-dataset&quot;,&quot;filter&quot;:&quot;status = &quot;pending&quot;&quot;}</p>
         */
        @NameInMap("dataset")
        public ListPipelinesResponseBodyPipelinesSourceDataset dataset;

        /**
         * <p>The input fields and their data types. This applies to all data source types.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]</p>
         */
        @NameInMap("inputFields")
        public java.util.List<ListPipelinesResponseBodyPipelinesSourceInputFields> inputFields;

        /**
         * <p>The Simple Log Service Logstore datasource config.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;}</p>
         */
        @NameInMap("logstore")
        public ListPipelinesResponseBodyPipelinesSourceLogstore logstore;

        /**
         * <p>The trajectory data configuration. This configuration is optional and takes effect only when type is set to trace. It obtains ATIF standard trajectory data from the trajectory scrubbing service and extends it based on features.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enrich&quot;:{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}}</p>
         */
        @NameInMap("trajectory")
        public ListPipelinesResponseBodyPipelinesSourceTrajectory trajectory;

        /**
         * <p>The type of the data source. Valid values: logstore, dataset, and trace. The trace type indicates a processing mode driven by trajectory signals. The validity of the enumerated values is verified by the server.</p>
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
         * <p>The timestamp of the committed watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>1767225600</p>
         */
        @NameInMap("committedWatermark")
        public Long committedWatermark;

        /**
         * <p>The time when the pipeline was created. The time is in the ISO 8601 standard in UTC.</p>
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
         * <p>The ID of the last run.</p>
         * 
         * <strong>example:</strong>
         * <p>run-20260101-0001</p>
         */
        @NameInMap("lastRunId")
        public String lastRunId;

        /**
         * <p>The status of the last run.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("lastRunStatus")
        public String lastRunStatus;

        /**
         * <p>The timestamp for the next scheduled trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>1767229200</p>
         */
        @NameInMap("nextTriggerTime")
        public Long nextTriggerTime;

        /**
         * <p>The reason why scheduling is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("pausedReason")
        public String pausedReason;

        /**
         * <p>The pipeline orchestration configuration.</p>
         */
        @NameInMap("pipeline")
        public ListPipelinesResponseBodyPipelinesPipeline pipeline;

        /**
         * <p>The pipeline type.</p>
         * 
         * <strong>example:</strong>
         * <p>ORCHESTRATION</p>
         */
        @NameInMap("pipelineKind")
        public String pipelineKind;

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
         * <p>The schedule status. Valid values: None (no scheduling, for RunOnce pipelines), Active, Paused, and Terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("scheduleStatus")
        public String scheduleStatus;

        /**
         * <p>The schedule type. Valid values: RunOnce (single execution), Scheduled (periodic scheduling), and Continuous (continuous execution, driven by trace source signals).</p>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        /**
         * <p>The pipeline sink, which is the destination for writing data.</p>
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
         * <p>The time when the pipeline was last updated. The time is in the ISO 8601 standard in UTC.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The version number of the pipeline configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

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

        public ListPipelinesResponseBodyPipelines setCommittedWatermark(Long committedWatermark) {
            this.committedWatermark = committedWatermark;
            return this;
        }
        public Long getCommittedWatermark() {
            return this.committedWatermark;
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

        public ListPipelinesResponseBodyPipelines setLastRunId(String lastRunId) {
            this.lastRunId = lastRunId;
            return this;
        }
        public String getLastRunId() {
            return this.lastRunId;
        }

        public ListPipelinesResponseBodyPipelines setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public ListPipelinesResponseBodyPipelines setNextTriggerTime(Long nextTriggerTime) {
            this.nextTriggerTime = nextTriggerTime;
            return this;
        }
        public Long getNextTriggerTime() {
            return this.nextTriggerTime;
        }

        public ListPipelinesResponseBodyPipelines setPausedReason(String pausedReason) {
            this.pausedReason = pausedReason;
            return this;
        }
        public String getPausedReason() {
            return this.pausedReason;
        }

        public ListPipelinesResponseBodyPipelines setPipeline(ListPipelinesResponseBodyPipelinesPipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public ListPipelinesResponseBodyPipelinesPipeline getPipeline() {
            return this.pipeline;
        }

        public ListPipelinesResponseBodyPipelines setPipelineKind(String pipelineKind) {
            this.pipelineKind = pipelineKind;
            return this;
        }
        public String getPipelineKind() {
            return this.pipelineKind;
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

        public ListPipelinesResponseBodyPipelines setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
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
