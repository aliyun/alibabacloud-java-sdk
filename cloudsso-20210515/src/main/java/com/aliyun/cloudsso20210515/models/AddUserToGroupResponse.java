// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserToGroupResponseBody body;

    public static AddUserToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupResponse self = new AddUserToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserToGroupResponse setBody(AddUserToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToGroupResponseBody getBody() {
        return this.body;
    }

}
