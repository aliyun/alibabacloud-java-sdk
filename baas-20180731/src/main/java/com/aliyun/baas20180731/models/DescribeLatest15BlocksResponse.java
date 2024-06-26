// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeLatest15BlocksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLatest15BlocksResponseBody body;

    public static DescribeLatest15BlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatest15BlocksResponse self = new DescribeLatest15BlocksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatest15BlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatest15BlocksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatest15BlocksResponse setBody(DescribeLatest15BlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatest15BlocksResponseBody getBody() {
        return this.body;
    }

}
