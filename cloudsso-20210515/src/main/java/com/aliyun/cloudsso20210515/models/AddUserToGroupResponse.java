// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddUserToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserToGroupResponse setBody(AddUserToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserToGroupResponseBody getBody() {
        return this.body;
    }

}
