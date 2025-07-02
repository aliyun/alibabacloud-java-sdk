// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupUserResponseBody body;

    public static DescribeGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupUserResponse self = new DescribeGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupUserResponse setBody(DescribeGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupUserResponseBody getBody() {
        return this.body;
    }

}
