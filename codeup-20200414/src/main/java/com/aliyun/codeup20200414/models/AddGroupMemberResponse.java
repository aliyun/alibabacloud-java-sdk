// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AddGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddGroupMemberResponseBody body;

    public static AddGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMemberResponse self = new AddGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGroupMemberResponse setBody(AddGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGroupMemberResponseBody getBody() {
        return this.body;
    }

}
