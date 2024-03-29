// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCdsFileResponseBody body;

    public static DeleteCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCdsFileResponse self = new DeleteCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCdsFileResponse setBody(DeleteCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCdsFileResponseBody getBody() {
        return this.body;
    }

}
