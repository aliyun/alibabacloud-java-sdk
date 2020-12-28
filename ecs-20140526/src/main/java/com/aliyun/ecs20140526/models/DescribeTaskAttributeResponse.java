// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTaskAttributeResponseBody body;

    public static DescribeTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskAttributeResponse self = new DescribeTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskAttributeResponse setBody(DescribeTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
