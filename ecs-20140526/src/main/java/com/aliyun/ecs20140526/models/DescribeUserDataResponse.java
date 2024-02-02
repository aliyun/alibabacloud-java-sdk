// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserDataResponseBody body;

    public static DescribeUserDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDataResponse self = new DescribeUserDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserDataResponse setBody(DescribeUserDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDataResponseBody getBody() {
        return this.body;
    }

}
