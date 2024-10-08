// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntegrationConfigResponseBody body;

    public static CreateIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationConfigResponse self = new CreateIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntegrationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntegrationConfigResponse setBody(CreateIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
