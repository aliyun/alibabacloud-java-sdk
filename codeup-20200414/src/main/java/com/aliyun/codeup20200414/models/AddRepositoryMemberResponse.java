// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class AddRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddRepositoryMemberResponse setBody(AddRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
