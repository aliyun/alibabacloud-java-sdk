// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOriginPoolResponseBody body;

    public static DeleteOriginPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginPoolResponse self = new DeleteOriginPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOriginPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOriginPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOriginPoolResponse setBody(DeleteOriginPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOriginPoolResponseBody getBody() {
        return this.body;
    }

}
