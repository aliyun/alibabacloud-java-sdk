// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateTenantStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTenantStatusResponseBody body;

    public static UpdateTenantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantStatusResponse self = new UpdateTenantStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTenantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTenantStatusResponse setBody(UpdateTenantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTenantStatusResponseBody getBody() {
        return this.body;
    }

}
