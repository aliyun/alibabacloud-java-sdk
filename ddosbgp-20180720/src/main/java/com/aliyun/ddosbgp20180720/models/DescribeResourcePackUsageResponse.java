// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeResourcePackUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourcePackUsageResponseBody body;

    public static DescribeResourcePackUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackUsageResponse self = new DescribeResourcePackUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePackUsageResponse setBody(DescribeResourcePackUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePackUsageResponseBody getBody() {
        return this.body;
    }

}
