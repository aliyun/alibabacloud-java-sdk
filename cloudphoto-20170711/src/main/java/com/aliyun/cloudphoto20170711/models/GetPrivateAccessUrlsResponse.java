// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPrivateAccessUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrivateAccessUrlsResponseBody body;

    public static GetPrivateAccessUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessUrlsResponse self = new GetPrivateAccessUrlsResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrivateAccessUrlsResponse setBody(GetPrivateAccessUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrivateAccessUrlsResponseBody getBody() {
        return this.body;
    }

}
