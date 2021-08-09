// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCrossBorderPackageComplianceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCrossBorderPackageComplianceStatusResponseBody body;

    public static UpdateCrossBorderPackageComplianceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBorderPackageComplianceStatusResponse self = new UpdateCrossBorderPackageComplianceStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBorderPackageComplianceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCrossBorderPackageComplianceStatusResponse setBody(UpdateCrossBorderPackageComplianceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCrossBorderPackageComplianceStatusResponseBody getBody() {
        return this.body;
    }

}
