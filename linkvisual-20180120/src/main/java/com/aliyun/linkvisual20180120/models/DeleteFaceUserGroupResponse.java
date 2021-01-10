// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceUserGroupResponseBody body;

    public static DeleteFaceUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupResponse self = new DeleteFaceUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceUserGroupResponse setBody(DeleteFaceUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceUserGroupResponseBody getBody() {
        return this.body;
    }

}
