// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseTextInfoByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadMPCoSPhaseTextInfoByDeviceResponseBody body;

    public static UploadMPCoSPhaseTextInfoByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseTextInfoByDeviceResponse self = new UploadMPCoSPhaseTextInfoByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadMPCoSPhaseTextInfoByDeviceResponse setBody(UploadMPCoSPhaseTextInfoByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMPCoSPhaseTextInfoByDeviceResponseBody getBody() {
        return this.body;
    }

}
