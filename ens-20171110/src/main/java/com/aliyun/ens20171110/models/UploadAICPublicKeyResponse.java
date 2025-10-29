// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UploadAICPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadAICPublicKeyResponseBody body;

    public static UploadAICPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAICPublicKeyResponse self = new UploadAICPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public UploadAICPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAICPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAICPublicKeyResponse setBody(UploadAICPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAICPublicKeyResponseBody getBody() {
        return this.body;
    }

}
