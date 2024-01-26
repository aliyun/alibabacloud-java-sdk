// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDesktopOversoldUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDesktopOversoldUserGroupResponseBody body;

    public static AddDesktopOversoldUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDesktopOversoldUserGroupResponse self = new AddDesktopOversoldUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddDesktopOversoldUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDesktopOversoldUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDesktopOversoldUserGroupResponse setBody(AddDesktopOversoldUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDesktopOversoldUserGroupResponseBody getBody() {
        return this.body;
    }

}
