// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class BusinessLicenseOcrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BusinessLicenseOcrResponseBody body;

    public static BusinessLicenseOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        BusinessLicenseOcrResponse self = new BusinessLicenseOcrResponse();
        return TeaModel.build(map, self);
    }

    public BusinessLicenseOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BusinessLicenseOcrResponse setBody(BusinessLicenseOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public BusinessLicenseOcrResponseBody getBody() {
        return this.body;
    }

}
