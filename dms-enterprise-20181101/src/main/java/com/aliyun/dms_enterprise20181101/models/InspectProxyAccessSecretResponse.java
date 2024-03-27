// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class InspectProxyAccessSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InspectProxyAccessSecretResponseBody body;

    public static InspectProxyAccessSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        InspectProxyAccessSecretResponse self = new InspectProxyAccessSecretResponse();
        return TeaModel.build(map, self);
    }

    public InspectProxyAccessSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InspectProxyAccessSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InspectProxyAccessSecretResponse setBody(InspectProxyAccessSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public InspectProxyAccessSecretResponseBody getBody() {
        return this.body;
    }

}
