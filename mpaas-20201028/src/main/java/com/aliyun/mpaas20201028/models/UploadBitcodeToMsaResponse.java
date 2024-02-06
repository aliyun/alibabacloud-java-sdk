// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadBitcodeToMsaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadBitcodeToMsaResponseBody body;

    public static UploadBitcodeToMsaResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadBitcodeToMsaResponse self = new UploadBitcodeToMsaResponse();
        return TeaModel.build(map, self);
    }

    public UploadBitcodeToMsaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadBitcodeToMsaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadBitcodeToMsaResponse setBody(UploadBitcodeToMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadBitcodeToMsaResponseBody getBody() {
        return this.body;
    }

}
