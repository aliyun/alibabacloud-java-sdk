// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveAudioAuditNotifyConfigResponseBody body;

    public static DescribeLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditNotifyConfigResponse self = new DescribeLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveAudioAuditNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveAudioAuditNotifyConfigResponse setBody(DescribeLiveAudioAuditNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
