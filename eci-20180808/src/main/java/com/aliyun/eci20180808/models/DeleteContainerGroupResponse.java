// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteContainerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContainerGroupResponseBody body;

    public static DeleteContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerGroupResponse self = new DeleteContainerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContainerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContainerGroupResponse setBody(DeleteContainerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContainerGroupResponseBody getBody() {
        return this.body;
    }

}
