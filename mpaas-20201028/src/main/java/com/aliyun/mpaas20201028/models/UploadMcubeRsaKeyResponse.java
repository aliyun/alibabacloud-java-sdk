// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadMcubeRsaKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UploadMcubeRsaKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMcubeRsaKeyResponse setBody(UploadMcubeRsaKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMcubeRsaKeyResponseBody getBody() {
        return this.body;
    }

}
