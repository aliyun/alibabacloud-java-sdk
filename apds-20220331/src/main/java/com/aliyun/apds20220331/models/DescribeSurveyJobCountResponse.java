// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSurveyJobCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSurveyJobCountResponseBody body;

    public static DescribeSurveyJobCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSurveyJobCountResponse self = new DescribeSurveyJobCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSurveyJobCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSurveyJobCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSurveyJobCountResponse setBody(DescribeSurveyJobCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSurveyJobCountResponseBody getBody() {
        return this.body;
    }

}
