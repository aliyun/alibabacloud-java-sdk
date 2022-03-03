// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteClientIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClientIdsResponseBody body;

    public static DeleteClientIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientIdsResponse self = new DeleteClientIdsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientIdsResponse setBody(DeleteClientIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientIdsResponseBody getBody() {
        return this.body;
    }

}
