// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIntegrationConfigResponseBody body;

    public static DeleteIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationConfigResponse self = new DeleteIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIntegrationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIntegrationConfigResponse setBody(DeleteIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
