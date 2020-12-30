// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RemoveFacePhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveFacePhotosResponseBody body;

    public static RemoveFacePhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveFacePhotosResponse self = new RemoveFacePhotosResponse();
        return TeaModel.build(map, self);
    }

    public RemoveFacePhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveFacePhotosResponse setBody(RemoveFacePhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveFacePhotosResponseBody getBody() {
        return this.body;
    }

}
