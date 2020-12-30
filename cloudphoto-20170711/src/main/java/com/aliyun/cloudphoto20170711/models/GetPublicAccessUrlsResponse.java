// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPublicAccessUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPublicAccessUrlsResponseBody body;

    public static GetPublicAccessUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicAccessUrlsResponse self = new GetPublicAccessUrlsResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicAccessUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicAccessUrlsResponse setBody(GetPublicAccessUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicAccessUrlsResponseBody getBody() {
        return this.body;
    }

}
