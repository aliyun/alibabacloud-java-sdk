// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateSurveyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSurveyResponseBody body;

    public static CreateSurveyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyResponse self = new CreateSurveyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSurveyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSurveyResponse setBody(CreateSurveyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSurveyResponseBody getBody() {
        return this.body;
    }

}
