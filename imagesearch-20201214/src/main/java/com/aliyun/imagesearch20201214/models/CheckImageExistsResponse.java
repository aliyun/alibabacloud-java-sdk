// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CheckImageExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckImageExistsResponseBody body;

    public static CheckImageExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckImageExistsResponse self = new CheckImageExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckImageExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckImageExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckImageExistsResponse setBody(CheckImageExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckImageExistsResponseBody getBody() {
        return this.body;
    }

}
