// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConstantsResponseBody body;

    public static DeleteConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConstantsResponse self = new DeleteConstantsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConstantsResponse setBody(DeleteConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConstantsResponseBody getBody() {
        return this.body;
    }

}
