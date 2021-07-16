// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableIntegrationConfigResponseBody body;

    public static DisableIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableIntegrationConfigResponse self = new DisableIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DisableIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableIntegrationConfigResponse setBody(DisableIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
