// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RevokeUserDeviceSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeUserDeviceSessionResponseBody body;

    public static RevokeUserDeviceSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeUserDeviceSessionResponse self = new RevokeUserDeviceSessionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeUserDeviceSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeUserDeviceSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeUserDeviceSessionResponse setBody(RevokeUserDeviceSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeUserDeviceSessionResponseBody getBody() {
        return this.body;
    }

}
