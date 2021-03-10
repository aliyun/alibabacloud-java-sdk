// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelValidationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateThingModelValidationConfigResponseBody body;

    public static UpdateThingModelValidationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelValidationConfigResponse self = new UpdateThingModelValidationConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThingModelValidationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateThingModelValidationConfigResponse setBody(UpdateThingModelValidationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateThingModelValidationConfigResponseBody getBody() {
        return this.body;
    }

}
