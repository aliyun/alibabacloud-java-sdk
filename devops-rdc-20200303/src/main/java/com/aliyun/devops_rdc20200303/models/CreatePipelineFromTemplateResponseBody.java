// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreatePipelineFromTemplateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 流水线ID
    @NameInMap("PipelineId")
    public Long pipelineId;

    public static CreatePipelineFromTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineFromTemplateResponseBody self = new CreatePipelineFromTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineFromTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelineFromTemplateResponseBody setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

}
