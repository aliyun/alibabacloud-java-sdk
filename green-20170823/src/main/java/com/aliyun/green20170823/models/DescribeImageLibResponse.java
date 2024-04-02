// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageLibResponseBody body;

    public static DescribeImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageLibResponse self = new DescribeImageLibResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageLibResponse setBody(DescribeImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageLibResponseBody getBody() {
        return this.body;
    }

}
