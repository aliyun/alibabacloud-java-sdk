// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetApiPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiPriceResponseBody body;

    public static GetApiPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiPriceResponse self = new GetApiPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetApiPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiPriceResponse setBody(GetApiPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiPriceResponseBody getBody() {
        return this.body;
    }

}
