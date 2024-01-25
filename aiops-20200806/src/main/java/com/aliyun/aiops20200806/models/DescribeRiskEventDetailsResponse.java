// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskEventDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventDetailsResponseBody body;

    public static DescribeRiskEventDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventDetailsResponse self = new DescribeRiskEventDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventDetailsResponse setBody(DescribeRiskEventDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventDetailsResponseBody getBody() {
        return this.body;
    }

}
