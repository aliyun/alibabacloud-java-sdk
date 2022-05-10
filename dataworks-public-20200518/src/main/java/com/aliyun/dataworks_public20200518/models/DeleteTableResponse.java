// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTableResponseBody body;

    public static DeleteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableResponse self = new DeleteTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTableResponse setBody(DeleteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableResponseBody getBody() {
        return this.body;
    }

}
