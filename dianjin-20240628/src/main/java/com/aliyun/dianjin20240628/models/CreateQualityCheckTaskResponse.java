// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateQualityCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQualityCheckTaskResponseBody body;

    public static CreateQualityCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckTaskResponse self = new CreateQualityCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQualityCheckTaskResponse setBody(CreateQualityCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityCheckTaskResponseBody getBody() {
        return this.body;
    }

}
