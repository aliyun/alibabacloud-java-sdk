// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class TriggerPipelineRequest extends TeaModel {
    @NameInMap("PipelineId")
    @Validation(required = true)
    public String pipelineId;

    @NameInMap("RuntimeEnvVariables")
    public java.util.Map<String, ?> runtimeEnvVariables;

    public static TriggerPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerPipelineRequest self = new TriggerPipelineRequest();
        return TeaModel.build(map, self);
    }

    public TriggerPipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public TriggerPipelineRequest setRuntimeEnvVariables(java.util.Map<String, ?> runtimeEnvVariables) {
        this.runtimeEnvVariables = runtimeEnvVariables;
        return this;
    }
    public java.util.Map<String, ?> getRuntimeEnvVariables() {
        return this.runtimeEnvVariables;
    }

}
