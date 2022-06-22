// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayApiDefinitionDeleteResponseBody body;

    public static SentinelGatewayApiDefinitionDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionDeleteResponse self = new SentinelGatewayApiDefinitionDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayApiDefinitionDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayApiDefinitionDeleteResponse setBody(SentinelGatewayApiDefinitionDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayApiDefinitionDeleteResponseBody getBody() {
        return this.body;
    }

}
