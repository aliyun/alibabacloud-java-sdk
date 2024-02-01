// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteFaceUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceUserGroupResponse setBody(DeleteFaceUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceUserGroupResponseBody getBody() {
        return this.body;
    }

}
