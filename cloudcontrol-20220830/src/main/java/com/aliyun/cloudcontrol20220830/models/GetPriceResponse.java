// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPriceResponseBody body;

    public static GetPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPriceResponse self = new GetPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPriceResponse setBody(GetPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPriceResponseBody getBody() {
        return this.body;
    }

}
