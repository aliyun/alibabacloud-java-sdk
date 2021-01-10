// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateDeviceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceModelResponseBody body;

    public static UpdateDeviceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceModelResponse self = new UpdateDeviceModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceModelResponse setBody(UpdateDeviceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceModelResponseBody getBody() {
        return this.body;
    }

}
