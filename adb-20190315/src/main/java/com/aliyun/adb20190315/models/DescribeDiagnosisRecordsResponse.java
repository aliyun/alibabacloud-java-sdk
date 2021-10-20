// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDiagnosisRecordsResponse setBody(DescribeDiagnosisRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosisRecordsResponseBody getBody() {
        return this.body;
    }

}
