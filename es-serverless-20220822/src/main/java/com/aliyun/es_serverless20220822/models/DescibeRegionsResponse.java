// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class DescibeRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescibeRegionsResponseBody body;

    public static DescibeRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescibeRegionsResponse self = new DescibeRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescibeRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescibeRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescibeRegionsResponse setBody(DescibeRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescibeRegionsResponseBody getBody() {
        return this.body;
    }

}
