// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PreviewPipelineRequest extends TeaModel {
    /**
     * <p>The start time of the preview data window, in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The pipeline configuration, which defines the node orchestration.</p>
     */
    @NameInMap("pipeline")
    public PreviewPipelineRequestPipeline pipeline;

    /**
     * <p>The pipeline data source.</p>
     */
    @NameInMap("source")
    public PreviewPipelineRequestSource source;

    /**
     * <p>The end time of the preview data window, in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735747200</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    public static PreviewPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewPipelineRequest self = new PreviewPipelineRequest();
        return TeaModel.build(map, self);
    }

    public PreviewPipelineRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public PreviewPipelineRequest setPipeline(PreviewPipelineRequestPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public PreviewPipelineRequestPipeline getPipeline() {
        return this.pipeline;
    }

    public PreviewPipelineRequest setSource(PreviewPipelineRequestSource source) {
        this.source = source;
        return this;
    }
    public PreviewPipelineRequestSource getSource() {
        return this.source;
    }

    public PreviewPipelineRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public static class PreviewPipelineRequestPipelineNodes extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>node-1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The node parameters in key-value structure. The parameters vary depending on the node type.</p>
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

        public static PreviewPipelineRequestPipelineNodes build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestPipelineNodes self = new PreviewPipelineRequestPipelineNodes();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestPipelineNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PreviewPipelineRequestPipelineNodes setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public PreviewPipelineRequestPipelineNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PreviewPipelineRequestPipeline extends TeaModel {
        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("nodes")
        public java.util.List<PreviewPipelineRequestPipelineNodes> nodes;

        public static PreviewPipelineRequestPipeline build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestPipeline self = new PreviewPipelineRequestPipeline();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestPipeline setNodes(java.util.List<PreviewPipelineRequestPipelineNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<PreviewPipelineRequestPipelineNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class PreviewPipelineRequestSourceLogstore extends TeaModel {
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

        public static PreviewPipelineRequestSourceLogstore build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestSourceLogstore self = new PreviewPipelineRequestSourceLogstore();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestSourceLogstore setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public PreviewPipelineRequestSourceLogstore setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public PreviewPipelineRequestSourceLogstore setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class PreviewPipelineRequestSource extends TeaModel {
        /**
         * <p>The SLS Logstore datasource config.</p>
         */
        @NameInMap("logstore")
        public PreviewPipelineRequestSourceLogstore logstore;

        /**
         * <p>The data source type. Currently, only Simple Log Service (SLS) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("type")
        public String type;

        public static PreviewPipelineRequestSource build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestSource self = new PreviewPipelineRequestSource();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestSource setLogstore(PreviewPipelineRequestSourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public PreviewPipelineRequestSourceLogstore getLogstore() {
            return this.logstore;
        }

        public PreviewPipelineRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
