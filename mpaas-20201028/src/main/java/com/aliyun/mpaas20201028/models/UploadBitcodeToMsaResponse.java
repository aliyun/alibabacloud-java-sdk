// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadBitcodeToMsaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UploadBitcodeToMsaResponse setBody(UploadBitcodeToMsaResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadBitcodeToMsaResponseBody getBody() {
        return this.body;
    }

}
