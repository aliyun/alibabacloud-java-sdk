// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSurveyJobsResponseBody body;

    public static ListSurveyJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyJobsResponse self = new ListSurveyJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSurveyJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSurveyJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSurveyJobsResponse setBody(ListSurveyJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyJobsResponseBody getBody() {
        return this.body;
    }

}
