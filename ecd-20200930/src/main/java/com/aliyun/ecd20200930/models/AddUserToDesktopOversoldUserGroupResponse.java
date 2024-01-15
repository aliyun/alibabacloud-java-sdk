// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopOversoldUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserToDesktopOversoldUserGroupResponseBody body;

    public static AddUserToDesktopOversoldUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopOversoldUserGroupResponse self = new AddUserToDesktopOversoldUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopOversoldUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToDesktopOversoldUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToDesktopOversoldUserGroupResponse setBody(AddUserToDesktopOversoldUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToDesktopOversoldUserGroupResponseBody getBody() {
        return this.body;
    }

}
