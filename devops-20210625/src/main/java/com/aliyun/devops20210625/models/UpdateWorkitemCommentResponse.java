// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkitemCommentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkitemCommentResponseBody body;

    public static UpdateWorkitemCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemCommentResponse self = new UpdateWorkitemCommentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkitemCommentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkitemCommentResponse setBody(UpdateWorkitemCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkitemCommentResponseBody getBody() {
        return this.body;
    }

}
