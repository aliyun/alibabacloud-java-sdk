// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveIntegrationConfigResponseBody body;

    public static RemoveIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIntegrationConfigResponse self = new RemoveIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveIntegrationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveIntegrationConfigResponse setBody(RemoveIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
