// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionResponseBody extends TeaModel {
    /**
     * <p>The ID of the image creation task.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartImagePipelineExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartImagePipelineExecutionResponseBody self = new StartImagePipelineExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartImagePipelineExecutionResponseBody setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public StartImagePipelineExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
