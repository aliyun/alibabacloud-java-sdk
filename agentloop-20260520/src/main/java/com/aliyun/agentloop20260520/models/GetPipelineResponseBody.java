// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetPipelineResponseBody extends TeaModel {
    /**
     * <p>The committed watermark in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("committedWatermark")
    public Long committedWatermark;

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
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>My pipeline</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The scheduling method.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mode&quot;:&quot;RunOnce&quot;,&quot;runOnce&quot;:{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}}</p>
     */
    @NameInMap("executePolicy")
    public GetPipelineResponseBodyExecutePolicy executePolicy;

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
     * <p>The next schedule trigger time in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735661100</p>
     */
    @NameInMap("nextTriggerTime")
    public Long nextTriggerTime;

    /**
     * <p>The pipeline configuration, which defines the node orchestration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nodes&quot;:[{&quot;id&quot;:&quot;select-fields&quot;,&quot;type&quot;:&quot;project&quot;,&quot;parameters&quot;:{&quot;question&quot;:&quot;user_query&quot;}}]}</p>
     */
    @NameInMap("pipeline")
    public GetPipelineResponseBodyPipeline pipeline;

    /**
     * <p>The pipeline type.</p>
     * 
     * <strong>example:</strong>
     * <p>ORCHESTRATION</p>
     */
    @NameInMap("pipelineKind")
    public String pipelineKind;

    /**
     * <p>The pipeline name.</p>
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
     * <p>The request ID, which is used to locate the request when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The schedule status. Valid values: None (no schedule), Active (active), Paused (paused), and Terminated (terminated).</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
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
     * <p>The pipeline sink, which specifies the data write destination.</p>
     */
    @NameInMap("sink")
    public GetPipelineResponseBodySink sink;

    /**
     * <p>The pipeline data source.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;logstore&quot;,&quot;logstore&quot;:{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;},&quot;inputFields&quot;:[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]}</p>
     */
    @NameInMap("source")
    public GetPipelineResponseBodySource source;

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
     * <p>The pipeline configuration version number.</p>
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

    public static GetPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineResponseBody self = new GetPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineResponseBody setCommittedWatermark(Long committedWatermark) {
        this.committedWatermark = committedWatermark;
        return this;
    }
    public Long getCommittedWatermark() {
        return this.committedWatermark;
    }

    public GetPipelineResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetPipelineResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetPipelineResponseBody setExecutePolicy(GetPipelineResponseBodyExecutePolicy executePolicy) {
        this.executePolicy = executePolicy;
        return this;
    }
    public GetPipelineResponseBodyExecutePolicy getExecutePolicy() {
        return this.executePolicy;
    }

    public GetPipelineResponseBody setLastRunId(String lastRunId) {
        this.lastRunId = lastRunId;
        return this;
    }
    public String getLastRunId() {
        return this.lastRunId;
    }

    public GetPipelineResponseBody setLastRunStatus(String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
        return this;
    }
    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    public GetPipelineResponseBody setNextTriggerTime(Long nextTriggerTime) {
        this.nextTriggerTime = nextTriggerTime;
        return this;
    }
    public Long getNextTriggerTime() {
        return this.nextTriggerTime;
    }

    public GetPipelineResponseBody setPipeline(GetPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetPipelineResponseBody setPipelineKind(String pipelineKind) {
        this.pipelineKind = pipelineKind;
        return this;
    }
    public String getPipelineKind() {
        return this.pipelineKind;
    }

    public GetPipelineResponseBody setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public GetPipelineResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineResponseBody setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    public GetPipelineResponseBody setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public GetPipelineResponseBody setSink(GetPipelineResponseBodySink sink) {
        this.sink = sink;
        return this;
    }
    public GetPipelineResponseBodySink getSink() {
        return this.sink;
    }

    public GetPipelineResponseBody setSource(GetPipelineResponseBodySource source) {
        this.source = source;
        return this;
    }
    public GetPipelineResponseBodySource getSource() {
        return this.source;
    }

    public GetPipelineResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetPipelineResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public GetPipelineResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetPipelineResponseBodyExecutePolicyContinuous extends TeaModel {
        /**
         * <p>The bootstrap history start time as a UNIX timestamp in seconds. It shares the same precision as runOnce/scheduled.fromTime. Millisecond values greater than or equal to 1e12 are automatically converted. The cursor starts from this time aligned to the grid and catches up window by window. After catching up, it switches to minute intervals. By default, it starts from the current time and processes only incremental data.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        public static GetPipelineResponseBodyExecutePolicyContinuous build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyExecutePolicyContinuous self = new GetPipelineResponseBodyExecutePolicyContinuous();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyExecutePolicyContinuous setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

    }

    public static class GetPipelineResponseBodyExecutePolicyRunOnce extends TeaModel {
        /**
         * <p>The start time of the data processing window in UNIX seconds. The value must be less than toTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <p>The end time of the data processing window in UNIX seconds. The value must be greater than fromTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1735747200</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static GetPipelineResponseBodyExecutePolicyRunOnce build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyExecutePolicyRunOnce self = new GetPipelineResponseBodyExecutePolicyRunOnce();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyExecutePolicyRunOnce setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public GetPipelineResponseBodyExecutePolicyRunOnce setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

    public static class GetPipelineResponseBodyExecutePolicyScheduled extends TeaModel {
        /**
         * <p>The scheduling start time as a UNIX timestamp in seconds. It shares the same precision as runOnce.fromTime. Millisecond values greater than or equal to 1e12 are automatically converted.</p>
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

        public static GetPipelineResponseBodyExecutePolicyScheduled build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyExecutePolicyScheduled self = new GetPipelineResponseBodyExecutePolicyScheduled();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyExecutePolicyScheduled setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public GetPipelineResponseBodyExecutePolicyScheduled setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class GetPipelineResponseBodyExecutePolicy extends TeaModel {
        /**
         * <p>The continuous execution configuration. This is used when type is set to trace. The processing frequency is a fixed value managed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fromTime&quot;:1735660800}</p>
         */
        @NameInMap("continuous")
        public GetPipelineResponseBodyExecutePolicyContinuous continuous;

        /**
         * <p>The scheduling mode. Valid values: RunOnce (single execution), Scheduled (periodic execution), and Continuous (continuous execution, applicable only to trace data sources; the processing frequency is a fixed value managed by the server, and processing automatically occurs at minute intervals after trace completion).</p>
         * 
         * <strong>example:</strong>
         * <p>scheduled</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The single execution configuration. This parameter is required only when mode is set to RunOnce.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fromTime&quot;:1735660800,&quot;toTime&quot;:1735664400}</p>
         */
        @NameInMap("runOnce")
        public GetPipelineResponseBodyExecutePolicyRunOnce runOnce;

        /**
         * <p>The periodic scheduling configuration. This parameter is required only when mode is set to Scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;interval&quot;:&quot;1h&quot;,&quot;fromTime&quot;:1735660800}</p>
         */
        @NameInMap("scheduled")
        public GetPipelineResponseBodyExecutePolicyScheduled scheduled;

        public static GetPipelineResponseBodyExecutePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyExecutePolicy self = new GetPipelineResponseBodyExecutePolicy();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyExecutePolicy setContinuous(GetPipelineResponseBodyExecutePolicyContinuous continuous) {
            this.continuous = continuous;
            return this;
        }
        public GetPipelineResponseBodyExecutePolicyContinuous getContinuous() {
            return this.continuous;
        }

        public GetPipelineResponseBodyExecutePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetPipelineResponseBodyExecutePolicy setRunOnce(GetPipelineResponseBodyExecutePolicyRunOnce runOnce) {
            this.runOnce = runOnce;
            return this;
        }
        public GetPipelineResponseBodyExecutePolicyRunOnce getRunOnce() {
            return this.runOnce;
        }

        public GetPipelineResponseBodyExecutePolicy setScheduled(GetPipelineResponseBodyExecutePolicyScheduled scheduled) {
            this.scheduled = scheduled;
            return this;
        }
        public GetPipelineResponseBodyExecutePolicyScheduled getScheduled() {
            return this.scheduled;
        }

    }

    public static class GetPipelineResponseBodyPipelineNodes extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>node-1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The node parameters. It uses a key-value structure and varies depending on the node type.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>transform</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodyPipelineNodes build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipelineNodes self = new GetPipelineResponseBodyPipelineNodes();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipelineNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPipelineResponseBodyPipelineNodes setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public GetPipelineResponseBodyPipelineNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineResponseBodyPipeline extends TeaModel {
        /**
         * <p>The list of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;select-fields&quot;,&quot;type&quot;:&quot;project&quot;,&quot;parameters&quot;:{}}]</p>
         */
        @NameInMap("nodes")
        public java.util.List<GetPipelineResponseBodyPipelineNodes> nodes;

        public static GetPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipeline self = new GetPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipeline setNodes(java.util.List<GetPipelineResponseBodyPipelineNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetPipelineResponseBodyPipelineNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class GetPipelineResponseBodySinkConditionDefaultSinkDataset extends TeaModel {
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

        public static GetPipelineResponseBodySinkConditionDefaultSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkConditionDefaultSinkDataset self = new GetPipelineResponseBodySinkConditionDefaultSinkDataset();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkConditionDefaultSinkDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetPipelineResponseBodySinkConditionDefaultSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

    }

    public static class GetPipelineResponseBodySinkConditionDefaultSink extends TeaModel {
        /**
         * <p>The default destination dataset.</p>
         */
        @NameInMap("dataset")
        public GetPipelineResponseBodySinkConditionDefaultSinkDataset dataset;

        /**
         * <p>The default destination type. Currently, only dataset is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySinkConditionDefaultSink build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkConditionDefaultSink self = new GetPipelineResponseBodySinkConditionDefaultSink();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkConditionDefaultSink setDataset(GetPipelineResponseBodySinkConditionDefaultSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetPipelineResponseBodySinkConditionDefaultSinkDataset getDataset() {
            return this.dataset;
        }

        public GetPipelineResponseBodySinkConditionDefaultSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineResponseBodySinkConditionRoutesSinkDataset extends TeaModel {
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

        public static GetPipelineResponseBodySinkConditionRoutesSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkConditionRoutesSinkDataset self = new GetPipelineResponseBodySinkConditionRoutesSinkDataset();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkConditionRoutesSinkDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetPipelineResponseBodySinkConditionRoutesSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

    }

    public static class GetPipelineResponseBodySinkConditionRoutesSink extends TeaModel {
        /**
         * <p>The route destination dataset.</p>
         */
        @NameInMap("dataset")
        public GetPipelineResponseBodySinkConditionRoutesSinkDataset dataset;

        /**
         * <p>The route destination type. Currently, only dataset is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySinkConditionRoutesSink build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkConditionRoutesSink self = new GetPipelineResponseBodySinkConditionRoutesSink();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkConditionRoutesSink setDataset(GetPipelineResponseBodySinkConditionRoutesSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetPipelineResponseBodySinkConditionRoutesSinkDataset getDataset() {
            return this.dataset;
        }

        public GetPipelineResponseBodySinkConditionRoutesSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineResponseBodySinkConditionRoutes extends TeaModel {
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
         * <p>The route write destination.</p>
         */
        @NameInMap("sink")
        public GetPipelineResponseBodySinkConditionRoutesSink sink;

        public static GetPipelineResponseBodySinkConditionRoutes build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkConditionRoutes self = new GetPipelineResponseBodySinkConditionRoutes();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkConditionRoutes setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetPipelineResponseBodySinkConditionRoutes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPipelineResponseBodySinkConditionRoutes setSink(GetPipelineResponseBodySinkConditionRoutesSink sink) {
            this.sink = sink;
            return this;
        }
        public GetPipelineResponseBodySinkConditionRoutesSink getSink() {
            return this.sink;
        }

    }

    public static class GetPipelineResponseBodySinkCondition extends TeaModel {
        /**
         * <p>The default write destination used when no conditional route is matched.</p>
         */
        @NameInMap("defaultSink")
        public GetPipelineResponseBodySinkConditionDefaultSink defaultSink;

        /**
         * <p>The route matching mode. Currently, only all is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("matchMode")
        public String matchMode;

        /**
         * <p>The conditional route list.</p>
         */
        @NameInMap("routes")
        public java.util.List<GetPipelineResponseBodySinkConditionRoutes> routes;

        public static GetPipelineResponseBodySinkCondition build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkCondition self = new GetPipelineResponseBodySinkCondition();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkCondition setDefaultSink(GetPipelineResponseBodySinkConditionDefaultSink defaultSink) {
            this.defaultSink = defaultSink;
            return this;
        }
        public GetPipelineResponseBodySinkConditionDefaultSink getDefaultSink() {
            return this.defaultSink;
        }

        public GetPipelineResponseBodySinkCondition setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public GetPipelineResponseBodySinkCondition setRoutes(java.util.List<GetPipelineResponseBodySinkConditionRoutes> routes) {
            this.routes = routes;
            return this;
        }
        public java.util.List<GetPipelineResponseBodySinkConditionRoutes> getRoutes() {
            return this.routes;
        }

    }

    public static class GetPipelineResponseBodySinkDataset extends TeaModel {
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

        public static GetPipelineResponseBodySinkDataset build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkDataset self = new GetPipelineResponseBodySinkDataset();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkDataset setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public GetPipelineResponseBodySinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

    }

    public static class GetPipelineResponseBodySink extends TeaModel {
        /**
         * <p>The conditional routing configuration. This parameter is used only when the sink type is condition.</p>
         */
        @NameInMap("condition")
        public GetPipelineResponseBodySinkCondition condition;

        /**
         * <p>The destination dataset configuration for the dataset sink. This parameter is used only when the sink type is dataset.</p>
         */
        @NameInMap("dataset")
        public GetPipelineResponseBodySinkDataset dataset;

        /**
         * <p>The sink type. Valid values: dataset and condition.</p>
         * 
         * <strong>example:</strong>
         * <p>condition</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySink build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySink self = new GetPipelineResponseBodySink();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySink setCondition(GetPipelineResponseBodySinkCondition condition) {
            this.condition = condition;
            return this;
        }
        public GetPipelineResponseBodySinkCondition getCondition() {
            return this.condition;
        }

        public GetPipelineResponseBodySink setDataset(GetPipelineResponseBodySinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetPipelineResponseBodySinkDataset getDataset() {
            return this.dataset;
        }

        public GetPipelineResponseBodySink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineResponseBodySourceDataset extends TeaModel {
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
         * <p>status = &quot;pending&quot;</p>
         */
        @NameInMap("filter")
        public String filter;

        public static GetPipelineResponseBodySourceDataset build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySourceDataset self = new GetPipelineResponseBodySourceDataset();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySourceDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public GetPipelineResponseBodySourceDataset setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

    }

    public static class GetPipelineResponseBodySourceInputFields extends TeaModel {
        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>question</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The field type. Valid values: text, long, double, and json.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySourceInputFields build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySourceInputFields self = new GetPipelineResponseBodySourceInputFields();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySourceInputFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineResponseBodySourceInputFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineResponseBodySourceLogstore extends TeaModel {
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
         * <p>The filtered query statement, which uses the SLS query and analysis syntax.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| SELECT *</li>
         * </ul>
         */
        @NameInMap("query")
        public String query;

        public static GetPipelineResponseBodySourceLogstore build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySourceLogstore self = new GetPipelineResponseBodySourceLogstore();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySourceLogstore setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetPipelineResponseBodySourceLogstore setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetPipelineResponseBodySourceLogstore setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class GetPipelineResponseBodySourceTrajectoryEnrich extends TeaModel {
        /**
         * <p>The list of enrichment columns. This parameter is retained for compatibility. The current implementation outputs a single fixed column named agent_trajectory, and this parameter no longer affects the output.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;input&quot;,&quot;output&quot;,&quot;session_id&quot;]</p>
         */
        @NameInMap("columns")
        public java.util.List<String> columns;

        /**
         * <p>Specifies whether to enable trace enrichment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetPipelineResponseBodySourceTrajectoryEnrich build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySourceTrajectoryEnrich self = new GetPipelineResponseBodySourceTrajectoryEnrich();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySourceTrajectoryEnrich setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public GetPipelineResponseBodySourceTrajectoryEnrich setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetPipelineResponseBodySourceTrajectory extends TeaModel {
        /**
         * <p>The trace enrichment configuration. It mounts trace data into the cleaning result by trace_id. When writing to a dataset, it uses the fixed column agent_trajectory to store the data, where the column value is the trace JSON content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}</p>
         */
        @NameInMap("enrich")
        public GetPipelineResponseBodySourceTrajectoryEnrich enrich;

        public static GetPipelineResponseBodySourceTrajectory build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySourceTrajectory self = new GetPipelineResponseBodySourceTrajectory();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySourceTrajectory setEnrich(GetPipelineResponseBodySourceTrajectoryEnrich enrich) {
            this.enrich = enrich;
            return this;
        }
        public GetPipelineResponseBodySourceTrajectoryEnrich getEnrich() {
            return this.enrich;
        }

    }

    public static class GetPipelineResponseBodySource extends TeaModel {
        /**
         * <p>The dataset datasource config under the current AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataset&quot;:&quot;my-dataset&quot;,&quot;filter&quot;:&quot;status = &quot;pending&quot;&quot;}</p>
         */
        @NameInMap("dataset")
        public GetPipelineResponseBodySourceDataset dataset;

        /**
         * <p>The input fields and their data types, applicable to all data source types.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]</p>
         */
        @NameInMap("inputFields")
        public java.util.List<GetPipelineResponseBodySourceInputFields> inputFields;

        /**
         * <p>The SLS Logstore datasource config.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;}</p>
         */
        @NameInMap("logstore")
        public GetPipelineResponseBodySourceLogstore logstore;

        /**
         * <p>The trace data configuration. This parameter is optional and takes effect only when the type is trace. It retrieves ATIF standard trace data from the trace cleaning service and extends it by feature.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enrich&quot;:{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}}</p>
         */
        @NameInMap("trajectory")
        public GetPipelineResponseBodySourceTrajectory trajectory;

        /**
         * <p>The data source type. Valid values: logstore, dataset, and trace. The trace value indicates the trace signal-driven processing mode. The server validates the enum values.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySource self = new GetPipelineResponseBodySource();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySource setDataset(GetPipelineResponseBodySourceDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetPipelineResponseBodySourceDataset getDataset() {
            return this.dataset;
        }

        public GetPipelineResponseBodySource setInputFields(java.util.List<GetPipelineResponseBodySourceInputFields> inputFields) {
            this.inputFields = inputFields;
            return this;
        }
        public java.util.List<GetPipelineResponseBodySourceInputFields> getInputFields() {
            return this.inputFields;
        }

        public GetPipelineResponseBodySource setLogstore(GetPipelineResponseBodySourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public GetPipelineResponseBodySourceLogstore getLogstore() {
            return this.logstore;
        }

        public GetPipelineResponseBodySource setTrajectory(GetPipelineResponseBodySourceTrajectory trajectory) {
            this.trajectory = trajectory;
            return this;
        }
        public GetPipelineResponseBodySourceTrajectory getTrajectory() {
            return this.trajectory;
        }

        public GetPipelineResponseBodySource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
