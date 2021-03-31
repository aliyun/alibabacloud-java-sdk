// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ExecutionId")
    @Validation(required = true)
    public String executionId;

    public static StartImagePipelineExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartImagePipelineExecutionResponse self = new StartImagePipelineExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartImagePipelineExecutionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartImagePipelineExecutionResponse setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
