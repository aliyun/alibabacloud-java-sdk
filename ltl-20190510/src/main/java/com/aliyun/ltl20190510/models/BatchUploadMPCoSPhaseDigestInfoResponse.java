// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseDigestInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUploadMPCoSPhaseDigestInfoResponseBody body;

    public static BatchUploadMPCoSPhaseDigestInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseDigestInfoResponse self = new BatchUploadMPCoSPhaseDigestInfoResponse();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseDigestInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUploadMPCoSPhaseDigestInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUploadMPCoSPhaseDigestInfoResponse setBody(BatchUploadMPCoSPhaseDigestInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUploadMPCoSPhaseDigestInfoResponseBody getBody() {
        return this.body;
    }

}
