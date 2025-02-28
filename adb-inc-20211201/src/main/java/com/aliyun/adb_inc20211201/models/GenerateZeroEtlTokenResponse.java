// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GenerateZeroEtlTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateZeroEtlTokenResponseBody body;

    public static GenerateZeroEtlTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateZeroEtlTokenResponse self = new GenerateZeroEtlTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateZeroEtlTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateZeroEtlTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateZeroEtlTokenResponse setBody(GenerateZeroEtlTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateZeroEtlTokenResponseBody getBody() {
        return this.body;
    }

}
