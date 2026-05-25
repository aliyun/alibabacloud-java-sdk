// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTlogDeviceInfoResponseBody body;

    public static GetTlogDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTlogDeviceInfoResponse self = new GetTlogDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTlogDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTlogDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTlogDeviceInfoResponse setBody(GetTlogDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTlogDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
