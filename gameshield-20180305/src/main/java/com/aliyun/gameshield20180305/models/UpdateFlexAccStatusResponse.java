// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexAccStatusResponseBody body;

    public static UpdateFlexAccStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccStatusResponse self = new UpdateFlexAccStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexAccStatusResponse setBody(UpdateFlexAccStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexAccStatusResponseBody getBody() {
        return this.body;
    }

}
