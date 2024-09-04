// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceAsyncScanResultsResponseBody body;

    public static VoiceAsyncScanResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceAsyncScanResultsResponse self = new VoiceAsyncScanResultsResponse();
        return TeaModel.build(map, self);
    }

    public VoiceAsyncScanResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceAsyncScanResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceAsyncScanResultsResponse setBody(VoiceAsyncScanResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceAsyncScanResultsResponseBody getBody() {
        return this.body;
    }

}
