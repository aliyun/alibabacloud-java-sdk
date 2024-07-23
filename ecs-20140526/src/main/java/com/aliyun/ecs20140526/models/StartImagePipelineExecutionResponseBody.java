// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionResponseBody extends TeaModel {
    /**
     * <p>The ID of the image creation task.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-5fb8facb8ed7427c****</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
