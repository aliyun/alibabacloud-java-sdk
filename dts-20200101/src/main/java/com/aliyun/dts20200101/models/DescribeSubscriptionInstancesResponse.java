// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSubscriptionInstancesResponseBody body;

    public static DescribeSubscriptionInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstancesResponse self = new DescribeSubscriptionInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionInstancesResponse setBody(DescribeSubscriptionInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionInstancesResponseBody getBody() {
        return this.body;
    }

}
