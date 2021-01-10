// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceUserResponseBody body;

    public static DeleteFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserResponse self = new DeleteFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceUserResponse setBody(DeleteFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceUserResponseBody getBody() {
        return this.body;
    }

}
