// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDeviceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceListResponseBody body;

    public static GetDeviceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceListResponse self = new GetDeviceListResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceListResponse setBody(GetDeviceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceListResponseBody getBody() {
        return this.body;
    }

}
