// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateMergeRequestCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMergeRequestCommentResponseBody body;

    public static CreateMergeRequestCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestCommentResponse self = new CreateMergeRequestCommentResponse();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMergeRequestCommentResponse setBody(CreateMergeRequestCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMergeRequestCommentResponseBody getBody() {
        return this.body;
    }

}
