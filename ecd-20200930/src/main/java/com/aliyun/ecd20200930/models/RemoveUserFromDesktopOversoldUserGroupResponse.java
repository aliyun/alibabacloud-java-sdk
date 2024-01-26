// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopOversoldUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserFromDesktopOversoldUserGroupResponseBody body;

    public static RemoveUserFromDesktopOversoldUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopOversoldUserGroupResponse self = new RemoveUserFromDesktopOversoldUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopOversoldUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserFromDesktopOversoldUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserFromDesktopOversoldUserGroupResponse setBody(RemoveUserFromDesktopOversoldUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserFromDesktopOversoldUserGroupResponseBody getBody() {
        return this.body;
    }

}
