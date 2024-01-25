// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiMarketAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiMarketAttributesResponseBody body;

    public static DescribeApiMarketAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMarketAttributesResponse self = new DescribeApiMarketAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiMarketAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiMarketAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiMarketAttributesResponse setBody(DescribeApiMarketAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiMarketAttributesResponseBody getBody() {
        return this.body;
    }

}
