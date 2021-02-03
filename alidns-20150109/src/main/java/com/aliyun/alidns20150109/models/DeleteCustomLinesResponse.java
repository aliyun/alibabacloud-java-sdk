// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCustomLinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCustomLinesResponseBody body;

    public static DeleteCustomLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLinesResponse self = new DeleteCustomLinesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomLinesResponse setBody(DeleteCustomLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomLinesResponseBody getBody() {
        return this.body;
    }

}
