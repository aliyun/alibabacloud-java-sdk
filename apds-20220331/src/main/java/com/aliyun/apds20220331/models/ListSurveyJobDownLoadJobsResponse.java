// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyJobDownLoadJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSurveyJobDownLoadJobsResponseBody body;

    public static ListSurveyJobDownLoadJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyJobDownLoadJobsResponse self = new ListSurveyJobDownLoadJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSurveyJobDownLoadJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSurveyJobDownLoadJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSurveyJobDownLoadJobsResponse setBody(ListSurveyJobDownLoadJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyJobDownLoadJobsResponseBody getBody() {
        return this.body;
    }

}
