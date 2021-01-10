// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCustomizedPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCustomizedPropertyResponseBody body;

    public static DeleteCustomizedPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedPropertyResponse self = new DeleteCustomizedPropertyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizedPropertyResponse setBody(DeleteCustomizedPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizedPropertyResponseBody getBody() {
        return this.body;
    }

}
