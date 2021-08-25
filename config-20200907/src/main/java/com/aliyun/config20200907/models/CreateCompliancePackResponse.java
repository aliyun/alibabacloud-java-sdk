// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCompliancePackResponseBody body;

    public static CreateCompliancePackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCompliancePackResponse self = new CreateCompliancePackResponse();
        return TeaModel.build(map, self);
    }

    public CreateCompliancePackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCompliancePackResponse setBody(CreateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
