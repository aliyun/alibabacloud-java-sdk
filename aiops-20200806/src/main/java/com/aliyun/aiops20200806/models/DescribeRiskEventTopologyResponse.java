// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventTopologyResponseBody body;

    public static DescribeRiskEventTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopologyResponse self = new DescribeRiskEventTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventTopologyResponse setBody(DescribeRiskEventTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventTopologyResponseBody getBody() {
        return this.body;
    }

}
