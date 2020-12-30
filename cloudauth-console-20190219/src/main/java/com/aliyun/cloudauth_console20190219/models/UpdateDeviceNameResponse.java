// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateDeviceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceNameResponseBody body;

    public static UpdateDeviceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceNameResponse self = new UpdateDeviceNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceNameResponse setBody(UpdateDeviceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceNameResponseBody getBody() {
        return this.body;
    }

}
