// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFacePersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFacePersonResponseBody body;

    public static DeleteFacePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacePersonResponse self = new DeleteFacePersonResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFacePersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFacePersonResponse setBody(DeleteFacePersonResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFacePersonResponseBody getBody() {
        return this.body;
    }

}
