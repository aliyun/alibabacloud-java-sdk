// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopTimerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDesktopTimerResponseBody body;

    public static ModifyDesktopTimerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopTimerResponse self = new ModifyDesktopTimerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopTimerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopTimerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopTimerResponse setBody(ModifyDesktopTimerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopTimerResponseBody getBody() {
        return this.body;
    }

}
