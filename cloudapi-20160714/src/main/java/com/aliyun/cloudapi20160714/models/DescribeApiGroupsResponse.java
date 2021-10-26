// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApiGroupsResponseBody body;

    public static DescribeApiGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupsResponse self = new DescribeApiGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupsResponse setBody(DescribeApiGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupsResponseBody getBody() {
        return this.body;
    }

}
