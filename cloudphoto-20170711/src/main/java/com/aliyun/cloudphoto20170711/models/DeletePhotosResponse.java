// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeletePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePhotosResponseBody body;

    public static DeletePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhotosResponse self = new DeletePhotosResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhotosResponse setBody(DeletePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhotosResponseBody getBody() {
        return this.body;
    }

}
