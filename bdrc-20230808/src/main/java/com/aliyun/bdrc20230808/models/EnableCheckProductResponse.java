// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCheckProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCheckProductResponseBody body;

    public static EnableCheckProductResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckProductResponse self = new EnableCheckProductResponse();
        return TeaModel.build(map, self);
    }

    public EnableCheckProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCheckProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCheckProductResponse setBody(EnableCheckProductResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCheckProductResponseBody getBody() {
        return this.body;
    }

}
