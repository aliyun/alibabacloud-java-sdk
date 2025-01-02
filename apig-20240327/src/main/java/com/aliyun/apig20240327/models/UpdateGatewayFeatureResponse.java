// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayFeatureResponseBody body;

    public static UpdateGatewayFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFeatureResponse self = new UpdateGatewayFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayFeatureResponse setBody(UpdateGatewayFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayFeatureResponseBody getBody() {
        return this.body;
    }

}
