// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ExportGatewayApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportGatewayApisResponseBody body;

    public static ExportGatewayApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportGatewayApisResponse self = new ExportGatewayApisResponse();
        return TeaModel.build(map, self);
    }

    public ExportGatewayApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportGatewayApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportGatewayApisResponse setBody(ExportGatewayApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportGatewayApisResponseBody getBody() {
        return this.body;
    }

}
