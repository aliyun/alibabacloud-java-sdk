// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeResourceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceQuotaResponseBody body;

    public static DescribeResourceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceQuotaResponse self = new DescribeResourceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceQuotaResponse setBody(DescribeResourceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceQuotaResponseBody getBody() {
        return this.body;
    }

}
