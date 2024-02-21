// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosisSettingsResponseBody body;

    public static DescribeDiagnosisSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSettingsResponse self = new DescribeDiagnosisSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosisSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosisSettingsResponse setBody(DescribeDiagnosisSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisSettingsResponseBody getBody() {
        return this.body;
    }

}
