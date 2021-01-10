// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDetectProcessResponseBody body;

    public static DeleteDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectProcessResponse self = new DeleteDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDetectProcessResponse setBody(DeleteDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDetectProcessResponseBody getBody() {
        return this.body;
    }

}
