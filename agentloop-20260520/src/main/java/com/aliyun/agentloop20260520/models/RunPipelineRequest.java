// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunPipelineRequest extends TeaModel {
    /**
     * <p>The start time of the data processing window in UNIX seconds. This parameter is required for SQL pipelines and time window-based WorkItem sources. It can be omitted for checkpoint-based WorkItem sources such as Dataset and Logstore Pull.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The output control settings. SQL pipelines support overriding these settings. WorkItem pipelines use the saved sink configurations and must keep the default values.</p>
     */
    @NameInMap("output")
    public RunPipelineRequestOutput output;

    /**
     * <p>The end time of the data processing window in UNIX seconds. It must be provided together with fromTime and must be greater than fromTime. This parameter can be omitted for checkpoint-based WorkItem sources.</p>
     * 
     * <strong>example:</strong>
     * <p>1735747200</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    public static RunPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPipelineRequest self = new RunPipelineRequest();
        return TeaModel.build(map, self);
    }

    public RunPipelineRequest setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public RunPipelineRequest setOutput(RunPipelineRequestOutput output) {
        this.output = output;
        return this;
    }
    public RunPipelineRequestOutput getOutput() {
        return this.output;
    }

    public RunPipelineRequest setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

    public static class RunPipelineRequestOutput extends TeaModel {
        /**
         * <p>Specifies whether to write data to the target dataset. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dataset")
        public Boolean dataset;

        /**
         * <p>Specifies whether to return inline results in the response. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("inline")
        public Boolean inline;

        public static RunPipelineRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            RunPipelineRequestOutput self = new RunPipelineRequestOutput();
            return TeaModel.build(map, self);
        }

        public RunPipelineRequestOutput setDataset(Boolean dataset) {
            this.dataset = dataset;
            return this;
        }
        public Boolean getDataset() {
            return this.dataset;
        }

        public RunPipelineRequestOutput setInline(Boolean inline) {
            this.inline = inline;
            return this;
        }
        public Boolean getInline() {
            return this.inline;
        }

    }

}
