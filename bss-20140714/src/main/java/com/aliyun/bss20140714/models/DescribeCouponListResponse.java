// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCouponListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCouponListResponseBody body;

    public static DescribeCouponListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponListResponse self = new DescribeCouponListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCouponListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCouponListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCouponListResponse setBody(DescribeCouponListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCouponListResponseBody getBody() {
        return this.body;
    }

}
