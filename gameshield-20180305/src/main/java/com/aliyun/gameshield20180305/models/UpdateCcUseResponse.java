// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcUseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcUseResponseBody body;

    public static UpdateCcUseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcUseResponse self = new UpdateCcUseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcUseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcUseResponse setBody(UpdateCcUseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcUseResponseBody getBody() {
        return this.body;
    }

}
