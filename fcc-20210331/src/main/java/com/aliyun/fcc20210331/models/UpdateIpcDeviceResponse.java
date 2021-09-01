// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateIpcDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIpcDeviceResponseBody body;

    public static UpdateIpcDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpcDeviceResponse self = new UpdateIpcDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpcDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpcDeviceResponse setBody(UpdateIpcDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpcDeviceResponseBody getBody() {
        return this.body;
    }

}
