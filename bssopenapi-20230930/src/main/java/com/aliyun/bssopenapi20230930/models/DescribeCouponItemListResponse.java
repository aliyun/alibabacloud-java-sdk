// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCouponItemListResponseBody body;

    public static DescribeCouponItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponItemListResponse self = new DescribeCouponItemListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCouponItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCouponItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCouponItemListResponse setBody(DescribeCouponItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCouponItemListResponseBody getBody() {
        return this.body;
    }

}
