// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceAsyncScanResponseBody body;

    public static VoiceAsyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncScanResponse self = new VoiceAsyncScanResponse();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceAsyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceAsyncScanResponse setBody(VoiceAsyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceAsyncScanResponseBody getBody() {
        return this.body;
    }

}
