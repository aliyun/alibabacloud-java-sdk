// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddMemberRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMemberRoleResponseBody body;

    public static AddMemberRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMemberRoleResponse self = new AddMemberRoleResponse();
        return TeaModel.build(map, self);
    }

    public AddMemberRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMemberRoleResponse setBody(AddMemberRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMemberRoleResponseBody getBody() {
        return this.body;
    }

}
