// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class CreateAIJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAIJobResponseBody body;

    public static CreateAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIJobResponse self = new CreateAIJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIJobResponse setBody(CreateAIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIJobResponseBody getBody() {
        return this.body;
    }

}
