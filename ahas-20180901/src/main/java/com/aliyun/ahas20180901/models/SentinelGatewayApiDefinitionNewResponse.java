// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayApiDefinitionNewResponseBody body;

    public static SentinelGatewayApiDefinitionNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionNewResponse self = new SentinelGatewayApiDefinitionNewResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayApiDefinitionNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayApiDefinitionNewResponse setBody(SentinelGatewayApiDefinitionNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayApiDefinitionNewResponseBody getBody() {
        return this.body;
    }

}
