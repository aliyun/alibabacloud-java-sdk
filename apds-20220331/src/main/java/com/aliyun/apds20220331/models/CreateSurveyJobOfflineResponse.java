// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class CreateSurveyJobOfflineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSurveyJobOfflineResponseBody body;

    public static CreateSurveyJobOfflineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyJobOfflineResponse self = new CreateSurveyJobOfflineResponse();
        return TeaModel.build(map, self);
    }

    public CreateSurveyJobOfflineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSurveyJobOfflineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSurveyJobOfflineResponse setBody(CreateSurveyJobOfflineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSurveyJobOfflineResponseBody getBody() {
        return this.body;
    }

}
