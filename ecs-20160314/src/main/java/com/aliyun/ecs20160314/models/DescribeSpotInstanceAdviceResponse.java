// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeSpotInstanceAdviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSpotInstanceAdviceResponseBody body;

    public static DescribeSpotInstanceAdviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotInstanceAdviceResponse self = new DescribeSpotInstanceAdviceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpotInstanceAdviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpotInstanceAdviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpotInstanceAdviceResponse setBody(DescribeSpotInstanceAdviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpotInstanceAdviceResponseBody getBody() {
        return this.body;
    }

}
