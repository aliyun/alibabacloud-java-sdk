// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTlogDeviceListResponseBody body;

    public static GetTlogDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTlogDeviceListResponse self = new GetTlogDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public GetTlogDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTlogDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTlogDeviceListResponse setBody(GetTlogDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTlogDeviceListResponseBody getBody() {
        return this.body;
    }

}
