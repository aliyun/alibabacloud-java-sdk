// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFaceGroupResponseBody body;

    public static DeleteFaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceGroupResponse self = new DeleteFaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceGroupResponse setBody(DeleteFaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceGroupResponseBody getBody() {
        return this.body;
    }

}
