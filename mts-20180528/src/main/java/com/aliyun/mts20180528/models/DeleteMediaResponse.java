// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DeleteMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaResponseBody body;

    public static DeleteMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaResponse self = new DeleteMediaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaResponse setBody(DeleteMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaResponseBody getBody() {
        return this.body;
    }

}
