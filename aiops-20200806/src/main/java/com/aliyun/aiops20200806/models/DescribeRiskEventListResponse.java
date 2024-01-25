// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventListResponseBody body;

    public static DescribeRiskEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventListResponse self = new DescribeRiskEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventListResponse setBody(DescribeRiskEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventListResponseBody getBody() {
        return this.body;
    }

}
