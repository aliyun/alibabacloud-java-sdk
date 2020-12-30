// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateParagraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateParagraphResponseBody body;

    public static CreateParagraphResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParagraphResponse self = new CreateParagraphResponse();
        return TeaModel.build(map, self);
    }

    public CreateParagraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParagraphResponse setBody(CreateParagraphResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParagraphResponseBody getBody() {
        return this.body;
    }

}
