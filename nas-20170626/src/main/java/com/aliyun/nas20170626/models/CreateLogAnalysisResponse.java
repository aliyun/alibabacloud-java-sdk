// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLogAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogAnalysisResponseBody body;

    public static CreateLogAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogAnalysisResponse self = new CreateLogAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogAnalysisResponse setBody(CreateLogAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogAnalysisResponseBody getBody() {
        return this.body;
    }

}
