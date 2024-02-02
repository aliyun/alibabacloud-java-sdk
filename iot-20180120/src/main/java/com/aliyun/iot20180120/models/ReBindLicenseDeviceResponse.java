// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReBindLicenseDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReBindLicenseDeviceResponseBody body;

    public static ReBindLicenseDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReBindLicenseDeviceResponse self = new ReBindLicenseDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ReBindLicenseDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReBindLicenseDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReBindLicenseDeviceResponse setBody(ReBindLicenseDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReBindLicenseDeviceResponseBody getBody() {
        return this.body;
    }

}
