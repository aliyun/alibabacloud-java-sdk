// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveUserGroupResponseBody body;

    public static SaveUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveUserGroupResponse self = new SaveUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public SaveUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveUserGroupResponse setBody(SaveUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveUserGroupResponseBody getBody() {
        return this.body;
    }

}
