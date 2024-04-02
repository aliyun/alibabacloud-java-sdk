// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageFromLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageFromLibResponseBody body;

    public static DescribeImageFromLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromLibResponse self = new DescribeImageFromLibResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageFromLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageFromLibResponse setBody(DescribeImageFromLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageFromLibResponseBody getBody() {
        return this.body;
    }

}
