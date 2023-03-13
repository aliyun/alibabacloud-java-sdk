// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateDRMLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDRMLicenseResponseBody body;

    public static GenerateDRMLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDRMLicenseResponse self = new GenerateDRMLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDRMLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDRMLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDRMLicenseResponse setBody(GenerateDRMLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDRMLicenseResponseBody getBody() {
        return this.body;
    }

}
