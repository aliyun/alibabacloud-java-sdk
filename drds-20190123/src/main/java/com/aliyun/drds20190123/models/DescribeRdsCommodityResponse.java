// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsCommodityResponseBody body;

    public static DescribeRdsCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsCommodityResponse self = new DescribeRdsCommodityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsCommodityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsCommodityResponse setBody(DescribeRdsCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsCommodityResponseBody getBody() {
        return this.body;
    }

}
