// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskConfigResponseBody body;

    public static DescribeRiskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskConfigResponse self = new DescribeRiskConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskConfigResponse setBody(DescribeRiskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskConfigResponseBody getBody() {
        return this.body;
    }

}
