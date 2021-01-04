// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcZoneBlockStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcZoneBlockStatusResponseBody body;

    public static UpdateCcZoneBlockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcZoneBlockStatusResponse self = new UpdateCcZoneBlockStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcZoneBlockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcZoneBlockStatusResponse setBody(UpdateCcZoneBlockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcZoneBlockStatusResponseBody getBody() {
        return this.body;
    }

}
