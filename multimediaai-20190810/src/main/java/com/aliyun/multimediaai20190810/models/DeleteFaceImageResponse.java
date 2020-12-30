// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFaceImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceImageResponseBody body;

    public static DeleteFaceImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceImageResponse self = new DeleteFaceImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceImageResponse setBody(DeleteFaceImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceImageResponseBody getBody() {
        return this.body;
    }

}
