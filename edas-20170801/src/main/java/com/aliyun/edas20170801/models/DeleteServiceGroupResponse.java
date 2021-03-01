// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceGroupResponseBody body;

    public static DeleteServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupResponse self = new DeleteServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceGroupResponse setBody(DeleteServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceGroupResponseBody getBody() {
        return this.body;
    }

}
