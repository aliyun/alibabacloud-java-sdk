// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceAsyncManualScanResponseBody body;

    public static VoiceAsyncManualScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncManualScanResponse self = new VoiceAsyncManualScanResponse();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncManualScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceAsyncManualScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceAsyncManualScanResponse setBody(VoiceAsyncManualScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceAsyncManualScanResponseBody getBody() {
        return this.body;
    }

}
