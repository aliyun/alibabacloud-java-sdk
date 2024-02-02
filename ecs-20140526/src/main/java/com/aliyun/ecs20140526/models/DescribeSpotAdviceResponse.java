// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSpotAdviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSpotAdviceResponseBody body;

    public static DescribeSpotAdviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotAdviceResponse self = new DescribeSpotAdviceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpotAdviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpotAdviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSpotAdviceResponse setBody(DescribeSpotAdviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpotAdviceResponseBody getBody() {
        return this.body;
    }

}
