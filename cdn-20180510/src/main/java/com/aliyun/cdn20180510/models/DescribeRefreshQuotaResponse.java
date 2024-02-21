// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRefreshQuotaResponseBody body;

    public static DescribeRefreshQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshQuotaResponse self = new DescribeRefreshQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRefreshQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRefreshQuotaResponse setBody(DescribeRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
