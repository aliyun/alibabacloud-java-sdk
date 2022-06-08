// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyWithoutPlaintextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDataKeyWithoutPlaintextResponseBody body;

    public static GenerateDataKeyWithoutPlaintextResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyWithoutPlaintextResponse self = new GenerateDataKeyWithoutPlaintextResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyWithoutPlaintextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDataKeyWithoutPlaintextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDataKeyWithoutPlaintextResponse setBody(GenerateDataKeyWithoutPlaintextResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDataKeyWithoutPlaintextResponseBody getBody() {
        return this.body;
    }

}
