// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubmissionResponseBody body;

    public static CreateSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubmissionResponse self = new CreateSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubmissionResponse setBody(CreateSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubmissionResponseBody getBody() {
        return this.body;
    }

}
