// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class UpdateLicenseDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLicenseDescriptionResponseBody body;

    public static UpdateLicenseDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLicenseDescriptionResponse self = new UpdateLicenseDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLicenseDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLicenseDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLicenseDescriptionResponse setBody(UpdateLicenseDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLicenseDescriptionResponseBody getBody() {
        return this.body;
    }

}
