// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class PricingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PricingResponseBody body;

    public static PricingResponse build(java.util.Map<String, ?> map) throws Exception {
        PricingResponse self = new PricingResponse();
        return TeaModel.build(map, self);
    }

    public PricingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PricingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PricingResponse setBody(PricingResponseBody body) {
        this.body = body;
        return this;
    }
    public PricingResponseBody getBody() {
        return this.body;
    }

}
