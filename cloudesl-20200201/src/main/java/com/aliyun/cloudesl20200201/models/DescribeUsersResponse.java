// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUsersResponseBody body;

    public static DescribeUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersResponse self = new DescribeUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsersResponse setBody(DescribeUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsersResponseBody getBody() {
        return this.body;
    }

}
