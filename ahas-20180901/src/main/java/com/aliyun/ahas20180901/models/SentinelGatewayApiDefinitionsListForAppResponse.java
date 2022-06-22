// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGatewayApiDefinitionsListForAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGatewayApiDefinitionsListForAppResponseBody body;

    public static SentinelGatewayApiDefinitionsListForAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGatewayApiDefinitionsListForAppResponse self = new SentinelGatewayApiDefinitionsListForAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGatewayApiDefinitionsListForAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGatewayApiDefinitionsListForAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGatewayApiDefinitionsListForAppResponse setBody(SentinelGatewayApiDefinitionsListForAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGatewayApiDefinitionsListForAppResponseBody getBody() {
        return this.body;
    }

}
