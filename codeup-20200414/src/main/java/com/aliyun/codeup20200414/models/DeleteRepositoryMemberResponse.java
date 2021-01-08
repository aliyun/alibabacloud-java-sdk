// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryMemberResponseBody body;

    public static DeleteRepositoryMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberResponse self = new DeleteRepositoryMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryMemberResponse setBody(DeleteRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
