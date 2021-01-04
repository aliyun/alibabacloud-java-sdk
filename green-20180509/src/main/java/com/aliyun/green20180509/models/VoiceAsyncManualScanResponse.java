// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceAsyncManualScanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

}
