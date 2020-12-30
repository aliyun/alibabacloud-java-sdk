// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeleteAlbumsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlbumsResponseBody body;

    public static DeleteAlbumsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlbumsResponse self = new DeleteAlbumsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlbumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlbumsResponse setBody(DeleteAlbumsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlbumsResponseBody getBody() {
        return this.body;
    }

}
