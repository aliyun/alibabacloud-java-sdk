// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RerankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RerankResponseBody body;

    public static RerankResponse build(java.util.Map<String, ?> map) throws Exception {
        RerankResponse self = new RerankResponse();
        return TeaModel.build(map, self);
    }

    public RerankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerankResponse setBody(RerankResponseBody body) {
        this.body = body;
        return this;
    }
    public RerankResponseBody getBody() {
        return this.body;
    }

}
