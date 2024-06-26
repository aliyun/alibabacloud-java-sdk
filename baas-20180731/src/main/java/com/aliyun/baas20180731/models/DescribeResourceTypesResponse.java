// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeResourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceTypesResponseBody body;

    public static DescribeResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypesResponse self = new DescribeResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceTypesResponse setBody(DescribeResourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceTypesResponseBody getBody() {
        return this.body;
    }

}
