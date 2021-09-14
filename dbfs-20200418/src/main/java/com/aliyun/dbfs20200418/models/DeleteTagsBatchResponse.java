// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteTagsBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTagsBatchResponseBody body;

    public static DeleteTagsBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsBatchResponse self = new DeleteTagsBatchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagsBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagsBatchResponse setBody(DeleteTagsBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagsBatchResponseBody getBody() {
        return this.body;
    }

}
