// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRepositoryMemberResponseBody body;

    public static AddRepositoryMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRepositoryMemberResponse self = new AddRepositoryMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddRepositoryMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRepositoryMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRepositoryMemberResponse setBody(AddRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
