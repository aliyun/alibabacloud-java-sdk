// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteComponentVersionResponseBody body;

    public static DeleteComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentVersionResponse self = new DeleteComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComponentVersionResponse setBody(DeleteComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComponentVersionResponseBody getBody() {
        return this.body;
    }

}
