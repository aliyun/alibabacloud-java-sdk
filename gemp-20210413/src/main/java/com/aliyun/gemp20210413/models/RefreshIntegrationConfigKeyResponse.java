// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RefreshIntegrationConfigKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshIntegrationConfigKeyResponseBody body;

    public static RefreshIntegrationConfigKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshIntegrationConfigKeyResponse self = new RefreshIntegrationConfigKeyResponse();
        return TeaModel.build(map, self);
    }

    public RefreshIntegrationConfigKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshIntegrationConfigKeyResponse setBody(RefreshIntegrationConfigKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshIntegrationConfigKeyResponseBody getBody() {
        return this.body;
    }

}
