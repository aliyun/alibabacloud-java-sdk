// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSubmissionResponseBody body;

    public static DeleteSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubmissionResponse self = new DeleteSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubmissionResponse setBody(DeleteSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubmissionResponseBody getBody() {
        return this.body;
    }

}
