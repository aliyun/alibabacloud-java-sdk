// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntRegionsResponseBody body;

    public static DescribeAntRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntRegionsResponse self = new DescribeAntRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntRegionsResponse setBody(DescribeAntRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntRegionsResponseBody getBody() {
        return this.body;
    }

}
