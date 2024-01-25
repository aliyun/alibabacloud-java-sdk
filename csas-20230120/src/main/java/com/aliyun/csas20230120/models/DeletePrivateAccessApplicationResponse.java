// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateAccessApplicationResponseBody body;

    public static DeletePrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessApplicationResponse self = new DeletePrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateAccessApplicationResponse setBody(DeletePrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
