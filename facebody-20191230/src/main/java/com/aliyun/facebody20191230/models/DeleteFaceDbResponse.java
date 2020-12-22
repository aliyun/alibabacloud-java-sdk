// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceDbResponseBody body;

    public static DeleteFaceDbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDbResponse self = new DeleteFaceDbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceDbResponse setBody(DeleteFaceDbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceDbResponseBody getBody() {
        return this.body;
    }

}
