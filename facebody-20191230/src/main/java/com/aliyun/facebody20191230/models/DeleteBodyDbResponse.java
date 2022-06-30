// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteBodyDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBodyDbResponseBody body;

    public static DeleteBodyDbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBodyDbResponse self = new DeleteBodyDbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBodyDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBodyDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBodyDbResponse setBody(DeleteBodyDbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBodyDbResponseBody getBody() {
        return this.body;
    }

}
