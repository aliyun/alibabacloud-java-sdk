// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewDataPipelineResponseBody extends TeaModel {
    /**
     * <p>The dataset preview results.</p>
     */
    @NameInMap("datasets")
    public java.util.List<PreviewDataPipelineResponseBodyDatasets> datasets;

    /**
     * <p>The effective SPL.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| where status_code == &quot;ERROR&quot;</li>
     * </ul>
     */
    @NameInMap("effectiveScript")
    public String effectiveScript;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-01j2example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PreviewDataPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewDataPipelineResponseBody self = new PreviewDataPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewDataPipelineResponseBody setDatasets(java.util.List<PreviewDataPipelineResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<PreviewDataPipelineResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public PreviewDataPipelineResponseBody setEffectiveScript(String effectiveScript) {
        this.effectiveScript = effectiveScript;
        return this;
    }
    public String getEffectiveScript() {
        return this.effectiveScript;
    }

    public PreviewDataPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreviewDataPipelineResponseBodyDatasetsMeta extends TeaModel {
        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_id</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The field type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        public static PreviewDataPipelineResponseBodyDatasetsMeta build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineResponseBodyDatasetsMeta self = new PreviewDataPipelineResponseBodyDatasetsMeta();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineResponseBodyDatasetsMeta setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineResponseBodyDatasetsMeta setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class PreviewDataPipelineResponseBodyDatasets extends TeaModel {
        /**
         * <p>The preview data.</p>
         */
        @NameInMap("data")
        public java.util.List<java.util.Map<String, ?>> data;

        /**
         * <p>The field metadata.</p>
         */
        @NameInMap("meta")
        public java.util.List<PreviewDataPipelineResponseBodyDatasetsMeta> meta;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>error_spans</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of samples.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sampleCount")
        public Long sampleCount;

        public static PreviewDataPipelineResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            PreviewDataPipelineResponseBodyDatasets self = new PreviewDataPipelineResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public PreviewDataPipelineResponseBodyDatasets setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public PreviewDataPipelineResponseBodyDatasets setMeta(java.util.List<PreviewDataPipelineResponseBodyDatasetsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<PreviewDataPipelineResponseBodyDatasetsMeta> getMeta() {
            return this.meta;
        }

        public PreviewDataPipelineResponseBodyDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PreviewDataPipelineResponseBodyDatasets setSampleCount(Long sampleCount) {
            this.sampleCount = sampleCount;
            return this;
        }
        public Long getSampleCount() {
            return this.sampleCount;
        }

    }

}
