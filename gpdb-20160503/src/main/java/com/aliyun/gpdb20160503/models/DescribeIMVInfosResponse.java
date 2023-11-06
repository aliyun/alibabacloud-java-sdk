// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeIMVInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIMVInfosResponseBody body;

    public static DescribeIMVInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMVInfosResponse self = new DescribeIMVInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIMVInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIMVInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIMVInfosResponse setBody(DescribeIMVInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIMVInfosResponseBody getBody() {
        return this.body;
    }

}
