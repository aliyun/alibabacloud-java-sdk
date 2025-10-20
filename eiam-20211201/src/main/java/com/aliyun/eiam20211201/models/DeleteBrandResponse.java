// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBrandResponseBody body;

    public static DeleteBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBrandResponse self = new DeleteBrandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBrandResponse setBody(DeleteBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBrandResponseBody getBody() {
        return this.body;
    }

}
