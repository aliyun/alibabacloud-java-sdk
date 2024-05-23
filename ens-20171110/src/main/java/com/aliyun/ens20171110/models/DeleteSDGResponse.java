// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSDGResponseBody body;

    public static DeleteSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSDGResponse self = new DeleteSDGResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSDGResponse setBody(DeleteSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSDGResponseBody getBody() {
        return this.body;
    }

}
