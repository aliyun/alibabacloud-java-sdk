// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAppliesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppliesResponseBody body;

    public static DescribeAppliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliesResponse self = new DescribeAppliesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppliesResponse setBody(DescribeAppliesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppliesResponseBody getBody() {
        return this.body;
    }

}
