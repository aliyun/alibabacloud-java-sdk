// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIntegrationResponseBody body;

    public static UpdateIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationResponse self = new UpdateIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIntegrationResponse setBody(UpdateIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntegrationResponseBody getBody() {
        return this.body;
    }

}
