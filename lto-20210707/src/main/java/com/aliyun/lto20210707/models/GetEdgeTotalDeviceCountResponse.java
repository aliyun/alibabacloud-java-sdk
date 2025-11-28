// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class GetEdgeTotalDeviceCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEdgeTotalDeviceCountResponseBody body;

    public static GetEdgeTotalDeviceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTotalDeviceCountResponse self = new GetEdgeTotalDeviceCountResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeTotalDeviceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEdgeTotalDeviceCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEdgeTotalDeviceCountResponse setBody(GetEdgeTotalDeviceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEdgeTotalDeviceCountResponseBody getBody() {
        return this.body;
    }

}
