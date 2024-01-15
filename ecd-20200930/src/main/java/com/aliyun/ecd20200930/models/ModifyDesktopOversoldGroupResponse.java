// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDesktopOversoldGroupResponseBody body;

    public static ModifyDesktopOversoldGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldGroupResponse self = new ModifyDesktopOversoldGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopOversoldGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopOversoldGroupResponse setBody(ModifyDesktopOversoldGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopOversoldGroupResponseBody getBody() {
        return this.body;
    }

}
