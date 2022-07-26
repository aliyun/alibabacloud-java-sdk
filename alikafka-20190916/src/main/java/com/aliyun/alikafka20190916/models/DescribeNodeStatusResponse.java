// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeNodeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeStatusResponseBody body;

    public static DescribeNodeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeStatusResponse self = new DescribeNodeStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeStatusResponse setBody(DescribeNodeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeStatusResponseBody getBody() {
        return this.body;
    }

}
