// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayDomainResponseBody body;

    public static UpdateGatewayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayDomainResponse self = new UpdateGatewayDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayDomainResponse setBody(UpdateGatewayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayDomainResponseBody getBody() {
        return this.body;
    }

}
