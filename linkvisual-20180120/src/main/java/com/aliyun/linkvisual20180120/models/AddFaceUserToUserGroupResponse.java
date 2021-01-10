// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserToUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceUserToUserGroupResponseBody body;

    public static AddFaceUserToUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserToUserGroupResponse self = new AddFaceUserToUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserToUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceUserToUserGroupResponse setBody(AddFaceUserToUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserToUserGroupResponseBody getBody() {
        return this.body;
    }

}
