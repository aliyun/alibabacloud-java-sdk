// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteSourceLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSourceLocationResponseBody body;

    public static DeleteSourceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceLocationResponse self = new DeleteSourceLocationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSourceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSourceLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSourceLocationResponse setBody(DeleteSourceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSourceLocationResponseBody getBody() {
        return this.body;
    }

}
