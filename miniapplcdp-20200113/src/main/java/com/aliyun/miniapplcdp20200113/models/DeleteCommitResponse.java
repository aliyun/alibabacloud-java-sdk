// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteCommitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCommitResponseBody body;

    public static DeleteCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommitResponse self = new DeleteCommitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCommitResponse setBody(DeleteCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCommitResponseBody getBody() {
        return this.body;
    }

}
