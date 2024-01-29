// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateCompliancePackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateCompliancePackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCompliancePackResponse setBody(CreateCompliancePackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCompliancePackResponseBody getBody() {
        return this.body;
    }

}
