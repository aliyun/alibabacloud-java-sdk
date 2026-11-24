// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VacancyDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VacancyDetectionResponseBody body;

    public static VacancyDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        VacancyDetectionResponse self = new VacancyDetectionResponse();
        return TeaModel.build(map, self);
    }

    public VacancyDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VacancyDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VacancyDetectionResponse setBody(VacancyDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public VacancyDetectionResponseBody getBody() {
        return this.body;
    }

}
