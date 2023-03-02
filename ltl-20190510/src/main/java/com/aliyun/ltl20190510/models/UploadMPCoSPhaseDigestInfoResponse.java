// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseDigestInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadMPCoSPhaseDigestInfoResponseBody body;

    public static UploadMPCoSPhaseDigestInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseDigestInfoResponse self = new UploadMPCoSPhaseDigestInfoResponse();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseDigestInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMPCoSPhaseDigestInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMPCoSPhaseDigestInfoResponse setBody(UploadMPCoSPhaseDigestInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMPCoSPhaseDigestInfoResponseBody getBody() {
        return this.body;
    }

}
