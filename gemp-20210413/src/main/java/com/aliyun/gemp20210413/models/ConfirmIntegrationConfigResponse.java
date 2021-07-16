// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ConfirmIntegrationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmIntegrationConfigResponseBody body;

    public static ConfirmIntegrationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIntegrationConfigResponse self = new ConfirmIntegrationConfigResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmIntegrationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmIntegrationConfigResponse setBody(ConfirmIntegrationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmIntegrationConfigResponseBody getBody() {
        return this.body;
    }

}
