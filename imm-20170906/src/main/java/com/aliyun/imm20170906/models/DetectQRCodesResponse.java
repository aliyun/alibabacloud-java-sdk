// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectQRCodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectQRCodesResponseBody body;

    public static DetectQRCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectQRCodesResponse self = new DetectQRCodesResponse();
        return TeaModel.build(map, self);
    }

    public DetectQRCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectQRCodesResponse setBody(DetectQRCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectQRCodesResponseBody getBody() {
        return this.body;
    }

}
