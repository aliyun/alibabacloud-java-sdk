// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteSurveyResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSurveyResourcesResponseBody body;

    public static DeleteSurveyResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSurveyResourcesResponse self = new DeleteSurveyResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSurveyResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSurveyResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSurveyResourcesResponse setBody(DeleteSurveyResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSurveyResourcesResponseBody getBody() {
        return this.body;
    }

}
