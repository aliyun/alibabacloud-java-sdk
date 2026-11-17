// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeShareImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeShareImageResponseBody body;

    public static DescribeShareImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShareImageResponse self = new DescribeShareImageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShareImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShareImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeShareImageResponse setBody(DescribeShareImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShareImageResponseBody getBody() {
        return this.body;
    }

}
