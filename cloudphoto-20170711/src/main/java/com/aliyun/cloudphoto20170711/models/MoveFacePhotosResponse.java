// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class MoveFacePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveFacePhotosResponseBody body;

    public static MoveFacePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveFacePhotosResponse self = new MoveFacePhotosResponse();
        return TeaModel.build(map, self);
    }

    public MoveFacePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveFacePhotosResponse setBody(MoveFacePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveFacePhotosResponseBody getBody() {
        return this.body;
    }

}
