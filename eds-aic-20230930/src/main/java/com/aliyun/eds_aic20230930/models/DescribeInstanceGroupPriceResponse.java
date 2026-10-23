// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInstanceGroupPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceGroupPriceResponseBody body;

    public static DescribeInstanceGroupPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGroupPriceResponse self = new DescribeInstanceGroupPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGroupPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceGroupPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceGroupPriceResponse setBody(DescribeInstanceGroupPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceGroupPriceResponseBody getBody() {
        return this.body;
    }

}
