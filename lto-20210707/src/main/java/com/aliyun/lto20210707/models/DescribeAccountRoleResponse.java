// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountRoleResponseBody body;

    public static DescribeAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRoleResponse self = new DescribeAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountRoleResponse setBody(DescribeAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountRoleResponseBody getBody() {
        return this.body;
    }

}
