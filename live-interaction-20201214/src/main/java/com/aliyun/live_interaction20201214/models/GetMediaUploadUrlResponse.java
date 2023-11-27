// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaUploadUrlResponseBody body;

    public static GetMediaUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUploadUrlResponse self = new GetMediaUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaUploadUrlResponse setBody(GetMediaUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaUploadUrlResponseBody getBody() {
        return this.body;
    }

}
