// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNoteResponseBody body;

    public static CreateNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNoteResponse self = new CreateNoteResponse();
        return TeaModel.build(map, self);
    }

    public CreateNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNoteResponse setBody(CreateNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNoteResponseBody getBody() {
        return this.body;
    }

}
