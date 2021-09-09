// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDiagnosisSettingsResponse setBody(DescribeDiagnosisSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisSettingsResponseBody getBody() {
        return this.body;
    }

}
