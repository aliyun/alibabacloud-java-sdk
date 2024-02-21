// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsumerGroupResponseBody body;

    public static DescribeConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerGroupResponse self = new DescribeConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsumerGroupResponse setBody(DescribeConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
