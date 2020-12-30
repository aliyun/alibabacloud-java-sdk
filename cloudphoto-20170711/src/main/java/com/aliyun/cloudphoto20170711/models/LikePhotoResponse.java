// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class LikePhotoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LikePhotoResponseBody body;

    public static LikePhotoResponse build(java.util.Map<String, ?> map) throws Exception {
        LikePhotoResponse self = new LikePhotoResponse();
        return TeaModel.build(map, self);
    }

    public LikePhotoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LikePhotoResponse setBody(LikePhotoResponseBody body) {
        this.body = body;
        return this;
    }
    public LikePhotoResponseBody getBody() {
        return this.body;
    }

}
