// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceInfoResponseBody body;

    public static GetDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoResponse self = new GetDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceInfoResponse setBody(GetDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
