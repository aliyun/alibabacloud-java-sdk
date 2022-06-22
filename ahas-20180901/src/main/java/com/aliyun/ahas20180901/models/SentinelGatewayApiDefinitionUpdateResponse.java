// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayApiDefinitionUpdateResponseBody body;

    public static SentinelGatewayApiDefinitionUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionUpdateResponse self = new SentinelGatewayApiDefinitionUpdateResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayApiDefinitionUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayApiDefinitionUpdateResponse setBody(SentinelGatewayApiDefinitionUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayApiDefinitionUpdateResponseBody getBody() {
        return this.body;
    }

}
