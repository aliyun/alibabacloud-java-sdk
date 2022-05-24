// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserQuotaResponseBody body;

    public static DescribeUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaResponse self = new DescribeUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserQuotaResponse setBody(DescribeUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserQuotaResponseBody getBody() {
        return this.body;
    }

}
