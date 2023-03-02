// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseTextInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadMPCoSPhaseTextInfoResponseBody body;

    public static UploadMPCoSPhaseTextInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseTextInfoResponse self = new UploadMPCoSPhaseTextInfoResponse();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseTextInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMPCoSPhaseTextInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMPCoSPhaseTextInfoResponse setBody(UploadMPCoSPhaseTextInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMPCoSPhaseTextInfoResponseBody getBody() {
        return this.body;
    }

}
