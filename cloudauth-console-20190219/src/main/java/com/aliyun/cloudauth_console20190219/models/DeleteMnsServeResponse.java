// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteMnsServeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMnsServeResponseBody body;

    public static DeleteMnsServeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMnsServeResponse self = new DeleteMnsServeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMnsServeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMnsServeResponse setBody(DeleteMnsServeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMnsServeResponseBody getBody() {
        return this.body;
    }

}
