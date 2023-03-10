// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class EnrichResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnrichResponseBody body;

    public static EnrichResponse build(java.util.Map<String, ?> map) throws Exception {
        EnrichResponse self = new EnrichResponse();
        return TeaModel.build(map, self);
    }

    public EnrichResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnrichResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnrichResponse setBody(EnrichResponseBody body) {
        this.body = body;
        return this;
    }
    public EnrichResponseBody getBody() {
        return this.body;
    }

}
