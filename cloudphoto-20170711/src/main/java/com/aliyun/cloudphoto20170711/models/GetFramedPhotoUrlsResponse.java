// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetFramedPhotoUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFramedPhotoUrlsResponseBody body;

    public static GetFramedPhotoUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFramedPhotoUrlsResponse self = new GetFramedPhotoUrlsResponse();
        return TeaModel.build(map, self);
    }

    public GetFramedPhotoUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFramedPhotoUrlsResponse setBody(GetFramedPhotoUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFramedPhotoUrlsResponseBody getBody() {
        return this.body;
    }

}
