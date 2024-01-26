// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsersPasswordResponseBody body;

    public static DescribeUsersPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersPasswordResponse self = new DescribeUsersPasswordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsersPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsersPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsersPasswordResponse setBody(DescribeUsersPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsersPasswordResponseBody getBody() {
        return this.body;
    }

}
