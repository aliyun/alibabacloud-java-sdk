// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveAudioAuditConfigResponseBody body;

    public static DescribeLiveAudioAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditConfigResponse self = new DescribeLiveAudioAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveAudioAuditConfigResponse setBody(DescribeLiveAudioAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAudioAuditConfigResponseBody getBody() {
        return this.body;
    }

}
