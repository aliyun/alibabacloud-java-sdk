// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceLicenseResponseBody body;

    public static GetInstanceLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLicenseResponse self = new GetInstanceLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceLicenseResponse setBody(GetInstanceLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceLicenseResponseBody getBody() {
        return this.body;
    }

}
