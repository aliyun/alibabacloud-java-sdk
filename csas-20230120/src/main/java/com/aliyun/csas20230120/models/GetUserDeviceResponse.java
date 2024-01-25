// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserDeviceResponseBody body;

    public static GetUserDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceResponse self = new GetUserDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserDeviceResponse setBody(GetUserDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDeviceResponseBody getBody() {
        return this.body;
    }

}
