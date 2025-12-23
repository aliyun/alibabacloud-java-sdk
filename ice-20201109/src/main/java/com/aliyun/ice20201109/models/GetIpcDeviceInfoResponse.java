// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetIpcDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIpcDeviceInfoResponseBody body;

    public static GetIpcDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpcDeviceInfoResponse self = new GetIpcDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetIpcDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpcDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIpcDeviceInfoResponse setBody(GetIpcDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpcDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
