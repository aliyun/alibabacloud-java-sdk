// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventPayloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskEventPayloadResponseBody body;

    public static DescribeRiskEventPayloadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventPayloadResponse self = new DescribeRiskEventPayloadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventPayloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskEventPayloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskEventPayloadResponse setBody(DescribeRiskEventPayloadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskEventPayloadResponseBody getBody() {
        return this.body;
    }

}
