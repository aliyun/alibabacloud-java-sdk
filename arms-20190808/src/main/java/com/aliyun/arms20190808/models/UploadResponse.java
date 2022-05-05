// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadResponseBody body;

    public static UploadResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadResponse self = new UploadResponse();
        return TeaModel.build(map, self);
    }

    public UploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadResponse setBody(UploadResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadResponseBody getBody() {
        return this.body;
    }

}
