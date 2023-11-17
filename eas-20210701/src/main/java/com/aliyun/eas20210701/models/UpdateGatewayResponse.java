// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayResponseBody body;

    public static UpdateGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayResponse self = new UpdateGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayResponse setBody(UpdateGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayResponseBody getBody() {
        return this.body;
    }

}
