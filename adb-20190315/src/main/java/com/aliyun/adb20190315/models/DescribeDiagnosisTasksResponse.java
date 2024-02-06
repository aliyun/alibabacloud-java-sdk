// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosisTasksResponseBody body;

    public static DescribeDiagnosisTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisTasksResponse self = new DescribeDiagnosisTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosisTasksResponse setBody(DescribeDiagnosisTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisTasksResponseBody getBody() {
        return this.body;
    }

}
