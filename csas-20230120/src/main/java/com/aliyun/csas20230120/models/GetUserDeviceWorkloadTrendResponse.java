// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceWorkloadTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserDeviceWorkloadTrendResponseBody body;

    public static GetUserDeviceWorkloadTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceWorkloadTrendResponse self = new GetUserDeviceWorkloadTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceWorkloadTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDeviceWorkloadTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserDeviceWorkloadTrendResponse setBody(GetUserDeviceWorkloadTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDeviceWorkloadTrendResponseBody getBody() {
        return this.body;
    }

}
