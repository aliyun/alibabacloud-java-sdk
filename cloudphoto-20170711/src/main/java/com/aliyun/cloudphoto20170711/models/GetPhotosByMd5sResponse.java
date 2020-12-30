// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotosByMd5sResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhotosByMd5sResponseBody body;

    public static GetPhotosByMd5sResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhotosByMd5sResponse self = new GetPhotosByMd5sResponse();
        return TeaModel.build(map, self);
    }

    public GetPhotosByMd5sResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhotosByMd5sResponse setBody(GetPhotosByMd5sResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhotosByMd5sResponseBody getBody() {
        return this.body;
    }

}
