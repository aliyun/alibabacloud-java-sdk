// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class EncodeBlindWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EncodeBlindWatermarkResponseBody body;

    public static EncodeBlindWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        EncodeBlindWatermarkResponse self = new EncodeBlindWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public EncodeBlindWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EncodeBlindWatermarkResponse setBody(EncodeBlindWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public EncodeBlindWatermarkResponseBody getBody() {
        return this.body;
    }

}
