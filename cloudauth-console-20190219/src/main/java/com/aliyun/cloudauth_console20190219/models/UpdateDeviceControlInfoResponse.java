// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateDeviceControlInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceControlInfoResponseBody body;

    public static UpdateDeviceControlInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceControlInfoResponse self = new UpdateDeviceControlInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceControlInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceControlInfoResponse setBody(UpdateDeviceControlInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceControlInfoResponseBody getBody() {
        return this.body;
    }

}
