// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceResponseBody body;

    public static DeleteFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceResponse self = new DeleteFaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceResponse setBody(DeleteFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceResponseBody getBody() {
        return this.body;
    }

}
