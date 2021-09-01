// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteCorpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCorpResponseBody body;

    public static DeleteCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCorpResponse self = new DeleteCorpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCorpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCorpResponse setBody(DeleteCorpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCorpResponseBody getBody() {
        return this.body;
    }

}
