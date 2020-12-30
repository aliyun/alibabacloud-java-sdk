// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUserGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserGroupListResponseBody body;

    public static DescribeUserGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserGroupListResponse self = new DescribeUserGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserGroupListResponse setBody(DescribeUserGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserGroupListResponseBody getBody() {
        return this.body;
    }

}
