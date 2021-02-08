// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelImagePipelineExecutionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelImagePipelineExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelImagePipelineExecutionResponse self = new CancelImagePipelineExecutionResponse();
        return TeaModel.build(map, self);
    }

    public CancelImagePipelineExecutionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
