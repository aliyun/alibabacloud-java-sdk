// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetDeviceIdByIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceIdByIdentityResponse setBody(GetDeviceIdByIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceIdByIdentityResponseBody getBody() {
        return this.body;
    }

}
