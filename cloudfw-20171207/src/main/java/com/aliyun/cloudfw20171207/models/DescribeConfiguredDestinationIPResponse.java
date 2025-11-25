// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeConfiguredDestinationIPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConfiguredDestinationIPResponseBody body;

    public static DescribeConfiguredDestinationIPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfiguredDestinationIPResponse self = new DescribeConfiguredDestinationIPResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfiguredDestinationIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfiguredDestinationIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfiguredDestinationIPResponse setBody(DescribeConfiguredDestinationIPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfiguredDestinationIPResponseBody getBody() {
        return this.body;
    }

}
