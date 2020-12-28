// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDemandsResponseBody body;

    public static DescribeDemandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDemandsResponse self = new DescribeDemandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDemandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDemandsResponse setBody(DescribeDemandsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDemandsResponseBody getBody() {
        return this.body;
    }

}
