// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMergeRequestCommentResponseBody body;

    public static UpdateMergeRequestCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestCommentResponse self = new UpdateMergeRequestCommentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMergeRequestCommentResponse setBody(UpdateMergeRequestCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMergeRequestCommentResponseBody getBody() {
        return this.body;
    }

}
