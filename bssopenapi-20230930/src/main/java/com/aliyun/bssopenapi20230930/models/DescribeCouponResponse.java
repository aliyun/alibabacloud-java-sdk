// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCouponResponseBody body;

    public static DescribeCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponResponse self = new DescribeCouponResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCouponResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCouponResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCouponResponse setBody(DescribeCouponResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCouponResponseBody getBody() {
        return this.body;
    }

}
