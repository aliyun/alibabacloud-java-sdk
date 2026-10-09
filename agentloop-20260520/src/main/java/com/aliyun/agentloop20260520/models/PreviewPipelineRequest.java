// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PreviewPipelineRequest extends TeaModel {
    /**
     * <p>The start time of the preview data window. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The pipeline configuration, including node orchestration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nodes&quot;:[{&quot;id&quot;:&quot;select-fields&quot;,&quot;type&quot;:&quot;project&quot;,&quot;parameters&quot;:{&quot;question&quot;:&quot;user_query&quot;}}]}</p>
     */
    @NameInMap("pipeline")
    public PreviewPipelineRequestPipeline pipeline;

    /**
     * <p>The data source of the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;logstore&quot;,&quot;logstore&quot;:{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;},&quot;inputFields&quot;:[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]}</p>
     */
    @NameInMap("source")
    public PreviewPipelineRequestSource source;

    /**
     * <p>The end time of the preview data window. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>node-1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The parameters of the node. The parameters are in key-value format and vary based on the node type.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The type of the node.</p>
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
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;select-fields&quot;,&quot;type&quot;:&quot;project&quot;,&quot;parameters&quot;:{}}]</p>
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

    public static class PreviewPipelineRequestSourceDataset extends TeaModel {
        /**
         * <p>The name of the source dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>my-dataset</p>
         */
        @NameInMap("dataset")
        public String dataset;

        /**
         * <p>The filter condition for the dataset data.</p>
         * 
         * <strong>example:</strong>
         * <p>status = \&quot;pending\&quot;</p>
         */
        @NameInMap("filter")
        public String filter;

        public static PreviewPipelineRequestSourceDataset build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestSourceDataset self = new PreviewPipelineRequestSourceDataset();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestSourceDataset setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public PreviewPipelineRequestSourceDataset setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

    }

    public static class PreviewPipelineRequestSourceInputFields extends TeaModel {
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

        public static PreviewPipelineRequestSourceInputFields build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestSourceInputFields self = new PreviewPipelineRequestSourceInputFields();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestSourceInputFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewPipelineRequestSourceInputFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PreviewPipelineRequestSourceLogstore extends TeaModel {
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

    public static class PreviewPipelineRequestSourceTrajectoryEnrich extends TeaModel {
        /**
         * <p>The list of enrichment columns. This parameter is retained for compatibility. The current implementation outputs only the fixed agent_trajectory column, and this parameter no longer affects the output.</p>
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

        public static PreviewPipelineRequestSourceTrajectoryEnrich build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestSourceTrajectoryEnrich self = new PreviewPipelineRequestSourceTrajectoryEnrich();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestSourceTrajectoryEnrich setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public PreviewPipelineRequestSourceTrajectoryEnrich setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class PreviewPipelineRequestSourceTrajectory extends TeaModel {
        /**
         * <p>Trajectory enrichment: mounts trajectory data into the cleaning results based on the trace_id. When writing data to a dataset, the data is stored in the fixed agent_trajectory column, and the column value is the JSON content of the trajectory.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}</p>
         */
        @NameInMap("enrich")
        public PreviewPipelineRequestSourceTrajectoryEnrich enrich;

        public static PreviewPipelineRequestSourceTrajectory build(java.util.Map<String, ?> map) throws Exception {
            PreviewPipelineRequestSourceTrajectory self = new PreviewPipelineRequestSourceTrajectory();
            return TeaModel.build(map, self);
        }

        public PreviewPipelineRequestSourceTrajectory setEnrich(PreviewPipelineRequestSourceTrajectoryEnrich enrich) {
            this.enrich = enrich;
            return this;
        }
        public PreviewPipelineRequestSourceTrajectoryEnrich getEnrich() {
            return this.enrich;
        }

    }

    public static class PreviewPipelineRequestSource extends TeaModel {
        /**
         * <p>The dataset datasource config in the current AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataset&quot;:&quot;my-dataset&quot;,&quot;filter&quot;:&quot;status = \&quot;pending\&quot;&quot;}</p>
         */
        @NameInMap("dataset")
        public PreviewPipelineRequestSourceDataset dataset;

        /**
         * <p>The input fields and their data types. This applies to all data source types.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;type&quot;:&quot;text&quot;}]</p>
         */
        @NameInMap("inputFields")
        public java.util.List<PreviewPipelineRequestSourceInputFields> inputFields;

        /**
         * <p>The Simple Log Service Logstore datasource config.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;my-sls-project&quot;,&quot;logstore&quot;:&quot;agent-logs&quot;}</p>
         */
        @NameInMap("logstore")
        public PreviewPipelineRequestSourceLogstore logstore;

        /**
         * <p>The configuration of trajectory data. This parameter is optional and takes effect only when the type is set to trace. It retrieves ATIF standard trajectory data from the trajectory cleaning service and extends the data based on features.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enrich&quot;:{&quot;enabled&quot;:true,&quot;columns&quot;:[&quot;input&quot;,&quot;output&quot;]}}</p>
         */
        @NameInMap("trajectory")
        public PreviewPipelineRequestSourceTrajectory trajectory;

        /**
         * <p>The type of the data source. Simple Log Service is currently supported.</p>
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

        public PreviewPipelineRequestSource setDataset(PreviewPipelineRequestSourceDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PreviewPipelineRequestSourceDataset getDataset() {
            return this.dataset;
        }

        public PreviewPipelineRequestSource setInputFields(java.util.List<PreviewPipelineRequestSourceInputFields> inputFields) {
            this.inputFields = inputFields;
            return this;
        }
        public java.util.List<PreviewPipelineRequestSourceInputFields> getInputFields() {
            return this.inputFields;
        }

        public PreviewPipelineRequestSource setLogstore(PreviewPipelineRequestSourceLogstore logstore) {
            this.logstore = logstore;
            return this;
        }
        public PreviewPipelineRequestSourceLogstore getLogstore() {
            return this.logstore;
        }

        public PreviewPipelineRequestSource setTrajectory(PreviewPipelineRequestSourceTrajectory trajectory) {
            this.trajectory = trajectory;
            return this;
        }
        public PreviewPipelineRequestSourceTrajectory getTrajectory() {
            return this.trajectory;
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
