// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeLiveAudioAuditConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveAudioAuditConfigResponse setBody(DescribeLiveAudioAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAudioAuditConfigResponseBody getBody() {
        return this.body;
    }

}
