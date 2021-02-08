// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImagePipelineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteImagePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagePipelineResponse self = new DeleteImagePipelineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImagePipelineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
