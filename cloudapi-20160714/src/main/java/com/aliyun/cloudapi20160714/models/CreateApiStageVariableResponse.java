// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiStageVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApiStageVariableResponseBody body;

    public static CreateApiStageVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiStageVariableResponse self = new CreateApiStageVariableResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiStageVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiStageVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiStageVariableResponse setBody(CreateApiStageVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiStageVariableResponseBody getBody() {
        return this.body;
    }

}
