// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhotosResponseBody body;

    public static GetPhotosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhotosResponse self = new GetPhotosResponse();
        return TeaModel.build(map, self);
    }

    public GetPhotosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhotosResponse setBody(GetPhotosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhotosResponseBody getBody() {
        return this.body;
    }

}
