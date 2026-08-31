// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunPipelineRequest extends TeaModel {
    /**
     * <p>The start of the data processing window, in UNIX seconds. This parameter is required for SQL Pipeline and time window-based WorkItem Source. This parameter is optional for checkpoint-based WorkItem Source types such as Dataset and Logstore Pull.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The output control settings. SQL Pipeline supports overriding. WorkItem Pipeline uses the saved Sink configuration and must keep the default value.</p>
     */
    @NameInMap("output")
    public RunPipelineRequestOutput output;

    /**
     * <p>The end of the data processing window, in UNIX seconds. This parameter must be provided together with fromTime and must be greater than fromTime. This parameter is optional for checkpoint-based WorkItem Source types.</p>
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
         * <p>Specifies whether to write to the target Dataset. Default value: true.</p>
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
