// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcRouteSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcRouteSwitchResponseBody body;

    public static UpdateCcRouteSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcRouteSwitchResponse self = new UpdateCcRouteSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcRouteSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcRouteSwitchResponse setBody(UpdateCcRouteSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcRouteSwitchResponseBody getBody() {
        return this.body;
    }

}
