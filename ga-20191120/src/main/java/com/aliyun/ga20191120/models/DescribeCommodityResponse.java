// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCommodityResponseBody body;

    public static DescribeCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityResponse self = new DescribeCommodityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommodityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommodityResponse setBody(DescribeCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommodityResponseBody getBody() {
        return this.body;
    }

}
