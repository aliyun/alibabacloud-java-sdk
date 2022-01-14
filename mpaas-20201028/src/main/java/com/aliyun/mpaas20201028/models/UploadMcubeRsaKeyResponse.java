// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadMcubeRsaKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadMcubeRsaKeyResponseBody body;

    public static UploadMcubeRsaKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeRsaKeyResponse self = new UploadMcubeRsaKeyResponse();
        return TeaModel.build(map, self);
    }

    public UploadMcubeRsaKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMcubeRsaKeyResponse setBody(UploadMcubeRsaKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMcubeRsaKeyResponseBody getBody() {
        return this.body;
    }

}
