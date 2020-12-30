// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetThumbnailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetThumbnailsResponseBody body;

    public static GetThumbnailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThumbnailsResponse self = new GetThumbnailsResponse();
        return TeaModel.build(map, self);
    }

    public GetThumbnailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThumbnailsResponse setBody(GetThumbnailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThumbnailsResponseBody getBody() {
        return this.body;
    }

}
