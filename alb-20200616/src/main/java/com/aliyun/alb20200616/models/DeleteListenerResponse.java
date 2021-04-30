// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteListenerResponseBody body;

    public static DeleteListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteListenerResponse self = new DeleteListenerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteListenerResponse setBody(DeleteListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteListenerResponseBody getBody() {
        return this.body;
    }

}
