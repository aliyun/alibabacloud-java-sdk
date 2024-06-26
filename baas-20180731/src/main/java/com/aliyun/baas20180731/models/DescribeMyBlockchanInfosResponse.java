// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMyBlockchanInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMyBlockchanInfosResponseBody body;

    public static DescribeMyBlockchanInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBlockchanInfosResponse self = new DescribeMyBlockchanInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMyBlockchanInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMyBlockchanInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMyBlockchanInfosResponse setBody(DescribeMyBlockchanInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMyBlockchanInfosResponseBody getBody() {
        return this.body;
    }

}
