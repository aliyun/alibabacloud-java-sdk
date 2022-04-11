// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdentityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceIdentityResponseBody body;

    public static GetDeviceIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdentityResponse self = new GetDeviceIdentityResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceIdentityResponse setBody(GetDeviceIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceIdentityResponseBody getBody() {
        return this.body;
    }

}
