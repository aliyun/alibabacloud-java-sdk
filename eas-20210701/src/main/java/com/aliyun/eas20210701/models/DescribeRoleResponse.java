// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRoleResponseBody body;

    public static DescribeRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleResponse self = new DescribeRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoleResponse setBody(DescribeRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoleResponseBody getBody() {
        return this.body;
    }

}
