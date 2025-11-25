// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingDestinationResponseBody body;

    public static DescribeOutgoingDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationResponse self = new DescribeOutgoingDestinationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingDestinationResponse setBody(DescribeOutgoingDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingDestinationResponseBody getBody() {
        return this.body;
    }

}
