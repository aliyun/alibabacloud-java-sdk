// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncScanResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

}
