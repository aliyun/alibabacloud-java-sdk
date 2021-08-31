// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteResourceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceMemberResponseBody body;

    public static DeleteResourceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceMemberResponse self = new DeleteResourceMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceMemberResponse setBody(DeleteResourceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceMemberResponseBody getBody() {
        return this.body;
    }

}
