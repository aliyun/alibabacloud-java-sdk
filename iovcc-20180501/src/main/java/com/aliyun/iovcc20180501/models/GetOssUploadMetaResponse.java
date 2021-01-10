// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetOssUploadMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssUploadMetaResponseBody body;

    public static GetOssUploadMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadMetaResponse self = new GetOssUploadMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadMetaResponse setBody(GetOssUploadMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadMetaResponseBody getBody() {
        return this.body;
    }

}
