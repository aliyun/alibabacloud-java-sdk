// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceQpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceQpsResponseBody body;

    public static DescribeInstanceQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceQpsResponse self = new DescribeInstanceQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceQpsResponse setBody(DescribeInstanceQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceQpsResponseBody getBody() {
        return this.body;
    }

}
