// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSourceMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSourceMapResponseBody body;

    public static DeleteSourceMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceMapResponse self = new DeleteSourceMapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSourceMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSourceMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSourceMapResponse setBody(DeleteSourceMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSourceMapResponseBody getBody() {
        return this.body;
    }

}
