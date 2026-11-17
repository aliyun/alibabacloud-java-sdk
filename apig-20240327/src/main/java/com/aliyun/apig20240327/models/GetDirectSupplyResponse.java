// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDirectSupplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDirectSupplyResponseBody body;

    public static GetDirectSupplyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectSupplyResponse self = new GetDirectSupplyResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectSupplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectSupplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDirectSupplyResponse setBody(GetDirectSupplyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectSupplyResponseBody getBody() {
        return this.body;
    }

}
