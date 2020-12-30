// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetThumbnailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetThumbnailResponseBody body;

    public static GetThumbnailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThumbnailResponse self = new GetThumbnailResponse();
        return TeaModel.build(map, self);
    }

    public GetThumbnailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThumbnailResponse setBody(GetThumbnailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThumbnailResponseBody getBody() {
        return this.body;
    }

}
