// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddGatewayDomainResponseBody body;

    public static AddGatewayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayDomainResponse self = new AddGatewayDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddGatewayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGatewayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGatewayDomainResponse setBody(AddGatewayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGatewayDomainResponseBody getBody() {
        return this.body;
    }

}
