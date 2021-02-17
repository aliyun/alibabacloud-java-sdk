// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageQRCodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageQRCodesResponseBody body;

    public static DetectImageQRCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageQRCodesResponse self = new DetectImageQRCodesResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageQRCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageQRCodesResponse setBody(DetectImageQRCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageQRCodesResponseBody getBody() {
        return this.body;
    }

}
