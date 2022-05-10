// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConnectionResponseBody body;

    public static DeleteConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectionResponse self = new DeleteConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConnectionResponse setBody(DeleteConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConnectionResponseBody getBody() {
        return this.body;
    }

}
