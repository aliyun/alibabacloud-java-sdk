// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteLogPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogPathResponseBody body;

    public static DeleteLogPathResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogPathResponse self = new DeleteLogPathResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogPathResponse setBody(DeleteLogPathResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogPathResponseBody getBody() {
        return this.body;
    }

}
