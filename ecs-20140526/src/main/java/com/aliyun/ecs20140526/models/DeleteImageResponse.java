// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageResponse self = new DeleteImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
