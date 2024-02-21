// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsumerChannelResponseBody body;

    public static DescribeConsumerChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerChannelResponse self = new DescribeConsumerChannelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsumerChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsumerChannelResponse setBody(DescribeConsumerChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsumerChannelResponseBody getBody() {
        return this.body;
    }

}
