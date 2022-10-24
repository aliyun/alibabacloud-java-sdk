// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class DeleteImageDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteImageDbResponseBody body;

    public static DeleteImageDbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageDbResponse self = new DeleteImageDbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageDbResponse setBody(DeleteImageDbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageDbResponseBody getBody() {
        return this.body;
    }

}
