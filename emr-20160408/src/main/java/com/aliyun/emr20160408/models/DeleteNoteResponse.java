// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNoteResponseBody body;

    public static DeleteNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNoteResponse self = new DeleteNoteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNoteResponse setBody(DeleteNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNoteResponseBody getBody() {
        return this.body;
    }

}
