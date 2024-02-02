// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceModificationPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceModificationPriceResponseBody body;

    public static DescribeInstanceModificationPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceModificationPriceResponse self = new DescribeInstanceModificationPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceModificationPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceModificationPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceModificationPriceResponse setBody(DescribeInstanceModificationPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceModificationPriceResponseBody getBody() {
        return this.body;
    }

}
