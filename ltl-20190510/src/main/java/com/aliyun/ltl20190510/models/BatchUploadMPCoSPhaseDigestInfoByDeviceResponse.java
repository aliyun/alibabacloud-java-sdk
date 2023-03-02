// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseDigestInfoByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody body;

    public static BatchUploadMPCoSPhaseDigestInfoByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseDigestInfoByDeviceResponse self = new BatchUploadMPCoSPhaseDigestInfoByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponse setBody(BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody getBody() {
        return this.body;
    }

}
