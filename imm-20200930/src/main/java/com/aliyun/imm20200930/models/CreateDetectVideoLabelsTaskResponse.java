// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDetectVideoLabelsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDetectVideoLabelsTaskResponseBody body;

    public static CreateDetectVideoLabelsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectVideoLabelsTaskResponse self = new CreateDetectVideoLabelsTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDetectVideoLabelsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDetectVideoLabelsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDetectVideoLabelsTaskResponse setBody(CreateDetectVideoLabelsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDetectVideoLabelsTaskResponseBody getBody() {
        return this.body;
    }

}
