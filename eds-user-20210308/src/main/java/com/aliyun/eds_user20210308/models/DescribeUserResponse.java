// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserResponseBody body;

    public static DescribeUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResponse self = new DescribeUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserResponse setBody(DescribeUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserResponseBody getBody() {
        return this.body;
    }

}
