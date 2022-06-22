// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GatewayProtectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GatewayProtectionsResponseBody body;

    public static GatewayProtectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GatewayProtectionsResponse self = new GatewayProtectionsResponse();
        return TeaModel.build(map, self);
    }

    public GatewayProtectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GatewayProtectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GatewayProtectionsResponse setBody(GatewayProtectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GatewayProtectionsResponseBody getBody() {
        return this.body;
    }

}
