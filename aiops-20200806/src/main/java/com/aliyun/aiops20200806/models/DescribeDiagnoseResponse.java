// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnoseResponseBody body;

    public static DescribeDiagnoseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseResponse self = new DescribeDiagnoseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnoseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnoseResponse setBody(DescribeDiagnoseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnoseResponseBody getBody() {
        return this.body;
    }

}
