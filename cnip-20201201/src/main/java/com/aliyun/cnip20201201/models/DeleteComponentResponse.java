// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteComponentResponseBody body;

    public static DeleteComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentResponse self = new DeleteComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComponentResponse setBody(DeleteComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComponentResponseBody getBody() {
        return this.body;
    }

}
