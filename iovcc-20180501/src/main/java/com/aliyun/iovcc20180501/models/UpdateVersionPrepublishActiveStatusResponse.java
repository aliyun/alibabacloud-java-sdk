// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateVersionPrepublishActiveStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVersionPrepublishActiveStatusResponseBody body;

    public static UpdateVersionPrepublishActiveStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionPrepublishActiveStatusResponse self = new UpdateVersionPrepublishActiveStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVersionPrepublishActiveStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVersionPrepublishActiveStatusResponse setBody(UpdateVersionPrepublishActiveStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVersionPrepublishActiveStatusResponseBody getBody() {
        return this.body;
    }

}
