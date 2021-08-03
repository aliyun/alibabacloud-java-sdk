// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveUserFromDesktopGroupResponseBody body;

    public static RemoveUserFromDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopGroupResponse self = new RemoveUserFromDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserFromDesktopGroupResponse setBody(RemoveUserFromDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserFromDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
