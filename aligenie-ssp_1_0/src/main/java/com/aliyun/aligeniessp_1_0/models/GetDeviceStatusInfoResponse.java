// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceStatusInfoResponseBody body;

    public static GetDeviceStatusInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusInfoResponse self = new GetDeviceStatusInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceStatusInfoResponse setBody(GetDeviceStatusInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceStatusInfoResponseBody getBody() {
        return this.body;
    }

}
