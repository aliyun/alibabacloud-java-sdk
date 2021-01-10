// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddFaceUserGroupResponseBody body;

    public static AddFaceUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupResponse self = new AddFaceUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceUserGroupResponse setBody(AddFaceUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserGroupResponseBody getBody() {
        return this.body;
    }

}
