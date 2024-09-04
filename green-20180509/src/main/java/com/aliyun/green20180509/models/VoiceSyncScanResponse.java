// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class VoiceSyncScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceSyncScanResponseBody body;

    public static VoiceSyncScanResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceSyncScanResponse self = new VoiceSyncScanResponse();
        return TeaModel.build(map, self);
    }

    public VoiceSyncScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceSyncScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceSyncScanResponse setBody(VoiceSyncScanResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceSyncScanResponseBody getBody() {
        return this.body;
    }

}
