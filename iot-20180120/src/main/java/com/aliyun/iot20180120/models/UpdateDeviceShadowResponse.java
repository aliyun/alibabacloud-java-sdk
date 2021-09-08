// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceShadowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceShadowResponseBody body;

    public static UpdateDeviceShadowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceShadowResponse self = new UpdateDeviceShadowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceShadowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceShadowResponse setBody(UpdateDeviceShadowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceShadowResponseBody getBody() {
        return this.body;
    }

}
