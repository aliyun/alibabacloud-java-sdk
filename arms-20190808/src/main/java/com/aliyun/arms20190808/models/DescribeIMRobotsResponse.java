// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIMRobotsResponseBody body;

    public static DescribeIMRobotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMRobotsResponse self = new DescribeIMRobotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIMRobotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIMRobotsResponse setBody(DescribeIMRobotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIMRobotsResponseBody getBody() {
        return this.body;
    }

}
