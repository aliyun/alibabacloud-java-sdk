// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSwimmingLaneGroupResponseBody body;

    public static DeleteSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneGroupResponse self = new DeleteSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSwimmingLaneGroupResponse setBody(DeleteSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
