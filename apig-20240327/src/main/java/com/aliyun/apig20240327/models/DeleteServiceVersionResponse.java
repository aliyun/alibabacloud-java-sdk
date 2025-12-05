// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceVersionResponseBody body;

    public static DeleteServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceVersionResponse self = new DeleteServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceVersionResponse setBody(DeleteServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceVersionResponseBody getBody() {
        return this.body;
    }

}
