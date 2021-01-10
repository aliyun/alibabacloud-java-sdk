// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCustomizedFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCustomizedFilterResponseBody body;

    public static DeleteCustomizedFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedFilterResponse self = new DeleteCustomizedFilterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizedFilterResponse setBody(DeleteCustomizedFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizedFilterResponseBody getBody() {
        return this.body;
    }

}
