// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteServiceTimeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceTimeConfigResponseBody body;

    public static DeleteServiceTimeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTimeConfigResponse self = new DeleteServiceTimeConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTimeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceTimeConfigResponse setBody(DeleteServiceTimeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceTimeConfigResponseBody getBody() {
        return this.body;
    }

}
