// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesktopGroupResponseBody body;

    public static ModifyDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopGroupResponse self = new ModifyDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopGroupResponse setBody(ModifyDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
