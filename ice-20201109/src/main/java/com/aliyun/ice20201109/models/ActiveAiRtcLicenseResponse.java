// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ActiveAiRtcLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveAiRtcLicenseResponseBody body;

    public static ActiveAiRtcLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveAiRtcLicenseResponse self = new ActiveAiRtcLicenseResponse();
        return TeaModel.build(map, self);
    }

    public ActiveAiRtcLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveAiRtcLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveAiRtcLicenseResponse setBody(ActiveAiRtcLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveAiRtcLicenseResponseBody getBody() {
        return this.body;
    }

}
