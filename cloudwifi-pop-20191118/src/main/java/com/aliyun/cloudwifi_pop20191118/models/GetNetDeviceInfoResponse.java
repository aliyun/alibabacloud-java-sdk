// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNetDeviceInfoResponseBody body;

    public static GetNetDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoResponse self = new GetNetDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetNetDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNetDeviceInfoResponse setBody(GetNetDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNetDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
