// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayServiceResponseBody body;

    public static UpdateGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayServiceResponse self = new UpdateGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayServiceResponse setBody(UpdateGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
