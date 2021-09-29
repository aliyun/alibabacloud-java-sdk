// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCameraShootingRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCameraShootingRecordResponseBody body;

    public static DeleteCameraShootingRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCameraShootingRecordResponse self = new DeleteCameraShootingRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCameraShootingRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCameraShootingRecordResponse setBody(DeleteCameraShootingRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCameraShootingRecordResponseBody getBody() {
        return this.body;
    }

}
