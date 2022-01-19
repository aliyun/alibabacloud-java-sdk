// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteStoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStoryResponseBody body;

    public static DeleteStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoryResponse self = new DeleteStoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStoryResponse setBody(DeleteStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStoryResponseBody getBody() {
        return this.body;
    }

}
