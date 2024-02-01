// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddFaceUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceUserGroupResponse setBody(AddFaceUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserGroupResponseBody getBody() {
        return this.body;
    }

}
