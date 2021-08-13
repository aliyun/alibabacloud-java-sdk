// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceIdByIdentityResponseBody body;

    public static GetDeviceIdByIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityResponse self = new GetDeviceIdByIdentityResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceIdByIdentityResponse setBody(GetDeviceIdByIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceIdByIdentityResponseBody getBody() {
        return this.body;
    }

}
