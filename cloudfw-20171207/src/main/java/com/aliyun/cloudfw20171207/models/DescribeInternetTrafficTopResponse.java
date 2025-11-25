// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetTrafficTopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetTrafficTopResponseBody body;

    public static DescribeInternetTrafficTopResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetTrafficTopResponse self = new DescribeInternetTrafficTopResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetTrafficTopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetTrafficTopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetTrafficTopResponse setBody(DescribeInternetTrafficTopResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetTrafficTopResponseBody getBody() {
        return this.body;
    }

}
