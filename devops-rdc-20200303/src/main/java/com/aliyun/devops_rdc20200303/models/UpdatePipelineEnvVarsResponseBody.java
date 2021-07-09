// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdatePipelineEnvVarsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    public static UpdatePipelineEnvVarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineEnvVarsResponseBody self = new UpdatePipelineEnvVarsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineEnvVarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePipelineEnvVarsResponseBody setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

}
