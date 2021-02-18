// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeConsumerGroupResponse setBody(DescribeConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
