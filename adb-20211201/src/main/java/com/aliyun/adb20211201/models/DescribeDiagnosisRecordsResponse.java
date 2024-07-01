// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosisRecordsResponseBody body;

    public static DescribeDiagnosisRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisRecordsResponse self = new DescribeDiagnosisRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosisRecordsResponse setBody(DescribeDiagnosisRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisRecordsResponseBody getBody() {
        return this.body;
    }

}
