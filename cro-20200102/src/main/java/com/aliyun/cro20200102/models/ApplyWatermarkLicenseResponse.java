// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ApplyWatermarkLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyWatermarkLicenseResponseBody body;

    public static ApplyWatermarkLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyWatermarkLicenseResponse self = new ApplyWatermarkLicenseResponse();
        return TeaModel.build(map, self);
    }

    public ApplyWatermarkLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyWatermarkLicenseResponse setBody(ApplyWatermarkLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyWatermarkLicenseResponseBody getBody() {
        return this.body;
    }

}
