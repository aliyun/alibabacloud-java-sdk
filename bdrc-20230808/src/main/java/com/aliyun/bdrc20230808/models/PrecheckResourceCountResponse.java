// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class PrecheckResourceCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrecheckResourceCountResponseBody body;

    public static PrecheckResourceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckResourceCountResponse self = new PrecheckResourceCountResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckResourceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckResourceCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrecheckResourceCountResponse setBody(PrecheckResourceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckResourceCountResponseBody getBody() {
        return this.body;
    }

}
