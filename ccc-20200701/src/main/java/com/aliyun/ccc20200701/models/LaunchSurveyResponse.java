// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchSurveyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LaunchSurveyResponseBody body;

    public static LaunchSurveyResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchSurveyResponse self = new LaunchSurveyResponse();
        return TeaModel.build(map, self);
    }

    public LaunchSurveyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchSurveyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchSurveyResponse setBody(LaunchSurveyResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchSurveyResponseBody getBody() {
        return this.body;
    }

}
