// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineTriggerSpec extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventFilter")
    public EventFilterConfig eventFilter;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("runPipeline")
    public RunPipelineConfig runPipeline;

    public static PipelineTriggerSpec build(java.util.Map<String, ?> map) throws Exception {
        PipelineTriggerSpec self = new PipelineTriggerSpec();
        return TeaModel.build(map, self);
    }

    public PipelineTriggerSpec setEventFilter(EventFilterConfig eventFilter) {
        this.eventFilter = eventFilter;
        return this;
    }
    public EventFilterConfig getEventFilter() {
        return this.eventFilter;
    }

    public PipelineTriggerSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public PipelineTriggerSpec setRunPipeline(RunPipelineConfig runPipeline) {
        this.runPipeline = runPipeline;
        return this;
    }
    public RunPipelineConfig getRunPipeline() {
        return this.runPipeline;
    }

}
