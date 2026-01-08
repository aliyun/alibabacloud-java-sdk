// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGroupResponseBody body;

    public static AddGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupResponse self = new AddGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupResponse setBody(AddGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupResponseBody getBody() {
        return this.body;
    }

}
