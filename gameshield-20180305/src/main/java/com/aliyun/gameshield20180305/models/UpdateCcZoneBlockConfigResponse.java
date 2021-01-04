// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcZoneBlockConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcZoneBlockConfigResponseBody body;

    public static UpdateCcZoneBlockConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcZoneBlockConfigResponse self = new UpdateCcZoneBlockConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcZoneBlockConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcZoneBlockConfigResponse setBody(UpdateCcZoneBlockConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcZoneBlockConfigResponseBody getBody() {
        return this.body;
    }

}
