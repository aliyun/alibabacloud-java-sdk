// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class FetchPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchPhotosResponseBody body;

    public static FetchPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchPhotosResponse self = new FetchPhotosResponse();
        return TeaModel.build(map, self);
    }

    public FetchPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchPhotosResponse setBody(FetchPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchPhotosResponseBody getBody() {
        return this.body;
    }

}
