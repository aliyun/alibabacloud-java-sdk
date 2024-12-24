// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class GenerateCoordinationCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateCoordinationCodeResponseBody body;

    public static GenerateCoordinationCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateCoordinationCodeResponse self = new GenerateCoordinationCodeResponse();
        return TeaModel.build(map, self);
    }

    public GenerateCoordinationCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateCoordinationCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateCoordinationCodeResponse setBody(GenerateCoordinationCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateCoordinationCodeResponseBody getBody() {
        return this.body;
    }

}
