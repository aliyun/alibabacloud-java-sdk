// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class UpdateAlertContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAlertContactResponseBody body;

    public static UpdateAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactResponse self = new UpdateAlertContactResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertContactResponse setBody(UpdateAlertContactResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertContactResponseBody getBody() {
        return this.body;
    }

}
