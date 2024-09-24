// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeOrgsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOrgsResponseBody body;

    public static DescribeOrgsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgsResponse self = new DescribeOrgsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOrgsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOrgsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOrgsResponse setBody(DescribeOrgsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOrgsResponseBody getBody() {
        return this.body;
    }

}
