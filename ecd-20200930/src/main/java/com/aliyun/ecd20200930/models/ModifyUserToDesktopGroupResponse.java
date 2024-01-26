// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyUserToDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserToDesktopGroupResponseBody body;

    public static ModifyUserToDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserToDesktopGroupResponse self = new ModifyUserToDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserToDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserToDesktopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserToDesktopGroupResponse setBody(ModifyUserToDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserToDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
