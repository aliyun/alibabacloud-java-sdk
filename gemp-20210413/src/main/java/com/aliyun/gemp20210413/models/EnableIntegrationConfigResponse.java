// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableIntegrationConfigResponseBody body;

    public static EnableIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableIntegrationConfigResponse self = new EnableIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public EnableIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableIntegrationConfigResponse setBody(EnableIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
