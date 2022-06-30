// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteSurveyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSurveyJobResponseBody body;

    public static DeleteSurveyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSurveyJobResponse self = new DeleteSurveyJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSurveyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSurveyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSurveyJobResponse setBody(DeleteSurveyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSurveyJobResponseBody getBody() {
        return this.body;
    }

}
