// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class UploadLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadLicenseResponseBody body;

    public static UploadLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLicenseResponse self = new UploadLicenseResponse();
        return TeaModel.build(map, self);
    }

    public UploadLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadLicenseResponse setBody(UploadLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLicenseResponseBody getBody() {
        return this.body;
    }

}
