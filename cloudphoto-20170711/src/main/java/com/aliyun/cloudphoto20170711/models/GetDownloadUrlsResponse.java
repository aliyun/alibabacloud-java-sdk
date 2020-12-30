// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetDownloadUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDownloadUrlsResponseBody body;

    public static GetDownloadUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlsResponse self = new GetDownloadUrlsResponse();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownloadUrlsResponse setBody(GetDownloadUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownloadUrlsResponseBody getBody() {
        return this.body;
    }

}
