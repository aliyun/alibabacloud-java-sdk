// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ListProductsByPopCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductsByPopCodeResponseBody body;

    public static ListProductsByPopCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsByPopCodeResponse self = new ListProductsByPopCodeResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsByPopCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductsByPopCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductsByPopCodeResponse setBody(ListProductsByPopCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductsByPopCodeResponseBody getBody() {
        return this.body;
    }

}
