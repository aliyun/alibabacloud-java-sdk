// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPipelineResponseBody extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("executePolicy")
    public GetPipelineResponseBodyExecutePolicy executePolicy;

    @NameInMap("pipeline")
    public GetPipelineResponseBodyPipeline pipeline;

    /**
     * <strong>example:</strong>
     * <p>pipeline-name-1</p>
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
     * <p>3430AE20-AFFF-597C-B553-2DF04B2933AA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sink")
    public GetPipelineResponseBodySink sink;

    @NameInMap("source")
    public GetPipelineResponseBodySource source;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-06T14:09:11Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineResponseBody self = new GetPipelineResponseBody();
        return TeaModel.build(map, self);
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

    public GetPipelineResponseBody setPipeline(GetPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
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

    public GetPipelineResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetPipelineResponseBodyExecutePolicyRunOnce extends TeaModel {
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
         * <strong>example:</strong>
         * <p>runOnce</p>
         */
        @NameInMap("mode")
        public String mode;

        @NameInMap("runOnce")
        public GetPipelineResponseBodyExecutePolicyRunOnce runOnce;

        @NameInMap("scheduled")
        public GetPipelineResponseBodyExecutePolicyScheduled scheduled;

        public static GetPipelineResponseBodyExecutePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyExecutePolicy self = new GetPipelineResponseBodyExecutePolicy();
            return TeaModel.build(map, self);
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

    public static class GetPipelineResponseBodySinkDataset extends TeaModel {
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

        public static GetPipelineResponseBodySinkDataset build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySinkDataset self = new GetPipelineResponseBodySinkDataset();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySinkDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public GetPipelineResponseBodySinkDataset setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class GetPipelineResponseBodySink extends TeaModel {
        @NameInMap("dataset")
        public GetPipelineResponseBodySinkDataset dataset;

        /**
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySink build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySink self = new GetPipelineResponseBodySink();
            return TeaModel.build(map, self);
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

    public static class GetPipelineResponseBodySourceLogstore extends TeaModel {
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

    }

    public static class GetPipelineResponseBodySource extends TeaModel {
        @NameInMap("logstore")
        public GetPipelineResponseBodySourceLogstore logstore;

        /**
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodySource self = new GetPipelineResponseBodySource();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodySource setLogstore(GetPipelineResponseBodySourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public GetPipelineResponseBodySourceLogstore getLogstore() {
            return this.logstore;
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
