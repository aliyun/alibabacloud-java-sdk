// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceCancelScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceCancelScanResponseBody body;

    public static VoiceCancelScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceCancelScanResponse self = new VoiceCancelScanResponse();
        return TeaModel.build(map, self);
    }

    public VoiceCancelScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceCancelScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceCancelScanResponse setBody(VoiceCancelScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceCancelScanResponseBody getBody() {
        return this.body;
    }

}
