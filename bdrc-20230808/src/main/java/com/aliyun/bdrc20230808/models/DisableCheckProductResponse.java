// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DisableCheckProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCheckProductResponseBody body;

    public static DisableCheckProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckProductResponse self = new DisableCheckProductResponse();
        return TeaModel.build(map, self);
    }

    public DisableCheckProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCheckProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCheckProductResponse setBody(DisableCheckProductResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCheckProductResponseBody getBody() {
        return this.body;
    }

}
