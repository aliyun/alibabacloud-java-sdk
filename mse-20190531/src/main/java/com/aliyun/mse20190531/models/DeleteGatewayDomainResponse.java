// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayDomainResponseBody body;

    public static DeleteGatewayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayDomainResponse self = new DeleteGatewayDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayDomainResponse setBody(DeleteGatewayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayDomainResponseBody getBody() {
        return this.body;
    }

}
