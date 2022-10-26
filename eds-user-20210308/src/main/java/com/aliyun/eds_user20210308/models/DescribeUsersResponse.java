// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public DescribeUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsersResponse setBody(DescribeUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsersResponseBody getBody() {
        return this.body;
    }

}
