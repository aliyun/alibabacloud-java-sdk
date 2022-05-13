// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserToDesktopGroupResponseBody body;

    public static AddUserToDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopGroupResponse self = new AddUserToDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToDesktopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToDesktopGroupResponse setBody(AddUserToDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
