// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableBrandResponseBody body;

    public static EnableBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBrandResponse self = new EnableBrandResponse();
        return TeaModel.build(map, self);
    }

    public EnableBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableBrandResponse setBody(EnableBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBrandResponseBody getBody() {
        return this.body;
    }

}
