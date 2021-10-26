// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class OpenApiGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenApiGatewayServiceResponseBody body;

    public static OpenApiGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiGatewayServiceResponse self = new OpenApiGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiGatewayServiceResponse setBody(OpenApiGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
