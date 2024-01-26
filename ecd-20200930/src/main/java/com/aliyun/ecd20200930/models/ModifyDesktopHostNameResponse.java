// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopHostNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesktopHostNameResponseBody body;

    public static ModifyDesktopHostNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopHostNameResponse self = new ModifyDesktopHostNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopHostNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopHostNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopHostNameResponse setBody(ModifyDesktopHostNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopHostNameResponseBody getBody() {
        return this.body;
    }

}
