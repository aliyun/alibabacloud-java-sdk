// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeActivationsResponseBody body;

    public static DescribeActivationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsResponse self = new DescribeActivationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActivationsResponse setBody(DescribeActivationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActivationsResponseBody getBody() {
        return this.body;
    }

}
