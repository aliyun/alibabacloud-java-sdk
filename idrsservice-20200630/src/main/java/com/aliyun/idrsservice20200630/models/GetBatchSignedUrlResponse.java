// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetBatchSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBatchSignedUrlResponseBody body;

    public static GetBatchSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchSignedUrlResponse self = new GetBatchSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchSignedUrlResponse setBody(GetBatchSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchSignedUrlResponseBody getBody() {
        return this.body;
    }

}
