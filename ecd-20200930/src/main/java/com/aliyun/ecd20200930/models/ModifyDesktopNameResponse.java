// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDesktopNameResponseBody body;

    public static ModifyDesktopNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopNameResponse self = new ModifyDesktopNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopNameResponse setBody(ModifyDesktopNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopNameResponseBody getBody() {
        return this.body;
    }

}
