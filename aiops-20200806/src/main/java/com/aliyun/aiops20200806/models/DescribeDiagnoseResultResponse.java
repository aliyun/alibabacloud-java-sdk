// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnoseResultResponseBody body;

    public static DescribeDiagnoseResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseResultResponse self = new DescribeDiagnoseResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnoseResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnoseResultResponse setBody(DescribeDiagnoseResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnoseResultResponseBody getBody() {
        return this.body;
    }

}
