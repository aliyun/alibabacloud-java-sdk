// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RegisterLineageRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterLineageRelationResponseBody body;

    public static RegisterLineageRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterLineageRelationResponse self = new RegisterLineageRelationResponse();
        return TeaModel.build(map, self);
    }

    public RegisterLineageRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterLineageRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterLineageRelationResponse setBody(RegisterLineageRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterLineageRelationResponseBody getBody() {
        return this.body;
    }

}
