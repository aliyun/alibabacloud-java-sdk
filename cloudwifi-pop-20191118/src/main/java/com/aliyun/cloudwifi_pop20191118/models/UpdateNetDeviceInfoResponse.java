// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class UpdateNetDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNetDeviceInfoResponseBody body;

    public static UpdateNetDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetDeviceInfoResponse self = new UpdateNetDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetDeviceInfoResponse setBody(UpdateNetDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
