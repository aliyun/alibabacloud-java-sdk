// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNoteResponseBody body;

    public static UpdateNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNoteResponse self = new UpdateNoteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNoteResponse setBody(UpdateNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNoteResponseBody getBody() {
        return this.body;
    }

}
