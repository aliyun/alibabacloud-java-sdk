// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ReleaseResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseResourceResponseBody body;

    public static ReleaseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseResourceResponse self = new ReleaseResourceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseResourceResponse setBody(ReleaseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseResourceResponseBody getBody() {
        return this.body;
    }

}
