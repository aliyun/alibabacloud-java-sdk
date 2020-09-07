// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class TriggerPipelineShrinkRequest extends TeaModel {
    @NameInMap("PipelineId")
    @Validation(required = true)
    public String pipelineId;

    @NameInMap("RuntimeEnvVariables")
    public String runtimeEnvVariablesShrink;

    public static TriggerPipelineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerPipelineShrinkRequest self = new TriggerPipelineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TriggerPipelineShrinkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public TriggerPipelineShrinkRequest setRuntimeEnvVariablesShrink(String runtimeEnvVariablesShrink) {
        this.runtimeEnvVariablesShrink = runtimeEnvVariablesShrink;
        return this;
    }
    public String getRuntimeEnvVariablesShrink() {
        return this.runtimeEnvVariablesShrink;
    }

}
