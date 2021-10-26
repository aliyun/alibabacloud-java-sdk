// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiGroupResponseBody body;

    public static DescribeApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupResponse self = new DescribeApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupResponse setBody(DescribeApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupResponseBody getBody() {
        return this.body;
    }

}
