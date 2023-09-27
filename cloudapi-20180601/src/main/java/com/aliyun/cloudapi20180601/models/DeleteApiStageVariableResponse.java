// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DeleteApiStageVariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApiStageVariableResponseBody body;

    public static DeleteApiStageVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiStageVariableResponse self = new DeleteApiStageVariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiStageVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiStageVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiStageVariableResponse setBody(DeleteApiStageVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiStageVariableResponseBody getBody() {
        return this.body;
    }

}
