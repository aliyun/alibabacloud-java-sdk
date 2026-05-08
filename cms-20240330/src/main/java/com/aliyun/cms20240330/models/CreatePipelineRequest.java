// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("executePolicy")
    public CreatePipelineRequestExecutePolicy executePolicy;

    @NameInMap("pipeline")
    public CreatePipelineRequestPipeline pipeline;

    /**
     * <strong>example:</strong>
     * <p>pipeline-name-1</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    @NameInMap("sink")
    public CreatePipelineRequestSink sink;

    @NameInMap("source")
    public CreatePipelineRequestSource source;

    public static CreatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRequest self = new CreatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePipelineRequest setExecutePolicy(CreatePipelineRequestExecutePolicy executePolicy) {
        this.executePolicy = executePolicy;
        return this;
    }
    public CreatePipelineRequestExecutePolicy getExecutePolicy() {
        return this.executePolicy;
    }

    public CreatePipelineRequest setPipeline(CreatePipelineRequestPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public CreatePipelineRequestPipeline getPipeline() {
        return this.pipeline;
    }

    public CreatePipelineRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public CreatePipelineRequest setSink(CreatePipelineRequestSink sink) {
        this.sink = sink;
        return this;
    }
    public CreatePipelineRequestSink getSink() {
        return this.sink;
    }

    public CreatePipelineRequest setSource(CreatePipelineRequestSource source) {
        this.source = source;
        return this;
    }
    public CreatePipelineRequestSource getSource() {
        return this.source;
    }

    public static class CreatePipelineRequestExecutePolicyRunOnce extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1772519013</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <strong>example:</strong>
         * <p>1772519013</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static CreatePipelineRequestExecutePolicyRunOnce build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestExecutePolicyRunOnce self = new CreatePipelineRequestExecutePolicyRunOnce();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestExecutePolicyRunOnce setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public CreatePipelineRequestExecutePolicyRunOnce setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

    public static class CreatePipelineRequestExecutePolicyScheduled extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1772519013</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("interval")
        public String interval;

        public static CreatePipelineRequestExecutePolicyScheduled build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestExecutePolicyScheduled self = new CreatePipelineRequestExecutePolicyScheduled();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestExecutePolicyScheduled setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public CreatePipelineRequestExecutePolicyScheduled setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class CreatePipelineRequestExecutePolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>runOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        @NameInMap("runOnce")
        public CreatePipelineRequestExecutePolicyRunOnce runOnce;

        @NameInMap("scheduled")
        public CreatePipelineRequestExecutePolicyScheduled scheduled;

        public static CreatePipelineRequestExecutePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestExecutePolicy self = new CreatePipelineRequestExecutePolicy();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestExecutePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreatePipelineRequestExecutePolicy setRunOnce(CreatePipelineRequestExecutePolicyRunOnce runOnce) {
            this.runOnce = runOnce;
            return this;
        }
        public CreatePipelineRequestExecutePolicyRunOnce getRunOnce() {
            return this.runOnce;
        }

        public CreatePipelineRequestExecutePolicy setScheduled(CreatePipelineRequestExecutePolicyScheduled scheduled) {
            this.scheduled = scheduled;
            return this;
        }
        public CreatePipelineRequestExecutePolicyScheduled getScheduled() {
            return this.scheduled;
        }

    }

    public static class CreatePipelineRequestPipelineNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>node_1</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <strong>example:</strong>
         * <p>dedup-fuzzy</p>
         */
        @NameInMap("type")
        public String type;

        public static CreatePipelineRequestPipelineNodes build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestPipelineNodes self = new CreatePipelineRequestPipelineNodes();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestPipelineNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePipelineRequestPipelineNodes setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreatePipelineRequestPipelineNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreatePipelineRequestPipeline extends TeaModel {
        @NameInMap("nodes")
        public java.util.List<CreatePipelineRequestPipelineNodes> nodes;

        public static CreatePipelineRequestPipeline build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestPipeline self = new CreatePipelineRequestPipeline();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestPipeline setNodes(java.util.List<CreatePipelineRequestPipelineNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<CreatePipelineRequestPipelineNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class CreatePipelineRequestSinkDataset extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dataset_1</p>
         */
        @NameInMap("dataset")
        public String dataset;

        /**
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreatePipelineRequestSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSinkDataset self = new CreatePipelineRequestSinkDataset();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public CreatePipelineRequestSinkDataset setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class CreatePipelineRequestSink extends TeaModel {
        @NameInMap("dataset")
        public CreatePipelineRequestSinkDataset dataset;

        /**
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static CreatePipelineRequestSink build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSink self = new CreatePipelineRequestSink();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSink setDataset(CreatePipelineRequestSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public CreatePipelineRequestSinkDataset getDataset() {
            return this.dataset;
        }

        public CreatePipelineRequestSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreatePipelineRequestSourceLogstore extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>status:500 and method:GET</p>
         */
        @NameInMap("query")
        public String query;

        public static CreatePipelineRequestSourceLogstore build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSourceLogstore self = new CreatePipelineRequestSourceLogstore();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSourceLogstore setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreatePipelineRequestSourceLogstore setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreatePipelineRequestSourceLogstore setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class CreatePipelineRequestSource extends TeaModel {
        @NameInMap("logstore")
        public CreatePipelineRequestSourceLogstore logstore;

        /**
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        @NameInMap("type")
        public String type;

        public static CreatePipelineRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSource self = new CreatePipelineRequestSource();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSource setLogstore(CreatePipelineRequestSourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public CreatePipelineRequestSourceLogstore getLogstore() {
            return this.logstore;
        }

        public CreatePipelineRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
