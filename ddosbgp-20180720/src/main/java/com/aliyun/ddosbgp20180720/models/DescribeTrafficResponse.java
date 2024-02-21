// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrafficResponseBody body;

    public static DescribeTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficResponse self = new DescribeTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrafficResponse setBody(DescribeTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrafficResponseBody getBody() {
        return this.body;
    }

}
