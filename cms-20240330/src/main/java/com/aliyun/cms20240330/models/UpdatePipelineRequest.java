// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePipelineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test pipeline</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("executePolicy")
    public UpdatePipelineRequestExecutePolicy executePolicy;

    @NameInMap("pipeline")
    public UpdatePipelineRequestPipeline pipeline;

    @NameInMap("sink")
    public UpdatePipelineRequestSink sink;

    @NameInMap("source")
    public UpdatePipelineRequestSource source;

    public static UpdatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRequest self = new UpdatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePipelineRequest setExecutePolicy(UpdatePipelineRequestExecutePolicy executePolicy) {
        this.executePolicy = executePolicy;
        return this;
    }
    public UpdatePipelineRequestExecutePolicy getExecutePolicy() {
        return this.executePolicy;
    }

    public UpdatePipelineRequest setPipeline(UpdatePipelineRequestPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public UpdatePipelineRequestPipeline getPipeline() {
        return this.pipeline;
    }

    public UpdatePipelineRequest setSink(UpdatePipelineRequestSink sink) {
        this.sink = sink;
        return this;
    }
    public UpdatePipelineRequestSink getSink() {
        return this.sink;
    }

    public UpdatePipelineRequest setSource(UpdatePipelineRequestSource source) {
        this.source = source;
        return this;
    }
    public UpdatePipelineRequestSource getSource() {
        return this.source;
    }

    public static class UpdatePipelineRequestExecutePolicyRunOnce extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1772519013</p>
         */
        @NameInMap("fromTime")
        public Long fromTime;

        /**
         * <strong>example:</strong>
         * <p>1772605413</p>
         */
        @NameInMap("toTime")
        public Long toTime;

        public static UpdatePipelineRequestExecutePolicyRunOnce build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestExecutePolicyRunOnce self = new UpdatePipelineRequestExecutePolicyRunOnce();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestExecutePolicyRunOnce setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public UpdatePipelineRequestExecutePolicyRunOnce setToTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }
        public Long getToTime() {
            return this.toTime;
        }

    }

    public static class UpdatePipelineRequestExecutePolicyScheduled extends TeaModel {
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

        public static UpdatePipelineRequestExecutePolicyScheduled build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestExecutePolicyScheduled self = new UpdatePipelineRequestExecutePolicyScheduled();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestExecutePolicyScheduled setFromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }
        public Long getFromTime() {
            return this.fromTime;
        }

        public UpdatePipelineRequestExecutePolicyScheduled setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class UpdatePipelineRequestExecutePolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>runOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        @NameInMap("runOnce")
        public UpdatePipelineRequestExecutePolicyRunOnce runOnce;

        @NameInMap("scheduled")
        public UpdatePipelineRequestExecutePolicyScheduled scheduled;

        public static UpdatePipelineRequestExecutePolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestExecutePolicy self = new UpdatePipelineRequestExecutePolicy();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestExecutePolicy setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdatePipelineRequestExecutePolicy setRunOnce(UpdatePipelineRequestExecutePolicyRunOnce runOnce) {
            this.runOnce = runOnce;
            return this;
        }
        public UpdatePipelineRequestExecutePolicyRunOnce getRunOnce() {
            return this.runOnce;
        }

        public UpdatePipelineRequestExecutePolicy setScheduled(UpdatePipelineRequestExecutePolicyScheduled scheduled) {
            this.scheduled = scheduled;
            return this;
        }
        public UpdatePipelineRequestExecutePolicyScheduled getScheduled() {
            return this.scheduled;
        }

    }

    public static class UpdatePipelineRequestPipelineNodes extends TeaModel {
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

        public static UpdatePipelineRequestPipelineNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestPipelineNodes self = new UpdatePipelineRequestPipelineNodes();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestPipelineNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePipelineRequestPipelineNodes setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public UpdatePipelineRequestPipelineNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdatePipelineRequestPipeline extends TeaModel {
        @NameInMap("nodes")
        public java.util.List<UpdatePipelineRequestPipelineNodes> nodes;

        public static UpdatePipelineRequestPipeline build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestPipeline self = new UpdatePipelineRequestPipeline();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestPipeline setNodes(java.util.List<UpdatePipelineRequestPipelineNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<UpdatePipelineRequestPipelineNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class UpdatePipelineRequestSinkDataset extends TeaModel {
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

        public static UpdatePipelineRequestSinkDataset build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSinkDataset self = new UpdatePipelineRequestSinkDataset();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public UpdatePipelineRequestSinkDataset setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class UpdatePipelineRequestSink extends TeaModel {
        @NameInMap("dataset")
        public UpdatePipelineRequestSinkDataset dataset;

        /**
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdatePipelineRequestSink build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSink self = new UpdatePipelineRequestSink();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSink setDataset(UpdatePipelineRequestSinkDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public UpdatePipelineRequestSinkDataset getDataset() {
            return this.dataset;
        }

        public UpdatePipelineRequestSink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdatePipelineRequestSourceLogstore extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <strong>example:</strong>
         * <p>status:500 and method:GET</p>
         */
        @NameInMap("query")
        public String query;

        public static UpdatePipelineRequestSourceLogstore build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSourceLogstore self = new UpdatePipelineRequestSourceLogstore();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSourceLogstore setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdatePipelineRequestSourceLogstore setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdatePipelineRequestSource extends TeaModel {
        @NameInMap("logstore")
        public UpdatePipelineRequestSourceLogstore logstore;

        /**
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdatePipelineRequestSource build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSource self = new UpdatePipelineRequestSource();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSource setLogstore(UpdatePipelineRequestSourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public UpdatePipelineRequestSourceLogstore getLogstore() {
            return this.logstore;
        }

        public UpdatePipelineRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
