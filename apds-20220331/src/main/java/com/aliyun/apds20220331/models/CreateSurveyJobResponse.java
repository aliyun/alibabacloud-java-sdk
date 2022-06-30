// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateSurveyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSurveyJobResponseBody body;

    public static CreateSurveyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyJobResponse self = new CreateSurveyJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSurveyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSurveyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSurveyJobResponse setBody(CreateSurveyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSurveyJobResponseBody getBody() {
        return this.body;
    }

}
