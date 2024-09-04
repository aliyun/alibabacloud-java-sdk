// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceAsyncManualScanResultsResponseBody body;

    public static VoiceAsyncManualScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncManualScanResultsResponse self = new VoiceAsyncManualScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncManualScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceAsyncManualScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceAsyncManualScanResultsResponse setBody(VoiceAsyncManualScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceAsyncManualScanResultsResponseBody getBody() {
        return this.body;
    }

}
