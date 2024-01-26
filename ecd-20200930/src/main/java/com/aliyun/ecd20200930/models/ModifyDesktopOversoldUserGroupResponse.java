// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDesktopOversoldUserGroupResponseBody body;

    public static ModifyDesktopOversoldUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldUserGroupResponse self = new ModifyDesktopOversoldUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDesktopOversoldUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDesktopOversoldUserGroupResponse setBody(ModifyDesktopOversoldUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDesktopOversoldUserGroupResponseBody getBody() {
        return this.body;
    }

}
