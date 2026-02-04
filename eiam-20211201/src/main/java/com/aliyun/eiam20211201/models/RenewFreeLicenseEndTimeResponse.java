// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RenewFreeLicenseEndTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewFreeLicenseEndTimeResponseBody body;

    public static RenewFreeLicenseEndTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewFreeLicenseEndTimeResponse self = new RenewFreeLicenseEndTimeResponse();
        return TeaModel.build(map, self);
    }

    public RenewFreeLicenseEndTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewFreeLicenseEndTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewFreeLicenseEndTimeResponse setBody(RenewFreeLicenseEndTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewFreeLicenseEndTimeResponseBody getBody() {
        return this.body;
    }

}
