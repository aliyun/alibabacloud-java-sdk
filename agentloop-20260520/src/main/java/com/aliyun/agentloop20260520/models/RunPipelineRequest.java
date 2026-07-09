// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunPipelineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    @NameInMap("output")
    public RunPipelineRequestOutput output;

    /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dataset")
        public Boolean dataset;

        /**
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
