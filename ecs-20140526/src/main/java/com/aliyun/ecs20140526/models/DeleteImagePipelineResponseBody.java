// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImagePipelineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImagePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagePipelineResponseBody self = new DeleteImagePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImagePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
