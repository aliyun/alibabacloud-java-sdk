// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpdResponseBody body;

    public static DeleteVpdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdResponse self = new DeleteVpdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpdResponse setBody(DeleteVpdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpdResponseBody getBody() {
        return this.body;
    }

}
