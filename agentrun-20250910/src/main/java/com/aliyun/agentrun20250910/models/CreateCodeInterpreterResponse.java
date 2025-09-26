// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCodeInterpreterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CodeInterpreterResult body;

    public static CreateCodeInterpreterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeInterpreterResponse self = new CreateCodeInterpreterResponse();
        return TeaModel.build(map, self);
    }

    public CreateCodeInterpreterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCodeInterpreterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCodeInterpreterResponse setBody(CodeInterpreterResult body) {
        this.body = body;
        return this;
    }
    public CodeInterpreterResult getBody() {
        return this.body;
    }

}
