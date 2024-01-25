// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ResetDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDeviceResponseBody body;

    public static ResetDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceResponse self = new ResetDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ResetDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDeviceResponse setBody(ResetDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDeviceResponseBody getBody() {
        return this.body;
    }

}
