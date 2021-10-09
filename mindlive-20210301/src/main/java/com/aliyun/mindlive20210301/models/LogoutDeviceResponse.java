// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class LogoutDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LogoutDeviceResponseBody body;

    public static LogoutDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        LogoutDeviceResponse self = new LogoutDeviceResponse();
        return TeaModel.build(map, self);
    }

    public LogoutDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogoutDeviceResponse setBody(LogoutDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public LogoutDeviceResponseBody getBody() {
        return this.body;
    }

}
