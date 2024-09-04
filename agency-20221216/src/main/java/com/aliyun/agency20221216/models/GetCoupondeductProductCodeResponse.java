// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCoupondeductProductCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCoupondeductProductCodeResponseBody body;

    public static GetCoupondeductProductCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCoupondeductProductCodeResponse self = new GetCoupondeductProductCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetCoupondeductProductCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCoupondeductProductCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCoupondeductProductCodeResponse setBody(GetCoupondeductProductCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCoupondeductProductCodeResponseBody getBody() {
        return this.body;
    }

}
