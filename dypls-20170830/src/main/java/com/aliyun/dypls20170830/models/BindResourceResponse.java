// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class BindResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindResourceResponseBody body;

    public static BindResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindResourceResponse self = new BindResourceResponse();
        return TeaModel.build(map, self);
    }

    public BindResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindResourceResponse setBody(BindResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindResourceResponseBody getBody() {
        return this.body;
    }

}
