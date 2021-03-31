// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImageComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImageComponentResponseBody body;

    public static DeleteImageComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageComponentResponse self = new DeleteImageComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageComponentResponse setBody(DeleteImageComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageComponentResponseBody getBody() {
        return this.body;
    }

}
