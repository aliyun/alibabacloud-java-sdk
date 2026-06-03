// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class DeleteSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchemeResponseBody body;

    public static DeleteSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemeResponse self = new DeleteSchemeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchemeResponse setBody(DeleteSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchemeResponseBody getBody() {
        return this.body;
    }

}
