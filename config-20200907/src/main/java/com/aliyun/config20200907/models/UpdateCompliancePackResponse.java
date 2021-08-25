// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCompliancePackResponseBody body;

    public static UpdateCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompliancePackResponse self = new UpdateCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCompliancePackResponse setBody(UpdateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
