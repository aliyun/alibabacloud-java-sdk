// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSurveyJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSurveyJobResponseBody body;

    public static DescribeSurveyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSurveyJobResponse self = new DescribeSurveyJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSurveyJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSurveyJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSurveyJobResponse setBody(DescribeSurveyJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSurveyJobResponseBody getBody() {
        return this.body;
    }

}
