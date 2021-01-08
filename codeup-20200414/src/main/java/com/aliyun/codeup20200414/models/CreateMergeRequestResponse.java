// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMergeRequestResponseBody body;

    public static CreateMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestResponse self = new CreateMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMergeRequestResponse setBody(CreateMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMergeRequestResponseBody getBody() {
        return this.body;
    }

}
