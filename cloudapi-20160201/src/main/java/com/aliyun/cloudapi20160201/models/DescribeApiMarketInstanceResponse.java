// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiMarketInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiMarketInstanceResponseBody body;

    public static DescribeApiMarketInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMarketInstanceResponse self = new DescribeApiMarketInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiMarketInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiMarketInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiMarketInstanceResponse setBody(DescribeApiMarketInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiMarketInstanceResponseBody getBody() {
        return this.body;
    }

}
