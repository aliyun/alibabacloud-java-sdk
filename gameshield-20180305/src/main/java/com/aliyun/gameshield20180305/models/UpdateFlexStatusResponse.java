// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexStatusResponseBody body;

    public static UpdateFlexStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexStatusResponse self = new UpdateFlexStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlexStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexStatusResponse setBody(UpdateFlexStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexStatusResponseBody getBody() {
        return this.body;
    }

}
