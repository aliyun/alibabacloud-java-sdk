// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeleteCopyrightPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCopyrightPersonResponseBody body;

    public static DeleteCopyrightPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCopyrightPersonResponse self = new DeleteCopyrightPersonResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCopyrightPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCopyrightPersonResponse setBody(DeleteCopyrightPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCopyrightPersonResponseBody getBody() {
        return this.body;
    }

}
