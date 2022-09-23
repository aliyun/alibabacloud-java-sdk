// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UnbindResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindResourceResponseBody body;

    public static UnbindResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindResourceResponse self = new UnbindResourceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindResourceResponse setBody(UnbindResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindResourceResponseBody getBody() {
        return this.body;
    }

}
