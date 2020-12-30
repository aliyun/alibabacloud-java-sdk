// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserGroupResponseBody body;

    public static DeleteUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupResponse self = new DeleteUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserGroupResponse setBody(DeleteUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserGroupResponseBody getBody() {
        return this.body;
    }

}
