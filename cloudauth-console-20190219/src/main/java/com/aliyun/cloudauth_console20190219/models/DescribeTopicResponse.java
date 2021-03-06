// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopicResponseBody body;

    public static DescribeTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopicResponse self = new DescribeTopicResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopicResponse setBody(DescribeTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopicResponseBody getBody() {
        return this.body;
    }

}
