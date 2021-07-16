// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIntegrationConfigResponseBody body;

    public static UpdateIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationConfigResponse self = new UpdateIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIntegrationConfigResponse setBody(UpdateIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
