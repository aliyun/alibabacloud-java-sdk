// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteExtCodeSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExtCodeSignResponseBody body;

    public static DeleteExtCodeSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtCodeSignResponse self = new DeleteExtCodeSignResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExtCodeSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExtCodeSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExtCodeSignResponse setBody(DeleteExtCodeSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExtCodeSignResponseBody getBody() {
        return this.body;
    }

}
