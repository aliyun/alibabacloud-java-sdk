// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFlushUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialFlushUploadResponseBody body;

    public static MaterialFlushUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialFlushUploadResponse self = new MaterialFlushUploadResponse();
        return TeaModel.build(map, self);
    }

    public MaterialFlushUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialFlushUploadResponse setBody(MaterialFlushUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialFlushUploadResponseBody getBody() {
        return this.body;
    }

}
