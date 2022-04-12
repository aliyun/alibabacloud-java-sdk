// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetUploadToolUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadToolUrlResponseBody body;

    public static GetUploadToolUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadToolUrlResponse self = new GetUploadToolUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadToolUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadToolUrlResponse setBody(GetUploadToolUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadToolUrlResponseBody getBody() {
        return this.body;
    }

}
