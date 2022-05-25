// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateDeviceCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDeviceCodeResponseBody body;

    public static GenerateDeviceCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceCodeResponse self = new GenerateDeviceCodeResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDeviceCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDeviceCodeResponse setBody(GenerateDeviceCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDeviceCodeResponseBody getBody() {
        return this.body;
    }

}
