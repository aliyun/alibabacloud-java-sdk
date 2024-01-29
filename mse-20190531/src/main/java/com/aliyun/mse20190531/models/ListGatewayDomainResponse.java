// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayDomainResponseBody body;

    public static ListGatewayDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayDomainResponse self = new ListGatewayDomainResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayDomainResponse setBody(ListGatewayDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayDomainResponseBody getBody() {
        return this.body;
    }

}
