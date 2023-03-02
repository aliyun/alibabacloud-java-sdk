// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseTextInfoByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody body;

    public static BatchUploadMPCoSPhaseTextInfoByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseTextInfoByDeviceResponse self = new BatchUploadMPCoSPhaseTextInfoByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceResponse setBody(BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody getBody() {
        return this.body;
    }

}
