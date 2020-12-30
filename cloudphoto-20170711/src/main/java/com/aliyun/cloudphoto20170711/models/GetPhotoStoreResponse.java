// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotoStoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhotoStoreResponseBody body;

    public static GetPhotoStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhotoStoreResponse self = new GetPhotoStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetPhotoStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhotoStoreResponse setBody(GetPhotoStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhotoStoreResponseBody getBody() {
        return this.body;
    }

}
