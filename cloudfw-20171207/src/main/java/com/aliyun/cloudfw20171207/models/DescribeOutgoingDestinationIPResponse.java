// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationIPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingDestinationIPResponseBody body;

    public static DescribeOutgoingDestinationIPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationIPResponse self = new DescribeOutgoingDestinationIPResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingDestinationIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingDestinationIPResponse setBody(DescribeOutgoingDestinationIPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingDestinationIPResponseBody getBody() {
        return this.body;
    }

}
